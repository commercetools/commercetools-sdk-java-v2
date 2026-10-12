
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryAddStoreActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryAddStoreAction categoryAddStoreAction = CategoryAddStoreAction.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryAddStoreActionBuilder implements Builder<CategoryAddStoreAction> {

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    /**
     *  <p>Value to add to the Category's <code>stores</code>.</p>
     *  <p>When called through an <span>in-Store endpoint</span>, the caller must have permission for the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public CategoryAddStoreActionBuilder store(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to add to the Category's <code>stores</code>.</p>
     *  <p>When called through an <span>in-Store endpoint</span>, the caller must have permission for the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public CategoryAddStoreActionBuilder withStore(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Value to add to the Category's <code>stores</code>.</p>
     *  <p>When called through an <span>in-Store endpoint</span>, the caller must have permission for the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @param store value to be set
     * @return Builder
     */

    public CategoryAddStoreActionBuilder store(final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>Value to add to the Category's <code>stores</code>.</p>
     *  <p>When called through an <span>in-Store endpoint</span>, the caller must have permission for the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @return store
     */

    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    /**
     * builds CategoryAddStoreAction with checking for non-null required values
     * @return CategoryAddStoreAction
     */
    public CategoryAddStoreAction build() {
        Objects.requireNonNull(store, CategoryAddStoreAction.class + ": store is missing");
        return new CategoryAddStoreActionImpl(store);
    }

    /**
     * builds CategoryAddStoreAction without checking for non-null required values
     * @return CategoryAddStoreAction
     */
    public CategoryAddStoreAction buildUnchecked() {
        return new CategoryAddStoreActionImpl(store);
    }

    /**
     * factory method for an instance of CategoryAddStoreActionBuilder
     * @return builder
     */
    public static CategoryAddStoreActionBuilder of() {
        return new CategoryAddStoreActionBuilder();
    }

    /**
     * create builder for CategoryAddStoreAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryAddStoreActionBuilder of(final CategoryAddStoreAction template) {
        CategoryAddStoreActionBuilder builder = new CategoryAddStoreActionBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
