package io.quarkus.telegram.bots.core.model;

import io.quarkus.telegram.bots.annotations.TelegramApiModel;
import org.jetbrains.annotations.NotNull;

/**
 * This object represents a point on the map.
 *
 * @see <a href="https://core.telegram.org/bots/api#location">Telegram Bot API</a>
 */
@TelegramApiModel
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
