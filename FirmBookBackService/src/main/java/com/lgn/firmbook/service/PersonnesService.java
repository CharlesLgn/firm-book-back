package com.lgn.firmbook.service;

import com.lgn.firmbook.metier.objet.Personne;
import com.lgn.firmbook.metier.process.person.*;
import com.lgn.firmbook.service.helper.ConnectionHelper;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("people")
public class PersonnesService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPeople(@HeaderParam("Authorization") String auth) {
        return new ConnectionHelper().connexion(auth, utilisateur -> {
            List<Personne> res = new GetPeopleProcess().get();
            return Response.ok().entity(res).build();
        });
    }
}
