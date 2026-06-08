
package com.commercetools.importapi.models.importcontainers;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Set a time to live retention policy for the ImportContainer.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("ttl")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TimeToLiveRetentionPolicyImpl.class)
public interface TimeToLiveRetentionPolicy extends RetentionPolicy {

    /**
     * discriminator value for TimeToLiveRetentionPolicy
     */
    String TTL = "ttl";

    /**
     *  <p>The configuration of the time to live retention policy.</p>
     * @return config
     */
    @NotNull
    @Valid
    @JsonProperty("config")
    public TimeToLiveConfig getConfig();

    /**
     *  <p>The configuration of the time to live retention policy.</p>
     * @param config value to be set
     */

    public void setConfig(final TimeToLiveConfig config);

    /**
     * factory method
     * @return instance of TimeToLiveRetentionPolicy
     */
    public static TimeToLiveRetentionPolicy of() {
        return new TimeToLiveRetentionPolicyImpl();
    }

    /**
     * factory method to create a shallow copy TimeToLiveRetentionPolicy
     * @param template instance to be copied
     * @return copy instance
     */
    public static TimeToLiveRetentionPolicy of(final TimeToLiveRetentionPolicy template) {
        TimeToLiveRetentionPolicyImpl instance = new TimeToLiveRetentionPolicyImpl();
        instance.setConfig(template.getConfig());
        return instance;
    }

    public TimeToLiveRetentionPolicy copyDeep();

    /**
     * factory method to create a deep copy of TimeToLiveRetentionPolicy
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TimeToLiveRetentionPolicy deepCopy(@Nullable final TimeToLiveRetentionPolicy template) {
        if (template == null) {
            return null;
        }
        TimeToLiveRetentionPolicyImpl instance = new TimeToLiveRetentionPolicyImpl();
        instance.setConfig(
            com.commercetools.importapi.models.importcontainers.TimeToLiveConfig.deepCopy(template.getConfig()));
        return instance;
    }

    /**
     * builder factory method for TimeToLiveRetentionPolicy
     * @return builder
     */
    public static TimeToLiveRetentionPolicyBuilder builder() {
        return TimeToLiveRetentionPolicyBuilder.of();
    }

    /**
     * create builder for TimeToLiveRetentionPolicy instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TimeToLiveRetentionPolicyBuilder builder(final TimeToLiveRetentionPolicy template) {
        return TimeToLiveRetentionPolicyBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTimeToLiveRetentionPolicy(Function<TimeToLiveRetentionPolicy, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TimeToLiveRetentionPolicy> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TimeToLiveRetentionPolicy>() {
            @Override
            public String toString() {
                return "TypeReference<TimeToLiveRetentionPolicy>";
            }
        };
    }
}
