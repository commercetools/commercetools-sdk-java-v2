
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodSetStoresActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetStoresAction shippingMethodSetStoresAction = ShippingMethodSetStoresAction.builder()
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodSetStoresActionBuilder implements Builder<ShippingMethodSetStoresAction> {

    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    /**
     *  <p>ResourceIdentifiers of the Stores to set. Overrides the current list of Stores. If empty, any existing values are removed.</p>
     * @param stores value to be set
     * @return Builder
     */

    public ShippingMethodSetStoresActionBuilder stores(
            final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>ResourceIdentifiers of the Stores to set. Overrides the current list of Stores. If empty, any existing values are removed.</p>
     * @param stores value to be set
     * @return Builder
     */

    public ShippingMethodSetStoresActionBuilder stores(
            final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>ResourceIdentifiers of the Stores to set. Overrides the current list of Stores. If empty, any existing values are removed.</p>
     * @param stores value to be set
     * @return Builder
     */

    public ShippingMethodSetStoresActionBuilder plusStores(
            final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>ResourceIdentifiers of the Stores to set. Overrides the current list of Stores. If empty, any existing values are removed.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public ShippingMethodSetStoresActionBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ResourceIdentifiers of the Stores to set. Overrides the current list of Stores. If empty, any existing values are removed.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public ShippingMethodSetStoresActionBuilder withStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ResourceIdentifiers of the Stores to set. Overrides the current list of Stores. If empty, any existing values are removed.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public ShippingMethodSetStoresActionBuilder addStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        return plusStores(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>ResourceIdentifiers of the Stores to set. Overrides the current list of Stores. If empty, any existing values are removed.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public ShippingMethodSetStoresActionBuilder setStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        return stores(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>ResourceIdentifiers of the Stores to set. Overrides the current list of Stores. If empty, any existing values are removed.</p>
     * @return stores
     */

    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores() {
        return this.stores;
    }

    /**
     * builds ShippingMethodSetStoresAction with checking for non-null required values
     * @return ShippingMethodSetStoresAction
     */
    public ShippingMethodSetStoresAction build() {
        Objects.requireNonNull(stores, ShippingMethodSetStoresAction.class + ": stores is missing");
        return new ShippingMethodSetStoresActionImpl(stores);
    }

    /**
     * builds ShippingMethodSetStoresAction without checking for non-null required values
     * @return ShippingMethodSetStoresAction
     */
    public ShippingMethodSetStoresAction buildUnchecked() {
        return new ShippingMethodSetStoresActionImpl(stores);
    }

    /**
     * factory method for an instance of ShippingMethodSetStoresActionBuilder
     * @return builder
     */
    public static ShippingMethodSetStoresActionBuilder of() {
        return new ShippingMethodSetStoresActionBuilder();
    }

    /**
     * create builder for ShippingMethodSetStoresAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSetStoresActionBuilder of(final ShippingMethodSetStoresAction template) {
        ShippingMethodSetStoresActionBuilder builder = new ShippingMethodSetStoresActionBuilder();
        builder.stores = template.getStores();
        return builder;
    }

}
