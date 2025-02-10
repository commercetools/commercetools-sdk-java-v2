
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupAssignmentBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupAssignment customerGroupAssignment = CustomerGroupAssignment.builder()
 *             .customerGroup(customerGroupBuilder -> customerGroupBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupAssignmentBuilder implements Builder<CustomerGroupAssignment> {

    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    /**
     *  <p>Reference to a Customer Group.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public CustomerGroupAssignmentBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to a Customer Group.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public CustomerGroupAssignmentBuilder withCustomerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReference> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to a Customer Group.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public CustomerGroupAssignmentBuilder customerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Reference to a Customer Group.</p>
     * @return customerGroup
     */

    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     * builds CustomerGroupAssignment with checking for non-null required values
     * @return CustomerGroupAssignment
     */
    public CustomerGroupAssignment build() {
        Objects.requireNonNull(customerGroup, CustomerGroupAssignment.class + ": customerGroup is missing");
        return new CustomerGroupAssignmentImpl(customerGroup);
    }

    /**
     * builds CustomerGroupAssignment without checking for non-null required values
     * @return CustomerGroupAssignment
     */
    public CustomerGroupAssignment buildUnchecked() {
        return new CustomerGroupAssignmentImpl(customerGroup);
    }

    /**
     * factory method for an instance of CustomerGroupAssignmentBuilder
     * @return builder
     */
    public static CustomerGroupAssignmentBuilder of() {
        return new CustomerGroupAssignmentBuilder();
    }

    /**
     * create builder for CustomerGroupAssignment instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupAssignmentBuilder of(final CustomerGroupAssignment template) {
        CustomerGroupAssignmentBuilder builder = new CustomerGroupAssignmentBuilder();
        builder.customerGroup = template.getCustomerGroup();
        return builder;
    }

}
