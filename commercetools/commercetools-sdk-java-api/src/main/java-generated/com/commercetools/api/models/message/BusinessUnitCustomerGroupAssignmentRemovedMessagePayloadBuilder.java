
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitCustomerGroupAssignmentRemovedMessagePayload businessUnitCustomerGroupAssignmentRemovedMessagePayload = BusinessUnitCustomerGroupAssignmentRemovedMessagePayload.builder()
 *             .customerGroupAssignment(customerGroupAssignmentBuilder -> customerGroupAssignmentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadBuilder
        implements Builder<BusinessUnitCustomerGroupAssignmentRemovedMessagePayload> {

    private com.commercetools.api.models.customer.CustomerGroupAssignment customerGroupAssignment;

    /**
     *  <p>Customer Group unassigned from the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitRemoveCustomerGroupAssignmentAction" rel="nofollow">Remove CustomerGroupAssignment</a> update action.</p>
     * @param builder function to build the customerGroupAssignment value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadBuilder customerGroupAssignment(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder> builder) {
        this.customerGroupAssignment = builder
                .apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Customer Group unassigned from the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitRemoveCustomerGroupAssignmentAction" rel="nofollow">Remove CustomerGroupAssignment</a> update action.</p>
     * @param builder function to build the customerGroupAssignment value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadBuilder withCustomerGroupAssignment(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignment> builder) {
        this.customerGroupAssignment = builder
                .apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of());
        return this;
    }

    /**
     *  <p>Customer Group unassigned from the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitRemoveCustomerGroupAssignmentAction" rel="nofollow">Remove CustomerGroupAssignment</a> update action.</p>
     * @param customerGroupAssignment value to be set
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadBuilder customerGroupAssignment(
            final com.commercetools.api.models.customer.CustomerGroupAssignment customerGroupAssignment) {
        this.customerGroupAssignment = customerGroupAssignment;
        return this;
    }

    /**
     *  <p>Customer Group unassigned from the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitRemoveCustomerGroupAssignmentAction" rel="nofollow">Remove CustomerGroupAssignment</a> update action.</p>
     * @return customerGroupAssignment
     */

    public com.commercetools.api.models.customer.CustomerGroupAssignment getCustomerGroupAssignment() {
        return this.customerGroupAssignment;
    }

    /**
     * builds BusinessUnitCustomerGroupAssignmentRemovedMessagePayload with checking for non-null required values
     * @return BusinessUnitCustomerGroupAssignmentRemovedMessagePayload
     */
    public BusinessUnitCustomerGroupAssignmentRemovedMessagePayload build() {
        Objects.requireNonNull(customerGroupAssignment,
            BusinessUnitCustomerGroupAssignmentRemovedMessagePayload.class + ": customerGroupAssignment is missing");
        return new BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadImpl(customerGroupAssignment);
    }

    /**
     * builds BusinessUnitCustomerGroupAssignmentRemovedMessagePayload without checking for non-null required values
     * @return BusinessUnitCustomerGroupAssignmentRemovedMessagePayload
     */
    public BusinessUnitCustomerGroupAssignmentRemovedMessagePayload buildUnchecked() {
        return new BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadImpl(customerGroupAssignment);
    }

    /**
     * factory method for an instance of BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadBuilder of() {
        return new BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitCustomerGroupAssignmentRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadBuilder of(
            final BusinessUnitCustomerGroupAssignmentRemovedMessagePayload template) {
        BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadBuilder builder = new BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadBuilder();
        builder.customerGroupAssignment = template.getCustomerGroupAssignment();
        return builder;
    }

}
