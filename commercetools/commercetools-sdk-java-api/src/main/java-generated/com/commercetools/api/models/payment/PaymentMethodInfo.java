
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.payment_method.PaymentMethodToken;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Represents a snapshot of the PaymentMethod data used for a Payment.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfo paymentMethodInfo = PaymentMethodInfo.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodInfoImpl.class)
public interface PaymentMethodInfo {

    /**
     *  <p>Payment service that processes the Payment—for example, a PSP. The combination of <code>paymentInterface</code> and the <code>interfaceId</code> of a Payment is unique.</p>
     * @return paymentInterface
     */

    @JsonProperty("paymentInterface")
    public String getPaymentInterface();

    /**
     *  <p>Payment method used—for example, a credit card or cash advance.</p>
     * @return method
     */

    @JsonProperty("method")
    public String getMethod();

    /**
     *  <p>Name of the Payment Method.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Tokenized representation of the Payment Method used by the payment interface.</p>
     * @return token
     */
    @Valid
    @JsonProperty("token")
    public PaymentMethodToken getToken();

    /**
     *  <p>Account or instance of the payment interface when multiple accounts are used (per interface).</p>
     * @return interfaceAccount
     */

    @JsonProperty("interfaceAccount")
    public String getInterfaceAccount();

    /**
     *  <p>Custom Fields of the PaymentMethodInfo.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Payment service that processes the Payment—for example, a PSP. The combination of <code>paymentInterface</code> and the <code>interfaceId</code> of a Payment is unique.</p>
     * @param paymentInterface value to be set
     */

    public void setPaymentInterface(final String paymentInterface);

    /**
     *  <p>Payment method used—for example, a credit card or cash advance.</p>
     * @param method value to be set
     */

    public void setMethod(final String method);

    /**
     *  <p>Name of the Payment Method.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Tokenized representation of the Payment Method used by the payment interface.</p>
     * @param token value to be set
     */

    public void setToken(final PaymentMethodToken token);

    /**
     *  <p>Account or instance of the payment interface when multiple accounts are used (per interface).</p>
     * @param interfaceAccount value to be set
     */

    public void setInterfaceAccount(final String interfaceAccount);

    /**
     *  <p>Custom Fields of the PaymentMethodInfo.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     * factory method
     * @return instance of PaymentMethodInfo
     */
    public static PaymentMethodInfo of() {
        return new PaymentMethodInfoImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodInfo
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodInfo of(final PaymentMethodInfo template) {
        PaymentMethodInfoImpl instance = new PaymentMethodInfoImpl();
        instance.setPaymentInterface(template.getPaymentInterface());
        instance.setMethod(template.getMethod());
        instance.setName(template.getName());
        instance.setToken(template.getToken());
        instance.setInterfaceAccount(template.getInterfaceAccount());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public PaymentMethodInfo copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodInfo
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodInfo deepCopy(@Nullable final PaymentMethodInfo template) {
        if (template == null) {
            return null;
        }
        PaymentMethodInfoImpl instance = new PaymentMethodInfoImpl();
        instance.setPaymentInterface(template.getPaymentInterface());
        instance.setMethod(template.getMethod());
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setToken(com.commercetools.api.models.payment_method.PaymentMethodToken.deepCopy(template.getToken()));
        instance.setInterfaceAccount(template.getInterfaceAccount());
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for PaymentMethodInfo
     * @return builder
     */
    public static PaymentMethodInfoBuilder builder() {
        return PaymentMethodInfoBuilder.of();
    }

    /**
     * create builder for PaymentMethodInfo instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoBuilder builder(final PaymentMethodInfo template) {
        return PaymentMethodInfoBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodInfo(Function<PaymentMethodInfo, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfo> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfo>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodInfo>";
            }
        };
    }
}
