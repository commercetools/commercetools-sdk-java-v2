
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
 * RecurrencePolicyUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurrencePolicyUpdateAction recurrencePolicyUpdateAction = RecurrencePolicyUpdateAction.setDescriptionBuilder()
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = RecurrencePolicyUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = RecurrencePolicyUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface RecurrencePolicyUpdateAction {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public RecurrencePolicyUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of RecurrencePolicyUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurrencePolicyUpdateAction deepCopy(@Nullable final RecurrencePolicyUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof RecurrencePolicyUpdateActionImpl)) {
            return template.copyDeep();
        }
        RecurrencePolicyUpdateActionImpl instance = new RecurrencePolicyUpdateActionImpl();
        return instance;
    }

    /**
     * builder for setDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.recurrence_policy.RecurrencePolicySetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.recurrence_policy.RecurrencePolicySetDescriptionActionBuilder.of();
    }

    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.recurrence_policy.RecurrencePolicySetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.recurrence_policy.RecurrencePolicySetKeyActionBuilder.of();
    }

    /**
     * builder for setName subtype
     * @return builder
     */
    public static com.commercetools.api.models.recurrence_policy.RecurrencePolicySetNameActionBuilder setNameBuilder() {
        return com.commercetools.api.models.recurrence_policy.RecurrencePolicySetNameActionBuilder.of();
    }

    /**
     * builder for setSchedule subtype
     * @return builder
     */
    public static com.commercetools.api.models.recurrence_policy.RecurrencePolicySetScheduleActionBuilder setScheduleBuilder() {
        return com.commercetools.api.models.recurrence_policy.RecurrencePolicySetScheduleActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurrencePolicyUpdateAction(Function<RecurrencePolicyUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurrencePolicyUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurrencePolicyUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<RecurrencePolicyUpdateAction>";
            }
        };
    }
}
