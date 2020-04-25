package io.quarkus.telegram.bots.core.model;

import io.quarkus.telegram.bots.annotations.TelegramApiModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This object represents one special entity in a text message. For example, hashtags, usernames,
 * URLs, etc.
 *
 * @see <a href="https://core.telegram.org/bots/api#messageentity">Telegram Bot API</a>
 */
@TelegramApiModel
public class MessageEntity {

    /**
     * Type of the entity. Can be “mention” (@username), “hashtag” (#hashtag), “cashtag” ($USD),
     * “bot_command” (/start@jobs_bot), “url” (https://telegram.org),
     * “email” (do-not-reply@telegram.org), “phone_number” (+1-212-555-0123), “bold” (bold text),
     * “italic” (italic text), “underline” (underlined text), “strikethrough” (strikethrough text),
     * “code” (monowidth string), “pre” (monowidth block), “text_link” (for clickable text URLs),
     * “text_mention” (for users <a href="https://telegram.org/blog/edit#new-mentions">without usernames</a>)
     */
    @NotNull
    public String type;

    /**
     * Offset in UTF-16 code units to the start of the entity
     */
    @NotNull
    public Integer offset;

    /**
     * Length of the entity in UTF-16 code units
     */
    @NotNull
    public Integer length;

    /**
     * For “text_link” only, url that will be opened after user taps on the text
     */
    @Nullable
    public String url;

    /**
     * For “text_mention” only, the mentioned user
     */
    @Nullable
    public User user;

    /**
     * For “pre” only, the programming language of the entity text
     */
    @Nullable
    public String language;
}
