package io.quarkus.telegram.bots.core.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This object represents a voice note.
 *
 * @see <a href="https://core.telegram.org/bots/api#voice">Telegram Bot API</a>
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Voice {

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
     * Duration of the audio in seconds as defined by sender
     */
    @NotNull
    public Integer duration;

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
