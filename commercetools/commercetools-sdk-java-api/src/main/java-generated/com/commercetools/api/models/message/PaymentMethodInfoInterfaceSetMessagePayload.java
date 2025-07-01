
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set MethodInfo Interface update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoInterfaceSetMessagePayload paymentMethodInfoInterfaceSetMessagePayload = PaymentMethodInfoInterfaceSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodInfoInterfaceSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodInfoInterfaceSetMessagePayloadImpl.class)
public interface PaymentMethodInfoInterfaceSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentMethodInfoInterfaceSetMessagePayload
     */
    String PAYMENT_METHOD_INFO_INTERFACE_SET = "PaymentMethodInfoInterfaceSet";

    /**
     *  <p>Payment interface of the Payment Method after the Set MethodInfo Interface update action.</p>
     * @return interface
     */

    @JsonProperty("interface")
    public String getInterface();

    /**
     *  <p>Payment interface of the Payment Method before the Set MethodInfo Interface update action.</p>
     * @return oldInterface
     */

    @JsonProperty("oldInterface")
    public String getOldInterface();

    /**
     *  <p>Payment interface of the Payment Method after the Set MethodInfo Interface update action.</p>
     * @param _interface value to be set
     */

    public void setInterface(final String _interface);

    /**
     *  <p>Payment interface of the Payment Method before the Set MethodInfo Interface update action.</p>
     * @param oldInterface value to be set
     */

    public void setOldInterface(final String oldInterface);

    /**
     * factory method
     * @return instance of PaymentMethodInfoInterfaceSetMessagePayload
     */
    public static PaymentMethodInfoInterfaceSetMessagePayload of() {
        return new PaymentMethodInfoInterfaceSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodInfoInterfaceSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodInfoInterfaceSetMessagePayload of(
            final PaymentMethodInfoInterfaceSetMessagePayload template) {
        PaymentMethodInfoInterfaceSetMessagePayloadImpl instance = new PaymentMethodInfoInterfaceSetMessagePayloadImpl();
        instance.setInterface(template.getInterface());
        instance.setOldInterface(template.getOldInterface());
        return instance;
    }

    public PaymentMethodInfoInterfaceSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodInfoInterfaceSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodInfoInterfaceSetMessagePayload deepCopy(
            @Nullable final PaymentMethodInfoInterfaceSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentMethodInfoInterfaceSetMessagePayloadImpl instance = new PaymentMethodInfoInterfaceSetMessagePayloadImpl();
        instance.setInterface(template.getInterface());
        instance.setOldInterface(template.getOldInterface());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodInfoInterfaceSetMessagePayload
     * @return builder
     */
    public static PaymentMethodInfoInterfaceSetMessagePayloadBuilder builder() {
        return PaymentMethodInfoInterfaceSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentMethodInfoInterfaceSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoInterfaceSetMessagePayloadBuilder builder(
            final PaymentMethodInfoInterfaceSetMessagePayload template) {
        return PaymentMethodInfoInterfaceSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodInfoInterfaceSetMessagePayload(
            Function<PaymentMethodInfoInterfaceSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoInterfaceSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoInterfaceSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodInfoInterfaceSetMessagePayload>";
            }
        };
    }
}
