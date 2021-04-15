
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListStoreSetMessagePayloadBuilder {

    private com.commercetools.api.models.store.StoreKeyReference store;

    public ShoppingListStoreSetMessagePayloadBuilder store(
            final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    public ShoppingListStoreSetMessagePayload build() {
        return new ShoppingListStoreSetMessagePayloadImpl(store);
    }

    public static ShoppingListStoreSetMessagePayloadBuilder of() {
        return new ShoppingListStoreSetMessagePayloadBuilder();
    }

    public static ShoppingListStoreSetMessagePayloadBuilder of(final ShoppingListStoreSetMessagePayload template) {
        ShoppingListStoreSetMessagePayloadBuilder builder = new ShoppingListStoreSetMessagePayloadBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
