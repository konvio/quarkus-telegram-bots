package io.quarkus.telegram.bots.core.model;

import io.quarkus.telegram.bots.annotations.TelegramApiModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This object represents a video file.
 *
 * @see <a href="https://core.telegram.org/bots/api#video">Telegram Bot API</a>
 */
@TelegramApiModel
public class Video {

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
     * Video thumbnail
     */
    @Nullable
    public PhotoSize thumb;

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
