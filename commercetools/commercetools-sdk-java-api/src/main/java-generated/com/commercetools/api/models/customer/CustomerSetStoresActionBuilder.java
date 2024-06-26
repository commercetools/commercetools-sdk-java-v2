
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetStoresActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetStoresAction customerSetStoresAction = CustomerSetStoresAction.builder()
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSetStoresActionBuilder implements Builder<CustomerSetStoresAction> {

    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    /**
     *  <p>ResourceIdentifier of the Stores to set.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CustomerSetStoresActionBuilder stores(
            final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Stores to set.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CustomerSetStoresActionBuilder stores(
            final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Stores to set.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CustomerSetStoresActionBuilder plusStores(
            final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Stores to set.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CustomerSetStoresActionBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Stores to set.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CustomerSetStoresActionBuilder withStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Stores to set.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CustomerSetStoresActionBuilder addStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        return plusStores(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>ResourceIdentifier of the Stores to set.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CustomerSetStoresActionBuilder setStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        return stores(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>ResourceIdentifier of the Stores to set.</p>
     * @return stores
     */

    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores() {
        return this.stores;
    }

    /**
     * builds CustomerSetStoresAction with checking for non-null required values
     * @return CustomerSetStoresAction
     */
    public CustomerSetStoresAction build() {
        Objects.requireNonNull(stores, CustomerSetStoresAction.class + ": stores is missing");
        return new CustomerSetStoresActionImpl(stores);
    }

    /**
     * builds CustomerSetStoresAction without checking for non-null required values
     * @return CustomerSetStoresAction
     */
    public CustomerSetStoresAction buildUnchecked() {
        return new CustomerSetStoresActionImpl(stores);
    }

    /**
     * factory method for an instance of CustomerSetStoresActionBuilder
     * @return builder
     */
    public static CustomerSetStoresActionBuilder of() {
        return new CustomerSetStoresActionBuilder();
    }

    /**
     * create builder for CustomerSetStoresAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetStoresActionBuilder of(final CustomerSetStoresAction template) {
        CustomerSetStoresActionBuilder builder = new CustomerSetStoresActionBuilder();
        builder.stores = template.getStores();
        return builder;
    }

}
