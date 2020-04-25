package io.quarkus.telegram.bots.core.model;

import java.util.List;

import org.jetbrains.annotations.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents an answer of a user in a non-anonymous poll.
 *
 * @see <a href="https://core.telegram.org/bots/api#pollanswer">Telegram Bot API</a>
 */
public class PollAnswer {

    /**
     * Unique poll identifier
     */
    @NotNull
    @JsonProperty("poll_id")
    public String pollId;

    /**
     * The user, who changed the answer to the poll
     */
    @NotNull
    @JsonProperty("user")
    public User user;

    /**
     * 0-based identifiers of answer options, chosen by the user.
     * May be empty if the user retracted their vote.
     */
    @NotNull
    @JsonProperty("option_ids")
    public List<Integer> optionIds;
}
