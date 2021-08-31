
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerSetStoresActionBuilder implements Builder<CustomerSetStoresAction> {

    @Nullable
    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    public CustomerSetStoresActionBuilder stores(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    public CustomerSetStoresActionBuilder withStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    public CustomerSetStoresActionBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    public CustomerSetStoresActionBuilder stores(
            @Nullable final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
        return this;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores() {
        return this.stores;
    }

    public CustomerSetStoresAction build() {
        return new CustomerSetStoresActionImpl(stores);
    }

    /**
     * builds CustomerSetStoresAction without checking for non null required values
     */
    public CustomerSetStoresAction buildUnchecked() {
        return new CustomerSetStoresActionImpl(stores);
    }

    public static CustomerSetStoresActionBuilder of() {
        return new CustomerSetStoresActionBuilder();
    }

    public static CustomerSetStoresActionBuilder of(final CustomerSetStoresAction template) {
        CustomerSetStoresActionBuilder builder = new CustomerSetStoresActionBuilder();
        builder.stores = template.getStores();
        return builder;
    }

}
