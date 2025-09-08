
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodDeletedMessagePayload paymentMethodDeletedMessagePayload = PaymentMethodDeletedMessagePayload.builder()
 *             .paymentMethod(paymentMethodBuilder -> paymentMethodBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodDeletedMessagePayloadBuilder implements Builder<PaymentMethodDeletedMessagePayload> {

    private com.commercetools.api.models.payment_method.PaymentMethod paymentMethod;

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> that was deleted.</p>
     * @param builder function to build the paymentMethod value
     * @return Builder
     */

    public PaymentMethodDeletedMessagePayloadBuilder paymentMethod(
            Function<com.commercetools.api.models.payment_method.PaymentMethodBuilder, com.commercetools.api.models.payment_method.PaymentMethodBuilder> builder) {
        this.paymentMethod = builder.apply(com.commercetools.api.models.payment_method.PaymentMethodBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> that was deleted.</p>
     * @param builder function to build the paymentMethod value
     * @return Builder
     */

    public PaymentMethodDeletedMessagePayloadBuilder withPaymentMethod(
            Function<com.commercetools.api.models.payment_method.PaymentMethodBuilder, com.commercetools.api.models.payment_method.PaymentMethod> builder) {
        this.paymentMethod = builder.apply(com.commercetools.api.models.payment_method.PaymentMethodBuilder.of());
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> that was deleted.</p>
     * @param paymentMethod value to be set
     * @return Builder
     */

    public PaymentMethodDeletedMessagePayloadBuilder paymentMethod(
            final com.commercetools.api.models.payment_method.PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> that was deleted.</p>
     * @return paymentMethod
     */

    public com.commercetools.api.models.payment_method.PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    /**
     * builds PaymentMethodDeletedMessagePayload with checking for non-null required values
     * @return PaymentMethodDeletedMessagePayload
     */
    public PaymentMethodDeletedMessagePayload build() {
        Objects.requireNonNull(paymentMethod, PaymentMethodDeletedMessagePayload.class + ": paymentMethod is missing");
        return new PaymentMethodDeletedMessagePayloadImpl(paymentMethod);
    }

    /**
     * builds PaymentMethodDeletedMessagePayload without checking for non-null required values
     * @return PaymentMethodDeletedMessagePayload
     */
    public PaymentMethodDeletedMessagePayload buildUnchecked() {
        return new PaymentMethodDeletedMessagePayloadImpl(paymentMethod);
    }

    /**
     * factory method for an instance of PaymentMethodDeletedMessagePayloadBuilder
     * @return builder
     */
    public static PaymentMethodDeletedMessagePayloadBuilder of() {
        return new PaymentMethodDeletedMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentMethodDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodDeletedMessagePayloadBuilder of(final PaymentMethodDeletedMessagePayload template) {
        PaymentMethodDeletedMessagePayloadBuilder builder = new PaymentMethodDeletedMessagePayloadBuilder();
        builder.paymentMethod = template.getPaymentMethod();
        return builder;
    }

}
