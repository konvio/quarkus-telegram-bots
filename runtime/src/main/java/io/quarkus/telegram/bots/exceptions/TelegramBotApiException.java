package io.quarkus.telegram.bots.exceptions;

public class TelegramBotApiException extends RuntimeException {

    private final Integer errorCode;
    private final String description;

    public TelegramBotApiException(Integer errorCode, String description) {
        super(description);
        this.errorCode = errorCode;
        this.description = description;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getDescription() {
        return description;
    }
}