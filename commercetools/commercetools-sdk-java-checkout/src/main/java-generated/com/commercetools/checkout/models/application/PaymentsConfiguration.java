
package com.commercetools.checkout.models.application;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.payment_integration.PaymentComponentType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * PaymentsConfiguration
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentsConfiguration paymentsConfiguration = PaymentsConfiguration.builder()
 *             .activePaymentComponentType(PaymentComponentType.COMPONENT)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentsConfigurationImpl.class)
public interface PaymentsConfiguration {

    /**
     *  <p>URL where the buyer will be redirected back to after an offsite payment.</p>
     * @return paymentReturnUrl
     */

    @JsonProperty("paymentReturnUrl")
    public String getPaymentReturnUrl();

    /**
     *  <p>Indicates the type of payment components that the Application will use.</p>
     * @return activePaymentComponentType
     */
    @NotNull
    @JsonProperty("activePaymentComponentType")
    public PaymentComponentType getActivePaymentComponentType();

    /**
     *  <p>URL where the buyer will be redirected back to after an offsite payment.</p>
     * @param paymentReturnUrl value to be set
     */

    public void setPaymentReturnUrl(final String paymentReturnUrl);

    /**
     *  <p>Indicates the type of payment components that the Application will use.</p>
     * @param activePaymentComponentType value to be set
     */

    public void setActivePaymentComponentType(final PaymentComponentType activePaymentComponentType);

    /**
     * factory method
     * @return instance of PaymentsConfiguration
     */
    public static PaymentsConfiguration of() {
        return new PaymentsConfigurationImpl();
    }

    /**
     * factory method to create a shallow copy PaymentsConfiguration
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentsConfiguration of(final PaymentsConfiguration template) {
        PaymentsConfigurationImpl instance = new PaymentsConfigurationImpl();
        instance.setPaymentReturnUrl(template.getPaymentReturnUrl());
        instance.setActivePaymentComponentType(template.getActivePaymentComponentType());
        return instance;
    }

    public PaymentsConfiguration copyDeep();

    /**
     * factory method to create a deep copy of PaymentsConfiguration
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentsConfiguration deepCopy(@Nullable final PaymentsConfiguration template) {
        if (template == null) {
            return null;
        }
        PaymentsConfigurationImpl instance = new PaymentsConfigurationImpl();
        instance.setPaymentReturnUrl(template.getPaymentReturnUrl());
        instance.setActivePaymentComponentType(template.getActivePaymentComponentType());
        return instance;
    }

    /**
     * builder factory method for PaymentsConfiguration
     * @return builder
     */
    public static PaymentsConfigurationBuilder builder() {
        return PaymentsConfigurationBuilder.of();
    }

    /**
     * create builder for PaymentsConfiguration instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentsConfigurationBuilder builder(final PaymentsConfiguration template) {
        return PaymentsConfigurationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentsConfiguration(Function<PaymentsConfiguration, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentsConfiguration> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentsConfiguration>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentsConfiguration>";
            }
        };
    }
}
