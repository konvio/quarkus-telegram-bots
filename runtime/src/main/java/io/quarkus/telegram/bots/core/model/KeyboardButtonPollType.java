package io.quarkus.telegram.bots.core.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.jetbrains.annotations.Nullable;

/**
 * This object represents type of a poll, which is allowed to be created and sent when the
 * corresponding button is pressed.
 *
 * @see <a href="https://core.telegram.org/bots/api#keyboardbuttonpolltype">Telegram Bot API</a>
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class KeyboardButtonPollType {

    /**
     * If "quiz" is passed, the user will be allowed to create only polls in the quiz mode.
     * If "regular" is passed, only regular polls will be allowed.
     * Otherwise, the user will be allowed to create a poll of any type.
     */
    @Nullable
    public String type;
}
