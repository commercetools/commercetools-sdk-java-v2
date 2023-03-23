
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitStoresSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitStoresSetMessagePayload businessUnitStoresSetMessagePayload = BusinessUnitStoresSetMessagePayload.builder()
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitStoresSetMessagePayloadBuilder implements Builder<BusinessUnitStoresSetMessagePayload> {

    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores;

    /**
     *  <p>Stores of the Business Unit after the Set Stores update action.</p>
     * @param stores
     * @return Builder
     */

    public BusinessUnitStoresSetMessagePayloadBuilder stores(
            final com.commercetools.api.models.store.StoreKeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Stores of the Business Unit after the Set Stores update action.</p>
     * @param stores
     * @return Builder
     */

    public BusinessUnitStoresSetMessagePayloadBuilder stores(
            final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>Stores of the Business Unit after the Set Stores update action.</p>
     * @param stores
     * @return Builder
     */

    public BusinessUnitStoresSetMessagePayloadBuilder plusStores(
            final com.commercetools.api.models.store.StoreKeyReference... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Stores of the Business Unit after the Set Stores update action.</p>
     * @return Builder
     */

    public BusinessUnitStoresSetMessagePayloadBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Stores of the Business Unit after the Set Stores update action.</p>
     * @return Builder
     */

    public BusinessUnitStoresSetMessagePayloadBuilder withStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getStores() {
        return this.stores;
    }

    public BusinessUnitStoresSetMessagePayload build() {
        Objects.requireNonNull(stores, BusinessUnitStoresSetMessagePayload.class + ": stores is missing");
        return new BusinessUnitStoresSetMessagePayloadImpl(stores);
    }

    /**
     * builds BusinessUnitStoresSetMessagePayload without checking for non null required values
     */
    public BusinessUnitStoresSetMessagePayload buildUnchecked() {
        return new BusinessUnitStoresSetMessagePayloadImpl(stores);
    }

    public static BusinessUnitStoresSetMessagePayloadBuilder of() {
        return new BusinessUnitStoresSetMessagePayloadBuilder();
    }

    public static BusinessUnitStoresSetMessagePayloadBuilder of(final BusinessUnitStoresSetMessagePayload template) {
        BusinessUnitStoresSetMessagePayloadBuilder builder = new BusinessUnitStoresSetMessagePayloadBuilder();
        builder.stores = template.getStores();
        return builder;
    }

}
