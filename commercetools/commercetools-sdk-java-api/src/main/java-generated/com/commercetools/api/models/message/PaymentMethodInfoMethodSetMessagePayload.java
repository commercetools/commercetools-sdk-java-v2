
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set MethodInfo Method update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoMethodSetMessagePayload paymentMethodInfoMethodSetMessagePayload = PaymentMethodInfoMethodSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodInfoMethodSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodInfoMethodSetMessagePayloadImpl.class)
public interface PaymentMethodInfoMethodSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentMethodInfoMethodSetMessagePayload
     */
    String PAYMENT_METHOD_INFO_METHOD_SET = "PaymentMethodInfoMethodSet";

    /**
     *  <p>Payment Method after the Set MethodInfo Method update action.</p>
     * @return method
     */

    @JsonProperty("method")
    public String getMethod();

    /**
     *  <p>Payment Method before the Set MethodInfo Method update action.</p>
     * @return oldMethod
     */

    @JsonProperty("oldMethod")
    public String getOldMethod();

    /**
     *  <p>Payment Method after the Set MethodInfo Method update action.</p>
     * @param method value to be set
     */

    public void setMethod(final String method);

    /**
     *  <p>Payment Method before the Set MethodInfo Method update action.</p>
     * @param oldMethod value to be set
     */

    public void setOldMethod(final String oldMethod);

    /**
     * factory method
     * @return instance of PaymentMethodInfoMethodSetMessagePayload
     */
    public static PaymentMethodInfoMethodSetMessagePayload of() {
        return new PaymentMethodInfoMethodSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodInfoMethodSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodInfoMethodSetMessagePayload of(final PaymentMethodInfoMethodSetMessagePayload template) {
        PaymentMethodInfoMethodSetMessagePayloadImpl instance = new PaymentMethodInfoMethodSetMessagePayloadImpl();
        instance.setMethod(template.getMethod());
        instance.setOldMethod(template.getOldMethod());
        return instance;
    }

    public PaymentMethodInfoMethodSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodInfoMethodSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodInfoMethodSetMessagePayload deepCopy(
            @Nullable final PaymentMethodInfoMethodSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentMethodInfoMethodSetMessagePayloadImpl instance = new PaymentMethodInfoMethodSetMessagePayloadImpl();
        instance.setMethod(template.getMethod());
        instance.setOldMethod(template.getOldMethod());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodInfoMethodSetMessagePayload
     * @return builder
     */
    public static PaymentMethodInfoMethodSetMessagePayloadBuilder builder() {
        return PaymentMethodInfoMethodSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentMethodInfoMethodSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoMethodSetMessagePayloadBuilder builder(
            final PaymentMethodInfoMethodSetMessagePayload template) {
        return PaymentMethodInfoMethodSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodInfoMethodSetMessagePayload(
            Function<PaymentMethodInfoMethodSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoMethodSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoMethodSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodInfoMethodSetMessagePayload>";
            }
        };
    }
}
