package io.bq.sl.apps.japp.api;

import io.bq.sl.apps.japp.model.User;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

public interface UserApiService {

    Response createUser(User user, SecurityContext securityContext) throws NotFoundException;

    Response deleteUser(String username, SecurityContext securityContext) throws NotFoundException;

    Response getUserByName(String username, SecurityContext securityContext) throws NotFoundException;

    Response getUserList(SecurityContext securityContext) throws NotFoundException;

    Response updateUser(String username, User body, SecurityContext securityContext) throws NotFoundException;

}
