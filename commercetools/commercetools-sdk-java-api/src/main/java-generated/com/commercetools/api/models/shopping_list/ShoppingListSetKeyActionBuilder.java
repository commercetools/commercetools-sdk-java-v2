
package com.commercetools.api.models.shopping_list;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListSetKeyActionBuilder implements Builder<ShoppingListSetKeyAction> {

    @Nullable
    private String key;

    public ShoppingListSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public ShoppingListSetKeyAction build() {
        return new ShoppingListSetKeyActionImpl(key);
    }

    /**
     * builds ShoppingListSetKeyAction without checking for non null required values
     */
    public ShoppingListSetKeyAction buildUnchecked() {
        return new ShoppingListSetKeyActionImpl(key);
    }

    public static ShoppingListSetKeyActionBuilder of() {
        return new ShoppingListSetKeyActionBuilder();
    }

    public static ShoppingListSetKeyActionBuilder of(final ShoppingListSetKeyAction template) {
        ShoppingListSetKeyActionBuilder builder = new ShoppingListSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
