package io.bq.sl.apps.japp;

import io.bq.sl.apps.japp.api.UserApi;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class UserRestApiServer {

    private static final int SERVER_PORT = 9998;
    private static final String HOST_URL = "http://localhost/";

    public static void main(String[] args) {

        URI baseUri = UriBuilder.fromUri(HOST_URL).port(SERVER_PORT).build();
        ResourceConfig config = new ResourceConfig(UserApi.class);
        JdkHttpServerFactory.createHttpServer(baseUri, config);
    }
}
