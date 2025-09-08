
package com.commercetools.api.models.event;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CheckoutMessagePaymentsPayloadBaseDataBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CheckoutMessagePaymentsPayloadBaseData checkoutMessagePaymentsPayloadBaseData = CheckoutMessagePaymentsPayloadBaseData.builder()
 *             .projectKey("{projectKey}")
 *             .payment(paymentBuilder -> paymentBuilder)
 *             .transactionId("{transactionId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CheckoutMessagePaymentsPayloadBaseDataBuilder implements Builder<CheckoutMessagePaymentsPayloadBaseData> {

    private String projectKey;

    private com.commercetools.api.models.payment.PaymentReference payment;

    private String transactionId;

    @Nullable
    private com.commercetools.api.models.cart.CartReference cart;

    @Nullable
    private com.commercetools.api.models.order.OrderReference order;

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a> where the payment was made.</p>
     * @param projectKey value to be set
     * @return Builder
     */

    public CheckoutMessagePaymentsPayloadBaseDataBuilder projectKey(final String projectKey) {
        this.projectKey = projectKey;
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> on which the change or action was performed.</p>
     * @param builder function to build the payment value
     * @return Builder
     */

    public CheckoutMessagePaymentsPayloadBaseDataBuilder payment(
            Function<com.commercetools.api.models.payment.PaymentReferenceBuilder, com.commercetools.api.models.payment.PaymentReferenceBuilder> builder) {
        this.payment = builder.apply(com.commercetools.api.models.payment.PaymentReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> on which the change or action was performed.</p>
     * @param builder function to build the payment value
     * @return Builder
     */

    public CheckoutMessagePaymentsPayloadBaseDataBuilder withPayment(
            Function<com.commercetools.api.models.payment.PaymentReferenceBuilder, com.commercetools.api.models.payment.PaymentReference> builder) {
        this.payment = builder.apply(com.commercetools.api.models.payment.PaymentReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> on which the change or action was performed.</p>
     * @param payment value to be set
     * @return Builder
     */

    public CheckoutMessagePaymentsPayloadBaseDataBuilder payment(
            final com.commercetools.api.models.payment.PaymentReference payment) {
        this.payment = payment;
        return this;
    }

    /**
     *  <p><code>id</code> of the <span>Transaction</span>.</p>
     * @param transactionId value to be set
     * @return Builder
     */

    public CheckoutMessagePaymentsPayloadBaseDataBuilder transactionId(final String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> on which the change or action was performed.</p>
     * @param builder function to build the cart value
     * @return Builder
     */

    public CheckoutMessagePaymentsPayloadBaseDataBuilder cart(
            Function<com.commercetools.api.models.cart.CartReferenceBuilder, com.commercetools.api.models.cart.CartReferenceBuilder> builder) {
        this.cart = builder.apply(com.commercetools.api.models.cart.CartReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> on which the change or action was performed.</p>
     * @param builder function to build the cart value
     * @return Builder
     */

    public CheckoutMessagePaymentsPayloadBaseDataBuilder withCart(
            Function<com.commercetools.api.models.cart.CartReferenceBuilder, com.commercetools.api.models.cart.CartReference> builder) {
        this.cart = builder.apply(com.commercetools.api.models.cart.CartReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> on which the change or action was performed.</p>
     * @param cart value to be set
     * @return Builder
     */

    public CheckoutMessagePaymentsPayloadBaseDataBuilder cart(
            @Nullable final com.commercetools.api.models.cart.CartReference cart) {
        this.cart = cart;
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> on which the change or action was performed.</p>
     * @param builder function to build the order value
     * @return Builder
     */

    public CheckoutMessagePaymentsPayloadBaseDataBuilder order(
            Function<com.commercetools.api.models.order.OrderReferenceBuilder, com.commercetools.api.models.order.OrderReferenceBuilder> builder) {
        this.order = builder.apply(com.commercetools.api.models.order.OrderReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> on which the change or action was performed.</p>
     * @param builder function to build the order value
     * @return Builder
     */

    public CheckoutMessagePaymentsPayloadBaseDataBuilder withOrder(
            Function<com.commercetools.api.models.order.OrderReferenceBuilder, com.commercetools.api.models.order.OrderReference> builder) {
        this.order = builder.apply(com.commercetools.api.models.order.OrderReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> on which the change or action was performed.</p>
     * @param order value to be set
     * @return Builder
     */

    public CheckoutMessagePaymentsPayloadBaseDataBuilder order(
            @Nullable final com.commercetools.api.models.order.OrderReference order) {
        this.order = order;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a> where the payment was made.</p>
     * @return projectKey
     */

    public String getProjectKey() {
        return this.projectKey;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> on which the change or action was performed.</p>
     * @return payment
     */

    public com.commercetools.api.models.payment.PaymentReference getPayment() {
        return this.payment;
    }

    /**
     *  <p><code>id</code> of the <span>Transaction</span>.</p>
     * @return transactionId
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> on which the change or action was performed.</p>
     * @return cart
     */

    @Nullable
    public com.commercetools.api.models.cart.CartReference getCart() {
        return this.cart;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> on which the change or action was performed.</p>
     * @return order
     */

    @Nullable
    public com.commercetools.api.models.order.OrderReference getOrder() {
        return this.order;
    }

    /**
     * builds CheckoutMessagePaymentsPayloadBaseData with checking for non-null required values
     * @return CheckoutMessagePaymentsPayloadBaseData
     */
    public CheckoutMessagePaymentsPayloadBaseData build() {
        Objects.requireNonNull(projectKey, CheckoutMessagePaymentsPayloadBaseData.class + ": projectKey is missing");
        Objects.requireNonNull(payment, CheckoutMessagePaymentsPayloadBaseData.class + ": payment is missing");
        Objects.requireNonNull(transactionId,
            CheckoutMessagePaymentsPayloadBaseData.class + ": transactionId is missing");
        return new CheckoutMessagePaymentsPayloadBaseDataImpl(projectKey, payment, transactionId, cart, order);
    }

    /**
     * builds CheckoutMessagePaymentsPayloadBaseData without checking for non-null required values
     * @return CheckoutMessagePaymentsPayloadBaseData
     */
    public CheckoutMessagePaymentsPayloadBaseData buildUnchecked() {
        return new CheckoutMessagePaymentsPayloadBaseDataImpl(projectKey, payment, transactionId, cart, order);
    }

    /**
     * factory method for an instance of CheckoutMessagePaymentsPayloadBaseDataBuilder
     * @return builder
     */
    public static CheckoutMessagePaymentsPayloadBaseDataBuilder of() {
        return new CheckoutMessagePaymentsPayloadBaseDataBuilder();
    }

    /**
     * create builder for CheckoutMessagePaymentsPayloadBaseData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CheckoutMessagePaymentsPayloadBaseDataBuilder of(
            final CheckoutMessagePaymentsPayloadBaseData template) {
        CheckoutMessagePaymentsPayloadBaseDataBuilder builder = new CheckoutMessagePaymentsPayloadBaseDataBuilder();
        builder.projectKey = template.getProjectKey();
        builder.payment = template.getPayment();
        builder.transactionId = template.getTransactionId();
        builder.cart = template.getCart();
        builder.order = template.getOrder();
        return builder;
    }

}
