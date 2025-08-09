package io.quarkiverse.discord4j.commands.runtime.config;

import java.util.Map;

import io.smallrye.config.ConfigMapping;

@ConfigMapping(prefix = "discord4j")
public interface Discord4jCommandsConfig {
    /**
     * Global commands configuration
     */
    public GlobalCommandsConfig globalCommands();

    /**
     * Guild commands configuration
     */
    public Map<String, GuildCommandsConfig> guildCommands();
}
