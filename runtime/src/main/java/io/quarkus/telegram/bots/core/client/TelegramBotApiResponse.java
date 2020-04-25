package io.quarkus.telegram.bots.core.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class TelegramBotApiResponse<T> {

    @JsonProperty("ok")
    public Boolean isOk;

    @JsonProperty("error_code")
    public Integer errorCode;

    @JsonProperty("description")
    public String description;

    public T result;
}
