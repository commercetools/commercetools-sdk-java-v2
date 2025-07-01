
package com.commercetools.api.models.payment_method;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodSetMethodActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodSetMethodAction paymentMethodSetMethodAction = PaymentMethodSetMethodAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodSetMethodActionBuilder implements Builder<PaymentMethodSetMethodAction> {

    @Nullable
    private String method;

    /**
     *  <p>New payment method—for example, a credit card or cash advance. If empty, any existing value will be removed.</p>
     * @param method value to be set
     * @return Builder
     */

    public PaymentMethodSetMethodActionBuilder method(@Nullable final String method) {
        this.method = method;
        return this;
    }

    /**
     *  <p>New payment method—for example, a credit card or cash advance. If empty, any existing value will be removed.</p>
     * @return method
     */

    @Nullable
    public String getMethod() {
        return this.method;
    }

    /**
     * builds PaymentMethodSetMethodAction with checking for non-null required values
     * @return PaymentMethodSetMethodAction
     */
    public PaymentMethodSetMethodAction build() {
        return new PaymentMethodSetMethodActionImpl(method);
    }

    /**
     * builds PaymentMethodSetMethodAction without checking for non-null required values
     * @return PaymentMethodSetMethodAction
     */
    public PaymentMethodSetMethodAction buildUnchecked() {
        return new PaymentMethodSetMethodActionImpl(method);
    }

    /**
     * factory method for an instance of PaymentMethodSetMethodActionBuilder
     * @return builder
     */
    public static PaymentMethodSetMethodActionBuilder of() {
        return new PaymentMethodSetMethodActionBuilder();
    }

    /**
     * create builder for PaymentMethodSetMethodAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodSetMethodActionBuilder of(final PaymentMethodSetMethodAction template) {
        PaymentMethodSetMethodActionBuilder builder = new PaymentMethodSetMethodActionBuilder();
        builder.method = template.getMethod();
        return builder;
    }

}
