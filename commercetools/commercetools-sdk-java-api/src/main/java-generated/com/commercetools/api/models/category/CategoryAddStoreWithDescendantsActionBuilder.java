
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryAddStoreWithDescendantsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryAddStoreWithDescendantsAction categoryAddStoreWithDescendantsAction = CategoryAddStoreWithDescendantsAction.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryAddStoreWithDescendantsActionBuilder implements Builder<CategoryAddStoreWithDescendantsAction> {

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    /**
     *  <p>Value to add to the <code>stores</code> of the Category and each of its descendant Categories.</p>
     *  <p>If the Store doesn't exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and the Store isn't one of them, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     *  <p>If the Category isn't assigned to any Store and one of its descendant Categories is assigned to a different Store, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public CategoryAddStoreWithDescendantsActionBuilder store(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to add to the <code>stores</code> of the Category and each of its descendant Categories.</p>
     *  <p>If the Store doesn't exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and the Store isn't one of them, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     *  <p>If the Category isn't assigned to any Store and one of its descendant Categories is assigned to a different Store, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public CategoryAddStoreWithDescendantsActionBuilder withStore(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Value to add to the <code>stores</code> of the Category and each of its descendant Categories.</p>
     *  <p>If the Store doesn't exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and the Store isn't one of them, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     *  <p>If the Category isn't assigned to any Store and one of its descendant Categories is assigned to a different Store, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param store value to be set
     * @return Builder
     */

    public CategoryAddStoreWithDescendantsActionBuilder store(
            final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>Value to add to the <code>stores</code> of the Category and each of its descendant Categories.</p>
     *  <p>If the Store doesn't exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and the Store isn't one of them, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     *  <p>If the Category isn't assigned to any Store and one of its descendant Categories is assigned to a different Store, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @return store
     */

    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    /**
     * builds CategoryAddStoreWithDescendantsAction with checking for non-null required values
     * @return CategoryAddStoreWithDescendantsAction
     */
    public CategoryAddStoreWithDescendantsAction build() {
        Objects.requireNonNull(store, CategoryAddStoreWithDescendantsAction.class + ": store is missing");
        return new CategoryAddStoreWithDescendantsActionImpl(store);
    }

    /**
     * builds CategoryAddStoreWithDescendantsAction without checking for non-null required values
     * @return CategoryAddStoreWithDescendantsAction
     */
    public CategoryAddStoreWithDescendantsAction buildUnchecked() {
        return new CategoryAddStoreWithDescendantsActionImpl(store);
    }

    /**
     * factory method for an instance of CategoryAddStoreWithDescendantsActionBuilder
     * @return builder
     */
    public static CategoryAddStoreWithDescendantsActionBuilder of() {
        return new CategoryAddStoreWithDescendantsActionBuilder();
    }

    /**
     * create builder for CategoryAddStoreWithDescendantsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryAddStoreWithDescendantsActionBuilder of(
            final CategoryAddStoreWithDescendantsAction template) {
        CategoryAddStoreWithDescendantsActionBuilder builder = new CategoryAddStoreWithDescendantsActionBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
