
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetCustomerGroupActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCustomerGroupAction stagedOrderSetCustomerGroupAction = StagedOrderSetCustomerGroupAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetCustomerGroupActionBuilder implements Builder<StagedOrderSetCustomerGroupAction> {

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public StagedOrderSetCustomerGroupActionBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public StagedOrderSetCustomerGroupActionBuilder withCustomerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public StagedOrderSetCustomerGroupActionBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return customerGroup
     */

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     * builds StagedOrderSetCustomerGroupAction with checking for non-null required values
     * @return StagedOrderSetCustomerGroupAction
     */
    public StagedOrderSetCustomerGroupAction build() {
        return new StagedOrderSetCustomerGroupActionImpl(customerGroup);
    }

    /**
     * builds StagedOrderSetCustomerGroupAction without checking for non-null required values
     * @return StagedOrderSetCustomerGroupAction
     */
    public StagedOrderSetCustomerGroupAction buildUnchecked() {
        return new StagedOrderSetCustomerGroupActionImpl(customerGroup);
    }

    /**
     * factory method for an instance of StagedOrderSetCustomerGroupActionBuilder
     * @return builder
     */
    public static StagedOrderSetCustomerGroupActionBuilder of() {
        return new StagedOrderSetCustomerGroupActionBuilder();
    }

    /**
     * create builder for StagedOrderSetCustomerGroupAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetCustomerGroupActionBuilder of(final StagedOrderSetCustomerGroupAction template) {
        StagedOrderSetCustomerGroupActionBuilder builder = new StagedOrderSetCustomerGroupActionBuilder();
        builder.customerGroup = template.getCustomerGroup();
        return builder;
    }

}
