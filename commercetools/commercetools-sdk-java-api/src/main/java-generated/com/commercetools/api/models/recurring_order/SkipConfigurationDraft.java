
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
 *     SkipConfigurationDraft skipConfigurationDraft = SkipConfigurationDraft.counterBuilder()
 *             totalToSkip(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = SkipConfigurationDraftImpl.class, visible = true)
@JsonDeserialize(as = SkipConfigurationDraftImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface SkipConfigurationDraft {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    public SkipConfigurationDraft copyDeep();

    /**
     * factory method to create a deep copy of SkipConfigurationDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SkipConfigurationDraft deepCopy(@Nullable final SkipConfigurationDraft template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof SkipConfigurationDraftImpl)) {
            return template.copyDeep();
        }
        SkipConfigurationDraftImpl instance = new SkipConfigurationDraftImpl();
        return instance;
    }

    /**
     * builder for counter subtype
     * @return builder
     */
    public static com.commercetools.api.models.recurring_order.CounterDraftBuilder counterBuilder() {
        return com.commercetools.api.models.recurring_order.CounterDraftBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSkipConfigurationDraft(Function<SkipConfigurationDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SkipConfigurationDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SkipConfigurationDraft>() {
            @Override
            public String toString() {
                return "TypeReference<SkipConfigurationDraft>";
            }
        };
    }
}
