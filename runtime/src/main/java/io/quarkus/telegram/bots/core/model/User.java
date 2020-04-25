package io.quarkus.telegram.bots.core.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents a Telegram user or bot.
 *
 * @see <a href="https://core.telegram.org/bots/api#user">Telegram Bot API</a>
 */
public class User {

    /**
     * Unique identifier for this user or bot
     */
    @NotNull
    @JsonProperty("id")
    public Integer id;

    /**
     * True, if this user is a bot
     */
    @NotNull
    @JsonProperty("is_bot")
    public Boolean isBot;

    /**
     * User's or bot's first name
     */
    @NotNull
    @JsonProperty("first_name")
    public String firstName;

    /**
     * User's or bot's last name
     */
    @Nullable
    @JsonProperty("last_name")
    public String lastName;

    /**
     * User's or bot's username
     */
    @Nullable
    @JsonProperty("username")
    public String username;

    /**
     * <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a> of the user's language
     */
    @Nullable
    @JsonProperty("language_code")
    public String languageCode;

    /**
     * True, if the bot can be invited to groups.
     * Returned only in <a href="https://core.telegram.org/bots/api#getme">getMe</a>.
     */
    @Nullable
    @JsonProperty("can_join_groups")
    public Boolean canJoinGroups;

    /**
     * True, if <a href="https://core.telegram.org/bots#privacy-mode">privacy mode</a> is disabled for the bot.
     * Returned only in <a href="https://core.telegram.org/bots/api#getme">getMe</a>.
     */
    @Nullable
    @JsonProperty("can_read_all_group_messages")
    public Boolean canReadAllGroupMessages;

    /**
     * True, if the bot supports inline queries.
     * Returned only in <a href="https://core.telegram.org/bots/api#getme">getMe</a>.
     */
    @Nullable
    @JsonProperty("supports_inline_queries")
    public Boolean supportsInlineQueries;
}
