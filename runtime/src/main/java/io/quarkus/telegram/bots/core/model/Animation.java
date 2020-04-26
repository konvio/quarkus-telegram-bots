package io.quarkus.telegram.bots.core.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This object represents an animation file (GIF or H.264/MPEG-4 AVC video without sound).
 *
 * @see <a href="https://core.telegram.org/bots/api#animation">Telegram Bot API</a>
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Animation {

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
     * Video width as defined by sender
     */
    @NotNull
    public Integer width;

    /**
     * Video height as defined by sender
     */
    @NotNull
    public Integer height;

    /**
     * Duration of the video in seconds as defined by sender
     */
    @NotNull
    public Integer duration;

    /**
     * Animation thumbnail as defined by sender
     */
    @Nullable
    public PhotoSize thumb;

    /**
     * Original animation filename as defined by sender
     */
    @Nullable
    public String fileName;

    /**
     * MIME type of the file as defined by sender
     */
    @Nullable
    public String mimeType;

    /**
     * File size
     */
    @Nullable
    public Integer fileSize;
}
