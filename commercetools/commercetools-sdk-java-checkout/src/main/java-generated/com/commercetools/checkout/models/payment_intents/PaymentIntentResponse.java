
package com.commercetools.checkout.models.payment_intents;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Returned by Checkout after forwarding a Payment Intent request to the payment Connector. If the Connector response does not contain a valid <code>outcome</code> value, Checkout returns a <code>500 Internal Server Error</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntentResponse paymentIntentResponse = PaymentIntentResponse.builder()
 *             .outcome(PaymentIntentOutcome.APPROVED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentIntentResponseImpl.class)
public interface PaymentIntentResponse {

    /**
     *  <p>The outcome of the Payment Intent as reported by the payment <span>Connector</span>.</p>
     * @return outcome
     */
    @NotNull
    @JsonProperty("outcome")
    public PaymentIntentOutcome getOutcome();

    /**
     *  <p>The outcome of the Payment Intent as reported by the payment <span>Connector</span>.</p>
     * @param outcome value to be set
     */

    public void setOutcome(final PaymentIntentOutcome outcome);

    /**
     * factory method
     * @return instance of PaymentIntentResponse
     */
    public static PaymentIntentResponse of() {
        return new PaymentIntentResponseImpl();
    }

    /**
     * factory method to create a shallow copy PaymentIntentResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentIntentResponse of(final PaymentIntentResponse template) {
        PaymentIntentResponseImpl instance = new PaymentIntentResponseImpl();
        instance.setOutcome(template.getOutcome());
        return instance;
    }

    public PaymentIntentResponse copyDeep();

    /**
     * factory method to create a deep copy of PaymentIntentResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentIntentResponse deepCopy(@Nullable final PaymentIntentResponse template) {
        if (template == null) {
            return null;
        }
        PaymentIntentResponseImpl instance = new PaymentIntentResponseImpl();
        instance.setOutcome(template.getOutcome());
        return instance;
    }

    /**
     * builder factory method for PaymentIntentResponse
     * @return builder
     */
    public static PaymentIntentResponseBuilder builder() {
        return PaymentIntentResponseBuilder.of();
    }

    /**
     * create builder for PaymentIntentResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntentResponseBuilder builder(final PaymentIntentResponse template) {
        return PaymentIntentResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentIntentResponse(Function<PaymentIntentResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<PaymentIntentResponse> typeReference() {
        return new tools.jackson.core.type.TypeReference<PaymentIntentResponse>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentIntentResponse>";
            }
        };
    }
}
