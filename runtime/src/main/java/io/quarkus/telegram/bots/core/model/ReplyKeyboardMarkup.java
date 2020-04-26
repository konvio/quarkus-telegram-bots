package io.quarkus.telegram.bots.core.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * This object represents a custom keyboard with reply options.
 *
 * @see <a href="https://core.telegram.org/bots#keyboards">Introduction to bots</a>
 * @see <a href="https://core.telegram.org/bots/api#replykeyboardmarkup">Telegram Bot API</a>
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ReplyKeyboardMarkup {

    /**
     * Array of button rows, each represented by an Array of {@link KeyboardButton} objects
     */
    @NotNull
    public List<List<KeyboardButton>> keyboard;

    /**
     * Requests clients to resize the keyboard vertically for optimal fit (e.g., make the keyboard
     * smaller if there are just two rows of buttons). Defaults to false, in which case the custom
     * keyboard is always of the same height as the app's standard keyboard.
     */
    @Nullable
    public Boolean resizeKeyboard;

    /**
     * Requests clients to hide the keyboard as soon as it's been used. The keyboard will still be
     * available, but clients will automatically display the usual letter-keyboard in the chat – the
     * user can press a special button in the input field to see the custom keyboard again.
     * Defaults to false.
     */
    @Nullable
    public Boolean oneTimeKeyboard;

    /**
     * Use this parameter if you want to show the keyboard to specific users only.
     * Targets: 1) users that are @mentioned in the text of the Message object;
     * 2) if the bot's message is a reply (has reply_to_message_id), sender of the original message.
     * <p>
     * Example: A user requests to change the bot's language, bot replies to the request with
     * a keyboard to select the new language. Other users in the group don’t see the keyboard.
     */
    @Nullable
    public Boolean selective;
}
