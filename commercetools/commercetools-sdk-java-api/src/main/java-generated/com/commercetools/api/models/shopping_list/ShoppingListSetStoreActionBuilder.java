
package com.commercetools.api.models.shopping_list;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetStoreActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetStoreAction shoppingListSetStoreAction = ShoppingListSetStoreAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListSetStoreActionBuilder implements Builder<ShoppingListSetStoreAction> {

    @Nullable
    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> the ShoppingList should be assigned to. If empty, any existing value will be removed.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ShoppingListSetStoreActionBuilder store(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> the ShoppingList should be assigned to. If empty, any existing value will be removed.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ShoppingListSetStoreActionBuilder withStore(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> the ShoppingList should be assigned to. If empty, any existing value will be removed.</p>
     * @param store value to be set
     * @return Builder
     */

    public ShoppingListSetStoreActionBuilder store(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> the ShoppingList should be assigned to. If empty, any existing value will be removed.</p>
     * @return store
     */

    @Nullable
    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    /**
     * builds ShoppingListSetStoreAction with checking for non-null required values
     * @return ShoppingListSetStoreAction
     */
    public ShoppingListSetStoreAction build() {
        return new ShoppingListSetStoreActionImpl(store);
    }

    /**
     * builds ShoppingListSetStoreAction without checking for non-null required values
     * @return ShoppingListSetStoreAction
     */
    public ShoppingListSetStoreAction buildUnchecked() {
        return new ShoppingListSetStoreActionImpl(store);
    }

    /**
     * factory method for an instance of ShoppingListSetStoreActionBuilder
     * @return builder
     */
    public static ShoppingListSetStoreActionBuilder of() {
        return new ShoppingListSetStoreActionBuilder();
    }

    /**
     * create builder for ShoppingListSetStoreAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListSetStoreActionBuilder of(final ShoppingListSetStoreAction template) {
        ShoppingListSetStoreActionBuilder builder = new ShoppingListSetStoreActionBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
