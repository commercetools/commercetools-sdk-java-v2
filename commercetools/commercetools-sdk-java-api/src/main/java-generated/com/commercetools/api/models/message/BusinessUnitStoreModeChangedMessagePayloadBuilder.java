
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoreModeAction" rel="nofollow">Set Store Mode</a> update action.</p>
     * @param stores value to be set
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessagePayloadBuilder stores(
            final com.commercetools.api.models.store.StoreKeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoreModeAction" rel="nofollow">Set Store Mode</a> update action.</p>
     * @param stores value to be set
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessagePayloadBuilder stores(
            final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoreModeAction" rel="nofollow">Set Store Mode</a> update action.</p>
     * @param stores value to be set
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoreModeAction" rel="nofollow">Set Store Mode</a> update action.</p>
     * @param builder function to build the stores value
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoreModeAction" rel="nofollow">Set Store Mode</a> update action.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessagePayloadBuilder withStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoreModeAction" rel="nofollow">Set Store Mode</a> update action.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessagePayloadBuilder addStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        return plusStores(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()));
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoreModeAction" rel="nofollow">Set Store Mode</a> update action.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessagePayloadBuilder setStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        return stores(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()));
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitStoreMode" rel="nofollow">BusinessUnitStoreMode</a> of the Business Unit after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoreModeAction" rel="nofollow">Set Store Mode</a> update action.</p>
     * @param storeMode value to be set
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessagePayloadBuilder storeMode(
            final com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode) {
        this.storeMode = storeMode;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoreModeAction" rel="nofollow">Set Store Mode</a> update action.</p>
     * @param oldStores value to be set
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessagePayloadBuilder oldStores(
            final com.commercetools.api.models.store.StoreKeyReference... oldStores) {
        this.oldStores = new ArrayList<>(Arrays.asList(oldStores));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoreModeAction" rel="nofollow">Set Store Mode</a> update action.</p>
     * @param oldStores value to be set
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessagePayloadBuilder oldStores(
            final java.util.List<com.commercetools.api.models.store.StoreKeyReference> oldStores) {
        this.oldStores = oldStores;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoreModeAction" rel="nofollow">Set Store Mode</a> update action.</p>
     * @param oldStores value to be set
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoreModeAction" rel="nofollow">Set Store Mode</a> update action.</p>
     * @param builder function to build the oldStores value
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoreModeAction" rel="nofollow">Set Store Mode</a> update action.</p>
     * @param builder function to build the oldStores value
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessagePayloadBuilder withOldStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.oldStores = new ArrayList<>();
        this.oldStores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoreModeAction" rel="nofollow">Set Store Mode</a> update action.</p>
     * @param builder function to build the oldStores value
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessagePayloadBuilder addOldStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        return plusOldStores(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()));
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoreModeAction" rel="nofollow">Set Store Mode</a> update action.</p>
     * @param builder function to build the oldStores value
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessagePayloadBuilder setOldStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        return oldStores(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()));
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitStoreMode" rel="nofollow">BusinessUnitStoreMode</a> of the Business Unit before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoreModeAction" rel="nofollow">Set Store Mode</a> update action.</p>
     * @param oldStoreMode value to be set
     * @return Builder
     */

    public BusinessUnitStoreModeChangedMessagePayloadBuilder oldStoreMode(
            final com.commercetools.api.models.business_unit.BusinessUnitStoreMode oldStoreMode) {
        this.oldStoreMode = oldStoreMode;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoreModeAction" rel="nofollow">Set Store Mode</a> update action.</p>
     * @return stores
     */

    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getStores() {
        return this.stores;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitStoreMode" rel="nofollow">BusinessUnitStoreMode</a> of the Business Unit after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoreModeAction" rel="nofollow">Set Store Mode</a> update action.</p>
     * @return storeMode
     */

    public com.commercetools.api.models.business_unit.BusinessUnitStoreMode getStoreMode() {
        return this.storeMode;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoreModeAction" rel="nofollow">Set Store Mode</a> update action.</p>
     * @return oldStores
     */

    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getOldStores() {
        return this.oldStores;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitStoreMode" rel="nofollow">BusinessUnitStoreMode</a> of the Business Unit before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoreModeAction" rel="nofollow">Set Store Mode</a> update action.</p>
     * @return oldStoreMode
     */

    public com.commercetools.api.models.business_unit.BusinessUnitStoreMode getOldStoreMode() {
        return this.oldStoreMode;
    }

    /**
     * builds BusinessUnitStoreModeChangedMessagePayload with checking for non-null required values
     * @return BusinessUnitStoreModeChangedMessagePayload
     */
    public BusinessUnitStoreModeChangedMessagePayload build() {
        Objects.requireNonNull(stores, BusinessUnitStoreModeChangedMessagePayload.class + ": stores is missing");
        Objects.requireNonNull(storeMode, BusinessUnitStoreModeChangedMessagePayload.class + ": storeMode is missing");
        Objects.requireNonNull(oldStores, BusinessUnitStoreModeChangedMessagePayload.class + ": oldStores is missing");
        Objects.requireNonNull(oldStoreMode,
            BusinessUnitStoreModeChangedMessagePayload.class + ": oldStoreMode is missing");
        return new BusinessUnitStoreModeChangedMessagePayloadImpl(stores, storeMode, oldStores, oldStoreMode);
    }

    /**
     * builds BusinessUnitStoreModeChangedMessagePayload without checking for non-null required values
     * @return BusinessUnitStoreModeChangedMessagePayload
     */
    public BusinessUnitStoreModeChangedMessagePayload buildUnchecked() {
        return new BusinessUnitStoreModeChangedMessagePayloadImpl(stores, storeMode, oldStores, oldStoreMode);
    }

    /**
     * factory method for an instance of BusinessUnitStoreModeChangedMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitStoreModeChangedMessagePayloadBuilder of() {
        return new BusinessUnitStoreModeChangedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitStoreModeChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
