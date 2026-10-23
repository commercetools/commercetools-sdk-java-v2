
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategorySetStoresWithDescendantsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetStoresWithDescendantsAction categorySetStoresWithDescendantsAction = CategorySetStoresWithDescendantsAction.builder()
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategorySetStoresWithDescendantsActionBuilder implements Builder<CategorySetStoresWithDescendantsAction> {

    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    /**
     *  <p>Value to set on the Category and each of its descendant Categories. It replaces the entire set of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> assigned to each Category in the subtree.</p>
     *  <p>If a Store doesn't exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and <code>stores</code> contains a Store the parent isn't assigned to, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and <code>stores</code> is empty, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CategorySetStoresWithDescendantsActionBuilder stores(
            final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Value to set on the Category and each of its descendant Categories. It replaces the entire set of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> assigned to each Category in the subtree.</p>
     *  <p>If a Store doesn't exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and <code>stores</code> contains a Store the parent isn't assigned to, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and <code>stores</code> is empty, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CategorySetStoresWithDescendantsActionBuilder stores(
            final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>Value to set on the Category and each of its descendant Categories. It replaces the entire set of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> assigned to each Category in the subtree.</p>
     *  <p>If a Store doesn't exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and <code>stores</code> contains a Store the parent isn't assigned to, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and <code>stores</code> is empty, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CategorySetStoresWithDescendantsActionBuilder plusStores(
            final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Value to set on the Category and each of its descendant Categories. It replaces the entire set of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> assigned to each Category in the subtree.</p>
     *  <p>If a Store doesn't exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and <code>stores</code> contains a Store the parent isn't assigned to, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and <code>stores</code> is empty, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CategorySetStoresWithDescendantsActionBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set on the Category and each of its descendant Categories. It replaces the entire set of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> assigned to each Category in the subtree.</p>
     *  <p>If a Store doesn't exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and <code>stores</code> contains a Store the parent isn't assigned to, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and <code>stores</code> is empty, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CategorySetStoresWithDescendantsActionBuilder withStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set on the Category and each of its descendant Categories. It replaces the entire set of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> assigned to each Category in the subtree.</p>
     *  <p>If a Store doesn't exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and <code>stores</code> contains a Store the parent isn't assigned to, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and <code>stores</code> is empty, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CategorySetStoresWithDescendantsActionBuilder addStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        return plusStores(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>Value to set on the Category and each of its descendant Categories. It replaces the entire set of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> assigned to each Category in the subtree.</p>
     *  <p>If a Store doesn't exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and <code>stores</code> contains a Store the parent isn't assigned to, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and <code>stores</code> is empty, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CategorySetStoresWithDescendantsActionBuilder setStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        return stores(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>Value to set on the Category and each of its descendant Categories. It replaces the entire set of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> assigned to each Category in the subtree.</p>
     *  <p>If a Store doesn't exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and <code>stores</code> contains a Store the parent isn't assigned to, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     *  <p>If the Category has a parent Category that is assigned to Stores and <code>stores</code> is empty, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @return stores
     */

    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores() {
        return this.stores;
    }

    /**
     * builds CategorySetStoresWithDescendantsAction with checking for non-null required values
     * @return CategorySetStoresWithDescendantsAction
     */
    public CategorySetStoresWithDescendantsAction build() {
        Objects.requireNonNull(stores, CategorySetStoresWithDescendantsAction.class + ": stores is missing");
        return new CategorySetStoresWithDescendantsActionImpl(stores);
    }

    /**
     * builds CategorySetStoresWithDescendantsAction without checking for non-null required values
     * @return CategorySetStoresWithDescendantsAction
     */
    public CategorySetStoresWithDescendantsAction buildUnchecked() {
        return new CategorySetStoresWithDescendantsActionImpl(stores);
    }

    /**
     * factory method for an instance of CategorySetStoresWithDescendantsActionBuilder
     * @return builder
     */
    public static CategorySetStoresWithDescendantsActionBuilder of() {
        return new CategorySetStoresWithDescendantsActionBuilder();
    }

    /**
     * create builder for CategorySetStoresWithDescendantsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetStoresWithDescendantsActionBuilder of(
            final CategorySetStoresWithDescendantsAction template) {
        CategorySetStoresWithDescendantsActionBuilder builder = new CategorySetStoresWithDescendantsActionBuilder();
        builder.stores = template.getStores();
        return builder;
    }

}
