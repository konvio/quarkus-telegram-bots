package io.quarkus.telegram.bots.core.model;

import io.quarkus.telegram.bots.annotations.TelegramApiModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This object represents a file ready to be downloaded. The file can be downloaded via the link
 * https://api.telegram.org/file/bot{token}/{file_path}. It is guaranteed that the link will be
 * valid for at least 1 hour. When the link expires, a new one can be requested by calling getFile.
 *
 * @see <a href="https://core.telegram.org/bots/api#file">Telegram Bot API</a>
 */
@TelegramApiModel
public class File {

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
     * File size, if known
     */
    @Nullable
    public Integer fileSize;

    /**
     * File path. Use https://api.telegram.org/file/bot{token}/{file_path} to get the file.
     */
    @NotNull
    public String filePath;
}
