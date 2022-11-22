
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
     */

    @JsonProperty("paymentInterface")
    public String getPaymentInterface();

    /**
     *  <p>Payment method used, for example, credit card, or cash advance.</p>
     */

    @JsonProperty("method")
    public String getMethod();

    /**
     *  <p>Localizable name of the payment method.</p>
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setPaymentInterface(final String paymentInterface);

    public void setMethod(final String method);

    public void setName(final LocalizedString name);

    public static PaymentMethodInfo of() {
        return new PaymentMethodInfoImpl();
    }

    public static PaymentMethodInfo of(final PaymentMethodInfo template) {
        PaymentMethodInfoImpl instance = new PaymentMethodInfoImpl();
        instance.setPaymentInterface(template.getPaymentInterface());
        instance.setMethod(template.getMethod());
        instance.setName(template.getName());
        return instance;
    }

    public static PaymentMethodInfoBuilder builder() {
        return PaymentMethodInfoBuilder.of();
    }

    public static PaymentMethodInfoBuilder builder(final PaymentMethodInfo template) {
        return PaymentMethodInfoBuilder.of(template);
    }

    default <T> T withPaymentMethodInfo(Function<PaymentMethodInfo, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfo> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfo>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodInfo>";
            }
        };
    }
}
