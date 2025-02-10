
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetCustomerGroupAssignmentsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetCustomerGroupAssignmentsAction customerSetCustomerGroupAssignmentsAction = CustomerSetCustomerGroupAssignmentsAction.builder()
 *             .plusCustomerGroupAssignments(customerGroupAssignmentsBuilder -> customerGroupAssignmentsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSetCustomerGroupAssignmentsActionBuilder
        implements Builder<CustomerSetCustomerGroupAssignmentsAction> {

    private java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignmentDraft> customerGroupAssignments;

    /**
     *  <p>Customer Groups to assign to the Customer.</p>
     * @param customerGroupAssignments value to be set
     * @return Builder
     */

    public CustomerSetCustomerGroupAssignmentsActionBuilder customerGroupAssignments(
            final com.commercetools.api.models.customer.CustomerGroupAssignmentDraft... customerGroupAssignments) {
        this.customerGroupAssignments = new ArrayList<>(Arrays.asList(customerGroupAssignments));
        return this;
    }

    /**
     *  <p>Customer Groups to assign to the Customer.</p>
     * @param customerGroupAssignments value to be set
     * @return Builder
     */

    public CustomerSetCustomerGroupAssignmentsActionBuilder customerGroupAssignments(
            final java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignmentDraft> customerGroupAssignments) {
        this.customerGroupAssignments = customerGroupAssignments;
        return this;
    }

    /**
     *  <p>Customer Groups to assign to the Customer.</p>
     * @param customerGroupAssignments value to be set
     * @return Builder
     */

    public CustomerSetCustomerGroupAssignmentsActionBuilder plusCustomerGroupAssignments(
            final com.commercetools.api.models.customer.CustomerGroupAssignmentDraft... customerGroupAssignments) {
        if (this.customerGroupAssignments == null) {
            this.customerGroupAssignments = new ArrayList<>();
        }
        this.customerGroupAssignments.addAll(Arrays.asList(customerGroupAssignments));
        return this;
    }

    /**
     *  <p>Customer Groups to assign to the Customer.</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public CustomerSetCustomerGroupAssignmentsActionBuilder plusCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder> builder) {
        if (this.customerGroupAssignments == null) {
            this.customerGroupAssignments = new ArrayList<>();
        }
        this.customerGroupAssignments.add(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Customer Groups to assign to the Customer.</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public CustomerSetCustomerGroupAssignmentsActionBuilder withCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder> builder) {
        this.customerGroupAssignments = new ArrayList<>();
        this.customerGroupAssignments.add(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Customer Groups to assign to the Customer.</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public CustomerSetCustomerGroupAssignmentsActionBuilder addCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentDraft> builder) {
        return plusCustomerGroupAssignments(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder.of()));
    }

    /**
     *  <p>Customer Groups to assign to the Customer.</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public CustomerSetCustomerGroupAssignmentsActionBuilder setCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentDraft> builder) {
        return customerGroupAssignments(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder.of()));
    }

    /**
     *  <p>Customer Groups to assign to the Customer.</p>
     * @return customerGroupAssignments
     */

    public java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignmentDraft> getCustomerGroupAssignments() {
        return this.customerGroupAssignments;
    }

    /**
     * builds CustomerSetCustomerGroupAssignmentsAction with checking for non-null required values
     * @return CustomerSetCustomerGroupAssignmentsAction
     */
    public CustomerSetCustomerGroupAssignmentsAction build() {
        Objects.requireNonNull(customerGroupAssignments,
            CustomerSetCustomerGroupAssignmentsAction.class + ": customerGroupAssignments is missing");
        return new CustomerSetCustomerGroupAssignmentsActionImpl(customerGroupAssignments);
    }

    /**
     * builds CustomerSetCustomerGroupAssignmentsAction without checking for non-null required values
     * @return CustomerSetCustomerGroupAssignmentsAction
     */
    public CustomerSetCustomerGroupAssignmentsAction buildUnchecked() {
        return new CustomerSetCustomerGroupAssignmentsActionImpl(customerGroupAssignments);
    }

    /**
     * factory method for an instance of CustomerSetCustomerGroupAssignmentsActionBuilder
     * @return builder
     */
    public static CustomerSetCustomerGroupAssignmentsActionBuilder of() {
        return new CustomerSetCustomerGroupAssignmentsActionBuilder();
    }

    /**
     * create builder for CustomerSetCustomerGroupAssignmentsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetCustomerGroupAssignmentsActionBuilder of(
            final CustomerSetCustomerGroupAssignmentsAction template) {
        CustomerSetCustomerGroupAssignmentsActionBuilder builder = new CustomerSetCustomerGroupAssignmentsActionBuilder();
        builder.customerGroupAssignments = template.getCustomerGroupAssignments();
        return builder;
    }

}
