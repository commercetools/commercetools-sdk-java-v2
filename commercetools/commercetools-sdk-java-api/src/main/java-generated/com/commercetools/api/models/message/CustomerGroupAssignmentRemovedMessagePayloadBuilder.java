
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupAssignmentRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupAssignmentRemovedMessagePayload customerGroupAssignmentRemovedMessagePayload = CustomerGroupAssignmentRemovedMessagePayload.builder()
 *             .customerGroupAssignment(customerGroupAssignmentBuilder -> customerGroupAssignmentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupAssignmentRemovedMessagePayloadBuilder
        implements Builder<CustomerGroupAssignmentRemovedMessagePayload> {

    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroupAssignment;

    /**
     *  <p>CustomerGroupAssignment that was removed during the Remove CustomerGroupAssignment update action.</p>
     * @param builder function to build the customerGroupAssignment value
     * @return Builder
     */

    public CustomerGroupAssignmentRemovedMessagePayloadBuilder customerGroupAssignment(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.customerGroupAssignment = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>CustomerGroupAssignment that was removed during the Remove CustomerGroupAssignment update action.</p>
     * @param builder function to build the customerGroupAssignment value
     * @return Builder
     */

    public CustomerGroupAssignmentRemovedMessagePayloadBuilder withCustomerGroupAssignment(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReference> builder) {
        this.customerGroupAssignment = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>CustomerGroupAssignment that was removed during the Remove CustomerGroupAssignment update action.</p>
     * @param customerGroupAssignment value to be set
     * @return Builder
     */

    public CustomerGroupAssignmentRemovedMessagePayloadBuilder customerGroupAssignment(
            final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroupAssignment) {
        this.customerGroupAssignment = customerGroupAssignment;
        return this;
    }

    /**
     *  <p>CustomerGroupAssignment that was removed during the Remove CustomerGroupAssignment update action.</p>
     * @return customerGroupAssignment
     */

    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroupAssignment() {
        return this.customerGroupAssignment;
    }

    /**
     * builds CustomerGroupAssignmentRemovedMessagePayload with checking for non-null required values
     * @return CustomerGroupAssignmentRemovedMessagePayload
     */
    public CustomerGroupAssignmentRemovedMessagePayload build() {
        Objects.requireNonNull(customerGroupAssignment,
            CustomerGroupAssignmentRemovedMessagePayload.class + ": customerGroupAssignment is missing");
        return new CustomerGroupAssignmentRemovedMessagePayloadImpl(customerGroupAssignment);
    }

    /**
     * builds CustomerGroupAssignmentRemovedMessagePayload without checking for non-null required values
     * @return CustomerGroupAssignmentRemovedMessagePayload
     */
    public CustomerGroupAssignmentRemovedMessagePayload buildUnchecked() {
        return new CustomerGroupAssignmentRemovedMessagePayloadImpl(customerGroupAssignment);
    }

    /**
     * factory method for an instance of CustomerGroupAssignmentRemovedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerGroupAssignmentRemovedMessagePayloadBuilder of() {
        return new CustomerGroupAssignmentRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerGroupAssignmentRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupAssignmentRemovedMessagePayloadBuilder of(
            final CustomerGroupAssignmentRemovedMessagePayload template) {
        CustomerGroupAssignmentRemovedMessagePayloadBuilder builder = new CustomerGroupAssignmentRemovedMessagePayloadBuilder();
        builder.customerGroupAssignment = template.getCustomerGroupAssignment();
        return builder;
    }

}
