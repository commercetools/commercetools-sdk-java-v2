
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Method update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodMethodSetMessagePayload paymentMethodMethodSetMessagePayload = PaymentMethodMethodSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodMethodSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodMethodSetMessagePayloadImpl.class)
public interface PaymentMethodMethodSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentMethodMethodSetMessagePayload
     */
    String PAYMENT_METHOD_METHOD_SET = "PaymentMethodMethodSet";

    /**
     *  <p>Payment Method after the Set Method update action.</p>
     * @return method
     */

    @JsonProperty("method")
    public String getMethod();

    /**
     *  <p>Payment Method before the Set Method update action.</p>
     * @return oldMethod
     */

    @JsonProperty("oldMethod")
    public String getOldMethod();

    /**
     *  <p>Payment Method after the Set Method update action.</p>
     * @param method value to be set
     */

    public void setMethod(final String method);

    /**
     *  <p>Payment Method before the Set Method update action.</p>
     * @param oldMethod value to be set
     */

    public void setOldMethod(final String oldMethod);

    /**
     * factory method
     * @return instance of PaymentMethodMethodSetMessagePayload
     */
    public static PaymentMethodMethodSetMessagePayload of() {
        return new PaymentMethodMethodSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodMethodSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodMethodSetMessagePayload of(final PaymentMethodMethodSetMessagePayload template) {
        PaymentMethodMethodSetMessagePayloadImpl instance = new PaymentMethodMethodSetMessagePayloadImpl();
        instance.setMethod(template.getMethod());
        instance.setOldMethod(template.getOldMethod());
        return instance;
    }

    public PaymentMethodMethodSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodMethodSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodMethodSetMessagePayload deepCopy(
            @Nullable final PaymentMethodMethodSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentMethodMethodSetMessagePayloadImpl instance = new PaymentMethodMethodSetMessagePayloadImpl();
        instance.setMethod(template.getMethod());
        instance.setOldMethod(template.getOldMethod());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodMethodSetMessagePayload
     * @return builder
     */
    public static PaymentMethodMethodSetMessagePayloadBuilder builder() {
        return PaymentMethodMethodSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentMethodMethodSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodMethodSetMessagePayloadBuilder builder(
            final PaymentMethodMethodSetMessagePayload template) {
        return PaymentMethodMethodSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodMethodSetMessagePayload(Function<PaymentMethodMethodSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodMethodSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodMethodSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodMethodSetMessagePayload>";
            }
        };
    }
}
