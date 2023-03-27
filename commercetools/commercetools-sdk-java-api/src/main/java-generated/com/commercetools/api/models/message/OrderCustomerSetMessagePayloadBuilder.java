
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCustomerSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomerSetMessagePayload orderCustomerSetMessagePayload = OrderCustomerSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCustomerSetMessagePayloadBuilder implements Builder<OrderCustomerSetMessagePayload> {

    @Nullable
    private com.commercetools.api.models.customer.CustomerReference customer;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    @Nullable
    private com.commercetools.api.models.customer.CustomerReference oldCustomer;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup;

    /**
     *  <p>Customer on the Order after the Set Customer Id update action.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public OrderCustomerSetMessagePayloadBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Customer on the Order after the Set Customer Id update action.</p>
     * @param customer value to be set
     * @return Builder
     */

    public OrderCustomerSetMessagePayloadBuilder customer(
            @Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>CustomerGroup on the Order after the Set Customer Id update action.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public OrderCustomerSetMessagePayloadBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>CustomerGroup on the Order after the Set Customer Id update action.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public OrderCustomerSetMessagePayloadBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Customer on the Order before the Set Customer Id update action.</p>
     * @param builder function to build the oldCustomer value
     * @return Builder
     */

    public OrderCustomerSetMessagePayloadBuilder oldCustomer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.oldCustomer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Customer on the Order before the Set Customer Id update action.</p>
     * @param oldCustomer value to be set
     * @return Builder
     */

    public OrderCustomerSetMessagePayloadBuilder oldCustomer(
            @Nullable final com.commercetools.api.models.customer.CustomerReference oldCustomer) {
        this.oldCustomer = oldCustomer;
        return this;
    }

    /**
     *  <p>CustomerGroup on the Order before the Set Customer Id update action.</p>
     * @param builder function to build the oldCustomerGroup value
     * @return Builder
     */

    public OrderCustomerSetMessagePayloadBuilder oldCustomerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.oldCustomerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>CustomerGroup on the Order before the Set Customer Id update action.</p>
     * @param oldCustomerGroup value to be set
     * @return Builder
     */

    public OrderCustomerSetMessagePayloadBuilder oldCustomerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup) {
        this.oldCustomerGroup = oldCustomerGroup;
        return this;
    }

    /**
     *  <p>Customer on the Order after the Set Customer Id update action.</p>
     * @return customer
     */

    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>CustomerGroup on the Order after the Set Customer Id update action.</p>
     * @return customerGroup
     */

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>Customer on the Order before the Set Customer Id update action.</p>
     * @return oldCustomer
     */

    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getOldCustomer() {
        return this.oldCustomer;
    }

    /**
     *  <p>CustomerGroup on the Order before the Set Customer Id update action.</p>
     * @return oldCustomerGroup
     */

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupReference getOldCustomerGroup() {
        return this.oldCustomerGroup;
    }

    /**
     * builds OrderCustomerSetMessagePayload with checking for non-null required values
     * @return OrderCustomerSetMessagePayload
     */
    public OrderCustomerSetMessagePayload build() {
        return new OrderCustomerSetMessagePayloadImpl(customer, customerGroup, oldCustomer, oldCustomerGroup);
    }

    /**
     * builds OrderCustomerSetMessagePayload without checking for non-null required values
     * @return OrderCustomerSetMessagePayload
     */
    public OrderCustomerSetMessagePayload buildUnchecked() {
        return new OrderCustomerSetMessagePayloadImpl(customer, customerGroup, oldCustomer, oldCustomerGroup);
    }

    /**
     * factory method for an instance of OrderCustomerSetMessagePayloadBuilder
     * @return builder
     */
    public static OrderCustomerSetMessagePayloadBuilder of() {
        return new OrderCustomerSetMessagePayloadBuilder();
    }

    /**
     * create builder for OrderCustomerSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomerSetMessagePayloadBuilder of(final OrderCustomerSetMessagePayload template) {
        OrderCustomerSetMessagePayloadBuilder builder = new OrderCustomerSetMessagePayloadBuilder();
        builder.customer = template.getCustomer();
        builder.customerGroup = template.getCustomerGroup();
        builder.oldCustomer = template.getOldCustomer();
        builder.oldCustomerGroup = template.getOldCustomerGroup();
        return builder;
    }

}
