
package com.commercetools.checkout.models.recurring_payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Base type for all RecurringPayment update actions.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringPaymentUpdateAction recurringPaymentUpdateAction = RecurringPaymentUpdateAction.addPaymentMethodConfigurationBuilder()
 *             paymentMethodConfiguration(paymentMethodConfigurationBuilder -> paymentMethodConfigurationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = RecurringPaymentUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = RecurringPaymentUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface RecurringPaymentUpdateAction {

    /**
     *  <p>Type of update action to be performed on the RecurringPayment.</p>
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public RecurringPaymentUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of RecurringPaymentUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringPaymentUpdateAction deepCopy(@Nullable final RecurringPaymentUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof RecurringPaymentUpdateActionImpl)) {
            return template.copyDeep();
        }
        RecurringPaymentUpdateActionImpl instance = new RecurringPaymentUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addPaymentMethodConfiguration subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.recurring_payment.RecurringPaymentAddPaymentMethodConfigurationUpdateActionBuilder addPaymentMethodConfigurationBuilder() {
        return com.commercetools.checkout.models.recurring_payment.RecurringPaymentAddPaymentMethodConfigurationUpdateActionBuilder
                .of();
    }

    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.recurring_payment.RecurringPaymentSetKeyUpdateActionBuilder setKeyBuilder() {
        return com.commercetools.checkout.models.recurring_payment.RecurringPaymentSetKeyUpdateActionBuilder.of();
    }

    /**
     * builder for setPaymentMethodConfiguration subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.recurring_payment.RecurringPaymentSetPaymentMethodConfigurationUpdateActionBuilder setPaymentMethodConfigurationBuilder() {
        return com.commercetools.checkout.models.recurring_payment.RecurringPaymentSetPaymentMethodConfigurationUpdateActionBuilder
                .of();
    }

    /**
     * builder for setRecurringOrder subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.recurring_payment.RecurringPaymentSetRecurringOrderUpdateActionBuilder setRecurringOrderBuilder() {
        return com.commercetools.checkout.models.recurring_payment.RecurringPaymentSetRecurringOrderUpdateActionBuilder
                .of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringPaymentUpdateAction(Function<RecurringPaymentUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<RecurringPaymentUpdateAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<RecurringPaymentUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringPaymentUpdateAction>";
            }
        };
    }
}
