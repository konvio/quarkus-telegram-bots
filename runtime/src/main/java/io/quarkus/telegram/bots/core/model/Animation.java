package io.quarkus.telegram.bots.core.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents an animation file (GIF or H.264/MPEG-4 AVC video without sound).
 *
 * @see <a href="https://core.telegram.org/bots/api#animation">Telegram Bot API</a>
 */
public class Animation {

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
     * Video width as defined by sender
     */
    @NotNull
    @JsonProperty("width")
    public Integer width;

    /**
     * Video height as defined by sender
     */
    @NotNull
    @JsonProperty("height")
    public Integer height;

    /**
     * Duration of the video in seconds as defined by sender
     */
    @NotNull
    @JsonProperty("duration")
    public Integer duration;

    /**
     * Animation thumbnail as defined by sender
     */
    @Nullable
    @JsonProperty("thumb")
    public PhotoSize thumb;

    /**
     * Original animation filename as defined by sender
     */
    @Nullable
    @JsonProperty("file_name")
    public String fileName;

    /**
     * MIME type of the file as defined by sender
     */
    @Nullable
    @JsonProperty("mime_type")
    public String mimeType;

    /**
     * File size
     */
    @Nullable
    @JsonProperty("file_size")
    public Integer fileSize;
}
