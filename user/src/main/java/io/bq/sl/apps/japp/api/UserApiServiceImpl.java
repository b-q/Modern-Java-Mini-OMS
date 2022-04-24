package io.bq.sl.apps.japp.api;

import io.bq.sl.apps.japp.model.User;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

public class UserApiServiceImpl implements UserApiService {

    @Override
    public Response createUser(User user, SecurityContext securityContext) throws NotFoundException {
        return Response.ok().entity("create user").build();
    }

    @Override
    public Response deleteUser(String username, SecurityContext securityContext) throws NotFoundException {
        return Response.ok().entity("delete user").build();
    }

    @Override
    public Response getUserByName(String username, SecurityContext securityContext) throws NotFoundException {
        return Response.ok().entity("get user by name").build();
    }

    @Override
    public Response getUserList(SecurityContext securityContext) throws NotFoundException {
        return Response.ok().entity("get user list").build();
    }

    @Override
    public Response updateUser(String username, User body, SecurityContext securityContext) throws NotFoundException {
        return Response.ok().entity("update user").build();
    }
}
