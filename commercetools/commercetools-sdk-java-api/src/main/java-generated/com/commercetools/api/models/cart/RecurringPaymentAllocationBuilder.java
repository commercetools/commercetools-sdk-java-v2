
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringPaymentAllocationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringPaymentAllocation recurringPaymentAllocation = RecurringPaymentAllocation.builder()
 *             .id("{id}")
 *             .paymentMethod(paymentMethodBuilder -> paymentMethodBuilder)
 *             .allocation(allocationBuilder -> allocationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringPaymentAllocationBuilder implements Builder<RecurringPaymentAllocation> {

    private String id;

    private com.commercetools.api.models.payment_method.PaymentMethodReference paymentMethod;

    private com.commercetools.api.models.cart.Allocation allocation;

    /**
     *  <p>Unique identifier of the RecurringPaymentAllocation within the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentConfiguration" rel="nofollow">RecurringPaymentConfiguration</a>. Use it to remove the allocation with the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRemoveRecurringPaymentAllocationAction" rel="nofollow">Remove RecurringPaymentAllocation</a> update action.</p>
     * @param id value to be set
     * @return Builder
     */

    public RecurringPaymentAllocationBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Payment Method charged for this share of the Order total.</p>
     * @param builder function to build the paymentMethod value
     * @return Builder
     */

    public RecurringPaymentAllocationBuilder paymentMethod(
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

    public RecurringPaymentAllocationBuilder withPaymentMethod(
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

    public RecurringPaymentAllocationBuilder paymentMethod(
            final com.commercetools.api.models.payment_method.PaymentMethodReference paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     *  <p>Share of the Order total charged to the <code>paymentMethod</code>.</p>
     * @param allocation value to be set
     * @return Builder
     */

    public RecurringPaymentAllocationBuilder allocation(final com.commercetools.api.models.cart.Allocation allocation) {
        this.allocation = allocation;
        return this;
    }

    /**
     *  <p>Share of the Order total charged to the <code>paymentMethod</code>.</p>
     * @param builder function to build the allocation value
     * @return Builder
     */

    public RecurringPaymentAllocationBuilder allocation(
            Function<com.commercetools.api.models.cart.AllocationBuilder, Builder<? extends com.commercetools.api.models.cart.Allocation>> builder) {
        this.allocation = builder.apply(com.commercetools.api.models.cart.AllocationBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Unique identifier of the RecurringPaymentAllocation within the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentConfiguration" rel="nofollow">RecurringPaymentConfiguration</a>. Use it to remove the allocation with the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRemoveRecurringPaymentAllocationAction" rel="nofollow">Remove RecurringPaymentAllocation</a> update action.</p>
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

    public com.commercetools.api.models.cart.Allocation getAllocation() {
        return this.allocation;
    }

    /**
     * builds RecurringPaymentAllocation with checking for non-null required values
     * @return RecurringPaymentAllocation
     */
    public RecurringPaymentAllocation build() {
        Objects.requireNonNull(id, RecurringPaymentAllocation.class + ": id is missing");
        Objects.requireNonNull(paymentMethod, RecurringPaymentAllocation.class + ": paymentMethod is missing");
        Objects.requireNonNull(allocation, RecurringPaymentAllocation.class + ": allocation is missing");
        return new RecurringPaymentAllocationImpl(id, paymentMethod, allocation);
    }

    /**
     * builds RecurringPaymentAllocation without checking for non-null required values
     * @return RecurringPaymentAllocation
     */
    public RecurringPaymentAllocation buildUnchecked() {
        return new RecurringPaymentAllocationImpl(id, paymentMethod, allocation);
    }

    /**
     * factory method for an instance of RecurringPaymentAllocationBuilder
     * @return builder
     */
    public static RecurringPaymentAllocationBuilder of() {
        return new RecurringPaymentAllocationBuilder();
    }

    /**
     * create builder for RecurringPaymentAllocation instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringPaymentAllocationBuilder of(final RecurringPaymentAllocation template) {
        RecurringPaymentAllocationBuilder builder = new RecurringPaymentAllocationBuilder();
        builder.id = template.getId();
        builder.paymentMethod = template.getPaymentMethod();
        builder.allocation = template.getAllocation();
        return builder;
    }

}
