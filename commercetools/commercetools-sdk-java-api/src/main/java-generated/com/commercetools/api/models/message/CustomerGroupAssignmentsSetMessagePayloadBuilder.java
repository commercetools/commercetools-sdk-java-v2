
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupAssignmentsSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupAssignmentsSetMessagePayload customerGroupAssignmentsSetMessagePayload = CustomerGroupAssignmentsSetMessagePayload.builder()
 *             .plusCustomerGroupAssignments(customerGroupAssignmentsBuilder -> customerGroupAssignmentsBuilder)
 *             .plusOldCustomerGroupAssignments(oldCustomerGroupAssignmentsBuilder -> oldCustomerGroupAssignmentsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupAssignmentsSetMessagePayloadBuilder
        implements Builder<CustomerGroupAssignmentsSetMessagePayload> {

    private java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> customerGroupAssignments;

    private java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> oldCustomerGroupAssignments;

    /**
     *  <p>Customer Groups assigned to the Customer during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param customerGroupAssignments value to be set
     * @return Builder
     */

    public CustomerGroupAssignmentsSetMessagePayloadBuilder customerGroupAssignments(
            final com.commercetools.api.models.customer.CustomerGroupAssignment... customerGroupAssignments) {
        this.customerGroupAssignments = new ArrayList<>(Arrays.asList(customerGroupAssignments));
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Customer during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param customerGroupAssignments value to be set
     * @return Builder
     */

    public CustomerGroupAssignmentsSetMessagePayloadBuilder customerGroupAssignments(
            final java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> customerGroupAssignments) {
        this.customerGroupAssignments = customerGroupAssignments;
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Customer during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param customerGroupAssignments value to be set
     * @return Builder
     */

    public CustomerGroupAssignmentsSetMessagePayloadBuilder plusCustomerGroupAssignments(
            final com.commercetools.api.models.customer.CustomerGroupAssignment... customerGroupAssignments) {
        if (this.customerGroupAssignments == null) {
            this.customerGroupAssignments = new ArrayList<>();
        }
        this.customerGroupAssignments.addAll(Arrays.asList(customerGroupAssignments));
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Customer during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public CustomerGroupAssignmentsSetMessagePayloadBuilder plusCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder> builder) {
        if (this.customerGroupAssignments == null) {
            this.customerGroupAssignments = new ArrayList<>();
        }
        this.customerGroupAssignments
                .add(builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Customer during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public CustomerGroupAssignmentsSetMessagePayloadBuilder withCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder> builder) {
        this.customerGroupAssignments = new ArrayList<>();
        this.customerGroupAssignments
                .add(builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Customer during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public CustomerGroupAssignmentsSetMessagePayloadBuilder addCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignment> builder) {
        return plusCustomerGroupAssignments(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()));
    }

    /**
     *  <p>Customer Groups assigned to the Customer during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public CustomerGroupAssignmentsSetMessagePayloadBuilder setCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignment> builder) {
        return customerGroupAssignments(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()));
    }

    /**
     *  <p>Customer Groups assigned to the Customer before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param oldCustomerGroupAssignments value to be set
     * @return Builder
     */

    public CustomerGroupAssignmentsSetMessagePayloadBuilder oldCustomerGroupAssignments(
            final com.commercetools.api.models.customer.CustomerGroupAssignment... oldCustomerGroupAssignments) {
        this.oldCustomerGroupAssignments = new ArrayList<>(Arrays.asList(oldCustomerGroupAssignments));
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Customer before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param oldCustomerGroupAssignments value to be set
     * @return Builder
     */

    public CustomerGroupAssignmentsSetMessagePayloadBuilder oldCustomerGroupAssignments(
            final java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> oldCustomerGroupAssignments) {
        this.oldCustomerGroupAssignments = oldCustomerGroupAssignments;
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Customer before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param oldCustomerGroupAssignments value to be set
     * @return Builder
     */

    public CustomerGroupAssignmentsSetMessagePayloadBuilder plusOldCustomerGroupAssignments(
            final com.commercetools.api.models.customer.CustomerGroupAssignment... oldCustomerGroupAssignments) {
        if (this.oldCustomerGroupAssignments == null) {
            this.oldCustomerGroupAssignments = new ArrayList<>();
        }
        this.oldCustomerGroupAssignments.addAll(Arrays.asList(oldCustomerGroupAssignments));
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Customer before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param builder function to build the oldCustomerGroupAssignments value
     * @return Builder
     */

    public CustomerGroupAssignmentsSetMessagePayloadBuilder plusOldCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder> builder) {
        if (this.oldCustomerGroupAssignments == null) {
            this.oldCustomerGroupAssignments = new ArrayList<>();
        }
        this.oldCustomerGroupAssignments
                .add(builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Customer before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param builder function to build the oldCustomerGroupAssignments value
     * @return Builder
     */

    public CustomerGroupAssignmentsSetMessagePayloadBuilder withOldCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder> builder) {
        this.oldCustomerGroupAssignments = new ArrayList<>();
        this.oldCustomerGroupAssignments
                .add(builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Customer before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param builder function to build the oldCustomerGroupAssignments value
     * @return Builder
     */

    public CustomerGroupAssignmentsSetMessagePayloadBuilder addOldCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignment> builder) {
        return plusOldCustomerGroupAssignments(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()));
    }

    /**
     *  <p>Customer Groups assigned to the Customer before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param builder function to build the oldCustomerGroupAssignments value
     * @return Builder
     */

    public CustomerGroupAssignmentsSetMessagePayloadBuilder setOldCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignment> builder) {
        return oldCustomerGroupAssignments(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()));
    }

    /**
     *  <p>Customer Groups assigned to the Customer during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @return customerGroupAssignments
     */

    public java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> getCustomerGroupAssignments() {
        return this.customerGroupAssignments;
    }

    /**
     *  <p>Customer Groups assigned to the Customer before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @return oldCustomerGroupAssignments
     */

    public java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> getOldCustomerGroupAssignments() {
        return this.oldCustomerGroupAssignments;
    }

    /**
     * builds CustomerGroupAssignmentsSetMessagePayload with checking for non-null required values
     * @return CustomerGroupAssignmentsSetMessagePayload
     */
    public CustomerGroupAssignmentsSetMessagePayload build() {
        Objects.requireNonNull(customerGroupAssignments,
            CustomerGroupAssignmentsSetMessagePayload.class + ": customerGroupAssignments is missing");
        Objects.requireNonNull(oldCustomerGroupAssignments,
            CustomerGroupAssignmentsSetMessagePayload.class + ": oldCustomerGroupAssignments is missing");
        return new CustomerGroupAssignmentsSetMessagePayloadImpl(customerGroupAssignments, oldCustomerGroupAssignments);
    }

    /**
     * builds CustomerGroupAssignmentsSetMessagePayload without checking for non-null required values
     * @return CustomerGroupAssignmentsSetMessagePayload
     */
    public CustomerGroupAssignmentsSetMessagePayload buildUnchecked() {
        return new CustomerGroupAssignmentsSetMessagePayloadImpl(customerGroupAssignments, oldCustomerGroupAssignments);
    }

    /**
     * factory method for an instance of CustomerGroupAssignmentsSetMessagePayloadBuilder
     * @return builder
     */
    public static CustomerGroupAssignmentsSetMessagePayloadBuilder of() {
        return new CustomerGroupAssignmentsSetMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerGroupAssignmentsSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupAssignmentsSetMessagePayloadBuilder of(
            final CustomerGroupAssignmentsSetMessagePayload template) {
        CustomerGroupAssignmentsSetMessagePayloadBuilder builder = new CustomerGroupAssignmentsSetMessagePayloadBuilder();
        builder.customerGroupAssignments = template.getCustomerGroupAssignments();
        builder.oldCustomerGroupAssignments = template.getOldCustomerGroupAssignments();
        return builder;
    }

}
