package io.quarkus.telegram.bots.core.model;

import io.quarkus.telegram.bots.annotations.TelegramApiModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This object represents a phone contact.
 *
 * @see <a href="https://core.telegram.org/bots/api#contact">Telegram Bot API</a>
 */
@TelegramApiModel
public class Contact {

    /**
     * Contact's phone number
     */
    @NotNull
    public String phoneNumber;

    /**
     * Contact's first name
     */
    @NotNull
    public String firstName;

    /**
     * Contact's last name
     */
    @Nullable
    public String lastName;

    /**
     * Contact's user identifier in Telegram
     */
    @Nullable
    public String userId;

    /**
     * Additional data about the contact in the form of a <a href="https://en.wikipedia.org/wiki/VCard">vCard</a>
     */
    @Nullable
    public String vcard;
}
