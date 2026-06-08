
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetInterfaceIdAction" rel="nofollow">Set InterfaceId</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentInterfaceIdSetMessagePayload paymentInterfaceIdSetMessagePayload = PaymentInterfaceIdSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentInterfaceIdSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentInterfaceIdSetMessagePayloadImpl.class)
public interface PaymentInterfaceIdSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentInterfaceIdSetMessagePayload
     */
    String PAYMENT_INTERFACE_ID_SET = "PaymentInterfaceIdSet";

    /**
     *  <p>Interface ID of the Payment after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetInterfaceIdAction" rel="nofollow">Set InterfaceId</a> update action.</p>
     * @return interfaceId
     */

    @JsonProperty("interfaceId")
    public String getInterfaceId();

    /**
     *  <p>Interface ID of the Payment before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetInterfaceIdAction" rel="nofollow">Set InterfaceId</a> update action.</p>
     * @return oldInterfaceId
     */

    @JsonProperty("oldInterfaceId")
    public String getOldInterfaceId();

    /**
     *  <p>Interface ID of the Payment after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetInterfaceIdAction" rel="nofollow">Set InterfaceId</a> update action.</p>
     * @param interfaceId value to be set
     */

    public void setInterfaceId(final String interfaceId);

    /**
     *  <p>Interface ID of the Payment before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetInterfaceIdAction" rel="nofollow">Set InterfaceId</a> update action.</p>
     * @param oldInterfaceId value to be set
     */

    public void setOldInterfaceId(final String oldInterfaceId);

    /**
     * factory method
     * @return instance of PaymentInterfaceIdSetMessagePayload
     */
    public static PaymentInterfaceIdSetMessagePayload of() {
        return new PaymentInterfaceIdSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentInterfaceIdSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentInterfaceIdSetMessagePayload of(final PaymentInterfaceIdSetMessagePayload template) {
        PaymentInterfaceIdSetMessagePayloadImpl instance = new PaymentInterfaceIdSetMessagePayloadImpl();
        instance.setInterfaceId(template.getInterfaceId());
        instance.setOldInterfaceId(template.getOldInterfaceId());
        return instance;
    }

    public PaymentInterfaceIdSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentInterfaceIdSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentInterfaceIdSetMessagePayload deepCopy(
            @Nullable final PaymentInterfaceIdSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentInterfaceIdSetMessagePayloadImpl instance = new PaymentInterfaceIdSetMessagePayloadImpl();
        instance.setInterfaceId(template.getInterfaceId());
        instance.setOldInterfaceId(template.getOldInterfaceId());
        return instance;
    }

    /**
     * builder factory method for PaymentInterfaceIdSetMessagePayload
     * @return builder
     */
    public static PaymentInterfaceIdSetMessagePayloadBuilder builder() {
        return PaymentInterfaceIdSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentInterfaceIdSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentInterfaceIdSetMessagePayloadBuilder builder(
            final PaymentInterfaceIdSetMessagePayload template) {
        return PaymentInterfaceIdSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentInterfaceIdSetMessagePayload(Function<PaymentInterfaceIdSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentInterfaceIdSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentInterfaceIdSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentInterfaceIdSetMessagePayload>";
            }
        };
    }
}
