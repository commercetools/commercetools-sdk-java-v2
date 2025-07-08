
package com.commercetools.api.models.recurrence_policy;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * RecurrencePolicyScheduleDraft
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurrencePolicyScheduleDraft recurrencePolicyScheduleDraft = RecurrencePolicyScheduleDraft.standardBuilder()
 *             value(0.3)
 *             intervalUnit(IntervalUnit.DAYS)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = RecurrencePolicyScheduleDraftImpl.class, visible = true)
@JsonDeserialize(as = RecurrencePolicyScheduleDraftImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface RecurrencePolicyScheduleDraft {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    public RecurrencePolicyScheduleDraft copyDeep();

    /**
     * factory method to create a deep copy of RecurrencePolicyScheduleDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurrencePolicyScheduleDraft deepCopy(@Nullable final RecurrencePolicyScheduleDraft template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof RecurrencePolicyScheduleDraftImpl)) {
            return template.copyDeep();
        }
        RecurrencePolicyScheduleDraftImpl instance = new RecurrencePolicyScheduleDraftImpl();
        return instance;
    }

    /**
     * builder for standard subtype
     * @return builder
     */
    public static com.commercetools.api.models.recurrence_policy.StandardScheduleDraftBuilder standardBuilder() {
        return com.commercetools.api.models.recurrence_policy.StandardScheduleDraftBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurrencePolicyScheduleDraft(Function<RecurrencePolicyScheduleDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurrencePolicyScheduleDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurrencePolicyScheduleDraft>() {
            @Override
            public String toString() {
                return "TypeReference<RecurrencePolicyScheduleDraft>";
            }
        };
    }
}
