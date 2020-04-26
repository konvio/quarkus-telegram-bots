package io.quarkus.telegram.bots.core.client;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public abstract class BotApiResponse<T> {

    public Boolean ok;

    public Integer errorCode;

    public String description;

    public T result;
}
