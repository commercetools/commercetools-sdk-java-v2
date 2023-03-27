
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.payment.PaymentResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartRemovePaymentAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartRemovePaymentAction cartRemovePaymentAction = CartRemovePaymentAction.builder()
 *             .payment(paymentBuilder -> paymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartRemovePaymentActionImpl.class)
public interface CartRemovePaymentAction extends CartUpdateAction {

    /**
     * discriminator value for CartRemovePaymentAction
     */
    String REMOVE_PAYMENT = "removePayment";

    /**
     *  <p>Payment to remove from the Cart.</p>
     * @return payment
     */
    @NotNull
    @Valid
    @JsonProperty("payment")
    public PaymentResourceIdentifier getPayment();

    /**
     *  <p>Payment to remove from the Cart.</p>
     * @param payment value to be set
     */

    public void setPayment(final PaymentResourceIdentifier payment);

    /**
     * factory method
     * @return instance of CartRemovePaymentAction
     */
    public static CartRemovePaymentAction of() {
        return new CartRemovePaymentActionImpl();
    }

    /**
     * factory method to copy an instance of CartRemovePaymentAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartRemovePaymentAction of(final CartRemovePaymentAction template) {
        CartRemovePaymentActionImpl instance = new CartRemovePaymentActionImpl();
        instance.setPayment(template.getPayment());
        return instance;
    }

    /**
     * builder factory method for CartRemovePaymentAction
     * @return builder
     */
    public static CartRemovePaymentActionBuilder builder() {
        return CartRemovePaymentActionBuilder.of();
    }

    /**
     * create builder for CartRemovePaymentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartRemovePaymentActionBuilder builder(final CartRemovePaymentAction template) {
        return CartRemovePaymentActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartRemovePaymentAction(Function<CartRemovePaymentAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartRemovePaymentAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartRemovePaymentAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartRemovePaymentAction>";
            }
        };
    }
}
