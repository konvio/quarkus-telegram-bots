package io.quarkus.telegram.bots.core.model;

import io.quarkus.telegram.bots.annotations.TelegramApiModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This object represents a video message.
 *
 * @see <a href="https://core.telegram.org/bots/api#videonote">Telegram Bot API</a>
 * @see <a href="https://telegram.org/blog/video-messages-and-telescope">Video Messages and Telescope</a>
 * @since v.4.0
 */
@TelegramApiModel
public class VideoNote {

    /**
     * Identifier for this file, which can be used to download or reuse the file
     */
    @NotNull
    public String fileId;

    /**
     * Unique identifier for this file, which is supposed to be the same over time and for different
     * bots. Can't be used to download or reuse the file.
     */
    @NotNull
    public String fileUniqueId;

    /**
     * Video width and height (diameter of the video message) as defined by sender
     */
    @NotNull
    public Integer length;

    /**
     * Duration of the video in seconds as defined by sender
     */
    @NotNull
    public Integer duration;

    /**
     * Video thumbnail
     */
    @Nullable
    public PhotoSize thumb;

    /**
     * File size
     */
    @Nullable
    public Integer fileSize;
}
