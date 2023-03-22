
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitSetStoresActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSetStoresAction businessUnitSetStoresAction = BusinessUnitSetStoresAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitSetStoresActionBuilder implements Builder<BusinessUnitSetStoresAction> {

    @Nullable
    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    /**
     *  <p>Stores to set. Overrides the current list of Stores.</p>
     * @param stores
     * @return Builder
     */

    public BusinessUnitSetStoresActionBuilder stores(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Stores to set. Overrides the current list of Stores.</p>
     * @param stores
     * @return Builder
     */

    public BusinessUnitSetStoresActionBuilder stores(
            @Nullable final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>Stores to set. Overrides the current list of Stores.</p>
     * @param stores
     * @return Builder
     */

    public BusinessUnitSetStoresActionBuilder plusStores(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Stores to set. Overrides the current list of Stores.</p>
     * @return Builder
     */

    public BusinessUnitSetStoresActionBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Stores to set. Overrides the current list of Stores.</p>
     * @return Builder
     */

    public BusinessUnitSetStoresActionBuilder withStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores() {
        return this.stores;
    }

    public BusinessUnitSetStoresAction build() {
        return new BusinessUnitSetStoresActionImpl(stores);
    }

    /**
     * builds BusinessUnitSetStoresAction without checking for non null required values
     */
    public BusinessUnitSetStoresAction buildUnchecked() {
        return new BusinessUnitSetStoresActionImpl(stores);
    }

    public static BusinessUnitSetStoresActionBuilder of() {
        return new BusinessUnitSetStoresActionBuilder();
    }

    public static BusinessUnitSetStoresActionBuilder of(final BusinessUnitSetStoresAction template) {
        BusinessUnitSetStoresActionBuilder builder = new BusinessUnitSetStoresActionBuilder();
        builder.stores = template.getStores();
        return builder;
    }

}
