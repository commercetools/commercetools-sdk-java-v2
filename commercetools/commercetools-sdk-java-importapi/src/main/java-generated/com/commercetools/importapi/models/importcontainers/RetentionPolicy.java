
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
 *  <p>The retention policy of the ImportContainer. If not set, the ImportContainer does not expire.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RetentionPolicy retentionPolicy = RetentionPolicy.ttlBuilder()
 *             config(configBuilder -> configBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "strategy", defaultImpl = RetentionPolicyImpl.class, visible = true)
@JsonDeserialize(as = RetentionPolicyImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface RetentionPolicy {

    /**
     *  <p>The strategy of the retention policy. Used to determine how the ImportContainer should be retained.</p>
     * @return strategy
     */
    @NotNull
    @JsonProperty("strategy")
    public StrategyEnum getStrategy();

    public RetentionPolicy copyDeep();

    /**
     * factory method to create a deep copy of RetentionPolicy
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RetentionPolicy deepCopy(@Nullable final RetentionPolicy template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof RetentionPolicyImpl)) {
            return template.copyDeep();
        }
        RetentionPolicyImpl instance = new RetentionPolicyImpl();
        return instance;
    }

    /**
     * builder for ttl subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.importcontainers.TimeToLiveRetentionPolicyBuilder ttlBuilder() {
        return com.commercetools.importapi.models.importcontainers.TimeToLiveRetentionPolicyBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRetentionPolicy(Function<RetentionPolicy, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RetentionPolicy> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RetentionPolicy>() {
            @Override
            public String toString() {
                return "TypeReference<RetentionPolicy>";
            }
        };
    }
}
