
package com.commercetools.api.models.shopping_list;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListSetCustomerActionBuilder implements Builder<ShoppingListSetCustomerAction> {

    @Nullable
    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    public ShoppingListSetCustomerActionBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public ShoppingListSetCustomerActionBuilder customer(
            @Nullable final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer() {
        return this.customer;
    }

    public ShoppingListSetCustomerAction build() {
        return new ShoppingListSetCustomerActionImpl(customer);
    }

    /**
     * builds ShoppingListSetCustomerAction without checking for non null required values
     */
    public ShoppingListSetCustomerAction buildUnchecked() {
        return new ShoppingListSetCustomerActionImpl(customer);
    }

    public static ShoppingListSetCustomerActionBuilder of() {
        return new ShoppingListSetCustomerActionBuilder();
    }

    public static ShoppingListSetCustomerActionBuilder of(final ShoppingListSetCustomerAction template) {
        ShoppingListSetCustomerActionBuilder builder = new ShoppingListSetCustomerActionBuilder();
        builder.customer = template.getCustomer();
        return builder;
    }

}
