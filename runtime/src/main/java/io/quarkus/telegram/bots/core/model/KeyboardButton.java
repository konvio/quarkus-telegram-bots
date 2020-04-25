package io.quarkus.telegram.bots.core.model;

import io.quarkus.telegram.bots.annotations.TelegramApiModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This object represents one button of the reply keyboard.
 * For simple text buttons String can be used instead of this object to specify text of the button.
 * Optional fields request_contact, request_location, and request_poll are mutually exclusive.
 *
 * @see <a href="https://core.telegram.org/bots/api#keyboardbutton">Telegram Bot API</a>
 */
@TelegramApiModel
public class KeyboardButton {

    /**
     * Text of the button. If none of the optional fields are used, it will be sent as a message
     * when the button is pressed.
     */
    @NotNull
    public String text;

    /**
     * If True, the user's phone number will be sent as a contact when the button is pressed.
     * Available in private chats only.
     */
    @Nullable
    public Boolean requestContact;

    /**
     * If True, the user's current location will be sent when the button is pressed.
     * Available in private chats only
     */
    @Nullable
    public Boolean requestLocation;

    /**
     * If specified, the user will be asked to create a poll and send it to the bot when the button
     * is pressed. Available in private chats only
     */
    @Nullable
    public KeyboardButtonPollType requestPoll;
}
