
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderStoreSetMessagePayloadBuilder {

    private com.commercetools.api.models.store.StoreKeyReference store;

    public OrderStoreSetMessagePayloadBuilder store(final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    public OrderStoreSetMessagePayload build() {
        return new OrderStoreSetMessagePayloadImpl(store);
    }

    public static OrderStoreSetMessagePayloadBuilder of() {
        return new OrderStoreSetMessagePayloadBuilder();
    }

    public static OrderStoreSetMessagePayloadBuilder of(final OrderStoreSetMessagePayload template) {
        OrderStoreSetMessagePayloadBuilder builder = new OrderStoreSetMessagePayloadBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
