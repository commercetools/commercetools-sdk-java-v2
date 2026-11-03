
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryRemoveStoreWithDescendantsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryRemoveStoreWithDescendantsAction categoryRemoveStoreWithDescendantsAction = CategoryRemoveStoreWithDescendantsAction.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryRemoveStoreWithDescendantsActionBuilder
        implements Builder<CategoryRemoveStoreWithDescendantsAction> {

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    /**
     *  <p>Value to remove from the <code>stores</code> of the Category and each of its descendant Categories.</p>
     *  <p>If the Store doesn't exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     *  <p>If removing the Store leaves the Category without Stores while its parent Category is assigned to Stores, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     *  <p>If the Store is the only Store of a descendant Category that would then be left without any Store while its parent Category is still assigned to Stores, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public CategoryRemoveStoreWithDescendantsActionBuilder store(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to remove from the <code>stores</code> of the Category and each of its descendant Categories.</p>
     *  <p>If the Store doesn't exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     *  <p>If removing the Store leaves the Category without Stores while its parent Category is assigned to Stores, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     *  <p>If the Store is the only Store of a descendant Category that would then be left without any Store while its parent Category is still assigned to Stores, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public CategoryRemoveStoreWithDescendantsActionBuilder withStore(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Value to remove from the <code>stores</code> of the Category and each of its descendant Categories.</p>
     *  <p>If the Store doesn't exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     *  <p>If removing the Store leaves the Category without Stores while its parent Category is assigned to Stores, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     *  <p>If the Store is the only Store of a descendant Category that would then be left without any Store while its parent Category is still assigned to Stores, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param store value to be set
     * @return Builder
     */

    public CategoryRemoveStoreWithDescendantsActionBuilder store(
            final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>Value to remove from the <code>stores</code> of the Category and each of its descendant Categories.</p>
     *  <p>If the Store doesn't exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     *  <p>If removing the Store leaves the Category without Stores while its parent Category is assigned to Stores, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     *  <p>If the Store is the only Store of a descendant Category that would then be left without any Store while its parent Category is still assigned to Stores, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @return store
     */

    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    /**
     * builds CategoryRemoveStoreWithDescendantsAction with checking for non-null required values
     * @return CategoryRemoveStoreWithDescendantsAction
     */
    public CategoryRemoveStoreWithDescendantsAction build() {
        Objects.requireNonNull(store, CategoryRemoveStoreWithDescendantsAction.class + ": store is missing");
        return new CategoryRemoveStoreWithDescendantsActionImpl(store);
    }

    /**
     * builds CategoryRemoveStoreWithDescendantsAction without checking for non-null required values
     * @return CategoryRemoveStoreWithDescendantsAction
     */
    public CategoryRemoveStoreWithDescendantsAction buildUnchecked() {
        return new CategoryRemoveStoreWithDescendantsActionImpl(store);
    }

    /**
     * factory method for an instance of CategoryRemoveStoreWithDescendantsActionBuilder
     * @return builder
     */
    public static CategoryRemoveStoreWithDescendantsActionBuilder of() {
        return new CategoryRemoveStoreWithDescendantsActionBuilder();
    }

    /**
     * create builder for CategoryRemoveStoreWithDescendantsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryRemoveStoreWithDescendantsActionBuilder of(
            final CategoryRemoveStoreWithDescendantsAction template) {
        CategoryRemoveStoreWithDescendantsActionBuilder builder = new CategoryRemoveStoreWithDescendantsActionBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
