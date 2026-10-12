
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategorySetStoresActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetStoresAction categorySetStoresAction = CategorySetStoresAction.builder()
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategorySetStoresActionBuilder implements Builder<CategorySetStoresAction> {

    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    /**
     *  <p>Value to set. It replaces the entire set of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> assigned to the Category.</p>
     *  <p>If the <code>stores</code> field contains a Store that you do not have permission for, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CategorySetStoresActionBuilder stores(
            final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Value to set. It replaces the entire set of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> assigned to the Category.</p>
     *  <p>If the <code>stores</code> field contains a Store that you do not have permission for, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CategorySetStoresActionBuilder stores(
            final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>Value to set. It replaces the entire set of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> assigned to the Category.</p>
     *  <p>If the <code>stores</code> field contains a Store that you do not have permission for, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CategorySetStoresActionBuilder plusStores(
            final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Value to set. It replaces the entire set of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> assigned to the Category.</p>
     *  <p>If the <code>stores</code> field contains a Store that you do not have permission for, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CategorySetStoresActionBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set. It replaces the entire set of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> assigned to the Category.</p>
     *  <p>If the <code>stores</code> field contains a Store that you do not have permission for, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CategorySetStoresActionBuilder withStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set. It replaces the entire set of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> assigned to the Category.</p>
     *  <p>If the <code>stores</code> field contains a Store that you do not have permission for, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CategorySetStoresActionBuilder addStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        return plusStores(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>Value to set. It replaces the entire set of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> assigned to the Category.</p>
     *  <p>If the <code>stores</code> field contains a Store that you do not have permission for, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CategorySetStoresActionBuilder setStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        return stores(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>Value to set. It replaces the entire set of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> assigned to the Category.</p>
     *  <p>If the <code>stores</code> field contains a Store that you do not have permission for, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @return stores
     */

    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores() {
        return this.stores;
    }

    /**
     * builds CategorySetStoresAction with checking for non-null required values
     * @return CategorySetStoresAction
     */
    public CategorySetStoresAction build() {
        Objects.requireNonNull(stores, CategorySetStoresAction.class + ": stores is missing");
        return new CategorySetStoresActionImpl(stores);
    }

    /**
     * builds CategorySetStoresAction without checking for non-null required values
     * @return CategorySetStoresAction
     */
    public CategorySetStoresAction buildUnchecked() {
        return new CategorySetStoresActionImpl(stores);
    }

    /**
     * factory method for an instance of CategorySetStoresActionBuilder
     * @return builder
     */
    public static CategorySetStoresActionBuilder of() {
        return new CategorySetStoresActionBuilder();
    }

    /**
     * create builder for CategorySetStoresAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetStoresActionBuilder of(final CategorySetStoresAction template) {
        CategorySetStoresActionBuilder builder = new CategorySetStoresActionBuilder();
        builder.stores = template.getStores();
        return builder;
    }

}
