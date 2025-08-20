package org.acme;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;  // <--- ADD THIS
import org.acme.MyEntity;

import java.util.List;


@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public MyEntity hello() {
        return new MyEntity("Hello from Quarkus REST");
    }

    @GET
    @Path("/GetAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<MyEntity> GetAll(){
        return MyEntity.listAll();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getById(@PathParam("id") Long id) {
        MyEntity entity = MyEntity.findById(id);

        if (entity == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        return Response.ok(entity).build();
    }

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public Response insertEntity(MyEntity entity){
        MyEntity.persist(entity);
        return Response.status(Response.Status.CREATED)
                .entity(entity)
                .build();
    }


    @DELETE
    @Path("{id}")
    @Transactional
    public void delete(@PathParam("id") Long id) {
        MyEntity.deleteById(id);
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public void update(@PathParam("id") Long id, MyEntity entity){
        entity.id = id;
        entity.persist();
    }

}
