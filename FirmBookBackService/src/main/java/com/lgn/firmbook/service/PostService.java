package com.lgn.firmbook.service;

import com.lgn.firmbook.metier.objet.Poste;
import com.lgn.firmbook.metier.objet.data.PostePersData;
import com.lgn.firmbook.metier.process.post.*;
import com.lgn.firmbook.service.helper.ConnectionHelper;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("post")
public class PostService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPost(@HeaderParam("Authorization") String auth) {
        return new ConnectionHelper().connexion(auth, user -> {
            List<Poste> res = new GetAllPostProcess().get();
            return Response.ok().entity(res).build();
        });
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAPost(@HeaderParam("Authorization") String auth, @PathParam("id") int id) {
        return new ConnectionHelper().connexion(auth, user -> {
            Poste res = new GetPostProcess().get(id);
            return Response.ok().entity(res).build();
        });
    }

    @POST
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updatePost(@HeaderParam("Authorization") String auth, @PathParam("id") int id, Poste poste) {
        return new ConnectionHelper().connexion(auth, utilisateur -> {
            new UpdatePostProcess().update(id, poste);
            return Response.ok().build();
        });
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createPost(@HeaderParam("Authorization") String auth, final Poste poste){
        return new ConnectionHelper().connexion(auth, utilisateur -> {
            Poste res = new CreatePostProcess().create(poste);
            return Response.ok().entity(res).build();
        });
    }

    @POST
    @Path("/person")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updatePersonPost(@HeaderParam("Authorization") String auth, PostePersData posteData) {
        return new ConnectionHelper().connexion(auth, utilisateur -> {
            new UpdatePostPersonProcess().update(posteData.getPostId(), posteData.getPersonId());
            return Response.ok().build();
        });
    }
    @POST
    @Path("/boss")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateBossPost(@HeaderParam("Authorization") String auth, PostePersData posteData) {
        return new ConnectionHelper().connexion(auth, utilisateur -> {
            new UpdateBossProcess().update(posteData.getPostId(), posteData.getPersonId());
            return Response.ok().build();
        });
    }
}
