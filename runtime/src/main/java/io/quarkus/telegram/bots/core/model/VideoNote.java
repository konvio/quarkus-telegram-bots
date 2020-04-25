package io.quarkus.telegram.bots.core.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents a video message.
 *
 * @see <a href="https://core.telegram.org/bots/api#videonote">Telegram Bot API</a>
 * @see <a href="https://telegram.org/blog/video-messages-and-telescope">Video Messages and Telescope</a>
 * @since v.4.0
 */
public class VideoNote {

    /**
     * Identifier for this file, which can be used to download or reuse the file
     */
    @NotNull
    @JsonProperty("file_id")
    public String fileId;

    /**
     * Unique identifier for this file, which is supposed to be the same over time and for different
     * bots. Can't be used to download or reuse the file.
     */
    @NotNull
    @JsonProperty("file_unique_id")
    public String fileUniqueId;

    /**
     * Video width and height (diameter of the video message) as defined by sender
     */
    @NotNull
    @JsonProperty("length")
    public Integer length;

    /**
     * Duration of the video in seconds as defined by sender
     */
    @NotNull
    @JsonProperty("duration")
    public Integer duration;

    /**
     * Video thumbnail
     */
    @Nullable
    @JsonProperty("thumb")
    public PhotoSize thumb;

    /**
     * File size
     */
    @Nullable
    @JsonProperty("file_size")
    public Integer fileSize;
}
