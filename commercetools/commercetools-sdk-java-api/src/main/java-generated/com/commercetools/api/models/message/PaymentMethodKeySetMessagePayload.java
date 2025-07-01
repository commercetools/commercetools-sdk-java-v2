
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Key update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodKeySetMessagePayload paymentMethodKeySetMessagePayload = PaymentMethodKeySetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodKeySet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodKeySetMessagePayloadImpl.class)
public interface PaymentMethodKeySetMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentMethodKeySetMessagePayload
     */
    String PAYMENT_METHOD_KEY_SET = "PaymentMethodKeySet";

    /**
     *  <p><code>key</code> value of the PaymentMethod after the Set Key update action.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p><code>key</code> value of the PaymentMethod before the Set Key update action.</p>
     * @return oldKey
     */

    @JsonProperty("oldKey")
    public String getOldKey();

    /**
     *  <p><code>key</code> value of the PaymentMethod after the Set Key update action.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p><code>key</code> value of the PaymentMethod before the Set Key update action.</p>
     * @param oldKey value to be set
     */

    public void setOldKey(final String oldKey);

    /**
     * factory method
     * @return instance of PaymentMethodKeySetMessagePayload
     */
    public static PaymentMethodKeySetMessagePayload of() {
        return new PaymentMethodKeySetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodKeySetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodKeySetMessagePayload of(final PaymentMethodKeySetMessagePayload template) {
        PaymentMethodKeySetMessagePayloadImpl instance = new PaymentMethodKeySetMessagePayloadImpl();
        instance.setKey(template.getKey());
        instance.setOldKey(template.getOldKey());
        return instance;
    }

    public PaymentMethodKeySetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodKeySetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodKeySetMessagePayload deepCopy(
            @Nullable final PaymentMethodKeySetMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentMethodKeySetMessagePayloadImpl instance = new PaymentMethodKeySetMessagePayloadImpl();
        instance.setKey(template.getKey());
        instance.setOldKey(template.getOldKey());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodKeySetMessagePayload
     * @return builder
     */
    public static PaymentMethodKeySetMessagePayloadBuilder builder() {
        return PaymentMethodKeySetMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentMethodKeySetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodKeySetMessagePayloadBuilder builder(final PaymentMethodKeySetMessagePayload template) {
        return PaymentMethodKeySetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodKeySetMessagePayload(Function<PaymentMethodKeySetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodKeySetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodKeySetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodKeySetMessagePayload>";
            }
        };
    }
}
