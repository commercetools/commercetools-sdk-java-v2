
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerSetCustomerGroupActionBuilder implements Builder<CustomerSetCustomerGroupAction> {

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    public CustomerSetCustomerGroupActionBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of())
                .build();
        return this;
    }

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

    /**
     * builds CustomerSetCustomerGroupAction without checking for non null required values
     */
    public CustomerSetCustomerGroupAction buildUnchecked() {
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
