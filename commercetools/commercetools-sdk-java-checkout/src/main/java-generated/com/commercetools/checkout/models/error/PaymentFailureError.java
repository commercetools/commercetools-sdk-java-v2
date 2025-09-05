
package com.commercetools.checkout.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when the payment cannot be completed successfully.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentFailureError paymentFailureError = PaymentFailureError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentFailure")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentFailureErrorImpl.class)
public interface PaymentFailureError extends ErrorObject {

    /**
     * discriminator value for PaymentFailureError
     */
    String PAYMENT_FAILURE = "PaymentFailure";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Payment could not be completed successfully."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"Payment could not be completed successfully."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of PaymentFailureError
     */
    public static PaymentFailureError of() {
        return new PaymentFailureErrorImpl();
    }

    /**
     * factory method to create a shallow copy PaymentFailureError
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentFailureError of(final PaymentFailureError template) {
        PaymentFailureErrorImpl instance = new PaymentFailureErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public PaymentFailureError copyDeep();

    /**
     * factory method to create a deep copy of PaymentFailureError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentFailureError deepCopy(@Nullable final PaymentFailureError template) {
        if (template == null) {
            return null;
        }
        PaymentFailureErrorImpl instance = new PaymentFailureErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder factory method for PaymentFailureError
     * @return builder
     */
    public static PaymentFailureErrorBuilder builder() {
        return PaymentFailureErrorBuilder.of();
    }

    /**
     * create builder for PaymentFailureError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentFailureErrorBuilder builder(final PaymentFailureError template) {
        return PaymentFailureErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentFailureError(Function<PaymentFailureError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentFailureError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentFailureError>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentFailureError>";
            }
        };
    }
}
