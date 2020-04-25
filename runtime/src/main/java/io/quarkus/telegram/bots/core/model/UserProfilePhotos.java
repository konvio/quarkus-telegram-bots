package io.quarkus.telegram.bots.core.model;

import java.util.List;

import org.jetbrains.annotations.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represent a user's profile pictures.
 *
 * @see <a href="https://core.telegram.org/bots/api#userprofilephotos">Telegram Bot API</a>
 */
public class UserProfilePhotos {

    /**
     * Total number of profile pictures the target user has
     */
    @NotNull
    @JsonProperty("total_count")
    public Integer totalCount;

    /**
     * Requested profile pictures (in up to 4 sizes each)
     */
    @NotNull
    @JsonProperty("photos")
    public List<List<PhotoSize>> photos;
}
