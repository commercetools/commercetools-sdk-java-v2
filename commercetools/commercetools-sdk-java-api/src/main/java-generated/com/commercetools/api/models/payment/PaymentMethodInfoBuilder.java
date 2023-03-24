
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodInfoBuilder
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
public class PaymentMethodInfoBuilder implements Builder<PaymentMethodInfo> {

    @Nullable
    private String paymentInterface;

    @Nullable
    private String method;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    /**
     *  <p>Payment service that processes the Payment (for example, a PSP). Once set, it cannot be changed. The combination of <code>paymentInterface</code> and the <code>interfaceId</code> of a Payment must be unique.</p>
     * @param paymentInterface value to be set
     * @return Builder
     */

    public PaymentMethodInfoBuilder paymentInterface(@Nullable final String paymentInterface) {
        this.paymentInterface = paymentInterface;
        return this;
    }

    /**
     *  <p>Payment method used, for example, credit card, or cash advance.</p>
     * @param method value to be set
     * @return Builder
     */

    public PaymentMethodInfoBuilder method(@Nullable final String method) {
        this.method = method;
        return this;
    }

    /**
     *  <p>Localizable name of the payment method.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public PaymentMethodInfoBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Localizable name of the payment method.</p>
     * @param name value to be set
     * @return Builder
     */

    public PaymentMethodInfoBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    @Nullable
    public String getPaymentInterface() {
        return this.paymentInterface;
    }

    @Nullable
    public String getMethod() {
        return this.method;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     * builds PaymentMethodInfo with checking for non-null required values
     * @return PaymentMethodInfo
     */
    public PaymentMethodInfo build() {
        return new PaymentMethodInfoImpl(paymentInterface, method, name);
    }

    /**
     * builds PaymentMethodInfo without checking for non-null required values
     * @return PaymentMethodInfo
     */
    public PaymentMethodInfo buildUnchecked() {
        return new PaymentMethodInfoImpl(paymentInterface, method, name);
    }

    public static PaymentMethodInfoBuilder of() {
        return new PaymentMethodInfoBuilder();
    }

    public static PaymentMethodInfoBuilder of(final PaymentMethodInfo template) {
        PaymentMethodInfoBuilder builder = new PaymentMethodInfoBuilder();
        builder.paymentInterface = template.getPaymentInterface();
        builder.method = template.getMethod();
        builder.name = template.getName();
        return builder;
    }

}
