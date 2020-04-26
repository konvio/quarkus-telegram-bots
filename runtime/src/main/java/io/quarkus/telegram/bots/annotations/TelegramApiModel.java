package io.quarkus.telegram.bots.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public @interface TelegramApiModel {
}
