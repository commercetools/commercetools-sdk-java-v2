
package com.commercetools.api.models.event;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CheckoutMessageOrderPayloadBaseDataBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CheckoutMessageOrderPayloadBaseData checkoutMessageOrderPayloadBaseData = CheckoutMessageOrderPayloadBaseData.builder()
 *             .projectKey("{projectKey}")
 *             .cart(cartBuilder -> cartBuilder)
 *             .plusPayments(paymentsBuilder -> paymentsBuilder)
 *             .plusErrors(errorsBuilder -> errorsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CheckoutMessageOrderPayloadBaseDataBuilder implements Builder<CheckoutMessageOrderPayloadBaseData> {

    private String projectKey;

    private com.commercetools.api.models.cart.CartReference cart;

    private java.util.List<com.commercetools.api.models.payment.PaymentReference> payments;

    private java.util.List<com.commercetools.api.models.error.ErrorObject> errors;

    /**
     *  <p><code>key</code> of the Project where the order would belong to.</p>
     * @param projectKey value to be set
     * @return Builder
     */

    public CheckoutMessageOrderPayloadBaseDataBuilder projectKey(final String projectKey) {
        this.projectKey = projectKey;
        return this;
    }

    /**
     *  <p>The Cart on which the change or action was performed.</p>
     * @param builder function to build the cart value
     * @return Builder
     */

    public CheckoutMessageOrderPayloadBaseDataBuilder cart(
            Function<com.commercetools.api.models.cart.CartReferenceBuilder, com.commercetools.api.models.cart.CartReferenceBuilder> builder) {
        this.cart = builder.apply(com.commercetools.api.models.cart.CartReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Cart on which the change or action was performed.</p>
     * @param builder function to build the cart value
     * @return Builder
     */

    public CheckoutMessageOrderPayloadBaseDataBuilder withCart(
            Function<com.commercetools.api.models.cart.CartReferenceBuilder, com.commercetools.api.models.cart.CartReference> builder) {
        this.cart = builder.apply(com.commercetools.api.models.cart.CartReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Cart on which the change or action was performed.</p>
     * @param cart value to be set
     * @return Builder
     */

    public CheckoutMessageOrderPayloadBaseDataBuilder cart(final com.commercetools.api.models.cart.CartReference cart) {
        this.cart = cart;
        return this;
    }

    /**
     *  <p>The Payments on which the change or action was performed.</p>
     * @param payments value to be set
     * @return Builder
     */

    public CheckoutMessageOrderPayloadBaseDataBuilder payments(
            final com.commercetools.api.models.payment.PaymentReference... payments) {
        this.payments = new ArrayList<>(Arrays.asList(payments));
        return this;
    }

    /**
     *  <p>The Payments on which the change or action was performed.</p>
     * @param payments value to be set
     * @return Builder
     */

    public CheckoutMessageOrderPayloadBaseDataBuilder payments(
            final java.util.List<com.commercetools.api.models.payment.PaymentReference> payments) {
        this.payments = payments;
        return this;
    }

    /**
     *  <p>The Payments on which the change or action was performed.</p>
     * @param payments value to be set
     * @return Builder
     */

    public CheckoutMessageOrderPayloadBaseDataBuilder plusPayments(
            final com.commercetools.api.models.payment.PaymentReference... payments) {
        if (this.payments == null) {
            this.payments = new ArrayList<>();
        }
        this.payments.addAll(Arrays.asList(payments));
        return this;
    }

    /**
     *  <p>The Payments on which the change or action was performed.</p>
     * @param builder function to build the payments value
     * @return Builder
     */

    public CheckoutMessageOrderPayloadBaseDataBuilder plusPayments(
            Function<com.commercetools.api.models.payment.PaymentReferenceBuilder, com.commercetools.api.models.payment.PaymentReferenceBuilder> builder) {
        if (this.payments == null) {
            this.payments = new ArrayList<>();
        }
        this.payments.add(builder.apply(com.commercetools.api.models.payment.PaymentReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Payments on which the change or action was performed.</p>
     * @param builder function to build the payments value
     * @return Builder
     */

    public CheckoutMessageOrderPayloadBaseDataBuilder withPayments(
            Function<com.commercetools.api.models.payment.PaymentReferenceBuilder, com.commercetools.api.models.payment.PaymentReferenceBuilder> builder) {
        this.payments = new ArrayList<>();
        this.payments.add(builder.apply(com.commercetools.api.models.payment.PaymentReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Payments on which the change or action was performed.</p>
     * @param builder function to build the payments value
     * @return Builder
     */

    public CheckoutMessageOrderPayloadBaseDataBuilder addPayments(
            Function<com.commercetools.api.models.payment.PaymentReferenceBuilder, com.commercetools.api.models.payment.PaymentReference> builder) {
        return plusPayments(builder.apply(com.commercetools.api.models.payment.PaymentReferenceBuilder.of()));
    }

    /**
     *  <p>The Payments on which the change or action was performed.</p>
     * @param builder function to build the payments value
     * @return Builder
     */

    public CheckoutMessageOrderPayloadBaseDataBuilder setPayments(
            Function<com.commercetools.api.models.payment.PaymentReferenceBuilder, com.commercetools.api.models.payment.PaymentReference> builder) {
        return payments(builder.apply(com.commercetools.api.models.payment.PaymentReferenceBuilder.of()));
    }

    /**
     *  <p>Errors associated with the order event.</p>
     * @param errors value to be set
     * @return Builder
     */

    public CheckoutMessageOrderPayloadBaseDataBuilder errors(
            final com.commercetools.api.models.error.ErrorObject... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>Errors associated with the order event.</p>
     * @param errors value to be set
     * @return Builder
     */

    public CheckoutMessageOrderPayloadBaseDataBuilder errors(
            final java.util.List<com.commercetools.api.models.error.ErrorObject> errors) {
        this.errors = errors;
        return this;
    }

    /**
     *  <p>Errors associated with the order event.</p>
     * @param errors value to be set
     * @return Builder
     */

    public CheckoutMessageOrderPayloadBaseDataBuilder plusErrors(
            final com.commercetools.api.models.error.ErrorObject... errors) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.addAll(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>Errors associated with the order event.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public CheckoutMessageOrderPayloadBaseDataBuilder plusErrors(
            Function<com.commercetools.api.models.error.ErrorObjectBuilder, Builder<? extends com.commercetools.api.models.error.ErrorObject>> builder) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(builder.apply(com.commercetools.api.models.error.ErrorObjectBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Errors associated with the order event.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public CheckoutMessageOrderPayloadBaseDataBuilder withErrors(
            Function<com.commercetools.api.models.error.ErrorObjectBuilder, Builder<? extends com.commercetools.api.models.error.ErrorObject>> builder) {
        this.errors = new ArrayList<>();
        this.errors.add(builder.apply(com.commercetools.api.models.error.ErrorObjectBuilder.of()).build());
        return this;
    }

    /**
     *  <p><code>key</code> of the Project where the order would belong to.</p>
     * @return projectKey
     */

    public String getProjectKey() {
        return this.projectKey;
    }

    /**
     *  <p>The Cart on which the change or action was performed.</p>
     * @return cart
     */

    public com.commercetools.api.models.cart.CartReference getCart() {
        return this.cart;
    }

    /**
     *  <p>The Payments on which the change or action was performed.</p>
     * @return payments
     */

    public java.util.List<com.commercetools.api.models.payment.PaymentReference> getPayments() {
        return this.payments;
    }

    /**
     *  <p>Errors associated with the order event.</p>
     * @return errors
     */

    public java.util.List<com.commercetools.api.models.error.ErrorObject> getErrors() {
        return this.errors;
    }

    /**
     * builds CheckoutMessageOrderPayloadBaseData with checking for non-null required values
     * @return CheckoutMessageOrderPayloadBaseData
     */
    public CheckoutMessageOrderPayloadBaseData build() {
        Objects.requireNonNull(projectKey, CheckoutMessageOrderPayloadBaseData.class + ": projectKey is missing");
        Objects.requireNonNull(cart, CheckoutMessageOrderPayloadBaseData.class + ": cart is missing");
        Objects.requireNonNull(payments, CheckoutMessageOrderPayloadBaseData.class + ": payments is missing");
        Objects.requireNonNull(errors, CheckoutMessageOrderPayloadBaseData.class + ": errors is missing");
        return new CheckoutMessageOrderPayloadBaseDataImpl(projectKey, cart, payments, errors);
    }

    /**
     * builds CheckoutMessageOrderPayloadBaseData without checking for non-null required values
     * @return CheckoutMessageOrderPayloadBaseData
     */
    public CheckoutMessageOrderPayloadBaseData buildUnchecked() {
        return new CheckoutMessageOrderPayloadBaseDataImpl(projectKey, cart, payments, errors);
    }

    /**
     * factory method for an instance of CheckoutMessageOrderPayloadBaseDataBuilder
     * @return builder
     */
    public static CheckoutMessageOrderPayloadBaseDataBuilder of() {
        return new CheckoutMessageOrderPayloadBaseDataBuilder();
    }

    /**
     * create builder for CheckoutMessageOrderPayloadBaseData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CheckoutMessageOrderPayloadBaseDataBuilder of(final CheckoutMessageOrderPayloadBaseData template) {
        CheckoutMessageOrderPayloadBaseDataBuilder builder = new CheckoutMessageOrderPayloadBaseDataBuilder();
        builder.projectKey = template.getProjectKey();
        builder.cart = template.getCart();
        builder.payments = template.getPayments();
        builder.errors = template.getErrors();
        return builder;
    }

}
