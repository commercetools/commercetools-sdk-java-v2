
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.payment.PaymentResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * OrderRemovePaymentAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderRemovePaymentAction orderRemovePaymentAction = OrderRemovePaymentAction.builder()
 *             .payment(paymentBuilder -> paymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removePayment")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderRemovePaymentActionImpl.class)
public interface OrderRemovePaymentAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderRemovePaymentAction
     */
    String REMOVE_PAYMENT = "removePayment";

    /**
     *  <p>Payment to remove from the PaymentInfo.</p>
     * @return payment
     */
    @NotNull
    @Valid
    @JsonProperty("payment")
    public PaymentResourceIdentifier getPayment();

    /**
     *  <p>Payment to remove from the PaymentInfo.</p>
     * @param payment value to be set
     */

    public void setPayment(final PaymentResourceIdentifier payment);

    /**
     * factory method
     * @return instance of OrderRemovePaymentAction
     */
    public static OrderRemovePaymentAction of() {
        return new OrderRemovePaymentActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderRemovePaymentAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderRemovePaymentAction of(final OrderRemovePaymentAction template) {
        OrderRemovePaymentActionImpl instance = new OrderRemovePaymentActionImpl();
        instance.setPayment(template.getPayment());
        return instance;
    }

    public OrderRemovePaymentAction copyDeep();

    /**
     * factory method to create a deep copy of OrderRemovePaymentAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderRemovePaymentAction deepCopy(@Nullable final OrderRemovePaymentAction template) {
        if (template == null) {
            return null;
        }
        OrderRemovePaymentActionImpl instance = new OrderRemovePaymentActionImpl();
        instance.setPayment(
            com.commercetools.api.models.payment.PaymentResourceIdentifier.deepCopy(template.getPayment()));
        return instance;
    }

    /**
     * builder factory method for OrderRemovePaymentAction
     * @return builder
     */
    public static OrderRemovePaymentActionBuilder builder() {
        return OrderRemovePaymentActionBuilder.of();
    }

    /**
     * create builder for OrderRemovePaymentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderRemovePaymentActionBuilder builder(final OrderRemovePaymentAction template) {
        return OrderRemovePaymentActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderRemovePaymentAction(Function<OrderRemovePaymentAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderRemovePaymentAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderRemovePaymentAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderRemovePaymentAction>";
            }
        };
    }
}
