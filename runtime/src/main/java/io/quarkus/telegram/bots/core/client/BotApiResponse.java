package io.quarkus.telegram.bots.core.client;

import io.quarkus.telegram.bots.annotations.TelegramApiModel;

@TelegramApiModel
abstract class BotApiResponse<T> {

    public Boolean ok;

    public Integer errorCode;

    public String description;

    public T result;
}
