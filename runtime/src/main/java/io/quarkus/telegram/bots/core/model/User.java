package io.quarkus.telegram.bots.core.model;

import io.quarkus.telegram.bots.annotations.TelegramApiModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This object represents a Telegram user or bot.
 *
 * @see <a href="https://core.telegram.org/bots/api#user">Telegram Bot API</a>
 */
@TelegramApiModel
public class User {

    /**
     * Unique identifier for this user or bot
     */
    @NotNull
    public Integer id;

    /**
     * True, if this user is a bot
     */
    @NotNull
    public Boolean isBot;

    /**
     * User's or bot's first name
     */
    @NotNull
    public String firstName;

    /**
     * User's or bot's last name
     */
    @Nullable
    public String lastName;

    /**
     * User's or bot's username
     */
    @Nullable
    public String username;

    /**
     * <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a> of the user's language
     */
    @Nullable
    public String languageCode;

    /**
     * True, if the bot can be invited to groups.
     * Returned only in <a href="https://core.telegram.org/bots/api#getme">getMe</a>.
     */
    @Nullable
    public Boolean canJoinGroups;

    /**
     * True, if <a href="https://core.telegram.org/bots#privacy-mode">privacy mode</a> is disabled for the bot.
     * Returned only in <a href="https://core.telegram.org/bots/api#getme">getMe</a>.
     */
    @Nullable
    public Boolean canReadAllGroupMessages;

    /**
     * True, if the bot supports inline queries.
     * Returned only in <a href="https://core.telegram.org/bots/api#getme">getMe</a>.
     */
    @Nullable
    public Boolean supportsInlineQueries;
}
