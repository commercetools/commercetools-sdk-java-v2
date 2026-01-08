
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitRemoveCustomerGroupAssignmentActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitRemoveCustomerGroupAssignmentAction businessUnitRemoveCustomerGroupAssignmentAction = BusinessUnitRemoveCustomerGroupAssignmentAction.builder()
 *             .customerGroup(customerGroupBuilder -> customerGroupBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitRemoveCustomerGroupAssignmentActionBuilder
        implements Builder<BusinessUnitRemoveCustomerGroupAssignmentAction> {

    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    /**
     *  <p>Customer Group to unassign the Business Unit from.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public BusinessUnitRemoveCustomerGroupAssignmentActionBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Customer Group to unassign the Business Unit from.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public BusinessUnitRemoveCustomerGroupAssignmentActionBuilder withCustomerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Customer Group to unassign the Business Unit from.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public BusinessUnitRemoveCustomerGroupAssignmentActionBuilder customerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Customer Group to unassign the Business Unit from.</p>
     * @return customerGroup
     */

    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     * builds BusinessUnitRemoveCustomerGroupAssignmentAction with checking for non-null required values
     * @return BusinessUnitRemoveCustomerGroupAssignmentAction
     */
    public BusinessUnitRemoveCustomerGroupAssignmentAction build() {
        Objects.requireNonNull(customerGroup,
            BusinessUnitRemoveCustomerGroupAssignmentAction.class + ": customerGroup is missing");
        return new BusinessUnitRemoveCustomerGroupAssignmentActionImpl(customerGroup);
    }

    /**
     * builds BusinessUnitRemoveCustomerGroupAssignmentAction without checking for non-null required values
     * @return BusinessUnitRemoveCustomerGroupAssignmentAction
     */
    public BusinessUnitRemoveCustomerGroupAssignmentAction buildUnchecked() {
        return new BusinessUnitRemoveCustomerGroupAssignmentActionImpl(customerGroup);
    }

    /**
     * factory method for an instance of BusinessUnitRemoveCustomerGroupAssignmentActionBuilder
     * @return builder
     */
    public static BusinessUnitRemoveCustomerGroupAssignmentActionBuilder of() {
        return new BusinessUnitRemoveCustomerGroupAssignmentActionBuilder();
    }

    /**
     * create builder for BusinessUnitRemoveCustomerGroupAssignmentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitRemoveCustomerGroupAssignmentActionBuilder of(
            final BusinessUnitRemoveCustomerGroupAssignmentAction template) {
        BusinessUnitRemoveCustomerGroupAssignmentActionBuilder builder = new BusinessUnitRemoveCustomerGroupAssignmentActionBuilder();
        builder.customerGroup = template.getCustomerGroup();
        return builder;
    }

}
