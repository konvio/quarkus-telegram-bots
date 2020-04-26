package io.quarkus.telegram.bots.core.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This object represents a chat.
 *
 * @see <a href="https://core.telegram.org/bots/api#chat">Telegram Bot API</a>
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Chat {

    /**
     * Unique identifier for this chat
     */
    @NotNull
    public Long id;

    /**
     * Type of chat, can be either “private”, “group”, “supergroup” or “channel”
     */
    @NotNull
    public String type;

    /**
     * Title, for supergroups, channels and group chats
     */
    @Nullable
    public String title;

    /**
     * Username, for private chats, supergroups and channels if available
     */
    @Nullable
    public String username;

    /**
     * First name of the other party in a private chat
     */
    @Nullable
    public String firstName;

    /**
     * Last name of the other party in a private chat
     */
    @Nullable
    public String lastName;

    /**
     * Chat photo.
     * Returned only in <a href="https://core.telegram.org/bots/api#getchat">getChat</a>.
     */
    @Nullable
    public ChatPhoto photo;

    /**
     * Description, for groups, supergroups and channel chats.
     * Returned only in <a href="https://core.telegram.org/bots/api#getchat">getChat</a>.
     */
    @Nullable
    public String description;

    /**
     * Chat invite link, for groups, supergroups and channel chats.
     * Each administrator in a chat generates their own invite links,
     * so the bot must first generate the link using
     * <a href="https://core.telegram.org/bots/api#exportchatinvitelink">exportChatInviteLink</a>.
     * Returned only in <a href="https://core.telegram.org/bots/api#getchat">getChat</a>.
     */
    @Nullable
    public String inviteLink;

    /**
     * Pinned message, for groups, supergroups and channels.
     * Returned only in <a href="https://core.telegram.org/bots/api#getchat">getChat</a>.
     */
    @Nullable
    public Message pinnedMessage;

    /**
     * Default chat member permissions, for groups and supergroups.
     * Returned only in <a href="https://core.telegram.org/bots/api#getchat">getChat</a>.
     */
    @Nullable
    public ChatPermissions permissions;

    /**
     * For supergroups, the minimum allowed delay between consecutive messages sent by each
     * unpriviledged user.
     * Returned only in <a href="https://core.telegram.org/bots/api#getchat">getChat</a>.
     */
    @Nullable
    public Integer slowModeDelay;

    /**
     * For supergroups, name of group sticker set.
     * Returned only in <a href="https://core.telegram.org/bots/api#getchat">getChat</a>.
     */
    @Nullable
    public String stickerSetName;

    /**
     * True, if the bot can change the group sticker set.
     * Returned only in <a href="https://core.telegram.org/bots/api#getchat">getChat</a>.
     */
    @Nullable
    public Boolean canSetStickerSet;
}
