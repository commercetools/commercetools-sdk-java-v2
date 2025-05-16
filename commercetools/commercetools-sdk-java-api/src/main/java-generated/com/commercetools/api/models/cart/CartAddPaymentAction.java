
package com.commercetools.api.models.cart;

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
 * CartAddPaymentAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartAddPaymentAction cartAddPaymentAction = CartAddPaymentAction.builder()
 *             .payment(paymentBuilder -> paymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addPayment")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartAddPaymentActionImpl.class)
public interface CartAddPaymentAction extends CartUpdateAction {

    /**
     * discriminator value for CartAddPaymentAction
     */
    String ADD_PAYMENT = "addPayment";

    /**
     *  <p>Payment to add to the Cart. Must not be assigned to another Order or active Cart already.</p>
     * @return payment
     */
    @NotNull
    @Valid
    @JsonProperty("payment")
    public PaymentResourceIdentifier getPayment();

    /**
     *  <p>Payment to add to the Cart. Must not be assigned to another Order or active Cart already.</p>
     * @param payment value to be set
     */

    public void setPayment(final PaymentResourceIdentifier payment);

    /**
     * factory method
     * @return instance of CartAddPaymentAction
     */
    public static CartAddPaymentAction of() {
        return new CartAddPaymentActionImpl();
    }

    /**
     * factory method to create a shallow copy CartAddPaymentAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartAddPaymentAction of(final CartAddPaymentAction template) {
        CartAddPaymentActionImpl instance = new CartAddPaymentActionImpl();
        instance.setPayment(template.getPayment());
        return instance;
    }

    public CartAddPaymentAction copyDeep();

    /**
     * factory method to create a deep copy of CartAddPaymentAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartAddPaymentAction deepCopy(@Nullable final CartAddPaymentAction template) {
        if (template == null) {
            return null;
        }
        CartAddPaymentActionImpl instance = new CartAddPaymentActionImpl();
        instance.setPayment(
            com.commercetools.api.models.payment.PaymentResourceIdentifier.deepCopy(template.getPayment()));
        return instance;
    }

    /**
     * builder factory method for CartAddPaymentAction
     * @return builder
     */
    public static CartAddPaymentActionBuilder builder() {
        return CartAddPaymentActionBuilder.of();
    }

    /**
     * create builder for CartAddPaymentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartAddPaymentActionBuilder builder(final CartAddPaymentAction template) {
        return CartAddPaymentActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartAddPaymentAction(Function<CartAddPaymentAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartAddPaymentAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartAddPaymentAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartAddPaymentAction>";
            }
        };
    }
}
