package io.quarkus.telegram.bots.core.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents one size of a photo or a
 * <a href="https://core.telegram.org/bots/api#document">file</a> /
 * <a href="https://core.telegram.org/bots/api#sticker">sticker</a> thumbnail.
 *
 * @see <a href="https://core.telegram.org/bots/api#photosize">Telegram Bot API</a>
 */
public class PhotoSize {

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
     * Photo width
     */
    @NotNull
    @JsonProperty("width")
    public Integer width;

    /**
     * Photo height
     */
    @NotNull
    @JsonProperty("height")
    public Integer height;

    /**
     * File size
     */
    @Nullable
    @JsonProperty("file_size")
    public Integer fileSize;
}
