package io.quarkus.telegram.bots.core.client;

import io.quarkus.telegram.bots.core.model.*;

public class SendMessageRequest extends BotApiRequest<Message> {

    private String text;

    private String parseMode;

    private Boolean disableWebPagePreview;

    private Boolean disableNotification;

    private Integer replyToMessageId;

    private InlineKeyboardMarkup inlineKeyboardMarkup;

    private ReplyKeyboardMarkup replyKeyboardMarkup;

    private ReplyKeyboardRemove replyKeyboardRemove;

    private ForceReply forceReply;

    public SendMessageRequest withParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    public SendMessageRequest disableWebPagePreview() {
        this.disableWebPagePreview = true;
        return this;
    }

    public SendMessageRequest withReplyToMessageId(Integer messageId) {
        this.replyToMessageId = messageId;
        return this;
    }
}
