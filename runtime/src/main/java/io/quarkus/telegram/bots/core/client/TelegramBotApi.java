package io.quarkus.telegram.bots.core.client;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;

public class TelegramBotApi {

    @Inject
    @RestClient
    TelegramBotApiRestClient telegramBotApiRestClient;
}
