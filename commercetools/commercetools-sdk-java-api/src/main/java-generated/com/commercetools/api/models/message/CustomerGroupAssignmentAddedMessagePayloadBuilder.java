
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupAssignmentAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupAssignmentAddedMessagePayload customerGroupAssignmentAddedMessagePayload = CustomerGroupAssignmentAddedMessagePayload.builder()
 *             .customerGroupAssignment(customerGroupAssignmentBuilder -> customerGroupAssignmentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupAssignmentAddedMessagePayloadBuilder
        implements Builder<CustomerGroupAssignmentAddedMessagePayload> {

    private com.commercetools.api.models.customer.CustomerGroupAssignment customerGroupAssignment;

    /**
     *  <p>Customer Group assigned to the Customer during the Add CustomerGroupAssignment update action.</p>
     * @param builder function to build the customerGroupAssignment value
     * @return Builder
     */

    public CustomerGroupAssignmentAddedMessagePayloadBuilder customerGroupAssignment(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder> builder) {
        this.customerGroupAssignment = builder
                .apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Customer Group assigned to the Customer during the Add CustomerGroupAssignment update action.</p>
     * @param builder function to build the customerGroupAssignment value
     * @return Builder
     */

    public CustomerGroupAssignmentAddedMessagePayloadBuilder withCustomerGroupAssignment(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignment> builder) {
        this.customerGroupAssignment = builder
                .apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of());
        return this;
    }

    /**
     *  <p>Customer Group assigned to the Customer during the Add CustomerGroupAssignment update action.</p>
     * @param customerGroupAssignment value to be set
     * @return Builder
     */

    public CustomerGroupAssignmentAddedMessagePayloadBuilder customerGroupAssignment(
            final com.commercetools.api.models.customer.CustomerGroupAssignment customerGroupAssignment) {
        this.customerGroupAssignment = customerGroupAssignment;
        return this;
    }

    /**
     *  <p>Customer Group assigned to the Customer during the Add CustomerGroupAssignment update action.</p>
     * @return customerGroupAssignment
     */

    public com.commercetools.api.models.customer.CustomerGroupAssignment getCustomerGroupAssignment() {
        return this.customerGroupAssignment;
    }

    /**
     * builds CustomerGroupAssignmentAddedMessagePayload with checking for non-null required values
     * @return CustomerGroupAssignmentAddedMessagePayload
     */
    public CustomerGroupAssignmentAddedMessagePayload build() {
        Objects.requireNonNull(customerGroupAssignment,
            CustomerGroupAssignmentAddedMessagePayload.class + ": customerGroupAssignment is missing");
        return new CustomerGroupAssignmentAddedMessagePayloadImpl(customerGroupAssignment);
    }

    /**
     * builds CustomerGroupAssignmentAddedMessagePayload without checking for non-null required values
     * @return CustomerGroupAssignmentAddedMessagePayload
     */
    public CustomerGroupAssignmentAddedMessagePayload buildUnchecked() {
        return new CustomerGroupAssignmentAddedMessagePayloadImpl(customerGroupAssignment);
    }

    /**
     * factory method for an instance of CustomerGroupAssignmentAddedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerGroupAssignmentAddedMessagePayloadBuilder of() {
        return new CustomerGroupAssignmentAddedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerGroupAssignmentAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupAssignmentAddedMessagePayloadBuilder of(
            final CustomerGroupAssignmentAddedMessagePayload template) {
        CustomerGroupAssignmentAddedMessagePayloadBuilder builder = new CustomerGroupAssignmentAddedMessagePayloadBuilder();
        builder.customerGroupAssignment = template.getCustomerGroupAssignment();
        return builder;
    }

}
