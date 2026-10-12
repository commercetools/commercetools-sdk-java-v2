
package com.commercetools.checkout.models.recurring_payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Adds a PaymentMethodConfiguration to a RecurringPayment. Checkout only supports processing a RecurringPayment with one PaymentMethodConfiguration.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringPaymentAddPaymentMethodConfigurationUpdateAction recurringPaymentAddPaymentMethodConfigurationUpdateAction = RecurringPaymentAddPaymentMethodConfigurationUpdateAction.builder()
 *             .paymentMethodConfiguration(paymentMethodConfigurationBuilder -> paymentMethodConfigurationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addPaymentMethodConfiguration")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringPaymentAddPaymentMethodConfigurationUpdateActionImpl.class)
public interface RecurringPaymentAddPaymentMethodConfigurationUpdateAction extends RecurringPaymentUpdateAction {

    /**
     * discriminator value for RecurringPaymentAddPaymentMethodConfigurationUpdateAction
     */
    String ADD_PAYMENT_METHOD_CONFIGURATION = "addPaymentMethodConfiguration";

    /**
     *  <p>PaymentMethod and Connector to add.</p>
     * @return paymentMethodConfiguration
     */
    @NotNull
    @Valid
    @JsonProperty("paymentMethodConfiguration")
    public PaymentMethodConfiguration getPaymentMethodConfiguration();

    /**
     *  <p>PaymentMethod and Connector to add.</p>
     * @param paymentMethodConfiguration value to be set
     */

    public void setPaymentMethodConfiguration(final PaymentMethodConfiguration paymentMethodConfiguration);

    /**
     * factory method
     * @return instance of RecurringPaymentAddPaymentMethodConfigurationUpdateAction
     */
    public static RecurringPaymentAddPaymentMethodConfigurationUpdateAction of() {
        return new RecurringPaymentAddPaymentMethodConfigurationUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy RecurringPaymentAddPaymentMethodConfigurationUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringPaymentAddPaymentMethodConfigurationUpdateAction of(
            final RecurringPaymentAddPaymentMethodConfigurationUpdateAction template) {
        RecurringPaymentAddPaymentMethodConfigurationUpdateActionImpl instance = new RecurringPaymentAddPaymentMethodConfigurationUpdateActionImpl();
        instance.setPaymentMethodConfiguration(template.getPaymentMethodConfiguration());
        return instance;
    }

    public RecurringPaymentAddPaymentMethodConfigurationUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of RecurringPaymentAddPaymentMethodConfigurationUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringPaymentAddPaymentMethodConfigurationUpdateAction deepCopy(
            @Nullable final RecurringPaymentAddPaymentMethodConfigurationUpdateAction template) {
        if (template == null) {
            return null;
        }
        RecurringPaymentAddPaymentMethodConfigurationUpdateActionImpl instance = new RecurringPaymentAddPaymentMethodConfigurationUpdateActionImpl();
        instance.setPaymentMethodConfiguration(
            com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration
                    .deepCopy(template.getPaymentMethodConfiguration()));
        return instance;
    }

    /**
     * builder factory method for RecurringPaymentAddPaymentMethodConfigurationUpdateAction
     * @return builder
     */
    public static RecurringPaymentAddPaymentMethodConfigurationUpdateActionBuilder builder() {
        return RecurringPaymentAddPaymentMethodConfigurationUpdateActionBuilder.of();
    }

    /**
     * create builder for RecurringPaymentAddPaymentMethodConfigurationUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringPaymentAddPaymentMethodConfigurationUpdateActionBuilder builder(
            final RecurringPaymentAddPaymentMethodConfigurationUpdateAction template) {
        return RecurringPaymentAddPaymentMethodConfigurationUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringPaymentAddPaymentMethodConfigurationUpdateAction(
            Function<RecurringPaymentAddPaymentMethodConfigurationUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<RecurringPaymentAddPaymentMethodConfigurationUpdateAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<RecurringPaymentAddPaymentMethodConfigurationUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringPaymentAddPaymentMethodConfigurationUpdateAction>";
            }
        };
    }
}
