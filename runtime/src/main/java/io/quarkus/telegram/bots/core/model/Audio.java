package io.quarkus.telegram.bots.core.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents an audio file to be treated as music by the Telegram clients.
 *
 * @see <a href="https://core.telegram.org/bots/api#audio">Telegram Bot API</a>
 */
public class Audio {

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
     * Performer of the audio as defined by sender or by audio tags
     */
    @Nullable
    @JsonProperty("performer")
    public String performer;

    /**
     * Title of the audio as defined by sender or by audio tags
     */
    @Nullable
    @JsonProperty("title")
    public String title;

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

    /**
     * Thumbnail of the album cover to which the music file belongs
     */
    @Nullable
    @JsonProperty("thumb")
    public PhotoSize thumb;
}
