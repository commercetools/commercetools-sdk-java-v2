
package com.commercetools.api.models.payment;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetMethodInfoMethodActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetMethodInfoMethodAction paymentSetMethodInfoMethodAction = PaymentSetMethodInfoMethodAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetMethodInfoMethodActionBuilder implements Builder<PaymentSetMethodInfoMethodAction> {

    @Nullable
    private String method;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public PaymentSetMethodInfoMethodActionBuilder method(@Nullable final String method) {
        this.method = method;
        return this;
    }

    @Nullable
    public String getMethod() {
        return this.method;
    }

    public PaymentSetMethodInfoMethodAction build() {
        return new PaymentSetMethodInfoMethodActionImpl(method);
    }

    /**
     * builds PaymentSetMethodInfoMethodAction without checking for non null required values
     */
    public PaymentSetMethodInfoMethodAction buildUnchecked() {
        return new PaymentSetMethodInfoMethodActionImpl(method);
    }

    public static PaymentSetMethodInfoMethodActionBuilder of() {
        return new PaymentSetMethodInfoMethodActionBuilder();
    }

    public static PaymentSetMethodInfoMethodActionBuilder of(final PaymentSetMethodInfoMethodAction template) {
        PaymentSetMethodInfoMethodActionBuilder builder = new PaymentSetMethodInfoMethodActionBuilder();
        builder.method = template.getMethod();
        return builder;
    }

}
