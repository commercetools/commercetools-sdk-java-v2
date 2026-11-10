
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodRemoveStoreActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodRemoveStoreAction shippingMethodRemoveStoreAction = ShippingMethodRemoveStoreAction.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodRemoveStoreActionBuilder implements Builder<ShippingMethodRemoveStoreAction> {

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    /**
     *  <p>ResourceIdentifier of the Store to remove.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ShippingMethodRemoveStoreActionBuilder store(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Store to remove.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ShippingMethodRemoveStoreActionBuilder withStore(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Store to remove.</p>
     * @param store value to be set
     * @return Builder
     */

    public ShippingMethodRemoveStoreActionBuilder store(
            final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Store to remove.</p>
     * @return store
     */

    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    /**
     * builds ShippingMethodRemoveStoreAction with checking for non-null required values
     * @return ShippingMethodRemoveStoreAction
     */
    public ShippingMethodRemoveStoreAction build() {
        Objects.requireNonNull(store, ShippingMethodRemoveStoreAction.class + ": store is missing");
        return new ShippingMethodRemoveStoreActionImpl(store);
    }

    /**
     * builds ShippingMethodRemoveStoreAction without checking for non-null required values
     * @return ShippingMethodRemoveStoreAction
     */
    public ShippingMethodRemoveStoreAction buildUnchecked() {
        return new ShippingMethodRemoveStoreActionImpl(store);
    }

    /**
     * factory method for an instance of ShippingMethodRemoveStoreActionBuilder
     * @return builder
     */
    public static ShippingMethodRemoveStoreActionBuilder of() {
        return new ShippingMethodRemoveStoreActionBuilder();
    }

    /**
     * create builder for ShippingMethodRemoveStoreAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodRemoveStoreActionBuilder of(final ShippingMethodRemoveStoreAction template) {
        ShippingMethodRemoveStoreActionBuilder builder = new ShippingMethodRemoveStoreActionBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
