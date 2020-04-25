package io.quarkus.telegram.bots.core.model;

import io.quarkus.telegram.bots.annotations.TelegramApiModel;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * This object represents an answer of a user in a non-anonymous poll.
 *
 * @see <a href="https://core.telegram.org/bots/api#pollanswer">Telegram Bot API</a>
 */
@TelegramApiModel
public class PollAnswer {

    /**
     * Unique poll identifier
     */
    @NotNull
    public String pollId;

    /**
     * The user, who changed the answer to the poll
     */
    @NotNull
    public User user;

    /**
     * 0-based identifiers of answer options, chosen by the user.
     * May be empty if the user retracted their vote.
     */
    @NotNull
    public List<Integer> optionIds;
}
