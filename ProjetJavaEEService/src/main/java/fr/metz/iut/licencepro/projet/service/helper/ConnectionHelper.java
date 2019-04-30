package fr.metz.iut.licencepro.projet.service.helper;

import static javax.ws.rs.core.Response.Status.FORBIDDEN;
import static javax.ws.rs.core.Response.ok;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.function.*;

import javax.ws.rs.core.Response;

import fr.metz.iut.licencepro.projet.metier.objet.Utilisateur;
import fr.metz.iut.licencepro.projet.metier.process.UserConnectionProcess;

public class ConnectionHelper {

  public Response connetion(String auth, Function<Utilisateur, Response> dataToSend) {
    String[] data = getAuth(auth);
    if (data == null || data.length < 2) {
      return Response.status(FORBIDDEN).build();
    }
    try {
      Utilisateur user = new UserConnectionProcess().connect(data[0], data[1]);
      if (user != null) {
        return dataToSend.apply(user);
      } else {
        return Response.status(FORBIDDEN).build();
      }
    } catch (Exception e) {
      e.printStackTrace();
      return Response.serverError().build();
    }
  }

  private String[] getAuth(String auth) {
    if (auth != null && auth.toLowerCase().startsWith("basic")) {
      try {
        String base64Credentials = auth.substring("Basic".length()).trim();
        byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
        String credentials = new String(credDecoded, StandardCharsets.UTF_8);
        return credentials.split(":", 2);
      } catch (Exception e) {
        return null;
      }
    }
    return null;
  }
}
