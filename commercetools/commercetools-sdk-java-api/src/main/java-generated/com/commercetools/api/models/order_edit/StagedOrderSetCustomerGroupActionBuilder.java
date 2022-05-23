
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
     <*  <p>ResourceIdentifier to a CustomerGroup.</p>>
     */

    public StagedOrderSetCustomerGroupActionBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     <*  <p>ResourceIdentifier to a CustomerGroup.</p>>
     */

    public StagedOrderSetCustomerGroupActionBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    public StagedOrderSetCustomerGroupAction build() {
        return new StagedOrderSetCustomerGroupActionImpl(customerGroup);
    }

    /**
     * builds StagedOrderSetCustomerGroupAction without checking for non null required values
     */
    public StagedOrderSetCustomerGroupAction buildUnchecked() {
        return new StagedOrderSetCustomerGroupActionImpl(customerGroup);
    }

    public static StagedOrderSetCustomerGroupActionBuilder of() {
        return new StagedOrderSetCustomerGroupActionBuilder();
    }

    public static StagedOrderSetCustomerGroupActionBuilder of(final StagedOrderSetCustomerGroupAction template) {
        StagedOrderSetCustomerGroupActionBuilder builder = new StagedOrderSetCustomerGroupActionBuilder();
        builder.customerGroup = template.getCustomerGroup();
        return builder;
    }

}
