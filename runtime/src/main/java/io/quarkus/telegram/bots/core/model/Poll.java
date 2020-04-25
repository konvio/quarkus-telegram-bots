package io.quarkus.telegram.bots.core.model;

import java.util.List;

import javax.validation.constraints.Size;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object contains information about a poll.
 *
 * @see <a href="https://core.telegram.org/bots/api#poll">Telegram Bot API</a>
 */
public class Poll {

    /**
     * Unique poll identifier
     */
    @NotNull
    @JsonProperty("id")
    public String id;

    /**
     * Poll question, 1-255 characters
     */
    @NotNull
    @Size(min = 1, max = 255)
    @JsonProperty("question")
    public String question;

    /**
     * List of poll options
     */
    @NotNull
    @JsonProperty("options")
    public List<PollOption> options;

    /**
     * Total number of users that voted in the poll
     */
    @NotNull
    @JsonProperty("total_voter_count")
    public Integer totalVoterCount;

    /**
     * True, if the poll is closed
     */
    @NotNull
    @JsonProperty("is_closed")
    public Boolean isClosed;

    /**
     * True, if the poll is anonymous
     */
    @NotNull
    @JsonProperty("is_anonymous")
    public Boolean isAnonymous;

    /**
     * Poll type, currently can be “regular” or “quiz”
     */
    @NotNull
    @JsonProperty("type")
    public String type;

    /**
     * True, if the poll allows multiple answers
     */
    @NotNull
    @JsonProperty("allows_multiple_answers")
    public Boolean allowsMultipleAnswers;

    /**
     * 0-based identifier of the correct answer option.
     * Available only for polls in the quiz mode, which are closed, or was sent (not forwarded) by
     * the bot or to the private chat with the bot.
     */
    @Nullable
    @JsonProperty("correct_option_id")
    public Integer correctOptionId;
}
