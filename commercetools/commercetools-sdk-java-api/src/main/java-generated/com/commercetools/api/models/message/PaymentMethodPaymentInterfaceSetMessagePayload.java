
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetPaymentInterfaceAction" rel="nofollow">Set PaymentInterface</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodPaymentInterfaceSetMessagePayload paymentMethodPaymentInterfaceSetMessagePayload = PaymentMethodPaymentInterfaceSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodPaymentInterfaceSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodPaymentInterfaceSetMessagePayloadImpl.class)
public interface PaymentMethodPaymentInterfaceSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentMethodPaymentInterfaceSetMessagePayload
     */
    String PAYMENT_METHOD_PAYMENT_INTERFACE_SET = "PaymentMethodPaymentInterfaceSet";

    /**
     *  <p>Payment interface of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetPaymentInterfaceAction" rel="nofollow">Set PaymentInterface</a> update action.</p>
     * @return paymentInterface
     */

    @JsonProperty("paymentInterface")
    public String getPaymentInterface();

    /**
     *  <p>Payment interface of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetPaymentInterfaceAction" rel="nofollow">Set PaymentInterface</a> update action.</p>
     * @return oldPaymentInterface
     */

    @JsonProperty("oldPaymentInterface")
    public String getOldPaymentInterface();

    /**
     *  <p>Payment interface of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetPaymentInterfaceAction" rel="nofollow">Set PaymentInterface</a> update action.</p>
     * @param paymentInterface value to be set
     */

    public void setPaymentInterface(final String paymentInterface);

    /**
     *  <p>Payment interface of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetPaymentInterfaceAction" rel="nofollow">Set PaymentInterface</a> update action.</p>
     * @param oldPaymentInterface value to be set
     */

    public void setOldPaymentInterface(final String oldPaymentInterface);

    /**
     * factory method
     * @return instance of PaymentMethodPaymentInterfaceSetMessagePayload
     */
    public static PaymentMethodPaymentInterfaceSetMessagePayload of() {
        return new PaymentMethodPaymentInterfaceSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodPaymentInterfaceSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodPaymentInterfaceSetMessagePayload of(
            final PaymentMethodPaymentInterfaceSetMessagePayload template) {
        PaymentMethodPaymentInterfaceSetMessagePayloadImpl instance = new PaymentMethodPaymentInterfaceSetMessagePayloadImpl();
        instance.setPaymentInterface(template.getPaymentInterface());
        instance.setOldPaymentInterface(template.getOldPaymentInterface());
        return instance;
    }

    public PaymentMethodPaymentInterfaceSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodPaymentInterfaceSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodPaymentInterfaceSetMessagePayload deepCopy(
            @Nullable final PaymentMethodPaymentInterfaceSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentMethodPaymentInterfaceSetMessagePayloadImpl instance = new PaymentMethodPaymentInterfaceSetMessagePayloadImpl();
        instance.setPaymentInterface(template.getPaymentInterface());
        instance.setOldPaymentInterface(template.getOldPaymentInterface());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodPaymentInterfaceSetMessagePayload
     * @return builder
     */
    public static PaymentMethodPaymentInterfaceSetMessagePayloadBuilder builder() {
        return PaymentMethodPaymentInterfaceSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentMethodPaymentInterfaceSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodPaymentInterfaceSetMessagePayloadBuilder builder(
            final PaymentMethodPaymentInterfaceSetMessagePayload template) {
        return PaymentMethodPaymentInterfaceSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodPaymentInterfaceSetMessagePayload(
            Function<PaymentMethodPaymentInterfaceSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodPaymentInterfaceSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodPaymentInterfaceSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodPaymentInterfaceSetMessagePayload>";
            }
        };
    }
}
