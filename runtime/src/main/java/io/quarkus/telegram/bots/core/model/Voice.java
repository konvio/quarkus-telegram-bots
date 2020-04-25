package io.quarkus.telegram.bots.core.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents a voice note.
 *
 * @see <a href="https://core.telegram.org/bots/api#voice">Telegram Bot API</a>
 */
public class Voice {

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
     * Duration of the audio in seconds as defined by sender
     */
    @NotNull
    @JsonProperty("duration")
    public Integer duration;

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
