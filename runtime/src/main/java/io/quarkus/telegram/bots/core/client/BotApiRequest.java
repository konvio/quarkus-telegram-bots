package io.quarkus.telegram.bots.core.client;

import io.smallrye.mutiny.Uni;

abstract class BotApiRequest<T> {

    private BotApiRequestExecutable<BotApiRequest<T>, T> botApiRequestExecutable;

    BotApiRequest<T> onSend(BotApiRequestExecutable<BotApiRequest<T>, T> botApiRequestExecutable) {
        this.botApiRequestExecutable = botApiRequestExecutable;
        return this;
    }

    public Uni<T> send() {
        return botApiRequestExecutable.execute(this);
    }
}
