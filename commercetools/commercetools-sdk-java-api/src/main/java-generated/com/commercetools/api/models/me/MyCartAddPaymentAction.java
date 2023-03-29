
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
 * MyCartAddPaymentAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartAddPaymentAction myCartAddPaymentAction = MyCartAddPaymentAction.builder()
 *             .payment(paymentBuilder -> paymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartAddPaymentActionImpl.class)
public interface MyCartAddPaymentAction extends MyCartUpdateAction {

    /**
     * discriminator value for MyCartAddPaymentAction
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
     * @return instance of MyCartAddPaymentAction
     */
    public static MyCartAddPaymentAction of() {
        return new MyCartAddPaymentActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCartAddPaymentAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartAddPaymentAction of(final MyCartAddPaymentAction template) {
        MyCartAddPaymentActionImpl instance = new MyCartAddPaymentActionImpl();
        instance.setPayment(template.getPayment());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyCartAddPaymentAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartAddPaymentAction deepCopy(@Nullable final MyCartAddPaymentAction template) {
        if (template == null) {
            return null;
        }
        MyCartAddPaymentActionImpl instance = new MyCartAddPaymentActionImpl();
        instance.setPayment(
            com.commercetools.api.models.payment.PaymentResourceIdentifier.deepCopy(template.getPayment()));
        return instance;
    }

    /**
     * builder factory method for MyCartAddPaymentAction
     * @return builder
     */
    public static MyCartAddPaymentActionBuilder builder() {
        return MyCartAddPaymentActionBuilder.of();
    }

    /**
     * create builder for MyCartAddPaymentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartAddPaymentActionBuilder builder(final MyCartAddPaymentAction template) {
        return MyCartAddPaymentActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartAddPaymentAction(Function<MyCartAddPaymentAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartAddPaymentAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartAddPaymentAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartAddPaymentAction>";
            }
        };
    }
}
