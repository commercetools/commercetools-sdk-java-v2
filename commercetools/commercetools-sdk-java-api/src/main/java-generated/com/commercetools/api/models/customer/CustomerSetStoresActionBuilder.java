
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetStoresActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetStoresAction customerSetStoresAction = CustomerSetStoresAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSetStoresActionBuilder implements Builder<CustomerSetStoresAction> {

    @Nullable
    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    /**
     *  <p>ResourceIdentifier of the Stores to set.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CustomerSetStoresActionBuilder stores(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Stores to set.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CustomerSetStoresActionBuilder stores(
            @Nullable final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Stores to set.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CustomerSetStoresActionBuilder plusStores(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
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

    @Nullable
    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores() {
        return this.stores;
    }

    /**
     * builds CustomerSetStoresAction with checking for non-null required values
     * @return CustomerSetStoresAction
     */
    public CustomerSetStoresAction build() {
        return new CustomerSetStoresActionImpl(stores);
    }

    /**
     * builds CustomerSetStoresAction without checking for non-null required values
     * @return CustomerSetStoresAction
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
