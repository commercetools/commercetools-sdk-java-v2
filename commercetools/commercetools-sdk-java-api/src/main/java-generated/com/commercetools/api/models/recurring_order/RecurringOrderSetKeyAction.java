
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This update action generates the RecurringOrderKeySet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderSetKeyAction recurringOrderSetKeyAction = RecurringOrderSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setKey")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderSetKeyActionImpl.class)
public interface RecurringOrderSetKeyAction extends RecurringOrderUpdateAction {

    /**
     * discriminator value for RecurringOrderSetKeyAction
     */
    String SET_KEY = "setKey";

    /**
     *  <p>Value to set. If empty, any existing key will be removed.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Value to set. If empty, any existing key will be removed.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of RecurringOrderSetKeyAction
     */
    public static RecurringOrderSetKeyAction of() {
        return new RecurringOrderSetKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderSetKeyAction of(final RecurringOrderSetKeyAction template) {
        RecurringOrderSetKeyActionImpl instance = new RecurringOrderSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public RecurringOrderSetKeyAction copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderSetKeyAction deepCopy(@Nullable final RecurringOrderSetKeyAction template) {
        if (template == null) {
            return null;
        }
        RecurringOrderSetKeyActionImpl instance = new RecurringOrderSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderSetKeyAction
     * @return builder
     */
    public static RecurringOrderSetKeyActionBuilder builder() {
        return RecurringOrderSetKeyActionBuilder.of();
    }

    /**
     * create builder for RecurringOrderSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderSetKeyActionBuilder builder(final RecurringOrderSetKeyAction template) {
        return RecurringOrderSetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderSetKeyAction(Function<RecurringOrderSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderSetKeyAction>";
            }
        };
    }
}
