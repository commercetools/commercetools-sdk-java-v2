
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.payment.PaymentResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartRemovePaymentAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartRemovePaymentAction myCartRemovePaymentAction = MyCartRemovePaymentAction.builder()
 *             .payment(paymentBuilder -> paymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartRemovePaymentActionImpl.class)
public interface MyCartRemovePaymentAction extends MyCartUpdateAction {

    /**
     * discriminator value for MyCartRemovePaymentAction
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
     * @return instance of MyCartRemovePaymentAction
     */
    public static MyCartRemovePaymentAction of() {
        return new MyCartRemovePaymentActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCartRemovePaymentAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartRemovePaymentAction of(final MyCartRemovePaymentAction template) {
        MyCartRemovePaymentActionImpl instance = new MyCartRemovePaymentActionImpl();
        instance.setPayment(template.getPayment());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyCartRemovePaymentAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartRemovePaymentAction deepCopy(@Nullable final MyCartRemovePaymentAction template) {
        if (template == null) {
            return null;
        }
        MyCartRemovePaymentActionImpl instance = new MyCartRemovePaymentActionImpl();
        instance.setPayment(Optional.ofNullable(template.getPayment())
                .map(com.commercetools.api.models.payment.PaymentResourceIdentifier::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for MyCartRemovePaymentAction
     * @return builder
     */
    public static MyCartRemovePaymentActionBuilder builder() {
        return MyCartRemovePaymentActionBuilder.of();
    }

    /**
     * create builder for MyCartRemovePaymentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartRemovePaymentActionBuilder builder(final MyCartRemovePaymentAction template) {
        return MyCartRemovePaymentActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartRemovePaymentAction(Function<MyCartRemovePaymentAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartRemovePaymentAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartRemovePaymentAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartRemovePaymentAction>";
            }
        };
    }
}
