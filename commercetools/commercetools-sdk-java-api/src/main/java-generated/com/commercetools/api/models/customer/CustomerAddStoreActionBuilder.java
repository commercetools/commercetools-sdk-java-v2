
package com.commercetools.api.models.customer;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerAddStoreActionBuilder {

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    public CustomerAddStoreActionBuilder store(final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    public CustomerAddStoreAction build() {
        return new CustomerAddStoreActionImpl(store);
    }

    public static CustomerAddStoreActionBuilder of() {
        return new CustomerAddStoreActionBuilder();
    }

    public static CustomerAddStoreActionBuilder of(final CustomerAddStoreAction template) {
        CustomerAddStoreActionBuilder builder = new CustomerAddStoreActionBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
