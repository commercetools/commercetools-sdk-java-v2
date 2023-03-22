
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitStoreModeChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitStoreModeChangedMessagePayload businessUnitStoreModeChangedMessagePayload = BusinessUnitStoreModeChangedMessagePayload.builder()
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .storeMode(BusinessUnitStoreMode.EXPLICIT)
 *             .plusOldStores(oldStoresBuilder -> oldStoresBuilder)
 *             .oldStoreMode(BusinessUnitStoreMode.EXPLICIT)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitStoreModeChangedMessagePayloadBuilder
        implements Builder<BusinessUnitStoreModeChangedMessagePayload> {

    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores;

    private com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode;

    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> oldStores;

    private com.commercetools.api.models.business_unit.BusinessUnitStoreMode oldStoreMode;

    /**
     *  <p>Stores of the Business Unit after the Set Store Mode update action.</p>
     * @param stores
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessagePayloadBuilder stores(
            final com.commercetools.api.models.store.StoreKeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Stores of the Business Unit after the Set Store Mode update action.</p>
     * @param stores
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessagePayloadBuilder stores(
            final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>Stores of the Business Unit after the Set Store Mode update action.</p>
     * @param stores
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessagePayloadBuilder plusStores(
            final com.commercetools.api.models.store.StoreKeyReference... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Stores of the Business Unit after the Set Store Mode update action.</p>
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessagePayloadBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Stores of the Business Unit after the Set Store Mode update action.</p>
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessagePayloadBuilder withStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>BusinessUnitStoreMode of the Business Unit after the Set Store Mode update action.</p>
     * @param storeMode
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessagePayloadBuilder storeMode(
            final com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode) {
        this.storeMode = storeMode;
        return this;
    }

    /**
     *  <p>Stores of the Business Unit before the Set Store Mode update action.</p>
     * @param oldStores
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessagePayloadBuilder oldStores(
            final com.commercetools.api.models.store.StoreKeyReference... oldStores) {
        this.oldStores = new ArrayList<>(Arrays.asList(oldStores));
        return this;
    }

    /**
     *  <p>Stores of the Business Unit before the Set Store Mode update action.</p>
     * @param oldStores
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessagePayloadBuilder oldStores(
            final java.util.List<com.commercetools.api.models.store.StoreKeyReference> oldStores) {
        this.oldStores = oldStores;
        return this;
    }

    /**
     *  <p>Stores of the Business Unit before the Set Store Mode update action.</p>
     * @param oldStores
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessagePayloadBuilder plusOldStores(
            final com.commercetools.api.models.store.StoreKeyReference... oldStores) {
        if (this.oldStores == null) {
            this.oldStores = new ArrayList<>();
        }
        this.oldStores.addAll(Arrays.asList(oldStores));
        return this;
    }

    /**
     *  <p>Stores of the Business Unit before the Set Store Mode update action.</p>
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessagePayloadBuilder plusOldStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        if (this.oldStores == null) {
            this.oldStores = new ArrayList<>();
        }
        this.oldStores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Stores of the Business Unit before the Set Store Mode update action.</p>
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessagePayloadBuilder withOldStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.oldStores = new ArrayList<>();
        this.oldStores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>BusinessUnitStoreMode of the Business Unit before the Set Store Mode update action.</p>
     * @param oldStoreMode
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessagePayloadBuilder oldStoreMode(
            final com.commercetools.api.models.business_unit.BusinessUnitStoreMode oldStoreMode) {
        this.oldStoreMode = oldStoreMode;
        return this;
    }

    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getStores() {
        return this.stores;
    }

    public com.commercetools.api.models.business_unit.BusinessUnitStoreMode getStoreMode() {
        return this.storeMode;
    }

    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getOldStores() {
        return this.oldStores;
    }

    public com.commercetools.api.models.business_unit.BusinessUnitStoreMode getOldStoreMode() {
        return this.oldStoreMode;
    }

    public BusinessUnitStoreModeChangedMessagePayload build() {
        Objects.requireNonNull(stores, BusinessUnitStoreModeChangedMessagePayload.class + ": stores is missing");
        Objects.requireNonNull(storeMode, BusinessUnitStoreModeChangedMessagePayload.class + ": storeMode is missing");
        Objects.requireNonNull(oldStores, BusinessUnitStoreModeChangedMessagePayload.class + ": oldStores is missing");
        Objects.requireNonNull(oldStoreMode,
            BusinessUnitStoreModeChangedMessagePayload.class + ": oldStoreMode is missing");
        return new BusinessUnitStoreModeChangedMessagePayloadImpl(stores, storeMode, oldStores, oldStoreMode);
    }

    /**
     * builds BusinessUnitStoreModeChangedMessagePayload without checking for non null required values
     */
    public BusinessUnitStoreModeChangedMessagePayload buildUnchecked() {
        return new BusinessUnitStoreModeChangedMessagePayloadImpl(stores, storeMode, oldStores, oldStoreMode);
    }

    public static BusinessUnitStoreModeChangedMessagePayloadBuilder of() {
        return new BusinessUnitStoreModeChangedMessagePayloadBuilder();
    }

    public static BusinessUnitStoreModeChangedMessagePayloadBuilder of(
            final BusinessUnitStoreModeChangedMessagePayload template) {
        BusinessUnitStoreModeChangedMessagePayloadBuilder builder = new BusinessUnitStoreModeChangedMessagePayloadBuilder();
        builder.stores = template.getStores();
        builder.storeMode = template.getStoreMode();
        builder.oldStores = template.getOldStores();
        builder.oldStoreMode = template.getOldStoreMode();
        return builder;
    }

}
