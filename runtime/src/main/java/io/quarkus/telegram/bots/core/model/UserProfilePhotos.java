package io.quarkus.telegram.bots.core.model;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.jetbrains.annotations.NotNull;

import io.quarkus.telegram.bots.annotations.TelegramApiModel;

/**
 * This object represent a user's profile pictures.
 *
 * @see <a href="https://core.telegram.org/bots/api#userprofilephotos">Telegram Bot API</a>
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserProfilePhotos {

    /**
     * Total number of profile pictures the target user has
     */
    @NotNull
    public Integer totalCount;

    /**
     * Requested profile pictures (in up to 4 sizes each)
     */
    @NotNull
    public List<List<PhotoSize>> photos;
}
