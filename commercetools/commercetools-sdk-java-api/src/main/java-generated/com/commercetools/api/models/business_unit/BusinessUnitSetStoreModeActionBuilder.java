
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitSetStoreModeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSetStoreModeAction businessUnitSetStoreModeAction = BusinessUnitSetStoreModeAction.builder()
 *             .storeMode(BusinessUnitStoreMode.EXPLICIT)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitSetStoreModeActionBuilder implements Builder<BusinessUnitSetStoreModeAction> {

    private com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode;

    @Nullable
    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    /**
     *  <p>Set to <code>Explicit</code> to specify Stores for the Business Unit. Set to <code>FromParent</code> to inherit Stores from a parent.</p>
     * @param storeMode value to be set
     * @return Builder
     */

    public BusinessUnitSetStoreModeActionBuilder storeMode(
            final com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode) {
        this.storeMode = storeMode;
        return this;
    }

    /**
     *  <p>Set the Stores the Business Unit is associated with. Can only be set if <code>storeMode</code> is <code>Explicit</code>.</p>
     * @param stores value to be set
     * @return Builder
     */

    public BusinessUnitSetStoreModeActionBuilder stores(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Set the Stores the Business Unit is associated with. Can only be set if <code>storeMode</code> is <code>Explicit</code>.</p>
     * @param stores value to be set
     * @return Builder
     */

    public BusinessUnitSetStoreModeActionBuilder stores(
            @Nullable final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>Set the Stores the Business Unit is associated with. Can only be set if <code>storeMode</code> is <code>Explicit</code>.</p>
     * @param stores value to be set
     * @return Builder
     */

    public BusinessUnitSetStoreModeActionBuilder plusStores(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Set the Stores the Business Unit is associated with. Can only be set if <code>storeMode</code> is <code>Explicit</code>.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public BusinessUnitSetStoreModeActionBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Set the Stores the Business Unit is associated with. Can only be set if <code>storeMode</code> is <code>Explicit</code>.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public BusinessUnitSetStoreModeActionBuilder withStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    public com.commercetools.api.models.business_unit.BusinessUnitStoreMode getStoreMode() {
        return this.storeMode;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores() {
        return this.stores;
    }

    /**
     * builds BusinessUnitSetStoreModeAction with checking for non-null required values
     * @return BusinessUnitSetStoreModeAction
     */
    public BusinessUnitSetStoreModeAction build() {
        Objects.requireNonNull(storeMode, BusinessUnitSetStoreModeAction.class + ": storeMode is missing");
        return new BusinessUnitSetStoreModeActionImpl(storeMode, stores);
    }

    /**
     * builds BusinessUnitSetStoreModeAction without checking for non-null required values
     * @return BusinessUnitSetStoreModeAction
     */
    public BusinessUnitSetStoreModeAction buildUnchecked() {
        return new BusinessUnitSetStoreModeActionImpl(storeMode, stores);
    }

    public static BusinessUnitSetStoreModeActionBuilder of() {
        return new BusinessUnitSetStoreModeActionBuilder();
    }

    public static BusinessUnitSetStoreModeActionBuilder of(final BusinessUnitSetStoreModeAction template) {
        BusinessUnitSetStoreModeActionBuilder builder = new BusinessUnitSetStoreModeActionBuilder();
        builder.storeMode = template.getStoreMode();
        builder.stores = template.getStores();
        return builder;
    }

}
