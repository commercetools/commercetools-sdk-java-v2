
package com.commercetools.api.models.payment_method;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodSetKeyAction paymentMethodSetKeyAction = PaymentMethodSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodSetKeyActionBuilder implements Builder<PaymentMethodSetKeyAction> {

    @Nullable
    private String key;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param key value to be set
     * @return Builder
     */

    public PaymentMethodSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds PaymentMethodSetKeyAction with checking for non-null required values
     * @return PaymentMethodSetKeyAction
     */
    public PaymentMethodSetKeyAction build() {
        return new PaymentMethodSetKeyActionImpl(key);
    }

    /**
     * builds PaymentMethodSetKeyAction without checking for non-null required values
     * @return PaymentMethodSetKeyAction
     */
    public PaymentMethodSetKeyAction buildUnchecked() {
        return new PaymentMethodSetKeyActionImpl(key);
    }

    /**
     * factory method for an instance of PaymentMethodSetKeyActionBuilder
     * @return builder
     */
    public static PaymentMethodSetKeyActionBuilder of() {
        return new PaymentMethodSetKeyActionBuilder();
    }

    /**
     * create builder for PaymentMethodSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodSetKeyActionBuilder of(final PaymentMethodSetKeyAction template) {
        PaymentMethodSetKeyActionBuilder builder = new PaymentMethodSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
