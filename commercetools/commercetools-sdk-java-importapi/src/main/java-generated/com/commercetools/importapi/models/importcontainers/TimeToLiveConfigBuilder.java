
package com.commercetools.importapi.models.importcontainers;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TimeToLiveConfigBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TimeToLiveConfig timeToLiveConfig = TimeToLiveConfig.builder()
 *             .timeToLive("{timeToLive}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TimeToLiveConfigBuilder implements Builder<TimeToLiveConfig> {

    private String timeToLive;

    /**
     *  <p>The time to live of the ImportContainer. Used to generate the <code>expiresAt</code> value of the ImportContainer. The lowest accepted value is <code>1h</code> and the highest accepted value is <code>30d</code>.</p>
     * @param timeToLive value to be set
     * @return Builder
     */

    public TimeToLiveConfigBuilder timeToLive(final String timeToLive) {
        this.timeToLive = timeToLive;
        return this;
    }

    /**
     *  <p>The time to live of the ImportContainer. Used to generate the <code>expiresAt</code> value of the ImportContainer. The lowest accepted value is <code>1h</code> and the highest accepted value is <code>30d</code>.</p>
     * @return timeToLive
     */

    public String getTimeToLive() {
        return this.timeToLive;
    }

    /**
     * builds TimeToLiveConfig with checking for non-null required values
     * @return TimeToLiveConfig
     */
    public TimeToLiveConfig build() {
        Objects.requireNonNull(timeToLive, TimeToLiveConfig.class + ": timeToLive is missing");
        return new TimeToLiveConfigImpl(timeToLive);
    }

    /**
     * builds TimeToLiveConfig without checking for non-null required values
     * @return TimeToLiveConfig
     */
    public TimeToLiveConfig buildUnchecked() {
        return new TimeToLiveConfigImpl(timeToLive);
    }

    /**
     * factory method for an instance of TimeToLiveConfigBuilder
     * @return builder
     */
    public static TimeToLiveConfigBuilder of() {
        return new TimeToLiveConfigBuilder();
    }

    /**
     * create builder for TimeToLiveConfig instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TimeToLiveConfigBuilder of(final TimeToLiveConfig template) {
        TimeToLiveConfigBuilder builder = new TimeToLiveConfigBuilder();
        builder.timeToLive = template.getTimeToLive();
        return builder;
    }

}
