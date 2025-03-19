
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupAssignmentsSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupAssignmentsSetMessagePayload customerGroupAssignmentsSetMessagePayload = CustomerGroupAssignmentsSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupAssignmentsSetMessagePayloadBuilder
        implements Builder<CustomerGroupAssignmentsSetMessagePayload> {

    @Nullable
    private java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> customerGroupAssignments;

    /**
     *  <p>Customer Groups assigned to the Customer during the Set CustomerGroupAssignments update action.</p>
     * @param customerGroupAssignments value to be set
     * @return Builder
     */

    public CustomerGroupAssignmentsSetMessagePayloadBuilder customerGroupAssignments(
            @Nullable final com.commercetools.api.models.customer.CustomerGroupAssignment... customerGroupAssignments) {
        this.customerGroupAssignments = new ArrayList<>(Arrays.asList(customerGroupAssignments));
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Customer during the Set CustomerGroupAssignments update action.</p>
     * @param customerGroupAssignments value to be set
     * @return Builder
     */

    public CustomerGroupAssignmentsSetMessagePayloadBuilder customerGroupAssignments(
            @Nullable final java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> customerGroupAssignments) {
        this.customerGroupAssignments = customerGroupAssignments;
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Customer during the Set CustomerGroupAssignments update action.</p>
     * @param customerGroupAssignments value to be set
     * @return Builder
     */

    public CustomerGroupAssignmentsSetMessagePayloadBuilder plusCustomerGroupAssignments(
            @Nullable final com.commercetools.api.models.customer.CustomerGroupAssignment... customerGroupAssignments) {
        if (this.customerGroupAssignments == null) {
            this.customerGroupAssignments = new ArrayList<>();
        }
        this.customerGroupAssignments.addAll(Arrays.asList(customerGroupAssignments));
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Customer during the Set CustomerGroupAssignments update action.</p>
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
     *  <p>Customer Groups assigned to the Customer during the Set CustomerGroupAssignments update action.</p>
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
     *  <p>Customer Groups assigned to the Customer during the Set CustomerGroupAssignments update action.</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public CustomerGroupAssignmentsSetMessagePayloadBuilder addCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignment> builder) {
        return plusCustomerGroupAssignments(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()));
    }

    /**
     *  <p>Customer Groups assigned to the Customer during the Set CustomerGroupAssignments update action.</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public CustomerGroupAssignmentsSetMessagePayloadBuilder setCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignment> builder) {
        return customerGroupAssignments(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()));
    }

    /**
     *  <p>Customer Groups assigned to the Customer during the Set CustomerGroupAssignments update action.</p>
     * @return customerGroupAssignments
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> getCustomerGroupAssignments() {
        return this.customerGroupAssignments;
    }

    /**
     * builds CustomerGroupAssignmentsSetMessagePayload with checking for non-null required values
     * @return CustomerGroupAssignmentsSetMessagePayload
     */
    public CustomerGroupAssignmentsSetMessagePayload build() {
        return new CustomerGroupAssignmentsSetMessagePayloadImpl(customerGroupAssignments);
    }

    /**
     * builds CustomerGroupAssignmentsSetMessagePayload without checking for non-null required values
     * @return CustomerGroupAssignmentsSetMessagePayload
     */
    public CustomerGroupAssignmentsSetMessagePayload buildUnchecked() {
        return new CustomerGroupAssignmentsSetMessagePayloadImpl(customerGroupAssignments);
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
        return builder;
    }

}
