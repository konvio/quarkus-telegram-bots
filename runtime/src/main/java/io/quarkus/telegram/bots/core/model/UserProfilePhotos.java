package io.quarkus.telegram.bots.core.model;

import io.quarkus.telegram.bots.annotations.TelegramApiModel;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * This object represent a user's profile pictures.
 *
 * @see <a href="https://core.telegram.org/bots/api#userprofilephotos">Telegram Bot API</a>
 */
@TelegramApiModel
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
