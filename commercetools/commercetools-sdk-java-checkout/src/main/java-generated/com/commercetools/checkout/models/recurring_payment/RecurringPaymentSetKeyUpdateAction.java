
package com.commercetools.checkout.models.recurring_payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets or unsets the key of a RecurringPayment.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringPaymentSetKeyUpdateAction recurringPaymentSetKeyUpdateAction = RecurringPaymentSetKeyUpdateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setKey")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringPaymentSetKeyUpdateActionImpl.class)
public interface RecurringPaymentSetKeyUpdateAction extends RecurringPaymentUpdateAction {

    /**
     * discriminator value for RecurringPaymentSetKeyUpdateAction
     */
    String SET_KEY = "setKey";

    /**
     *  <p>Key to set. If omitted, any existing value is removed.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Key to set. If omitted, any existing value is removed.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of RecurringPaymentSetKeyUpdateAction
     */
    public static RecurringPaymentSetKeyUpdateAction of() {
        return new RecurringPaymentSetKeyUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy RecurringPaymentSetKeyUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringPaymentSetKeyUpdateAction of(final RecurringPaymentSetKeyUpdateAction template) {
        RecurringPaymentSetKeyUpdateActionImpl instance = new RecurringPaymentSetKeyUpdateActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public RecurringPaymentSetKeyUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of RecurringPaymentSetKeyUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringPaymentSetKeyUpdateAction deepCopy(
            @Nullable final RecurringPaymentSetKeyUpdateAction template) {
        if (template == null) {
            return null;
        }
        RecurringPaymentSetKeyUpdateActionImpl instance = new RecurringPaymentSetKeyUpdateActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for RecurringPaymentSetKeyUpdateAction
     * @return builder
     */
    public static RecurringPaymentSetKeyUpdateActionBuilder builder() {
        return RecurringPaymentSetKeyUpdateActionBuilder.of();
    }

    /**
     * create builder for RecurringPaymentSetKeyUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringPaymentSetKeyUpdateActionBuilder builder(final RecurringPaymentSetKeyUpdateAction template) {
        return RecurringPaymentSetKeyUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringPaymentSetKeyUpdateAction(Function<RecurringPaymentSetKeyUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<RecurringPaymentSetKeyUpdateAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<RecurringPaymentSetKeyUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringPaymentSetKeyUpdateAction>";
            }
        };
    }
}
