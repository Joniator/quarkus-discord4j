package io.quarkiverse.discord4j.deployment;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;
import io.smallrye.config.WithName;

@ConfigMapping(prefix = "discord4j")
public interface Discord4jBuildTimeConfig {
    /**
     * Whether a health check should be published for the Gateway clients managed by this extension if the
     * quarkus-smallrye-health extension is present
     */
    @WithName("health.enabled")
    @WithDefault("true")
    public boolean healthEnabled();

    /**
     * Whether metrics should be collected for the Gateway clients managed by this extension if the
     * quarkus-micrometer or quarkus-smallrye-metrics extension is present
     */
    @WithName("metrics.enabled")
    public boolean metricsEnabled();
}
