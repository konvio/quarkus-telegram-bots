package io.quarkus.telegram.bots.core.model;

import javax.validation.constraints.Size;

import org.jetbrains.annotations.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object contains information about one answer option in a poll.
 *
 * @see <a href="https://core.telegram.org/bots/api#polloption">Telegram Bot API</a>
 */
public class PollOption {

    /**
     * Option text, 1-100 characters
     */
    @NotNull
    @Size(min = 1, max = 100)
    @JsonProperty("text")
    public String text;

    /**
     * Number of users that voted for this option
     */
    @NotNull
    @JsonProperty("voter_count")
    public Integer voterCount;
}
