
package com.commercetools.checkout.models.application;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentsConfigurationBuilder
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
public class PaymentsConfigurationBuilder implements Builder<PaymentsConfiguration> {

    @Nullable
    private String paymentReturnUrl;

    private com.commercetools.checkout.models.payment_integration.PaymentComponentType activePaymentComponentType;

    /**
     *  <p>URL where the buyer will be redirected back to after an offsite payment.</p>
     * @param paymentReturnUrl value to be set
     * @return Builder
     */

    public PaymentsConfigurationBuilder paymentReturnUrl(@Nullable final String paymentReturnUrl) {
        this.paymentReturnUrl = paymentReturnUrl;
        return this;
    }

    /**
     *  <p>Indicates the type of payment components that the Application will use.</p>
     * @param activePaymentComponentType value to be set
     * @return Builder
     */

    public PaymentsConfigurationBuilder activePaymentComponentType(
            final com.commercetools.checkout.models.payment_integration.PaymentComponentType activePaymentComponentType) {
        this.activePaymentComponentType = activePaymentComponentType;
        return this;
    }

    /**
     *  <p>URL where the buyer will be redirected back to after an offsite payment.</p>
     * @return paymentReturnUrl
     */

    @Nullable
    public String getPaymentReturnUrl() {
        return this.paymentReturnUrl;
    }

    /**
     *  <p>Indicates the type of payment components that the Application will use.</p>
     * @return activePaymentComponentType
     */

    public com.commercetools.checkout.models.payment_integration.PaymentComponentType getActivePaymentComponentType() {
        return this.activePaymentComponentType;
    }

    /**
     * builds PaymentsConfiguration with checking for non-null required values
     * @return PaymentsConfiguration
     */
    public PaymentsConfiguration build() {
        Objects.requireNonNull(activePaymentComponentType,
            PaymentsConfiguration.class + ": activePaymentComponentType is missing");
        return new PaymentsConfigurationImpl(paymentReturnUrl, activePaymentComponentType);
    }

    /**
     * builds PaymentsConfiguration without checking for non-null required values
     * @return PaymentsConfiguration
     */
    public PaymentsConfiguration buildUnchecked() {
        return new PaymentsConfigurationImpl(paymentReturnUrl, activePaymentComponentType);
    }

    /**
     * factory method for an instance of PaymentsConfigurationBuilder
     * @return builder
     */
    public static PaymentsConfigurationBuilder of() {
        return new PaymentsConfigurationBuilder();
    }

    /**
     * create builder for PaymentsConfiguration instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentsConfigurationBuilder of(final PaymentsConfiguration template) {
        PaymentsConfigurationBuilder builder = new PaymentsConfigurationBuilder();
        builder.paymentReturnUrl = template.getPaymentReturnUrl();
        builder.activePaymentComponentType = template.getActivePaymentComponentType();
        return builder;
    }

}
