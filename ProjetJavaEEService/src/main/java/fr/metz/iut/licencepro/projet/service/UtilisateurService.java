package fr.metz.iut.licencepro.projet.service;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import fr.metz.iut.licencepro.projet.service.helper.ConnectionHelper;

@Path("user")
public class UtilisateurService {

  @GET
  @Path("/connect")
  public Response isValid(@HeaderParam("Authorization") String auth) {
    return new ConnectionHelper().connetion(auth, user -> Response.ok().entity(user).build());
  }

}

