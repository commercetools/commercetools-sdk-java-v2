
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
 * OrderAddPaymentAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderAddPaymentAction orderAddPaymentAction = OrderAddPaymentAction.builder()
 *             .payment(paymentBuilder -> paymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addPayment")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderAddPaymentActionImpl.class)
public interface OrderAddPaymentAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderAddPaymentAction
     */
    String ADD_PAYMENT = "addPayment";

    /**
     *  <p>Payment to add to the PaymentInfo. Must not be assigned to another Order or active Cart already.</p>
     * @return payment
     */
    @NotNull
    @Valid
    @JsonProperty("payment")
    public PaymentResourceIdentifier getPayment();

    /**
     *  <p>Payment to add to the PaymentInfo. Must not be assigned to another Order or active Cart already.</p>
     * @param payment value to be set
     */

    public void setPayment(final PaymentResourceIdentifier payment);

    /**
     * factory method
     * @return instance of OrderAddPaymentAction
     */
    public static OrderAddPaymentAction of() {
        return new OrderAddPaymentActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderAddPaymentAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderAddPaymentAction of(final OrderAddPaymentAction template) {
        OrderAddPaymentActionImpl instance = new OrderAddPaymentActionImpl();
        instance.setPayment(template.getPayment());
        return instance;
    }

    public OrderAddPaymentAction copyDeep();

    /**
     * factory method to create a deep copy of OrderAddPaymentAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderAddPaymentAction deepCopy(@Nullable final OrderAddPaymentAction template) {
        if (template == null) {
            return null;
        }
        OrderAddPaymentActionImpl instance = new OrderAddPaymentActionImpl();
        instance.setPayment(
            com.commercetools.api.models.payment.PaymentResourceIdentifier.deepCopy(template.getPayment()));
        return instance;
    }

    /**
     * builder factory method for OrderAddPaymentAction
     * @return builder
     */
    public static OrderAddPaymentActionBuilder builder() {
        return OrderAddPaymentActionBuilder.of();
    }

    /**
     * create builder for OrderAddPaymentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderAddPaymentActionBuilder builder(final OrderAddPaymentAction template) {
        return OrderAddPaymentActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderAddPaymentAction(Function<OrderAddPaymentAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderAddPaymentAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderAddPaymentAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderAddPaymentAction>";
            }
        };
    }
}
