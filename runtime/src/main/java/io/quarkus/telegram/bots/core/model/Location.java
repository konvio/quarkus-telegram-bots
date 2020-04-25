package io.quarkus.telegram.bots.core.model;

import org.jetbrains.annotations.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents a point on the map.
 *
 * @see <a href="https://core.telegram.org/bots/api#location">Telegram Bot API</a>
 */
public class Location {

    /**
     * Longitude as defined by sender
     */
    @NotNull
    @JsonProperty("longitude")
    public Double longitude;

    /**
     * Latitude as defined by sender
     */
    @NotNull
    @JsonProperty("latitude")
    public Double latitude;
}
