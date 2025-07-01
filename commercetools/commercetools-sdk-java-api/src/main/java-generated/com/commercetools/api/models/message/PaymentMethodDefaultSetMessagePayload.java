
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Set Default update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodDefaultSetMessagePayload paymentMethodDefaultSetMessagePayload = PaymentMethodDefaultSetMessagePayload.builder()
 *             .default(true)
 *             .oldDefault(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodDefaultSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodDefaultSetMessagePayloadImpl.class)
public interface PaymentMethodDefaultSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentMethodDefaultSetMessagePayload
     */
    String PAYMENT_METHOD_DEFAULT_SET = "PaymentMethodDefaultSet";

    /**
     *  <p>Default Payment Method after the Set Default update action.</p>
     * @return default
     */
    @NotNull
    @JsonProperty("default")
    public Boolean getDefault();

    /**
     *  <p>Default Payment Method before the Set Default update action.</p>
     * @return oldDefault
     */
    @NotNull
    @JsonProperty("oldDefault")
    public Boolean getOldDefault();

    /**
     *  <p>Default Payment Method after the Set Default update action.</p>
     * @param _default value to be set
     */

    public void setDefault(final Boolean _default);

    /**
     *  <p>Default Payment Method before the Set Default update action.</p>
     * @param oldDefault value to be set
     */

    public void setOldDefault(final Boolean oldDefault);

    /**
     * factory method
     * @return instance of PaymentMethodDefaultSetMessagePayload
     */
    public static PaymentMethodDefaultSetMessagePayload of() {
        return new PaymentMethodDefaultSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodDefaultSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodDefaultSetMessagePayload of(final PaymentMethodDefaultSetMessagePayload template) {
        PaymentMethodDefaultSetMessagePayloadImpl instance = new PaymentMethodDefaultSetMessagePayloadImpl();
        instance.setDefault(template.getDefault());
        instance.setOldDefault(template.getOldDefault());
        return instance;
    }

    public PaymentMethodDefaultSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodDefaultSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodDefaultSetMessagePayload deepCopy(
            @Nullable final PaymentMethodDefaultSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentMethodDefaultSetMessagePayloadImpl instance = new PaymentMethodDefaultSetMessagePayloadImpl();
        instance.setDefault(template.getDefault());
        instance.setOldDefault(template.getOldDefault());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodDefaultSetMessagePayload
     * @return builder
     */
    public static PaymentMethodDefaultSetMessagePayloadBuilder builder() {
        return PaymentMethodDefaultSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentMethodDefaultSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodDefaultSetMessagePayloadBuilder builder(
            final PaymentMethodDefaultSetMessagePayload template) {
        return PaymentMethodDefaultSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodDefaultSetMessagePayload(Function<PaymentMethodDefaultSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodDefaultSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodDefaultSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodDefaultSetMessagePayload>";
            }
        };
    }
}
