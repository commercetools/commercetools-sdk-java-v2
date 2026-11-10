
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
 *  <p>Draft type to create a <a href="https://docs.commercetools.com/apis/ctp:checkout:type:RecurringPayment" rel="nofollow">RecurringPayment</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringPaymentDraft recurringPaymentDraft = RecurringPaymentDraft.builder()
 *             .recurringOrder(recurringOrderBuilder -> recurringOrderBuilder)
 *             .plusPaymentMethodConfigurations(paymentMethodConfigurationsBuilder -> paymentMethodConfigurationsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringPaymentDraftImpl.class)
public interface RecurringPaymentDraft extends io.vrap.rmf.base.client.Draft<RecurringPaymentDraft> {

    /**
     *  <p>User-defined unique identifier of the RecurringPayment.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> whose future payments must be processed using Checkout.</p>
     * @return recurringOrder
     */
    @NotNull
    @Valid
    @JsonProperty("recurringOrder")
    public RecurringOrderReference getRecurringOrder();

    /**
     *  <p>PaymentMethod and Connector to use to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>. Checkout only supports processing this array with one PaymentMethodConfiguration.</p>
     * @return paymentMethodConfigurations
     */
    @NotNull
    @Valid
    @JsonProperty("paymentMethodConfigurations")
    public List<PaymentMethodConfiguration> getPaymentMethodConfigurations();

    /**
     *  <p>User-defined unique identifier of the RecurringPayment.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> whose future payments must be processed using Checkout.</p>
     * @param recurringOrder value to be set
     */

    public void setRecurringOrder(final RecurringOrderReference recurringOrder);

    /**
     *  <p>PaymentMethod and Connector to use to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>. Checkout only supports processing this array with one PaymentMethodConfiguration.</p>
     * @param paymentMethodConfigurations values to be set
     */

    @JsonIgnore
    public void setPaymentMethodConfigurations(final PaymentMethodConfiguration... paymentMethodConfigurations);

    /**
     *  <p>PaymentMethod and Connector to use to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>. Checkout only supports processing this array with one PaymentMethodConfiguration.</p>
     * @param paymentMethodConfigurations values to be set
     */

    public void setPaymentMethodConfigurations(final List<PaymentMethodConfiguration> paymentMethodConfigurations);

    /**
     * factory method
     * @return instance of RecurringPaymentDraft
     */
    public static RecurringPaymentDraft of() {
        return new RecurringPaymentDraftImpl();
    }

    /**
     * factory method to create a shallow copy RecurringPaymentDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringPaymentDraft of(final RecurringPaymentDraft template) {
        RecurringPaymentDraftImpl instance = new RecurringPaymentDraftImpl();
        instance.setKey(template.getKey());
        instance.setRecurringOrder(template.getRecurringOrder());
        instance.setPaymentMethodConfigurations(template.getPaymentMethodConfigurations());
        return instance;
    }

    public RecurringPaymentDraft copyDeep();

    /**
     * factory method to create a deep copy of RecurringPaymentDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringPaymentDraft deepCopy(@Nullable final RecurringPaymentDraft template) {
        if (template == null) {
            return null;
        }
        RecurringPaymentDraftImpl instance = new RecurringPaymentDraftImpl();
        instance.setKey(template.getKey());
        instance.setRecurringOrder(com.commercetools.checkout.models.recurring_payment.RecurringOrderReference
                .deepCopy(template.getRecurringOrder()));
        instance.setPaymentMethodConfigurations(Optional.ofNullable(template.getPaymentMethodConfigurations())
                .map(t -> t.stream()
                        .map(com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for RecurringPaymentDraft
     * @return builder
     */
    public static RecurringPaymentDraftBuilder builder() {
        return RecurringPaymentDraftBuilder.of();
    }

    /**
     * create builder for RecurringPaymentDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringPaymentDraftBuilder builder(final RecurringPaymentDraft template) {
        return RecurringPaymentDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringPaymentDraft(Function<RecurringPaymentDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<RecurringPaymentDraft> typeReference() {
        return new tools.jackson.core.type.TypeReference<RecurringPaymentDraft>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringPaymentDraft>";
            }
        };
    }
}
