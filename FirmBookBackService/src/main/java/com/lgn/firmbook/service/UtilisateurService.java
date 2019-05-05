package com.lgn.firmbook.service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.lgn.firmbook.service.helper.ConnectionHelper;

@Path("user")
public class UtilisateurService {

  @GET
  @Path("/connect")
  @Produces({MediaType.APPLICATION_JSON})
  public Response isValid(@HeaderParam("Authorization") String auth) {
    return new ConnectionHelper().connexion(auth, user -> Response.ok().entity(user).build());
  }

}

