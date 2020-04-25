package io.quarkus.telegram.bots.core.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents a venue.
 *
 * @see <a href="https://core.telegram.org/bots/api#venue">Telegram Bot API</a>
 */
public class Venue {

    /**
     * Venue location
     */
    @NotNull
    @JsonProperty("location")
    public Location location;

    /**
     * Name of the venue
     */
    @NotNull
    @JsonProperty("title")
    public String title;

    /**
     * Address of the venue
     */
    @NotNull
    @JsonProperty("address")
    public String address;

    /**
     * Foursquare identifier of the venue
     */
    @Nullable
    @JsonProperty("foursquare_id")
    public String foursquareId;

    /**
     * Foursquare type of the venue. (For example, “arts_entertainment/default”,
     * “arts_entertainment/aquarium” or “food/icecream”.)
     */
    @Nullable
    @JsonProperty("foursquare_type")
    public String foursquareType;
}
