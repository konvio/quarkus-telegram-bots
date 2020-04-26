package io.quarkus.telegram.bots.core.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.Size;

/**
 * This object contains information about one answer option in a poll.
 *
 * @see <a href="https://core.telegram.org/bots/api#polloption">Telegram Bot API</a>
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
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
