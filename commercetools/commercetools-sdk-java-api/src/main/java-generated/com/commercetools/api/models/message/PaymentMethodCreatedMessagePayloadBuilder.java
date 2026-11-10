
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodCreatedMessagePayload paymentMethodCreatedMessagePayload = PaymentMethodCreatedMessagePayload.builder()
 *             .paymentMethod(paymentMethodBuilder -> paymentMethodBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodCreatedMessagePayloadBuilder implements Builder<PaymentMethodCreatedMessagePayload> {

    private com.commercetools.api.models.payment_method.PaymentMethod paymentMethod;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> that was created.</p>
     * @param builder function to build the paymentMethod value
     * @return Builder
     */

    public PaymentMethodCreatedMessagePayloadBuilder paymentMethod(
            Function<com.commercetools.api.models.payment_method.PaymentMethodBuilder, com.commercetools.api.models.payment_method.PaymentMethodBuilder> builder) {
        this.paymentMethod = builder.apply(com.commercetools.api.models.payment_method.PaymentMethodBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> that was created.</p>
     * @param builder function to build the paymentMethod value
     * @return Builder
     */

    public PaymentMethodCreatedMessagePayloadBuilder withPaymentMethod(
            Function<com.commercetools.api.models.payment_method.PaymentMethodBuilder, com.commercetools.api.models.payment_method.PaymentMethod> builder) {
        this.paymentMethod = builder.apply(com.commercetools.api.models.payment_method.PaymentMethodBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> that was created.</p>
     * @param paymentMethod value to be set
     * @return Builder
     */

    public PaymentMethodCreatedMessagePayloadBuilder paymentMethod(
            final com.commercetools.api.models.payment_method.PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> that was created.</p>
     * @return paymentMethod
     */

    public com.commercetools.api.models.payment_method.PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    /**
     * builds PaymentMethodCreatedMessagePayload with checking for non-null required values
     * @return PaymentMethodCreatedMessagePayload
     */
    public PaymentMethodCreatedMessagePayload build() {
        Objects.requireNonNull(paymentMethod, PaymentMethodCreatedMessagePayload.class + ": paymentMethod is missing");
        return new PaymentMethodCreatedMessagePayloadImpl(paymentMethod);
    }

    /**
     * builds PaymentMethodCreatedMessagePayload without checking for non-null required values
     * @return PaymentMethodCreatedMessagePayload
     */
    public PaymentMethodCreatedMessagePayload buildUnchecked() {
        return new PaymentMethodCreatedMessagePayloadImpl(paymentMethod);
    }

    /**
     * factory method for an instance of PaymentMethodCreatedMessagePayloadBuilder
     * @return builder
     */
    public static PaymentMethodCreatedMessagePayloadBuilder of() {
        return new PaymentMethodCreatedMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentMethodCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodCreatedMessagePayloadBuilder of(final PaymentMethodCreatedMessagePayload template) {
        PaymentMethodCreatedMessagePayloadBuilder builder = new PaymentMethodCreatedMessagePayloadBuilder();
        builder.paymentMethod = template.getPaymentMethod();
        return builder;
    }

}
