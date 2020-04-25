package io.quarkus.telegram.bots.core.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents a general file (as opposed to photos, voice messages and audio files).
 *
 * @see <a href="https://core.telegram.org/bots/api#document">Telegram Bot API</a>
 */
public class Document {

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
     * Document thumbnail as defined by sender
     */
    @Nullable
    @JsonProperty("thumb")
    public PhotoSize thumb;

    /**
     * Original filename as defined by sender
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
