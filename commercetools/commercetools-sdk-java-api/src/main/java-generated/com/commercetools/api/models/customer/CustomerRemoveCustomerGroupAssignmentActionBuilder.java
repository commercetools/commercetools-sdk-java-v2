
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerRemoveCustomerGroupAssignmentActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerRemoveCustomerGroupAssignmentAction customerRemoveCustomerGroupAssignmentAction = CustomerRemoveCustomerGroupAssignmentAction.builder()
 *             .customerGroup(customerGroupBuilder -> customerGroupBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerRemoveCustomerGroupAssignmentActionBuilder
        implements Builder<CustomerRemoveCustomerGroupAssignmentAction> {

    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    /**
     *  <p>Customer Group to unassign from the Customer.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public CustomerRemoveCustomerGroupAssignmentActionBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Customer Group to unassign from the Customer.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public CustomerRemoveCustomerGroupAssignmentActionBuilder withCustomerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Customer Group to unassign from the Customer.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public CustomerRemoveCustomerGroupAssignmentActionBuilder customerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Customer Group to unassign from the Customer.</p>
     * @return customerGroup
     */

    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     * builds CustomerRemoveCustomerGroupAssignmentAction with checking for non-null required values
     * @return CustomerRemoveCustomerGroupAssignmentAction
     */
    public CustomerRemoveCustomerGroupAssignmentAction build() {
        Objects.requireNonNull(customerGroup,
            CustomerRemoveCustomerGroupAssignmentAction.class + ": customerGroup is missing");
        return new CustomerRemoveCustomerGroupAssignmentActionImpl(customerGroup);
    }

    /**
     * builds CustomerRemoveCustomerGroupAssignmentAction without checking for non-null required values
     * @return CustomerRemoveCustomerGroupAssignmentAction
     */
    public CustomerRemoveCustomerGroupAssignmentAction buildUnchecked() {
        return new CustomerRemoveCustomerGroupAssignmentActionImpl(customerGroup);
    }

    /**
     * factory method for an instance of CustomerRemoveCustomerGroupAssignmentActionBuilder
     * @return builder
     */
    public static CustomerRemoveCustomerGroupAssignmentActionBuilder of() {
        return new CustomerRemoveCustomerGroupAssignmentActionBuilder();
    }

    /**
     * create builder for CustomerRemoveCustomerGroupAssignmentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerRemoveCustomerGroupAssignmentActionBuilder of(
            final CustomerRemoveCustomerGroupAssignmentAction template) {
        CustomerRemoveCustomerGroupAssignmentActionBuilder builder = new CustomerRemoveCustomerGroupAssignmentActionBuilder();
        builder.customerGroup = template.getCustomerGroup();
        return builder;
    }

}
