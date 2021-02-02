
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetStoreActionBuilder {

    @Nullable
    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    public OrderSetStoreActionBuilder store(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    public OrderSetStoreAction build() {
        return new OrderSetStoreActionImpl(store);
    }

    public static OrderSetStoreActionBuilder of() {
        return new OrderSetStoreActionBuilder();
    }

    public static OrderSetStoreActionBuilder of(final OrderSetStoreAction template) {
        OrderSetStoreActionBuilder builder = new OrderSetStoreActionBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
