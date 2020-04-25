package io.quarkus.telegram.bots.core.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents a file ready to be downloaded. The file can be downloaded via the link
 * https://api.telegram.org/file/bot{token}/{file_path}. It is guaranteed that the link will be
 * valid for at least 1 hour. When the link expires, a new one can be requested by calling getFile.
 *
 * @see <a href="https://core.telegram.org/bots/api#file">Telegram Bot API</a>
 */
public class File {

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
     * File size, if known
     */
    @Nullable
    @JsonProperty("file_size")
    public Integer fileSize;

    /**
     * File path. Use https://api.telegram.org/file/bot{token}/{file_path} to get the file.
     */
    @NotNull
    @JsonProperty("file_path")
    public String filePath;
}
