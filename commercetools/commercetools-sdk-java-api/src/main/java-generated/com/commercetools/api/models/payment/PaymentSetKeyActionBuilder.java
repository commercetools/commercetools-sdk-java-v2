
package com.commercetools.api.models.payment;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetKeyAction paymentSetKeyAction = PaymentSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetKeyActionBuilder implements Builder<PaymentSetKeyAction> {

    @Nullable
    private String key;

    /**
     *  <p>Value to set. If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     * @param key value to be set
     * @return Builder
     */

    public PaymentSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Value to set. If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds PaymentSetKeyAction with checking for non-null required values
     * @return PaymentSetKeyAction
     */
    public PaymentSetKeyAction build() {
        return new PaymentSetKeyActionImpl(key);
    }

    /**
     * builds PaymentSetKeyAction without checking for non-null required values
     * @return PaymentSetKeyAction
     */
    public PaymentSetKeyAction buildUnchecked() {
        return new PaymentSetKeyActionImpl(key);
    }

    /**
     * factory method for an instance of PaymentSetKeyActionBuilder
     * @return builder
     */
    public static PaymentSetKeyActionBuilder of() {
        return new PaymentSetKeyActionBuilder();
    }

    /**
     * create builder for PaymentSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetKeyActionBuilder of(final PaymentSetKeyAction template) {
        PaymentSetKeyActionBuilder builder = new PaymentSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
