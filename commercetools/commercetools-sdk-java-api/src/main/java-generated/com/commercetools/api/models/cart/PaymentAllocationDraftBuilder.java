
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentAllocationDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentAllocationDraft paymentAllocationDraft = PaymentAllocationDraft.builder()
 *             .id("{id}")
 *             .paymentMethod(paymentMethodBuilder -> paymentMethodBuilder)
 *             .allocation(allocationBuilder -> allocationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentAllocationDraftBuilder implements Builder<PaymentAllocationDraft> {

    private String id;

    private com.commercetools.api.models.payment_method.PaymentMethodReference paymentMethod;

    private com.commercetools.api.models.cart.AllocationDraft allocation;

    /**
     *  <p>Unique identifier of the resulting <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentAllocation" rel="nofollow">RecurringPaymentAllocation</a> within the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentConfiguration" rel="nofollow">RecurringPaymentConfiguration</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public PaymentAllocationDraftBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Payment Method charged for this share of the Order total.</p>
     * @param builder function to build the paymentMethod value
     * @return Builder
     */

    public PaymentAllocationDraftBuilder paymentMethod(
            Function<com.commercetools.api.models.payment_method.PaymentMethodReferenceBuilder, com.commercetools.api.models.payment_method.PaymentMethodReferenceBuilder> builder) {
        this.paymentMethod = builder
                .apply(com.commercetools.api.models.payment_method.PaymentMethodReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Payment Method charged for this share of the Order total.</p>
     * @param builder function to build the paymentMethod value
     * @return Builder
     */

    public PaymentAllocationDraftBuilder withPaymentMethod(
            Function<com.commercetools.api.models.payment_method.PaymentMethodReferenceBuilder, com.commercetools.api.models.payment_method.PaymentMethodReference> builder) {
        this.paymentMethod = builder
                .apply(com.commercetools.api.models.payment_method.PaymentMethodReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Payment Method charged for this share of the Order total.</p>
     * @param paymentMethod value to be set
     * @return Builder
     */

    public PaymentAllocationDraftBuilder paymentMethod(
            final com.commercetools.api.models.payment_method.PaymentMethodReference paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     *  <p>Share of the Order total charged to the <code>paymentMethod</code>.</p>
     * @param allocation value to be set
     * @return Builder
     */

    public PaymentAllocationDraftBuilder allocation(
            final com.commercetools.api.models.cart.AllocationDraft allocation) {
        this.allocation = allocation;
        return this;
    }

    /**
     *  <p>Share of the Order total charged to the <code>paymentMethod</code>.</p>
     * @param builder function to build the allocation value
     * @return Builder
     */

    public PaymentAllocationDraftBuilder allocation(
            Function<com.commercetools.api.models.cart.AllocationDraftBuilder, Builder<? extends com.commercetools.api.models.cart.AllocationDraft>> builder) {
        this.allocation = builder.apply(com.commercetools.api.models.cart.AllocationDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Unique identifier of the resulting <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentAllocation" rel="nofollow">RecurringPaymentAllocation</a> within the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentConfiguration" rel="nofollow">RecurringPaymentConfiguration</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Payment Method charged for this share of the Order total.</p>
     * @return paymentMethod
     */

    public com.commercetools.api.models.payment_method.PaymentMethodReference getPaymentMethod() {
        return this.paymentMethod;
    }

    /**
     *  <p>Share of the Order total charged to the <code>paymentMethod</code>.</p>
     * @return allocation
     */

    public com.commercetools.api.models.cart.AllocationDraft getAllocation() {
        return this.allocation;
    }

    /**
     * builds PaymentAllocationDraft with checking for non-null required values
     * @return PaymentAllocationDraft
     */
    public PaymentAllocationDraft build() {
        Objects.requireNonNull(id, PaymentAllocationDraft.class + ": id is missing");
        Objects.requireNonNull(paymentMethod, PaymentAllocationDraft.class + ": paymentMethod is missing");
        Objects.requireNonNull(allocation, PaymentAllocationDraft.class + ": allocation is missing");
        return new PaymentAllocationDraftImpl(id, paymentMethod, allocation);
    }

    /**
     * builds PaymentAllocationDraft without checking for non-null required values
     * @return PaymentAllocationDraft
     */
    public PaymentAllocationDraft buildUnchecked() {
        return new PaymentAllocationDraftImpl(id, paymentMethod, allocation);
    }

    /**
     * factory method for an instance of PaymentAllocationDraftBuilder
     * @return builder
     */
    public static PaymentAllocationDraftBuilder of() {
        return new PaymentAllocationDraftBuilder();
    }

    /**
     * create builder for PaymentAllocationDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentAllocationDraftBuilder of(final PaymentAllocationDraft template) {
        PaymentAllocationDraftBuilder builder = new PaymentAllocationDraftBuilder();
        builder.id = template.getId();
        builder.paymentMethod = template.getPaymentMethod();
        builder.allocation = template.getAllocation();
        return builder;
    }

}
