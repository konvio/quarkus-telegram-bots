package io.quarkus.telegram.bots.core.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Upon receiving a message with this object, Telegram clients will remove the current custom
 * keyboard and display the default letter-keyboard.
 * By default, custom keyboards are displayed until a new keyboard is sent by a bot. An exception
 * is made for one-time keyboards that are hidden immediately after the user presses a button.
 *
 * @see <a href="https://core.telegram.org/bots/api#replykeyboardremove">Telegram Bot API</a>
 * @see ReplyKeyboardMarkup
 */
public class ReplyKeyboardRemove {

    /**
     * Requests clients to remove the custom keyboard (user will not be able to summon this
     * keyboard; if you want to hide the keyboard from sight but keep it accessible,
     * use {@link ReplyKeyboardMarkup#oneTimeKeyboard}
     */
    @NotNull
    @JsonProperty("remove_keyboard")
    public Boolean removeKeyboard;

    /**
     * Use this parameter if you want to show the keyboard to specific users only.
     * Targets: 1) users that are @mentioned in the text of the Message object;
     * 2) if the bot's message is a reply (has reply_to_message_id), sender of the original message.
     * <p>
     * Example: A user requests to change the bot's language, bot replies to the request with
     * a keyboard to select the new language. Other users in the group don’t see the keyboard.
     */
    @Nullable
    @JsonProperty("selective")
    public Boolean selective;
}
