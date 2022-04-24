package io.bq.sl.apps.japp;

import com.sun.net.httpserver.HttpServer;
import io.bq.sl.apps.japp.api.UserApi;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class UserRestApiServer {

    private final static int serverPort = 9998;
    private final static String hostUrl = "http://localhost/";

    public static void main(String[] args) {

        URI baseUri = UriBuilder.fromUri(hostUrl).port(serverPort).build();
        ResourceConfig config = new ResourceConfig(UserApi.class);
        HttpServer server = JdkHttpServerFactory.createHttpServer(baseUri, config);
    }
}
