
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryRemoveStoreActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryRemoveStoreAction categoryRemoveStoreAction = CategoryRemoveStoreAction.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryRemoveStoreActionBuilder implements Builder<CategoryRemoveStoreAction> {

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    /**
     *  <p>Value to remove from the Category's <code>stores</code>.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public CategoryRemoveStoreActionBuilder store(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to remove from the Category's <code>stores</code>.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public CategoryRemoveStoreActionBuilder withStore(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Value to remove from the Category's <code>stores</code>.</p>
     * @param store value to be set
     * @return Builder
     */

    public CategoryRemoveStoreActionBuilder store(
            final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>Value to remove from the Category's <code>stores</code>.</p>
     * @return store
     */

    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    /**
     * builds CategoryRemoveStoreAction with checking for non-null required values
     * @return CategoryRemoveStoreAction
     */
    public CategoryRemoveStoreAction build() {
        Objects.requireNonNull(store, CategoryRemoveStoreAction.class + ": store is missing");
        return new CategoryRemoveStoreActionImpl(store);
    }

    /**
     * builds CategoryRemoveStoreAction without checking for non-null required values
     * @return CategoryRemoveStoreAction
     */
    public CategoryRemoveStoreAction buildUnchecked() {
        return new CategoryRemoveStoreActionImpl(store);
    }

    /**
     * factory method for an instance of CategoryRemoveStoreActionBuilder
     * @return builder
     */
    public static CategoryRemoveStoreActionBuilder of() {
        return new CategoryRemoveStoreActionBuilder();
    }

    /**
     * create builder for CategoryRemoveStoreAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryRemoveStoreActionBuilder of(final CategoryRemoveStoreAction template) {
        CategoryRemoveStoreActionBuilder builder = new CategoryRemoveStoreActionBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
