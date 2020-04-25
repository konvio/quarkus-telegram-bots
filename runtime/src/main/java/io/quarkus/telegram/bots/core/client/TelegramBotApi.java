package io.quarkus.telegram.bots.core.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.quarkus.telegram.bots.core.model.User;
import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;

public class TelegramBotApi {

    @Inject
    @RestClient
    BotApiRestClient botApiRestClient;

    public Uni<User> getMe() {
        return botApiRestClient.getMe("").onItem().produceUni((r, c) -> {
            if (r.ok) {
                c.complete(r.result);
            } else {
                c.fail(new RuntimeException());
            }
        });
    }

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        UserResponse userResponse = new UserResponse();
        System.out.println(objectMapper.writeValueAsString(userResponse));
    }
}
