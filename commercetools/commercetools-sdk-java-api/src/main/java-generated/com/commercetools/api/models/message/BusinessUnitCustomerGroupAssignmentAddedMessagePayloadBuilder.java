
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitCustomerGroupAssignmentAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitCustomerGroupAssignmentAddedMessagePayload businessUnitCustomerGroupAssignmentAddedMessagePayload = BusinessUnitCustomerGroupAssignmentAddedMessagePayload.builder()
 *             .customerGroupAssignment(customerGroupAssignmentBuilder -> customerGroupAssignmentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitCustomerGroupAssignmentAddedMessagePayloadBuilder
        implements Builder<BusinessUnitCustomerGroupAssignmentAddedMessagePayload> {

    private com.commercetools.api.models.customer.CustomerGroupAssignment customerGroupAssignment;

    /**
     *  <p>Customer Group assigned to the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitAddCustomerGroupAssignmentAction" rel="nofollow">Add CustomerGroupAssignment</a> update action.</p>
     * @param builder function to build the customerGroupAssignment value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentAddedMessagePayloadBuilder customerGroupAssignment(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder> builder) {
        this.customerGroupAssignment = builder
                .apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Customer Group assigned to the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitAddCustomerGroupAssignmentAction" rel="nofollow">Add CustomerGroupAssignment</a> update action.</p>
     * @param builder function to build the customerGroupAssignment value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentAddedMessagePayloadBuilder withCustomerGroupAssignment(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignment> builder) {
        this.customerGroupAssignment = builder
                .apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of());
        return this;
    }

    /**
     *  <p>Customer Group assigned to the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitAddCustomerGroupAssignmentAction" rel="nofollow">Add CustomerGroupAssignment</a> update action.</p>
     * @param customerGroupAssignment value to be set
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentAddedMessagePayloadBuilder customerGroupAssignment(
            final com.commercetools.api.models.customer.CustomerGroupAssignment customerGroupAssignment) {
        this.customerGroupAssignment = customerGroupAssignment;
        return this;
    }

    /**
     *  <p>Customer Group assigned to the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitAddCustomerGroupAssignmentAction" rel="nofollow">Add CustomerGroupAssignment</a> update action.</p>
     * @return customerGroupAssignment
     */

    public com.commercetools.api.models.customer.CustomerGroupAssignment getCustomerGroupAssignment() {
        return this.customerGroupAssignment;
    }

    /**
     * builds BusinessUnitCustomerGroupAssignmentAddedMessagePayload with checking for non-null required values
     * @return BusinessUnitCustomerGroupAssignmentAddedMessagePayload
     */
    public BusinessUnitCustomerGroupAssignmentAddedMessagePayload build() {
        Objects.requireNonNull(customerGroupAssignment,
            BusinessUnitCustomerGroupAssignmentAddedMessagePayload.class + ": customerGroupAssignment is missing");
        return new BusinessUnitCustomerGroupAssignmentAddedMessagePayloadImpl(customerGroupAssignment);
    }

    /**
     * builds BusinessUnitCustomerGroupAssignmentAddedMessagePayload without checking for non-null required values
     * @return BusinessUnitCustomerGroupAssignmentAddedMessagePayload
     */
    public BusinessUnitCustomerGroupAssignmentAddedMessagePayload buildUnchecked() {
        return new BusinessUnitCustomerGroupAssignmentAddedMessagePayloadImpl(customerGroupAssignment);
    }

    /**
     * factory method for an instance of BusinessUnitCustomerGroupAssignmentAddedMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitCustomerGroupAssignmentAddedMessagePayloadBuilder of() {
        return new BusinessUnitCustomerGroupAssignmentAddedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitCustomerGroupAssignmentAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitCustomerGroupAssignmentAddedMessagePayloadBuilder of(
            final BusinessUnitCustomerGroupAssignmentAddedMessagePayload template) {
        BusinessUnitCustomerGroupAssignmentAddedMessagePayloadBuilder builder = new BusinessUnitCustomerGroupAssignmentAddedMessagePayloadBuilder();
        builder.customerGroupAssignment = template.getCustomerGroupAssignment();
        return builder;
    }

}
