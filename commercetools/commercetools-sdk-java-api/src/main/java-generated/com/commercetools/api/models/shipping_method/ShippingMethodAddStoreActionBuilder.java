
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodAddStoreActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodAddStoreAction shippingMethodAddStoreAction = ShippingMethodAddStoreAction.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodAddStoreActionBuilder implements Builder<ShippingMethodAddStoreAction> {

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    /**
     *  <p>ResourceIdentifier of the Store to add.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ShippingMethodAddStoreActionBuilder store(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Store to add.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ShippingMethodAddStoreActionBuilder withStore(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Store to add.</p>
     * @param store value to be set
     * @return Builder
     */

    public ShippingMethodAddStoreActionBuilder store(
            final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Store to add.</p>
     * @return store
     */

    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    /**
     * builds ShippingMethodAddStoreAction with checking for non-null required values
     * @return ShippingMethodAddStoreAction
     */
    public ShippingMethodAddStoreAction build() {
        Objects.requireNonNull(store, ShippingMethodAddStoreAction.class + ": store is missing");
        return new ShippingMethodAddStoreActionImpl(store);
    }

    /**
     * builds ShippingMethodAddStoreAction without checking for non-null required values
     * @return ShippingMethodAddStoreAction
     */
    public ShippingMethodAddStoreAction buildUnchecked() {
        return new ShippingMethodAddStoreActionImpl(store);
    }

    /**
     * factory method for an instance of ShippingMethodAddStoreActionBuilder
     * @return builder
     */
    public static ShippingMethodAddStoreActionBuilder of() {
        return new ShippingMethodAddStoreActionBuilder();
    }

    /**
     * create builder for ShippingMethodAddStoreAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodAddStoreActionBuilder of(final ShippingMethodAddStoreAction template) {
        ShippingMethodAddStoreActionBuilder builder = new ShippingMethodAddStoreActionBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
