package io.quarkus.telegram.bots.core.client;

import io.smallrye.mutiny.Uni;

@FunctionalInterface
interface BotApiRequestExecutable<BotApiRequestT extends BotApiRequest<ResultT>, ResultT> {

    Uni<ResultT> execute(BotApiRequestT request);
}
