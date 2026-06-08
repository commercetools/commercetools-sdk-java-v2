
package com.commercetools.importapi.models.importcontainers;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * TimeToLiveConfig
 *
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
@JsonDeserialize(as = TimeToLiveConfigImpl.class)
public interface TimeToLiveConfig {

    /**
     *  <p>The time to live of the ImportContainer. Used to generate the <code>expiresAt</code> value of the ImportContainer. The lowest accepted value is <code>1h</code> and the highest accepted value is <code>30d</code>.</p>
     * @return timeToLive
     */
    @NotNull
    @JsonProperty("timeToLive")
    public String getTimeToLive();

    /**
     *  <p>The time to live of the ImportContainer. Used to generate the <code>expiresAt</code> value of the ImportContainer. The lowest accepted value is <code>1h</code> and the highest accepted value is <code>30d</code>.</p>
     * @param timeToLive value to be set
     */

    public void setTimeToLive(final String timeToLive);

    /**
     * factory method
     * @return instance of TimeToLiveConfig
     */
    public static TimeToLiveConfig of() {
        return new TimeToLiveConfigImpl();
    }

    /**
     * factory method to create a shallow copy TimeToLiveConfig
     * @param template instance to be copied
     * @return copy instance
     */
    public static TimeToLiveConfig of(final TimeToLiveConfig template) {
        TimeToLiveConfigImpl instance = new TimeToLiveConfigImpl();
        instance.setTimeToLive(template.getTimeToLive());
        return instance;
    }

    public TimeToLiveConfig copyDeep();

    /**
     * factory method to create a deep copy of TimeToLiveConfig
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TimeToLiveConfig deepCopy(@Nullable final TimeToLiveConfig template) {
        if (template == null) {
            return null;
        }
        TimeToLiveConfigImpl instance = new TimeToLiveConfigImpl();
        instance.setTimeToLive(template.getTimeToLive());
        return instance;
    }

    /**
     * builder factory method for TimeToLiveConfig
     * @return builder
     */
    public static TimeToLiveConfigBuilder builder() {
        return TimeToLiveConfigBuilder.of();
    }

    /**
     * create builder for TimeToLiveConfig instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TimeToLiveConfigBuilder builder(final TimeToLiveConfig template) {
        return TimeToLiveConfigBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTimeToLiveConfig(Function<TimeToLiveConfig, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TimeToLiveConfig> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TimeToLiveConfig>() {
            @Override
            public String toString() {
                return "TypeReference<TimeToLiveConfig>";
            }
        };
    }
}
