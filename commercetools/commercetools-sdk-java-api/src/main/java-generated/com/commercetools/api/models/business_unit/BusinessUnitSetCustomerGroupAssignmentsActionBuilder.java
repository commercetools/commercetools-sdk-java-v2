
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitSetCustomerGroupAssignmentsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSetCustomerGroupAssignmentsAction businessUnitSetCustomerGroupAssignmentsAction = BusinessUnitSetCustomerGroupAssignmentsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitSetCustomerGroupAssignmentsActionBuilder
        implements Builder<BusinessUnitSetCustomerGroupAssignmentsAction> {

    @Nullable
    private java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignmentDraft> customerGroupAssignments;

    /**
     *  <p>Customer Groups to assign the Business Unit to.</p>
     * @param customerGroupAssignments value to be set
     * @return Builder
     */

    public BusinessUnitSetCustomerGroupAssignmentsActionBuilder customerGroupAssignments(
            @Nullable final com.commercetools.api.models.customer.CustomerGroupAssignmentDraft... customerGroupAssignments) {
        this.customerGroupAssignments = new ArrayList<>(Arrays.asList(customerGroupAssignments));
        return this;
    }

    /**
     *  <p>Customer Groups to assign the Business Unit to.</p>
     * @param customerGroupAssignments value to be set
     * @return Builder
     */

    public BusinessUnitSetCustomerGroupAssignmentsActionBuilder customerGroupAssignments(
            @Nullable final java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignmentDraft> customerGroupAssignments) {
        this.customerGroupAssignments = customerGroupAssignments;
        return this;
    }

    /**
     *  <p>Customer Groups to assign the Business Unit to.</p>
     * @param customerGroupAssignments value to be set
     * @return Builder
     */

    public BusinessUnitSetCustomerGroupAssignmentsActionBuilder plusCustomerGroupAssignments(
            @Nullable final com.commercetools.api.models.customer.CustomerGroupAssignmentDraft... customerGroupAssignments) {
        if (this.customerGroupAssignments == null) {
            this.customerGroupAssignments = new ArrayList<>();
        }
        this.customerGroupAssignments.addAll(Arrays.asList(customerGroupAssignments));
        return this;
    }

    /**
     *  <p>Customer Groups to assign the Business Unit to.</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public BusinessUnitSetCustomerGroupAssignmentsActionBuilder plusCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder> builder) {
        if (this.customerGroupAssignments == null) {
            this.customerGroupAssignments = new ArrayList<>();
        }
        this.customerGroupAssignments.add(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Customer Groups to assign the Business Unit to.</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public BusinessUnitSetCustomerGroupAssignmentsActionBuilder withCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder> builder) {
        this.customerGroupAssignments = new ArrayList<>();
        this.customerGroupAssignments.add(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Customer Groups to assign the Business Unit to.</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public BusinessUnitSetCustomerGroupAssignmentsActionBuilder addCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentDraft> builder) {
        return plusCustomerGroupAssignments(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder.of()));
    }

    /**
     *  <p>Customer Groups to assign the Business Unit to.</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public BusinessUnitSetCustomerGroupAssignmentsActionBuilder setCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentDraft> builder) {
        return customerGroupAssignments(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder.of()));
    }

    /**
     *  <p>Customer Groups to assign the Business Unit to.</p>
     * @return customerGroupAssignments
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignmentDraft> getCustomerGroupAssignments() {
        return this.customerGroupAssignments;
    }

    /**
     * builds BusinessUnitSetCustomerGroupAssignmentsAction with checking for non-null required values
     * @return BusinessUnitSetCustomerGroupAssignmentsAction
     */
    public BusinessUnitSetCustomerGroupAssignmentsAction build() {
        return new BusinessUnitSetCustomerGroupAssignmentsActionImpl(customerGroupAssignments);
    }

    /**
     * builds BusinessUnitSetCustomerGroupAssignmentsAction without checking for non-null required values
     * @return BusinessUnitSetCustomerGroupAssignmentsAction
     */
    public BusinessUnitSetCustomerGroupAssignmentsAction buildUnchecked() {
        return new BusinessUnitSetCustomerGroupAssignmentsActionImpl(customerGroupAssignments);
    }

    /**
     * factory method for an instance of BusinessUnitSetCustomerGroupAssignmentsActionBuilder
     * @return builder
     */
    public static BusinessUnitSetCustomerGroupAssignmentsActionBuilder of() {
        return new BusinessUnitSetCustomerGroupAssignmentsActionBuilder();
    }

    /**
     * create builder for BusinessUnitSetCustomerGroupAssignmentsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitSetCustomerGroupAssignmentsActionBuilder of(
            final BusinessUnitSetCustomerGroupAssignmentsAction template) {
        BusinessUnitSetCustomerGroupAssignmentsActionBuilder builder = new BusinessUnitSetCustomerGroupAssignmentsActionBuilder();
        builder.customerGroupAssignments = template.getCustomerGroupAssignments();
        return builder;
    }

}
