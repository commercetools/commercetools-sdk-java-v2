
package com.commercetools.importapi.models.importcontainers;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TimeToLiveRetentionPolicyBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TimeToLiveRetentionPolicy timeToLiveRetentionPolicy = TimeToLiveRetentionPolicy.builder()
 *             .config(configBuilder -> configBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TimeToLiveRetentionPolicyBuilder implements Builder<TimeToLiveRetentionPolicy> {

    private com.commercetools.importapi.models.importcontainers.TimeToLiveConfig config;

    /**
     *  <p>The configuration of the time to live retention policy.</p>
     * @param builder function to build the config value
     * @return Builder
     */

    public TimeToLiveRetentionPolicyBuilder config(
            Function<com.commercetools.importapi.models.importcontainers.TimeToLiveConfigBuilder, com.commercetools.importapi.models.importcontainers.TimeToLiveConfigBuilder> builder) {
        this.config = builder.apply(com.commercetools.importapi.models.importcontainers.TimeToLiveConfigBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The configuration of the time to live retention policy.</p>
     * @param builder function to build the config value
     * @return Builder
     */

    public TimeToLiveRetentionPolicyBuilder withConfig(
            Function<com.commercetools.importapi.models.importcontainers.TimeToLiveConfigBuilder, com.commercetools.importapi.models.importcontainers.TimeToLiveConfig> builder) {
        this.config = builder.apply(com.commercetools.importapi.models.importcontainers.TimeToLiveConfigBuilder.of());
        return this;
    }

    /**
     *  <p>The configuration of the time to live retention policy.</p>
     * @param config value to be set
     * @return Builder
     */

    public TimeToLiveRetentionPolicyBuilder config(
            final com.commercetools.importapi.models.importcontainers.TimeToLiveConfig config) {
        this.config = config;
        return this;
    }

    /**
     *  <p>The configuration of the time to live retention policy.</p>
     * @return config
     */

    public com.commercetools.importapi.models.importcontainers.TimeToLiveConfig getConfig() {
        return this.config;
    }

    /**
     * builds TimeToLiveRetentionPolicy with checking for non-null required values
     * @return TimeToLiveRetentionPolicy
     */
    public TimeToLiveRetentionPolicy build() {
        Objects.requireNonNull(config, TimeToLiveRetentionPolicy.class + ": config is missing");
        return new TimeToLiveRetentionPolicyImpl(config);
    }

    /**
     * builds TimeToLiveRetentionPolicy without checking for non-null required values
     * @return TimeToLiveRetentionPolicy
     */
    public TimeToLiveRetentionPolicy buildUnchecked() {
        return new TimeToLiveRetentionPolicyImpl(config);
    }

    /**
     * factory method for an instance of TimeToLiveRetentionPolicyBuilder
     * @return builder
     */
    public static TimeToLiveRetentionPolicyBuilder of() {
        return new TimeToLiveRetentionPolicyBuilder();
    }

    /**
     * create builder for TimeToLiveRetentionPolicy instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TimeToLiveRetentionPolicyBuilder of(final TimeToLiveRetentionPolicy template) {
        TimeToLiveRetentionPolicyBuilder builder = new TimeToLiveRetentionPolicyBuilder();
        builder.config = template.getConfig();
        return builder;
    }

}
