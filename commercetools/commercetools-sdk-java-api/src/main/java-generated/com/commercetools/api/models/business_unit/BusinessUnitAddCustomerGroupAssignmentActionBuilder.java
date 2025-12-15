
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitAddCustomerGroupAssignmentActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddCustomerGroupAssignmentAction businessUnitAddCustomerGroupAssignmentAction = BusinessUnitAddCustomerGroupAssignmentAction.builder()
 *             .customerGroupAssignment(customerGroupAssignmentBuilder -> customerGroupAssignmentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAddCustomerGroupAssignmentActionBuilder
        implements Builder<BusinessUnitAddCustomerGroupAssignmentAction> {

    private com.commercetools.api.models.customer.CustomerGroupAssignmentDraft customerGroupAssignment;

    /**
     *  <p>Customer Group to assign the Business Unit to.</p>
     * @param builder function to build the customerGroupAssignment value
     * @return Builder
     */

    public BusinessUnitAddCustomerGroupAssignmentActionBuilder customerGroupAssignment(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder> builder) {
        this.customerGroupAssignment = builder
                .apply(com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Customer Group to assign the Business Unit to.</p>
     * @param builder function to build the customerGroupAssignment value
     * @return Builder
     */

    public BusinessUnitAddCustomerGroupAssignmentActionBuilder withCustomerGroupAssignment(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentDraft> builder) {
        this.customerGroupAssignment = builder
                .apply(com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Customer Group to assign the Business Unit to.</p>
     * @param customerGroupAssignment value to be set
     * @return Builder
     */

    public BusinessUnitAddCustomerGroupAssignmentActionBuilder customerGroupAssignment(
            final com.commercetools.api.models.customer.CustomerGroupAssignmentDraft customerGroupAssignment) {
        this.customerGroupAssignment = customerGroupAssignment;
        return this;
    }

    /**
     *  <p>Customer Group to assign the Business Unit to.</p>
     * @return customerGroupAssignment
     */

    public com.commercetools.api.models.customer.CustomerGroupAssignmentDraft getCustomerGroupAssignment() {
        return this.customerGroupAssignment;
    }

    /**
     * builds BusinessUnitAddCustomerGroupAssignmentAction with checking for non-null required values
     * @return BusinessUnitAddCustomerGroupAssignmentAction
     */
    public BusinessUnitAddCustomerGroupAssignmentAction build() {
        Objects.requireNonNull(customerGroupAssignment,
            BusinessUnitAddCustomerGroupAssignmentAction.class + ": customerGroupAssignment is missing");
        return new BusinessUnitAddCustomerGroupAssignmentActionImpl(customerGroupAssignment);
    }

    /**
     * builds BusinessUnitAddCustomerGroupAssignmentAction without checking for non-null required values
     * @return BusinessUnitAddCustomerGroupAssignmentAction
     */
    public BusinessUnitAddCustomerGroupAssignmentAction buildUnchecked() {
        return new BusinessUnitAddCustomerGroupAssignmentActionImpl(customerGroupAssignment);
    }

    /**
     * factory method for an instance of BusinessUnitAddCustomerGroupAssignmentActionBuilder
     * @return builder
     */
    public static BusinessUnitAddCustomerGroupAssignmentActionBuilder of() {
        return new BusinessUnitAddCustomerGroupAssignmentActionBuilder();
    }

    /**
     * create builder for BusinessUnitAddCustomerGroupAssignmentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddCustomerGroupAssignmentActionBuilder of(
            final BusinessUnitAddCustomerGroupAssignmentAction template) {
        BusinessUnitAddCustomerGroupAssignmentActionBuilder builder = new BusinessUnitAddCustomerGroupAssignmentActionBuilder();
        builder.customerGroupAssignment = template.getCustomerGroupAssignment();
        return builder;
    }

}
