package io.bq.sl.apps.japp;

import io.bq.sl.apps.japp.model.Article;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("article")
public class ArticleApi {
    @POST
    public Response createArticle(Article article, @Context SecurityContext securityContext) throws NotFoundException {
        return null;
    }

    @DELETE
    @Path("/{articleId}")
    @Produces({"application/xml", "application/json"})
    public Response deleteArticle(@PathParam("articleId") String articleId, @Context SecurityContext securityContext) throws NotFoundException {
        return null;
    }

    @GET
    @Path("/{articleId}")
    @Produces({"application/xml", "application/json"})
    public Response getArticleByName(@PathParam("articleId") String articleId, @Context SecurityContext securityContext) throws NotFoundException {
        return null;
    }

    @GET
    @Produces({"application/xml", "application/json"})
    public Response getArticleList(@Context SecurityContext securityContext) throws NotFoundException {
        return null;
    }

    @PUT
    @Path("/{articleId}")
    @Produces({"application/xml", "application/json"})
    public Response updateArticle(@PathParam("articleId") String articleId, Article article, @Context SecurityContext securityContext) throws NotFoundException {
        return null;
    }

}
