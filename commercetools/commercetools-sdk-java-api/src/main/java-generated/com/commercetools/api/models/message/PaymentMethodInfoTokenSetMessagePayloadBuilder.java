
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodInfoTokenSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoTokenSetMessagePayload paymentMethodInfoTokenSetMessagePayload = PaymentMethodInfoTokenSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodInfoTokenSetMessagePayloadBuilder
        implements Builder<PaymentMethodInfoTokenSetMessagePayload> {

    @Nullable
    private com.commercetools.api.models.payment_method.PaymentMethodToken token;

    @Nullable
    private com.commercetools.api.models.payment_method.PaymentMethodToken oldToken;

    /**
     *  <p>Token of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoTokenAction" rel="nofollow">Set MethodInfo Token</a> update action.</p>
     * @param builder function to build the token value
     * @return Builder
     */

    public PaymentMethodInfoTokenSetMessagePayloadBuilder token(
            Function<com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder, com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder> builder) {
        this.token = builder.apply(com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Token of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoTokenAction" rel="nofollow">Set MethodInfo Token</a> update action.</p>
     * @param builder function to build the token value
     * @return Builder
     */

    public PaymentMethodInfoTokenSetMessagePayloadBuilder withToken(
            Function<com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder, com.commercetools.api.models.payment_method.PaymentMethodToken> builder) {
        this.token = builder.apply(com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder.of());
        return this;
    }

    /**
     *  <p>Token of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoTokenAction" rel="nofollow">Set MethodInfo Token</a> update action.</p>
     * @param token value to be set
     * @return Builder
     */

    public PaymentMethodInfoTokenSetMessagePayloadBuilder token(
            @Nullable final com.commercetools.api.models.payment_method.PaymentMethodToken token) {
        this.token = token;
        return this;
    }

    /**
     *  <p>Token of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoTokenAction" rel="nofollow">Set MethodInfo Token</a> update action.</p>
     * @param builder function to build the oldToken value
     * @return Builder
     */

    public PaymentMethodInfoTokenSetMessagePayloadBuilder oldToken(
            Function<com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder, com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder> builder) {
        this.oldToken = builder.apply(com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Token of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoTokenAction" rel="nofollow">Set MethodInfo Token</a> update action.</p>
     * @param builder function to build the oldToken value
     * @return Builder
     */

    public PaymentMethodInfoTokenSetMessagePayloadBuilder withOldToken(
            Function<com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder, com.commercetools.api.models.payment_method.PaymentMethodToken> builder) {
        this.oldToken = builder.apply(com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder.of());
        return this;
    }

    /**
     *  <p>Token of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoTokenAction" rel="nofollow">Set MethodInfo Token</a> update action.</p>
     * @param oldToken value to be set
     * @return Builder
     */

    public PaymentMethodInfoTokenSetMessagePayloadBuilder oldToken(
            @Nullable final com.commercetools.api.models.payment_method.PaymentMethodToken oldToken) {
        this.oldToken = oldToken;
        return this;
    }

    /**
     *  <p>Token of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoTokenAction" rel="nofollow">Set MethodInfo Token</a> update action.</p>
     * @return token
     */

    @Nullable
    public com.commercetools.api.models.payment_method.PaymentMethodToken getToken() {
        return this.token;
    }

    /**
     *  <p>Token of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoTokenAction" rel="nofollow">Set MethodInfo Token</a> update action.</p>
     * @return oldToken
     */

    @Nullable
    public com.commercetools.api.models.payment_method.PaymentMethodToken getOldToken() {
        return this.oldToken;
    }

    /**
     * builds PaymentMethodInfoTokenSetMessagePayload with checking for non-null required values
     * @return PaymentMethodInfoTokenSetMessagePayload
     */
    public PaymentMethodInfoTokenSetMessagePayload build() {
        return new PaymentMethodInfoTokenSetMessagePayloadImpl(token, oldToken);
    }

    /**
     * builds PaymentMethodInfoTokenSetMessagePayload without checking for non-null required values
     * @return PaymentMethodInfoTokenSetMessagePayload
     */
    public PaymentMethodInfoTokenSetMessagePayload buildUnchecked() {
        return new PaymentMethodInfoTokenSetMessagePayloadImpl(token, oldToken);
    }

    /**
     * factory method for an instance of PaymentMethodInfoTokenSetMessagePayloadBuilder
     * @return builder
     */
    public static PaymentMethodInfoTokenSetMessagePayloadBuilder of() {
        return new PaymentMethodInfoTokenSetMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentMethodInfoTokenSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoTokenSetMessagePayloadBuilder of(
            final PaymentMethodInfoTokenSetMessagePayload template) {
        PaymentMethodInfoTokenSetMessagePayloadBuilder builder = new PaymentMethodInfoTokenSetMessagePayloadBuilder();
        builder.token = template.getToken();
        builder.oldToken = template.getOldToken();
        return builder;
    }

}
