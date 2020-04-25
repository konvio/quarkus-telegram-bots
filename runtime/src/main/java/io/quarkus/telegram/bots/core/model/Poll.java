package io.quarkus.telegram.bots.core.model;

import io.quarkus.telegram.bots.annotations.TelegramApiModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.validation.constraints.Size;
import java.util.List;

/**
 * This object contains information about a poll.
 *
 * @see <a href="https://core.telegram.org/bots/api#poll">Telegram Bot API</a>
 */
@TelegramApiModel
public class Poll {

    /**
     * Unique poll identifier
     */
    @NotNull
    public String id;

    /**
     * Poll question, 1-255 characters
     */
    @NotNull
    @Size(min = 1, max = 255)

    public String question;

    /**
     * List of poll options
     */
    @NotNull
    public List<PollOption> options;

    /**
     * Total number of users that voted in the poll
     */
    @NotNull
    public Integer totalVoterCount;

    /**
     * True, if the poll is closed
     */
    @NotNull
    public Boolean isClosed;

    /**
     * True, if the poll is anonymous
     */
    @NotNull
    public Boolean isAnonymous;

    /**
     * Poll type, currently can be “regular” or “quiz”
     */
    @NotNull
    public String type;

    /**
     * True, if the poll allows multiple answers
     */
    @NotNull
    public Boolean allowsMultipleAnswers;

    /**
     * 0-based identifier of the correct answer option.
     * Available only for polls in the quiz mode, which are closed, or was sent (not forwarded) by
     * the bot or to the private chat with the bot.
     */
    @Nullable
    public Integer correctOptionId;
}
