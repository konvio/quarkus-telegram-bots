package io.quarkus.telegram.bots.core.client;

import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/bot{token}")
@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient(configKey = "telegram-bot-api", baseUri = "https://api.telegram.org")
public interface TelegramBotApiRestClient {

    @GET
    @Path("/getMe")
    Uni<UserTelegramBotApiResponse> getMe(@PathParam("token") String token);
}
