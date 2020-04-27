package io.quarkus.telegram.bots.core.client;

import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Singleton
@Path("/bot{token}")
@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient(configKey = "telegram-bot-api", baseUri = "https://api.telegram.org")
public interface BotApiRestClient {

    @GET
    @Path("/getMe")
    Uni<UserResponse> getMe(@PathParam("token") String token);

    @POST
    @Path("/sendMessage")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    Uni<MessageResponse> sendMessage(@PathParam("token") String token,
                                     @FormParam("chat_id") Integer chatId,
                                     @FormParam("text") String text,
                                     @FormParam("parse_mode") String parseMode,
                                     @FormParam("disable_web_page_preview") Boolean disableWebPagePreview,
                                     @FormParam("disable_notification") Boolean disableNotification,
                                     @FormParam("reply_to_message_id") Integer replyToMessageId,
                                     @FormParam("reply_markup") String replyMarkup);
}
