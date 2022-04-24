package io.bq.sl.apps.japp.api;

import io.bq.sl.apps.japp.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("user")
public class UserApi {

    private final UserApiService userApiService;

    public UserApi() {
        userApiService = new UserApiServiceImpl();
    }

    @POST
    public Response createUser(User user, @Context SecurityContext securityContext) throws NotFoundException {
        return userApiService.createUser(user, securityContext);
    }

    @DELETE
    @Path("/{userName}")
    @Produces({"application/xml", "application/json"})
    public Response deleteUser(@PathParam("userName") String userName, @Context SecurityContext securityContext) throws NotFoundException {
        return userApiService.deleteUser(userName, securityContext);
    }

    @GET
    @Path("/{userName}")
    @Produces({"application/xml", "application/json"})
    public Response getUserByName(@PathParam("userName") String userName, @Context SecurityContext securityContext) throws NotFoundException {
        return userApiService.getUserByName(userName, securityContext);
    }

    @GET
    @Produces({"application/xml", "application/json"})
    public Response getUserList(@Context SecurityContext securityContext) throws NotFoundException {
        return userApiService.getUserList(securityContext);
    }

    @PUT
    @Path("/{userName}")
    @Produces({"application/xml", "application/json"})
    public Response updateUser(@PathParam("userName") String userName, User user, @Context SecurityContext securityContext) throws NotFoundException {
        return userApiService.updateUser(userName, user, securityContext);
    }
}
