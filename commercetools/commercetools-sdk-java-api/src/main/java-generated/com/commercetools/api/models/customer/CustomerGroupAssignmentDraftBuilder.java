
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupAssignmentDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupAssignmentDraft customerGroupAssignmentDraft = CustomerGroupAssignmentDraft.builder()
 *             .customerGroup(customerGroupBuilder -> customerGroupBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupAssignmentDraftBuilder implements Builder<CustomerGroupAssignmentDraft> {

    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    /**
     *  <p>ResourceIdentifier of a Customer Group.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public CustomerGroupAssignmentDraftBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier of a Customer Group.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public CustomerGroupAssignmentDraftBuilder withCustomerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>ResourceIdentifier of a Customer Group.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public CustomerGroupAssignmentDraftBuilder customerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>ResourceIdentifier of a Customer Group.</p>
     * @return customerGroup
     */

    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     * builds CustomerGroupAssignmentDraft with checking for non-null required values
     * @return CustomerGroupAssignmentDraft
     */
    public CustomerGroupAssignmentDraft build() {
        Objects.requireNonNull(customerGroup, CustomerGroupAssignmentDraft.class + ": customerGroup is missing");
        return new CustomerGroupAssignmentDraftImpl(customerGroup);
    }

    /**
     * builds CustomerGroupAssignmentDraft without checking for non-null required values
     * @return CustomerGroupAssignmentDraft
     */
    public CustomerGroupAssignmentDraft buildUnchecked() {
        return new CustomerGroupAssignmentDraftImpl(customerGroup);
    }

    /**
     * factory method for an instance of CustomerGroupAssignmentDraftBuilder
     * @return builder
     */
    public static CustomerGroupAssignmentDraftBuilder of() {
        return new CustomerGroupAssignmentDraftBuilder();
    }

    /**
     * create builder for CustomerGroupAssignmentDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupAssignmentDraftBuilder of(final CustomerGroupAssignmentDraft template) {
        CustomerGroupAssignmentDraftBuilder builder = new CustomerGroupAssignmentDraftBuilder();
        builder.customerGroup = template.getCustomerGroup();
        return builder;
    }

}
