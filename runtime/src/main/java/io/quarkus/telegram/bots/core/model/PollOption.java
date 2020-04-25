package io.quarkus.telegram.bots.core.model;

import io.quarkus.telegram.bots.annotations.TelegramApiModel;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.Size;

/**
 * This object contains information about one answer option in a poll.
 *
 * @see <a href="https://core.telegram.org/bots/api#polloption">Telegram Bot API</a>
 */
@TelegramApiModel
public class PollOption {

    /**
     * Option text, 1-100 characters
     */
    @NotNull
    @Size(min = 1, max = 100)

    public String text;

    /**
     * Number of users that voted for this option
     */
    @NotNull
    public Integer voterCount;
}
