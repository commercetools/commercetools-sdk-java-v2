
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Defines how the next orders are going to be skipped.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SkipConfiguration skipConfiguration = SkipConfiguration.counterBuilder()
 *             totalToSkip(1)
 *             skipped(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = SkipConfigurationImpl.class, visible = true)
@JsonDeserialize(as = SkipConfigurationImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface SkipConfiguration {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    public SkipConfiguration copyDeep();

    /**
     * factory method to create a deep copy of SkipConfiguration
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SkipConfiguration deepCopy(@Nullable final SkipConfiguration template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof SkipConfigurationImpl)) {
            return template.copyDeep();
        }
        SkipConfigurationImpl instance = new SkipConfigurationImpl();
        return instance;
    }

    /**
     * builder for counter subtype
     * @return builder
     */
    public static com.commercetools.api.models.recurring_order.CounterBuilder counterBuilder() {
        return com.commercetools.api.models.recurring_order.CounterBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSkipConfiguration(Function<SkipConfiguration, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SkipConfiguration> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SkipConfiguration>() {
            @Override
            public String toString() {
                return "TypeReference<SkipConfiguration>";
            }
        };
    }
}
