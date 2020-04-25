package io.quarkus.telegram.bots.core.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents a phone contact.
 *
 * @see <a href="https://core.telegram.org/bots/api#contact">Telegram Bot API</a>
 */
public class Contact {

    /**
     * Contact's phone number
     */
    @NotNull
    @JsonProperty("phone_number")
    public String phoneNumber;

    /**
     * Contact's first name
     */
    @NotNull
    @JsonProperty("first_name")
    public String firstName;

    /**
     * Contact's last name
     */
    @Nullable
    @JsonProperty("last_name")
    public String lastName;

    /**
     * Contact's user identifier in Telegram
     */
    @Nullable
    @JsonProperty("user_id")
    public String userId;

    /**
     * Additional data about the contact in the form of a <a href="https://en.wikipedia.org/wiki/VCard">vCard</a>
     */
    @Nullable
    @JsonProperty("vcard")
    public String vcard;
}
