package io.quarkiverse.discord4j.runtime.config;

import java.util.Optional;

import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.gateway.intent.Intent;
import io.smallrye.config.ConfigMapping;

@ConfigMapping()
public class Discord4jConfig {
    /**
     * The bot token used to authenticate to the Discord API.
     */
    public String token;

    /**
     * Presence configuration
     */
    public PresenceConfig presence;

    /**
     * The Gateway intents that should be enabled. Specific Gateway intents are required to receive certain Gateway
     * events. Non-privileged intents will be enabled by default.
     */
    public Optional<Intent[]> enabledIntents;

    /**
     * The strategy to use for retrieving Discord entities. Default is {@code cache-fallback-rest}.
     */
    public Optional<EntityRetrievalStrategy> entityRetrievalStrategy;

    /**
     * Sharding configuration
     */
    public ShardingConfig sharding;
}
