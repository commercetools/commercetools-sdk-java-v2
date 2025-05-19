
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * PaymentMethodInfo
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
     *  <p>Payment service that processes the Payment (for example, a PSP). Once set, it cannot be changed. The combination of <code>paymentInterface</code> and the <code>interfaceId</code> of a Payment must be unique.</p>
     * @return paymentInterface
     */

    @JsonProperty("paymentInterface")
    public String getPaymentInterface();

    /**
     *  <p>Payment method used, for example, credit card, or cash advance.</p>
     * @return method
     */

    @JsonProperty("method")
    public String getMethod();

    /**
     *  <p>Localizable name of the payment method.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Payment service that processes the Payment (for example, a PSP). Once set, it cannot be changed. The combination of <code>paymentInterface</code> and the <code>interfaceId</code> of a Payment must be unique.</p>
     * @param paymentInterface value to be set
     */

    public void setPaymentInterface(final String paymentInterface);

    /**
     *  <p>Payment method used, for example, credit card, or cash advance.</p>
     * @param method value to be set
     */

    public void setMethod(final String method);

    /**
     *  <p>Localizable name of the payment method.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

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
