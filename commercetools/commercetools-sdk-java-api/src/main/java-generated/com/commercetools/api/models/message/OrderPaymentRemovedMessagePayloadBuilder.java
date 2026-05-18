
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderPaymentRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderPaymentRemovedMessagePayload orderPaymentRemovedMessagePayload = OrderPaymentRemovedMessagePayload.builder()
 *             .paymentRef(paymentRefBuilder -> paymentRefBuilder)
 *             .removedPaymentInfo(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderPaymentRemovedMessagePayloadBuilder implements Builder<OrderPaymentRemovedMessagePayload> {

    private com.commercetools.api.models.payment.PaymentReference paymentRef;

    private Boolean removedPaymentInfo;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param builder function to build the paymentRef value
     * @return Builder
     */

    public OrderPaymentRemovedMessagePayloadBuilder paymentRef(
            Function<com.commercetools.api.models.payment.PaymentReferenceBuilder, com.commercetools.api.models.payment.PaymentReferenceBuilder> builder) {
        this.paymentRef = builder.apply(com.commercetools.api.models.payment.PaymentReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param builder function to build the paymentRef value
     * @return Builder
     */

    public OrderPaymentRemovedMessagePayloadBuilder withPaymentRef(
            Function<com.commercetools.api.models.payment.PaymentReferenceBuilder, com.commercetools.api.models.payment.PaymentReference> builder) {
        this.paymentRef = builder.apply(com.commercetools.api.models.payment.PaymentReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param paymentRef value to be set
     * @return Builder
     */

    public OrderPaymentRemovedMessagePayloadBuilder paymentRef(
            final com.commercetools.api.models.payment.PaymentReference paymentRef) {
        this.paymentRef = paymentRef;
        return this;
    }

    /**
     *  <p>Indicates whether the removal of the Payment resulted in no Payments remaining on the Order. The value is <code>true</code> if all Payments have been removed (none remain), and <code>false</code> if there are still Payments associated with the Order after the removal.</p>
     * @param removedPaymentInfo value to be set
     * @return Builder
     */

    public OrderPaymentRemovedMessagePayloadBuilder removedPaymentInfo(final Boolean removedPaymentInfo) {
        this.removedPaymentInfo = removedPaymentInfo;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @return paymentRef
     */

    public com.commercetools.api.models.payment.PaymentReference getPaymentRef() {
        return this.paymentRef;
    }

    /**
     *  <p>Indicates whether the removal of the Payment resulted in no Payments remaining on the Order. The value is <code>true</code> if all Payments have been removed (none remain), and <code>false</code> if there are still Payments associated with the Order after the removal.</p>
     * @return removedPaymentInfo
     */

    public Boolean getRemovedPaymentInfo() {
        return this.removedPaymentInfo;
    }

    /**
     * builds OrderPaymentRemovedMessagePayload with checking for non-null required values
     * @return OrderPaymentRemovedMessagePayload
     */
    public OrderPaymentRemovedMessagePayload build() {
        Objects.requireNonNull(paymentRef, OrderPaymentRemovedMessagePayload.class + ": paymentRef is missing");
        Objects.requireNonNull(removedPaymentInfo,
            OrderPaymentRemovedMessagePayload.class + ": removedPaymentInfo is missing");
        return new OrderPaymentRemovedMessagePayloadImpl(paymentRef, removedPaymentInfo);
    }

    /**
     * builds OrderPaymentRemovedMessagePayload without checking for non-null required values
     * @return OrderPaymentRemovedMessagePayload
     */
    public OrderPaymentRemovedMessagePayload buildUnchecked() {
        return new OrderPaymentRemovedMessagePayloadImpl(paymentRef, removedPaymentInfo);
    }

    /**
     * factory method for an instance of OrderPaymentRemovedMessagePayloadBuilder
     * @return builder
     */
    public static OrderPaymentRemovedMessagePayloadBuilder of() {
        return new OrderPaymentRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for OrderPaymentRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderPaymentRemovedMessagePayloadBuilder of(final OrderPaymentRemovedMessagePayload template) {
        OrderPaymentRemovedMessagePayloadBuilder builder = new OrderPaymentRemovedMessagePayloadBuilder();
        builder.paymentRef = template.getPaymentRef();
        builder.removedPaymentInfo = template.getRemovedPaymentInfo();
        return builder;
    }

}
