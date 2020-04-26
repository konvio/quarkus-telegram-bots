package io.quarkus.telegram.bots.core.client;

import io.quarkus.telegram.bots.core.model.User;
import io.quarkus.telegram.bots.exceptions.TelegramBotApiException;
import io.smallrye.mutiny.Uni;
import io.smallrye.mutiny.subscription.UniEmitter;
import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class TelegramBotApi {

    public static final String QUARKUS_TELEGRAM_BOT_TOKEN_CONFIG_NAME = "quarkus.telegram.bot.token";

    @Inject
    @RestClient
    BotApiRestClient botApiRestClient;

    public Uni<User> getMe() {
        return botApiRestClient.getMe(getToken())
                .onItem()
                .produceUni(this::produceBotApiResponseUni);
    }

    private <T> void produceBotApiResponseUni(BotApiResponse<T> botApiResponse, UniEmitter<? super T> uniEmitter) {
        if (botApiResponse.ok) {
            uniEmitter.complete(botApiResponse.result);
        } else {
            uniEmitter.fail(new TelegramBotApiException(botApiResponse.errorCode, botApiResponse.description));
        }
    }

    private String getToken() {
        return ConfigProvider.getConfig().getValue(QUARKUS_TELEGRAM_BOT_TOKEN_CONFIG_NAME, String.class);
    }
}
