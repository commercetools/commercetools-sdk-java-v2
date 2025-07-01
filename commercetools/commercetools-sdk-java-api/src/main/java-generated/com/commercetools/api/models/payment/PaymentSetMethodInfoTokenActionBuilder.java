
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetMethodInfoTokenActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetMethodInfoTokenAction paymentSetMethodInfoTokenAction = PaymentSetMethodInfoTokenAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetMethodInfoTokenActionBuilder implements Builder<PaymentSetMethodInfoTokenAction> {

    @Nullable
    private com.commercetools.api.models.payment_method.PaymentMethodToken token;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the token value
     * @return Builder
     */

    public PaymentSetMethodInfoTokenActionBuilder token(
            Function<com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder, com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder> builder) {
        this.token = builder.apply(com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the token value
     * @return Builder
     */

    public PaymentSetMethodInfoTokenActionBuilder withToken(
            Function<com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder, com.commercetools.api.models.payment_method.PaymentMethodToken> builder) {
        this.token = builder.apply(com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param token value to be set
     * @return Builder
     */

    public PaymentSetMethodInfoTokenActionBuilder token(
            @Nullable final com.commercetools.api.models.payment_method.PaymentMethodToken token) {
        this.token = token;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return token
     */

    @Nullable
    public com.commercetools.api.models.payment_method.PaymentMethodToken getToken() {
        return this.token;
    }

    /**
     * builds PaymentSetMethodInfoTokenAction with checking for non-null required values
     * @return PaymentSetMethodInfoTokenAction
     */
    public PaymentSetMethodInfoTokenAction build() {
        return new PaymentSetMethodInfoTokenActionImpl(token);
    }

    /**
     * builds PaymentSetMethodInfoTokenAction without checking for non-null required values
     * @return PaymentSetMethodInfoTokenAction
     */
    public PaymentSetMethodInfoTokenAction buildUnchecked() {
        return new PaymentSetMethodInfoTokenActionImpl(token);
    }

    /**
     * factory method for an instance of PaymentSetMethodInfoTokenActionBuilder
     * @return builder
     */
    public static PaymentSetMethodInfoTokenActionBuilder of() {
        return new PaymentSetMethodInfoTokenActionBuilder();
    }

    /**
     * create builder for PaymentSetMethodInfoTokenAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetMethodInfoTokenActionBuilder of(final PaymentSetMethodInfoTokenAction template) {
        PaymentSetMethodInfoTokenActionBuilder builder = new PaymentSetMethodInfoTokenActionBuilder();
        builder.token = template.getToken();
        return builder;
    }

}
