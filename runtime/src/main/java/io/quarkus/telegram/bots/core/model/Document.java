package io.quarkus.telegram.bots.core.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This object represents a general file (as opposed to photos, voice messages and audio files).
 *
 * @see <a href="https://core.telegram.org/bots/api#document">Telegram Bot API</a>
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Document {

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
     * Document thumbnail as defined by sender
     */
    @Nullable
    public PhotoSize thumb;

    /**
     * Original filename as defined by sender
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
