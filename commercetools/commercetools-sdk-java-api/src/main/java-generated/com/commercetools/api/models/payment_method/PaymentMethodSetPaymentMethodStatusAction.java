
package com.commercetools.api.models.payment_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>This action generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodPaymentMethodStatusSetMessage" rel="nofollow">PaymentMethodPaymentMethodStatusSet</a> Message.</p>
 *  <p>A default Payment Method cannot be set as inactive, and the action will return an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodSetPaymentMethodStatusAction paymentMethodSetPaymentMethodStatusAction = PaymentMethodSetPaymentMethodStatusAction.builder()
 *             .paymentMethodStatus(PaymentMethodStatus.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setPaymentMethodStatus")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodSetPaymentMethodStatusActionImpl.class)
public interface PaymentMethodSetPaymentMethodStatusAction extends PaymentMethodUpdateAction {

    /**
     * discriminator value for PaymentMethodSetPaymentMethodStatusAction
     */
    String SET_PAYMENT_METHOD_STATUS = "setPaymentMethodStatus";

    /**
     *  <p>Value to set.</p>
     * @return paymentMethodStatus
     */
    @NotNull
    @JsonProperty("paymentMethodStatus")
    public PaymentMethodStatus getPaymentMethodStatus();

    /**
     *  <p>Value to set.</p>
     * @param paymentMethodStatus value to be set
     */

    public void setPaymentMethodStatus(final PaymentMethodStatus paymentMethodStatus);

    /**
     * factory method
     * @return instance of PaymentMethodSetPaymentMethodStatusAction
     */
    public static PaymentMethodSetPaymentMethodStatusAction of() {
        return new PaymentMethodSetPaymentMethodStatusActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodSetPaymentMethodStatusAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodSetPaymentMethodStatusAction of(
            final PaymentMethodSetPaymentMethodStatusAction template) {
        PaymentMethodSetPaymentMethodStatusActionImpl instance = new PaymentMethodSetPaymentMethodStatusActionImpl();
        instance.setPaymentMethodStatus(template.getPaymentMethodStatus());
        return instance;
    }

    public PaymentMethodSetPaymentMethodStatusAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodSetPaymentMethodStatusAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodSetPaymentMethodStatusAction deepCopy(
            @Nullable final PaymentMethodSetPaymentMethodStatusAction template) {
        if (template == null) {
            return null;
        }
        PaymentMethodSetPaymentMethodStatusActionImpl instance = new PaymentMethodSetPaymentMethodStatusActionImpl();
        instance.setPaymentMethodStatus(template.getPaymentMethodStatus());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodSetPaymentMethodStatusAction
     * @return builder
     */
    public static PaymentMethodSetPaymentMethodStatusActionBuilder builder() {
        return PaymentMethodSetPaymentMethodStatusActionBuilder.of();
    }

    /**
     * create builder for PaymentMethodSetPaymentMethodStatusAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodSetPaymentMethodStatusActionBuilder builder(
            final PaymentMethodSetPaymentMethodStatusAction template) {
        return PaymentMethodSetPaymentMethodStatusActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodSetPaymentMethodStatusAction(
            Function<PaymentMethodSetPaymentMethodStatusAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodSetPaymentMethodStatusAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodSetPaymentMethodStatusAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodSetPaymentMethodStatusAction>";
            }
        };
    }
}
