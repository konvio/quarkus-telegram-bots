package io.quarkus.telegram.bots.core.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This object represents a venue.
 *
 * @see <a href="https://core.telegram.org/bots/api#venue">Telegram Bot API</a>
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Venue {

    /**
     * Venue location
     */
    @NotNull
    public Location location;

    /**
     * Name of the venue
     */
    @NotNull
    public String title;

    /**
     * Address of the venue
     */
    @NotNull
    public String address;

    /**
     * Foursquare identifier of the venue
     */
    @Nullable
    public String foursquareId;

    /**
     * Foursquare type of the venue. (For example, “arts_entertainment/default”,
     * “arts_entertainment/aquarium” or “food/icecream”.)
     */
    @Nullable
    public String foursquareType;
}
