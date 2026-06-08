
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetStatusInterfaceCodeAction" rel="nofollow">Set StatusInterfaceCode</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentStatusInterfaceCodeSetMessagePayload paymentStatusInterfaceCodeSetMessagePayload = PaymentStatusInterfaceCodeSetMessagePayload.builder()
 *             .paymentId("{paymentId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentStatusInterfaceCodeSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentStatusInterfaceCodeSetMessagePayloadImpl.class)
public interface PaymentStatusInterfaceCodeSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentStatusInterfaceCodeSetMessagePayload
     */
    String PAYMENT_STATUS_INTERFACE_CODE_SET = "PaymentStatusInterfaceCodeSet";

    /**
     *  <p>The <code>interfaceCode</code> that was set during the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetStatusInterfaceCodeAction" rel="nofollow">Set StatusInterfaceCode</a> update action.</p>
     * @return interfaceCode
     */

    @JsonProperty("interfaceCode")
    public String getInterfaceCode();

    /**
     *  <p>The <code>interfaceCode</code> that was set during the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetStatusInterfaceCodeAction" rel="nofollow">Set StatusInterfaceCode</a> update action.</p>
     * @param interfaceCode value to be set
     */

    public void setInterfaceCode(final String interfaceCode);

    /**
     * factory method
     * @return instance of PaymentStatusInterfaceCodeSetMessagePayload
     */
    public static PaymentStatusInterfaceCodeSetMessagePayload of() {
        return new PaymentStatusInterfaceCodeSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentStatusInterfaceCodeSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentStatusInterfaceCodeSetMessagePayload of(
            final PaymentStatusInterfaceCodeSetMessagePayload template) {
        PaymentStatusInterfaceCodeSetMessagePayloadImpl instance = new PaymentStatusInterfaceCodeSetMessagePayloadImpl();
        instance.setInterfaceCode(template.getInterfaceCode());
        return instance;
    }

    public PaymentStatusInterfaceCodeSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentStatusInterfaceCodeSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentStatusInterfaceCodeSetMessagePayload deepCopy(
            @Nullable final PaymentStatusInterfaceCodeSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentStatusInterfaceCodeSetMessagePayloadImpl instance = new PaymentStatusInterfaceCodeSetMessagePayloadImpl();
        instance.setInterfaceCode(template.getInterfaceCode());
        return instance;
    }

    /**
     * builder factory method for PaymentStatusInterfaceCodeSetMessagePayload
     * @return builder
     */
    public static PaymentStatusInterfaceCodeSetMessagePayloadBuilder builder() {
        return PaymentStatusInterfaceCodeSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentStatusInterfaceCodeSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentStatusInterfaceCodeSetMessagePayloadBuilder builder(
            final PaymentStatusInterfaceCodeSetMessagePayload template) {
        return PaymentStatusInterfaceCodeSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentStatusInterfaceCodeSetMessagePayload(
            Function<PaymentStatusInterfaceCodeSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentStatusInterfaceCodeSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentStatusInterfaceCodeSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentStatusInterfaceCodeSetMessagePayload>";
            }
        };
    }
}
