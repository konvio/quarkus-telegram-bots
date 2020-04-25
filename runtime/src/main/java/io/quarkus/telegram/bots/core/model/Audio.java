package io.quarkus.telegram.bots.core.model;

import io.quarkus.telegram.bots.annotations.TelegramApiModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This object represents an audio file to be treated as music by the Telegram clients.
 *
 * @see <a href="https://core.telegram.org/bots/api#audio">Telegram Bot API</a>
 */
@TelegramApiModel
public class Audio {

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
     * Performer of the audio as defined by sender or by audio tags
     */
    @Nullable
    public String performer;

    /**
     * Title of the audio as defined by sender or by audio tags
     */
    @Nullable
    public String title;

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

    /**
     * Thumbnail of the album cover to which the music file belongs
     */
    @Nullable
    public PhotoSize thumb;
}
