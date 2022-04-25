package io.bq.sl.apps.japp.api;

import io.bq.sl.apps.japp.model.User;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.HashMap;
import java.util.Map;

public class UserApiServiceImpl implements UserApiService {

    // Memory type User List
    private final Map<String, User> userMap;

    public UserApiServiceImpl() {
        userMap = new HashMap<>();
        User user = new User();
        user.setId(123456L);
        user.setFirstName("joe");
        user.setLastName("Runner");
        user.setEmail("joe.runner@gmail.com");
        user.setPhone("0123456789");
        userMap.put(user.getUsername(), user);
    }

    @Override
    public Response createUser(User user, SecurityContext securityContext) throws NotFoundException {
        if (userMap.put(user.getUsername(), user) == null) {
            return Response.ok().entity(user).build();
        }
        return Response.status(Response.Status.NOT_ACCEPTABLE).build();
    }

    @Override
    public Response deleteUser(String username, SecurityContext securityContext) throws NotFoundException {
        if (userMap.containsKey(username)) {
            userMap.remove(username);
            return Response.ok().build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();

    }

    @Override
    public Response getUserByName(String username, SecurityContext securityContext) throws NotFoundException {
        if (userMap.containsKey(username)) {
            return Response.ok().entity(userMap.get(username)).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }

    @Override
    public Response getUserList(SecurityContext securityContext) throws NotFoundException {
        return Response.ok().entity(userMap.values().toArray()).build();
    }

    @Override
    public Response updateUser(String username, User user, SecurityContext securityContext) throws NotFoundException {
        if (userMap.containsKey(username)) {
            userMap.replace(username, user);
            return Response.ok().entity(user).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
