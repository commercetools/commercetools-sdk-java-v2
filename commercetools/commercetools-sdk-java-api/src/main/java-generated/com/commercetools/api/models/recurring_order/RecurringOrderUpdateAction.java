
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
 * RecurringOrderUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderUpdateAction recurringOrderUpdateAction = RecurringOrderUpdateAction.setCustomFieldBuilder()
 *             name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = RecurringOrderUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = RecurringOrderUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface RecurringOrderUpdateAction {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public RecurringOrderUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderUpdateAction deepCopy(@Nullable final RecurringOrderUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof RecurringOrderUpdateActionImpl)) {
            return template.copyDeep();
        }
        RecurringOrderUpdateActionImpl instance = new RecurringOrderUpdateActionImpl();
        return instance;
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.recurring_order.RecurringOrderSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrderSetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.recurring_order.RecurringOrderSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrderSetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.recurring_order.RecurringOrderSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrderSetKeyActionBuilder.of();
    }

    /**
     * builder for setOrderSkipConfiguration subtype
     * @return builder
     */
    public static com.commercetools.api.models.recurring_order.RecurringOrderSetOrderSkipConfigurationActionBuilder setOrderSkipConfigurationBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrderSetOrderSkipConfigurationActionBuilder.of();
    }

    /**
     * builder for setSchedule subtype
     * @return builder
     */
    public static com.commercetools.api.models.recurring_order.RecurringOrderSetScheduleActionBuilder setScheduleBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrderSetScheduleActionBuilder.of();
    }

    /**
     * builder for setStartsAt subtype
     * @return builder
     */
    public static com.commercetools.api.models.recurring_order.RecurringOrderSetStartsAtActionBuilder setStartsAtBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrderSetStartsAtActionBuilder.of();
    }

    /**
     * builder for setRecurringOrderState subtype
     * @return builder
     */
    public static com.commercetools.api.models.recurring_order.RecurringOrderSetStateActionBuilder setRecurringOrderStateBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrderSetStateActionBuilder.of();
    }

    /**
     * builder for transitionState subtype
     * @return builder
     */
    public static com.commercetools.api.models.recurring_order.RecurringOrderTransitionStateActionBuilder transitionStateBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrderTransitionStateActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderUpdateAction(Function<RecurringOrderUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderUpdateAction>";
            }
        };
    }
}
