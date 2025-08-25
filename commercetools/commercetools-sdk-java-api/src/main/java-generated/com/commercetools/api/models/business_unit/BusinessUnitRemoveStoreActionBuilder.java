
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> to remove.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public BusinessUnitRemoveStoreActionBuilder store(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> to remove.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public BusinessUnitRemoveStoreActionBuilder withStore(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> to remove.</p>
     * @param store value to be set
     * @return Builder
     */

    public BusinessUnitRemoveStoreActionBuilder store(
            final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> to remove.</p>
     * @return store
     */

    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    /**
     * builds BusinessUnitRemoveStoreAction with checking for non-null required values
     * @return BusinessUnitRemoveStoreAction
     */
    public BusinessUnitRemoveStoreAction build() {
        Objects.requireNonNull(store, BusinessUnitRemoveStoreAction.class + ": store is missing");
        return new BusinessUnitRemoveStoreActionImpl(store);
    }

    /**
     * builds BusinessUnitRemoveStoreAction without checking for non-null required values
     * @return BusinessUnitRemoveStoreAction
     */
    public BusinessUnitRemoveStoreAction buildUnchecked() {
        return new BusinessUnitRemoveStoreActionImpl(store);
    }

    /**
     * factory method for an instance of BusinessUnitRemoveStoreActionBuilder
     * @return builder
     */
    public static BusinessUnitRemoveStoreActionBuilder of() {
        return new BusinessUnitRemoveStoreActionBuilder();
    }

    /**
     * create builder for BusinessUnitRemoveStoreAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitRemoveStoreActionBuilder of(final BusinessUnitRemoveStoreAction template) {
        BusinessUnitRemoveStoreActionBuilder builder = new BusinessUnitRemoveStoreActionBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
