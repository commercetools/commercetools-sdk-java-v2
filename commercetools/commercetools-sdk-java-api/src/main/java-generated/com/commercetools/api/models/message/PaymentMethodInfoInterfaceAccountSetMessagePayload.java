
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set MethodInfo InterfaceAccount update action on Payments and Set MethodInfo InterfaceAccount update action on My Payments.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoInterfaceAccountSetMessagePayload paymentMethodInfoInterfaceAccountSetMessagePayload = PaymentMethodInfoInterfaceAccountSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodInfoInterfaceAccountSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodInfoInterfaceAccountSetMessagePayloadImpl.class)
public interface PaymentMethodInfoInterfaceAccountSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentMethodInfoInterfaceAccountSetMessagePayload
     */
    String PAYMENT_METHOD_INFO_INTERFACE_ACCOUNT_SET = "PaymentMethodInfoInterfaceAccountSet";

    /**
     *  <p>Interface account of the Payment Method after the Set MethodInfo InterfaceAccount update action.</p>
     * @return interfaceAccount
     */

    @JsonProperty("interfaceAccount")
    public String getInterfaceAccount();

    /**
     *  <p>Interface account of the Payment Method before the Set MethodInfo InterfaceAccount update action.</p>
     * @return oldInterfaceAccount
     */

    @JsonProperty("oldInterfaceAccount")
    public String getOldInterfaceAccount();

    /**
     *  <p>Interface account of the Payment Method after the Set MethodInfo InterfaceAccount update action.</p>
     * @param interfaceAccount value to be set
     */

    public void setInterfaceAccount(final String interfaceAccount);

    /**
     *  <p>Interface account of the Payment Method before the Set MethodInfo InterfaceAccount update action.</p>
     * @param oldInterfaceAccount value to be set
     */

    public void setOldInterfaceAccount(final String oldInterfaceAccount);

    /**
     * factory method
     * @return instance of PaymentMethodInfoInterfaceAccountSetMessagePayload
     */
    public static PaymentMethodInfoInterfaceAccountSetMessagePayload of() {
        return new PaymentMethodInfoInterfaceAccountSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodInfoInterfaceAccountSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodInfoInterfaceAccountSetMessagePayload of(
            final PaymentMethodInfoInterfaceAccountSetMessagePayload template) {
        PaymentMethodInfoInterfaceAccountSetMessagePayloadImpl instance = new PaymentMethodInfoInterfaceAccountSetMessagePayloadImpl();
        instance.setInterfaceAccount(template.getInterfaceAccount());
        instance.setOldInterfaceAccount(template.getOldInterfaceAccount());
        return instance;
    }

    public PaymentMethodInfoInterfaceAccountSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodInfoInterfaceAccountSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodInfoInterfaceAccountSetMessagePayload deepCopy(
            @Nullable final PaymentMethodInfoInterfaceAccountSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentMethodInfoInterfaceAccountSetMessagePayloadImpl instance = new PaymentMethodInfoInterfaceAccountSetMessagePayloadImpl();
        instance.setInterfaceAccount(template.getInterfaceAccount());
        instance.setOldInterfaceAccount(template.getOldInterfaceAccount());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodInfoInterfaceAccountSetMessagePayload
     * @return builder
     */
    public static PaymentMethodInfoInterfaceAccountSetMessagePayloadBuilder builder() {
        return PaymentMethodInfoInterfaceAccountSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentMethodInfoInterfaceAccountSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoInterfaceAccountSetMessagePayloadBuilder builder(
            final PaymentMethodInfoInterfaceAccountSetMessagePayload template) {
        return PaymentMethodInfoInterfaceAccountSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodInfoInterfaceAccountSetMessagePayload(
            Function<PaymentMethodInfoInterfaceAccountSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoInterfaceAccountSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoInterfaceAccountSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodInfoInterfaceAccountSetMessagePayload>";
            }
        };
    }
}
