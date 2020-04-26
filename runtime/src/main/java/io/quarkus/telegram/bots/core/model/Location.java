package io.quarkus.telegram.bots.core.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.jetbrains.annotations.NotNull;

/**
 * This object represents a point on the map.
 *
 * @see <a href="https://core.telegram.org/bots/api#location">Telegram Bot API</a>
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Location {

    /**
     * Longitude as defined by sender
     */
    @NotNull
    public Double longitude;

    /**
     * Latitude as defined by sender
     */
    @NotNull
    public Double latitude;
}
