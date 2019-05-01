package com.lgn.firmbook.service;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import com.lgn.firmbook.metier.objet.Personne;
import com.lgn.firmbook.metier.process.person.CreatePersonProcess;
import com.lgn.firmbook.metier.process.person.DeletePersonProcess;
import com.lgn.firmbook.metier.process.person.UpdatePersonProcess;
import com.lgn.firmbook.service.helper.ConnectionHelper;

@Path("person")
public class PersonneService {

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public Response createPerson(@HeaderParam("Authorization") String auth, final Personne personne){
    return new ConnectionHelper().connetion(auth, utilisateur -> {
      Personne res = new CreatePersonProcess().create(personne);
      return Response.ok().entity(res).build();
    });
  }

  @POST
  @Path("/{id}")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public Response updatePerson(@HeaderParam("Authorization") String auth, @PathParam("id") int id, final Personne personne) {
    personne.setId(id);
    return new ConnectionHelper().connetion(auth, utilisateur -> {
      new UpdatePersonProcess().update(personne);
      return Response.ok().entity(personne).build();
    });
  }

  @DELETE
  @Path("/{id}")
  public Response deletePerson(@HeaderParam("Authorization") String auth, @PathParam("id") int id) {
    return new ConnectionHelper().connetion(auth, utilisateur -> {
      new DeletePersonProcess().delete(id);
      return Response.ok().build();
    });
  }

}
