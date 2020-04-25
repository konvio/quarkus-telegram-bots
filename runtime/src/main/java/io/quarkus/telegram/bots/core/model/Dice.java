package io.quarkus.telegram.bots.core.model;

import io.quarkus.telegram.bots.annotations.TelegramApiModel;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * This object represents a dice with random value from 1 to 6. (Yes, we're aware of the “proper”
 * singular of die. But it's awkward, and we decided to help it change. One dice at a time!)
 *
 * @see <a href="https://core.telegram.org/bots/api#dice">Telegram Bot API</a>
 */
@TelegramApiModel
public class Dice {

    /**
     * Value of the dice, 1-6
     */
    @NotNull
    @Min(1)
    @Max(6)

    public Integer value;
}
