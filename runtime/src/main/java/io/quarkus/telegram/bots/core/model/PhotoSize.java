package io.quarkus.telegram.bots.core.model;

import io.quarkus.telegram.bots.annotations.TelegramApiModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This object represents one size of a photo or a
 * <a href="https://core.telegram.org/bots/api#document">file</a> /
 * <a href="https://core.telegram.org/bots/api#sticker">sticker</a> thumbnail.
 *
 * @see <a href="https://core.telegram.org/bots/api#photosize">Telegram Bot API</a>
 */
@TelegramApiModel
public class PhotoSize {

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
     * Photo width
     */
    @NotNull
    public Integer width;

    /**
     * Photo height
     */
    @NotNull
    public Integer height;

    /**
     * File size
     */
    @Nullable
    public Integer fileSize;
}
