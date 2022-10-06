
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitRemoveStoreActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitRemoveStoreAction businessUnitRemoveStoreAction = BusinessUnitRemoveStoreAction.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitRemoveStoreActionBuilder implements Builder<BusinessUnitRemoveStoreAction> {

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    /**
     *  <p>Store to remove.</p>
     */

    public BusinessUnitRemoveStoreActionBuilder store(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Store to remove.</p>
     */

    public BusinessUnitRemoveStoreActionBuilder store(
            final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    public BusinessUnitRemoveStoreAction build() {
        Objects.requireNonNull(store, BusinessUnitRemoveStoreAction.class + ": store is missing");
        return new BusinessUnitRemoveStoreActionImpl(store);
    }

    /**
     * builds BusinessUnitRemoveStoreAction without checking for non null required values
     */
    public BusinessUnitRemoveStoreAction buildUnchecked() {
        return new BusinessUnitRemoveStoreActionImpl(store);
    }

    public static BusinessUnitRemoveStoreActionBuilder of() {
        return new BusinessUnitRemoveStoreActionBuilder();
    }

    public static BusinessUnitRemoveStoreActionBuilder of(final BusinessUnitRemoveStoreAction template) {
        BusinessUnitRemoveStoreActionBuilder builder = new BusinessUnitRemoveStoreActionBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
