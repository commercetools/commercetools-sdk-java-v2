
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetInterfaceAccountAction" rel="nofollow">Set InterfaceAccount</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInterfaceAccountSetMessagePayload paymentMethodInterfaceAccountSetMessagePayload = PaymentMethodInterfaceAccountSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodInterfaceAccountSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodInterfaceAccountSetMessagePayloadImpl.class)
public interface PaymentMethodInterfaceAccountSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentMethodInterfaceAccountSetMessagePayload
     */
    String PAYMENT_METHOD_INTERFACE_ACCOUNT_SET = "PaymentMethodInterfaceAccountSet";

    /**
     *  <p>Interface account of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetInterfaceAccountAction" rel="nofollow">Set InterfaceAccount</a> update action.</p>
     * @return interfaceAccount
     */

    @JsonProperty("interfaceAccount")
    public String getInterfaceAccount();

    /**
     *  <p>Interface account of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetInterfaceAccountAction" rel="nofollow">Set InterfaceAccount</a> update action.</p>
     * @return oldInterfaceAccount
     */

    @JsonProperty("oldInterfaceAccount")
    public String getOldInterfaceAccount();

    /**
     *  <p>Interface account of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetInterfaceAccountAction" rel="nofollow">Set InterfaceAccount</a> update action.</p>
     * @param interfaceAccount value to be set
     */

    public void setInterfaceAccount(final String interfaceAccount);

    /**
     *  <p>Interface account of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetInterfaceAccountAction" rel="nofollow">Set InterfaceAccount</a> update action.</p>
     * @param oldInterfaceAccount value to be set
     */

    public void setOldInterfaceAccount(final String oldInterfaceAccount);

    /**
     * factory method
     * @return instance of PaymentMethodInterfaceAccountSetMessagePayload
     */
    public static PaymentMethodInterfaceAccountSetMessagePayload of() {
        return new PaymentMethodInterfaceAccountSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodInterfaceAccountSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodInterfaceAccountSetMessagePayload of(
            final PaymentMethodInterfaceAccountSetMessagePayload template) {
        PaymentMethodInterfaceAccountSetMessagePayloadImpl instance = new PaymentMethodInterfaceAccountSetMessagePayloadImpl();
        instance.setInterfaceAccount(template.getInterfaceAccount());
        instance.setOldInterfaceAccount(template.getOldInterfaceAccount());
        return instance;
    }

    public PaymentMethodInterfaceAccountSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodInterfaceAccountSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodInterfaceAccountSetMessagePayload deepCopy(
            @Nullable final PaymentMethodInterfaceAccountSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentMethodInterfaceAccountSetMessagePayloadImpl instance = new PaymentMethodInterfaceAccountSetMessagePayloadImpl();
        instance.setInterfaceAccount(template.getInterfaceAccount());
        instance.setOldInterfaceAccount(template.getOldInterfaceAccount());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodInterfaceAccountSetMessagePayload
     * @return builder
     */
    public static PaymentMethodInterfaceAccountSetMessagePayloadBuilder builder() {
        return PaymentMethodInterfaceAccountSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentMethodInterfaceAccountSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInterfaceAccountSetMessagePayloadBuilder builder(
            final PaymentMethodInterfaceAccountSetMessagePayload template) {
        return PaymentMethodInterfaceAccountSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodInterfaceAccountSetMessagePayload(
            Function<PaymentMethodInterfaceAccountSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInterfaceAccountSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInterfaceAccountSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodInterfaceAccountSetMessagePayload>";
            }
        };
    }
}
