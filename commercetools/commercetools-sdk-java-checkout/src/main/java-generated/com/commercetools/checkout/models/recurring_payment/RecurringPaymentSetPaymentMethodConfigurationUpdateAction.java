
package com.commercetools.checkout.models.recurring_payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets the PaymentMethodConfigurations of a RecurringPayment, replacing any existing ones. Checkout only supports processing this array with one PaymentMethodConfiguration.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringPaymentSetPaymentMethodConfigurationUpdateAction recurringPaymentSetPaymentMethodConfigurationUpdateAction = RecurringPaymentSetPaymentMethodConfigurationUpdateAction.builder()
 *             .plusPaymentMethodConfigurations(paymentMethodConfigurationsBuilder -> paymentMethodConfigurationsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setPaymentMethodConfiguration")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringPaymentSetPaymentMethodConfigurationUpdateActionImpl.class)
public interface RecurringPaymentSetPaymentMethodConfigurationUpdateAction extends RecurringPaymentUpdateAction {

    /**
     * discriminator value for RecurringPaymentSetPaymentMethodConfigurationUpdateAction
     */
    String SET_PAYMENT_METHOD_CONFIGURATION = "setPaymentMethodConfiguration";

    /**
     *  <p>PaymentMethod and Connector to set.</p>
     * @return paymentMethodConfigurations
     */
    @NotNull
    @Valid
    @JsonProperty("paymentMethodConfigurations")
    public List<PaymentMethodConfiguration> getPaymentMethodConfigurations();

    /**
     *  <p>PaymentMethod and Connector to set.</p>
     * @param paymentMethodConfigurations values to be set
     */

    @JsonIgnore
    public void setPaymentMethodConfigurations(final PaymentMethodConfiguration... paymentMethodConfigurations);

    /**
     *  <p>PaymentMethod and Connector to set.</p>
     * @param paymentMethodConfigurations values to be set
     */

    public void setPaymentMethodConfigurations(final List<PaymentMethodConfiguration> paymentMethodConfigurations);

    /**
     * factory method
     * @return instance of RecurringPaymentSetPaymentMethodConfigurationUpdateAction
     */
    public static RecurringPaymentSetPaymentMethodConfigurationUpdateAction of() {
        return new RecurringPaymentSetPaymentMethodConfigurationUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy RecurringPaymentSetPaymentMethodConfigurationUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringPaymentSetPaymentMethodConfigurationUpdateAction of(
            final RecurringPaymentSetPaymentMethodConfigurationUpdateAction template) {
        RecurringPaymentSetPaymentMethodConfigurationUpdateActionImpl instance = new RecurringPaymentSetPaymentMethodConfigurationUpdateActionImpl();
        instance.setPaymentMethodConfigurations(template.getPaymentMethodConfigurations());
        return instance;
    }

    public RecurringPaymentSetPaymentMethodConfigurationUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of RecurringPaymentSetPaymentMethodConfigurationUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringPaymentSetPaymentMethodConfigurationUpdateAction deepCopy(
            @Nullable final RecurringPaymentSetPaymentMethodConfigurationUpdateAction template) {
        if (template == null) {
            return null;
        }
        RecurringPaymentSetPaymentMethodConfigurationUpdateActionImpl instance = new RecurringPaymentSetPaymentMethodConfigurationUpdateActionImpl();
        instance.setPaymentMethodConfigurations(Optional.ofNullable(template.getPaymentMethodConfigurations())
                .map(t -> t.stream()
                        .map(com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for RecurringPaymentSetPaymentMethodConfigurationUpdateAction
     * @return builder
     */
    public static RecurringPaymentSetPaymentMethodConfigurationUpdateActionBuilder builder() {
        return RecurringPaymentSetPaymentMethodConfigurationUpdateActionBuilder.of();
    }

    /**
     * create builder for RecurringPaymentSetPaymentMethodConfigurationUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringPaymentSetPaymentMethodConfigurationUpdateActionBuilder builder(
            final RecurringPaymentSetPaymentMethodConfigurationUpdateAction template) {
        return RecurringPaymentSetPaymentMethodConfigurationUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringPaymentSetPaymentMethodConfigurationUpdateAction(
            Function<RecurringPaymentSetPaymentMethodConfigurationUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<RecurringPaymentSetPaymentMethodConfigurationUpdateAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<RecurringPaymentSetPaymentMethodConfigurationUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringPaymentSetPaymentMethodConfigurationUpdateAction>";
            }
        };
    }
}
