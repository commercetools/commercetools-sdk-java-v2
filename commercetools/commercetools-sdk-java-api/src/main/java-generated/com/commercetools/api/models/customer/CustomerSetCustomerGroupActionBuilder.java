
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerSetCustomerGroupActionBuilder {

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    public CustomerSetCustomerGroupActionBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    public CustomerSetCustomerGroupAction build() {
        return new CustomerSetCustomerGroupActionImpl(customerGroup);
    }

    public static CustomerSetCustomerGroupActionBuilder of() {
        return new CustomerSetCustomerGroupActionBuilder();
    }

    public static CustomerSetCustomerGroupActionBuilder of(final CustomerSetCustomerGroupAction template) {
        CustomerSetCustomerGroupActionBuilder builder = new CustomerSetCustomerGroupActionBuilder();
        builder.customerGroup = template.getCustomerGroup();
        return builder;
    }

}
