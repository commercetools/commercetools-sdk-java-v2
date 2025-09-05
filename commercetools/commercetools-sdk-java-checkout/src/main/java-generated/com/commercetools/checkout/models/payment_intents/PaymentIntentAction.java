
package com.commercetools.checkout.models.payment_intents;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Depending on the action specified, Checkout requests the <span>payment service provider</span> (PSP) or gift card management system to capture, refund, or cancel the authorization for the given Payment.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntentAction paymentIntentAction = PaymentIntentAction.cancelPaymentBuilder()
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = PaymentIntentActionImpl.class, visible = true)
@JsonDeserialize(as = PaymentIntentActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface PaymentIntentAction {

    /**
     *  <p>Action to execute for the given <span>Payment</span>.</p>
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public PaymentIntentOperation getAction();

    public PaymentIntentAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentIntentAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentIntentAction deepCopy(@Nullable final PaymentIntentAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof PaymentIntentActionImpl)) {
            return template.copyDeep();
        }
        PaymentIntentActionImpl instance = new PaymentIntentActionImpl();
        return instance;
    }

    /**
     * builder for cancelPayment subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.payment_intents.PaymentIntentCancelActionBuilder cancelPaymentBuilder() {
        return com.commercetools.checkout.models.payment_intents.PaymentIntentCancelActionBuilder.of();
    }

    /**
     * builder for capturePayment subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.payment_intents.PaymentIntentCaptureActionBuilder capturePaymentBuilder() {
        return com.commercetools.checkout.models.payment_intents.PaymentIntentCaptureActionBuilder.of();
    }

    /**
     * builder for refundPayment subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.payment_intents.PaymentIntentRefundActionBuilder refundPaymentBuilder() {
        return com.commercetools.checkout.models.payment_intents.PaymentIntentRefundActionBuilder.of();
    }

    /**
     * builder for reversePayment subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.payment_intents.PaymentIntentReverseActionBuilder reversePaymentBuilder() {
        return com.commercetools.checkout.models.payment_intents.PaymentIntentReverseActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentIntentAction(Function<PaymentIntentAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentIntentAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentIntentAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentIntentAction>";
            }
        };
    }
}
