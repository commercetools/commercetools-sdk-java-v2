
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetCustomerGroupActionBuilder {

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    public CartSetCustomerGroupActionBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    public CartSetCustomerGroupAction build() {
        return new CartSetCustomerGroupActionImpl(customerGroup);
    }

    public static CartSetCustomerGroupActionBuilder of() {
        return new CartSetCustomerGroupActionBuilder();
    }

    public static CartSetCustomerGroupActionBuilder of(final CartSetCustomerGroupAction template) {
        CartSetCustomerGroupActionBuilder builder = new CartSetCustomerGroupActionBuilder();
        builder.customerGroup = template.getCustomerGroup();
        return builder;
    }

}
