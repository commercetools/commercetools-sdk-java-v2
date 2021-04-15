
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetCustomerGroupActionBuilder {

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

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

    public static StagedOrderSetCustomerGroupActionBuilder of() {
        return new StagedOrderSetCustomerGroupActionBuilder();
    }

    public static StagedOrderSetCustomerGroupActionBuilder of(final StagedOrderSetCustomerGroupAction template) {
        StagedOrderSetCustomerGroupActionBuilder builder = new StagedOrderSetCustomerGroupActionBuilder();
        builder.customerGroup = template.getCustomerGroup();
        return builder;
    }

}
