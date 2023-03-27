
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitAddStoreActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddStoreAction businessUnitAddStoreAction = BusinessUnitAddStoreAction.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAddStoreActionBuilder implements Builder<BusinessUnitAddStoreAction> {

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    /**
     *  <p>Store to add.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public BusinessUnitAddStoreActionBuilder store(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Store to add.</p>
     * @param store value to be set
     * @return Builder
     */

    public BusinessUnitAddStoreActionBuilder store(
            final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>Store to add.</p>
     * @return store
     */

    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    /**
     * builds BusinessUnitAddStoreAction with checking for non-null required values
     * @return BusinessUnitAddStoreAction
     */
    public BusinessUnitAddStoreAction build() {
        Objects.requireNonNull(store, BusinessUnitAddStoreAction.class + ": store is missing");
        return new BusinessUnitAddStoreActionImpl(store);
    }

    /**
     * builds BusinessUnitAddStoreAction without checking for non-null required values
     * @return BusinessUnitAddStoreAction
     */
    public BusinessUnitAddStoreAction buildUnchecked() {
        return new BusinessUnitAddStoreActionImpl(store);
    }

    /**
     * factory method for an instance of BusinessUnitAddStoreActionBuilder
     * @return builder
     */
    public static BusinessUnitAddStoreActionBuilder of() {
        return new BusinessUnitAddStoreActionBuilder();
    }

    /**
     * create builder for BusinessUnitAddStoreAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddStoreActionBuilder of(final BusinessUnitAddStoreAction template) {
        BusinessUnitAddStoreActionBuilder builder = new BusinessUnitAddStoreActionBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
