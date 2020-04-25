package io.quarkus.telegram.bots.core.model;

import io.quarkus.telegram.bots.annotations.TelegramApiModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.validation.constraints.Size;
import java.util.List;

/**
 * This object represents a message.
 *
 * @see <a href="https://core.telegram.org/bots/api#message">Telegram Bot API</a>
 */
@TelegramApiModel
public class Message {

    /**
     * Unique message identifier inside this chat
     */
    @NotNull
    public Integer messageId;

    /**
     * Sender, empty for messages sent to channels
     */
    @Nullable
    public User from;

    /**
     * Date the message was sent in Unix time
     */
    @NotNull
    public Integer date;

    /**
     * Conversation the message belongs to
     */
    @NotNull
    public Chat chat;

    /**
     * For forwarded messages, sender of the original message
     */
    @Nullable
    public User forwardFrom;

    /**
     * For messages forwarded from channels, information about the original channel
     */
    @Nullable
    public Chat forwardFromChat;

    /**
     * For messages forwarded from channels, identifier of the original message in the channel
     */
    @Nullable
    public Integer forwardFromMessageId;

    /**
     * For messages forwarded from channels, signature of the post author if present
     */
    @Nullable
    public String forwardSignature;

    /**
     * Sender's name for messages forwarded from users who disallow adding a link to their account
     * in forwarded messages
     */
    @Nullable
    public String forwardSenderName;

    /**
     * For forwarded messages, date the original message was sent in Unix time
     */
    @Nullable
    public Integer forwardDate;

    /**
     * For replies, the original message. Note that the Message object in this field will not
     * contain further reply_to_message fields even if it itself is a reply.
     */
    @Nullable
    public Message replyToMessage;

    /**
     * Date the message was last edited in Unix time
     */
    @Nullable
    public Integer editDate;

    /**
     * The unique identifier of a media message group this message belongs to
     */
    @Nullable
    public String mediaGroupId;

    /**
     * Signature of the post author for messages in channels
     */
    @Nullable
    public String authorSignature;

    /**
     * For text messages, the actual UTF-8 text of the message, 0-4096 characters
     */
    @Nullable
    @Size(max = 4096)

    public String text;

    /**
     * For text messages, special entities like usernames, URLs, bot commands, etc. that
     * appear in the text
     */
    @Nullable
    public List<MessageEntity> entities;

    /**
     * For messages with a caption, special entities like usernames, URLs, bot commands, etc. that
     * appear in the caption
     */
    @Nullable
    public List<MessageEntity> captionEntities;

    /**
     * Message is an audio file, information about the file
     */
    @Nullable
    public Audio audio;

    /**
     * Message is a general file, information about the file
     */
    @Nullable
    public Document document;

    /**
     * Message is an animation, information about the animation. For backward compatibility,
     * when this field is set, the document field will also be set
     */
    @Nullable
    public Animation animation;

    /**
     * Message is a game, information about the game
     *
     * @see <a href="https://core.telegram.org/bots/api#games">More about games</a>
     */
    @Nullable
    public Game game;

    /**
     * Message is a photo, available sizes of the photo
     */
    @Nullable
    public List<PhotoSize> photo;

    /**
     * Message is a sticker, information about the sticker
     */
    @Nullable
    public Sticker sticker;

    /**
     * Message is a video, information about the video
     */
    @Nullable
    public Video video;

    /**
     * Message is a voice message, information about the file
     */
    @Nullable
    public Voice voice;

    /**
     * Message is a <a href="https://telegram.org/blog/video-messages-and-telescope">video note</a>,
     * information about the video message
     */
    @Nullable
    public VideoNote videoNote;

    /**
     * Caption for the animation, audio, document, photo, video or voice, 0-1024 characters
     */
    @Nullable
    @Size(max = 1024)

    public String caption;

    /**
     * Message is a shared contact, information about the contact
     */
    @Nullable
    public Contact contact;

    /**
     * Message is a shared location, information about the location
     */
    @Nullable
    public Location location;

    /**
     * Message is a venue, information about the venue
     */
    @Nullable
    public Venue venue;

    /**
     * Message is a native poll, information about the poll
     */
    @Nullable
    public Poll poll;

    /**
     * Message is a dice with random value from 1 to 6
     */
    @Nullable
    public Dice dice;

    /**
     * New members that were added to the group or supergroup and information about them
     * (the bot itself may be one of these members)
     */
    @Nullable
    public List<User> newChatMembers;

    /**
     * A member was removed from the group, information about them
     * (this member may be the bot itself)
     */
    @Nullable
    public User leftChatMember;

    /**
     * A chat title was changed to this value
     */
    @Nullable
    public String newChatTitle;

    /**
     * A chat photo was change to this value
     */
    @Nullable
    public List<PhotoSize> newChatPhoto;

    /**
     * Service message: the chat photo was deleted
     */
    @Nullable
    public Boolean deleteChatPhoto;

    /**
     * Service message: the group has been created
     */
    @Nullable
    public Boolean groupChatCreated;

    /**
     * Service message: the supergroup has been created. This field can't be received in a message
     * coming through updates, because bot can’t be a member of a supergroup when it is created.
     * It can only be found in reply_to_message if someone replies to a very first message in a
     * directly created supergroup.
     */
    @Nullable
    public Boolean supergroupChatCreated;

    /**
     * Service message: the channel has been created. This field can't be received in a message
     * coming through updates, because bot can’t be a member of a channel when it is created.
     * It can only be found in reply_to_message if someone replies to a very first message in a
     * channel.
     */
    @Nullable
    public Boolean channelChatCreated;

    /**
     * The group has been migrated to a supergroup with the specified identifier
     */
    @Nullable
    public Long migrateToChatId;

    /**
     * The supergroup has been migrated from a group with the specified identifier
     */
    @Nullable
    public Long migrateFromChatId;

    /**
     * Specified message was pinned. Note that the Message object in this field will not contain
     * further reply_to_message fields even if it is itself a reply.
     */
    @Nullable
    public Message pinnedMessage;

    /**
     * Message is an invoice for a payment, information about the invoice.
     *
     * @see <a href="https://core.telegram.org/bots/api#payments">More about payments</a>
     */
    @Nullable
    public Invoice invoice;

    /**
     * Message is a service message about a successful payment, information about the payment
     *
     * @see <a href="https://core.telegram.org/bots/api#payments">More about payments</a>
     */
    @Nullable
    public SuccessfulPayment successfulPayment;

    /**
     * The domain name of the website on which the user has logged in
     *
     * <a href="https://core.telegram.org/widgets/login">More about Telegram Login</a>
     */
    @Nullable
    public String connectedWebsite;

    /**
     * Telegram Passport data
     */
    @Nullable
    public PassportData passportData;

    /**
     * Inline keyboard attached to the message.
     * login_url buttons are represented as ordinary url buttons.
     */
    @Nullable
    public InlineKeyboardMarkup replyMarkup;
}
