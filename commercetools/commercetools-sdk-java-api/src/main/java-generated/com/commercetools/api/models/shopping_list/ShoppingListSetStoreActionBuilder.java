
package com.commercetools.api.models.shopping_list;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListSetStoreActionBuilder implements Builder<ShoppingListSetStoreAction> {

    @Nullable
    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    public ShoppingListSetStoreActionBuilder store(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    public ShoppingListSetStoreAction build() {
        return new ShoppingListSetStoreActionImpl(store);
    }

    /**
     * builds ShoppingListSetStoreAction without checking for non null required values
     */
    public ShoppingListSetStoreAction buildUnchecked() {
        return new ShoppingListSetStoreActionImpl(store);
    }

    public static ShoppingListSetStoreActionBuilder of() {
        return new ShoppingListSetStoreActionBuilder();
    }

    public static ShoppingListSetStoreActionBuilder of(final ShoppingListSetStoreAction template) {
        ShoppingListSetStoreActionBuilder builder = new ShoppingListSetStoreActionBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
