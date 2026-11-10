
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerAddCustomerGroupAssignmentActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddCustomerGroupAssignmentAction customerAddCustomerGroupAssignmentAction = CustomerAddCustomerGroupAssignmentAction.builder()
 *             .customerGroupAssignment(customerGroupAssignmentBuilder -> customerGroupAssignmentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerAddCustomerGroupAssignmentActionBuilder
        implements Builder<CustomerAddCustomerGroupAssignmentAction> {

    private com.commercetools.api.models.customer.CustomerGroupAssignmentDraft customerGroupAssignment;

    /**
     *  <p>Customer Group to assign the Customer to.</p>
     * @param builder function to build the customerGroupAssignment value
     * @return Builder
     */

    public CustomerAddCustomerGroupAssignmentActionBuilder customerGroupAssignment(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder> builder) {
        this.customerGroupAssignment = builder
                .apply(com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Customer Group to assign the Customer to.</p>
     * @param builder function to build the customerGroupAssignment value
     * @return Builder
     */

    public CustomerAddCustomerGroupAssignmentActionBuilder withCustomerGroupAssignment(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentDraft> builder) {
        this.customerGroupAssignment = builder
                .apply(com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Customer Group to assign the Customer to.</p>
     * @param customerGroupAssignment value to be set
     * @return Builder
     */

    public CustomerAddCustomerGroupAssignmentActionBuilder customerGroupAssignment(
            final com.commercetools.api.models.customer.CustomerGroupAssignmentDraft customerGroupAssignment) {
        this.customerGroupAssignment = customerGroupAssignment;
        return this;
    }

    /**
     *  <p>Customer Group to assign the Customer to.</p>
     * @return customerGroupAssignment
     */

    public com.commercetools.api.models.customer.CustomerGroupAssignmentDraft getCustomerGroupAssignment() {
        return this.customerGroupAssignment;
    }

    /**
     * builds CustomerAddCustomerGroupAssignmentAction with checking for non-null required values
     * @return CustomerAddCustomerGroupAssignmentAction
     */
    public CustomerAddCustomerGroupAssignmentAction build() {
        Objects.requireNonNull(customerGroupAssignment,
            CustomerAddCustomerGroupAssignmentAction.class + ": customerGroupAssignment is missing");
        return new CustomerAddCustomerGroupAssignmentActionImpl(customerGroupAssignment);
    }

    /**
     * builds CustomerAddCustomerGroupAssignmentAction without checking for non-null required values
     * @return CustomerAddCustomerGroupAssignmentAction
     */
    public CustomerAddCustomerGroupAssignmentAction buildUnchecked() {
        return new CustomerAddCustomerGroupAssignmentActionImpl(customerGroupAssignment);
    }

    /**
     * factory method for an instance of CustomerAddCustomerGroupAssignmentActionBuilder
     * @return builder
     */
    public static CustomerAddCustomerGroupAssignmentActionBuilder of() {
        return new CustomerAddCustomerGroupAssignmentActionBuilder();
    }

    /**
     * create builder for CustomerAddCustomerGroupAssignmentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddCustomerGroupAssignmentActionBuilder of(
            final CustomerAddCustomerGroupAssignmentAction template) {
        CustomerAddCustomerGroupAssignmentActionBuilder builder = new CustomerAddCustomerGroupAssignmentActionBuilder();
        builder.customerGroupAssignment = template.getCustomerGroupAssignment();
        return builder;
    }

}
