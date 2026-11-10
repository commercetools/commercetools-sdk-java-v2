
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountRemoveStoreActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountRemoveStoreAction cartDiscountRemoveStoreAction = CartDiscountRemoveStoreAction.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountRemoveStoreActionBuilder implements Builder<CartDiscountRemoveStoreAction> {

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> to remove.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public CartDiscountRemoveStoreActionBuilder store(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> to remove.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public CartDiscountRemoveStoreActionBuilder withStore(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> to remove.</p>
     * @param store value to be set
     * @return Builder
     */

    public CartDiscountRemoveStoreActionBuilder store(
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
     * builds CartDiscountRemoveStoreAction with checking for non-null required values
     * @return CartDiscountRemoveStoreAction
     */
    public CartDiscountRemoveStoreAction build() {
        Objects.requireNonNull(store, CartDiscountRemoveStoreAction.class + ": store is missing");
        return new CartDiscountRemoveStoreActionImpl(store);
    }

    /**
     * builds CartDiscountRemoveStoreAction without checking for non-null required values
     * @return CartDiscountRemoveStoreAction
     */
    public CartDiscountRemoveStoreAction buildUnchecked() {
        return new CartDiscountRemoveStoreActionImpl(store);
    }

    /**
     * factory method for an instance of CartDiscountRemoveStoreActionBuilder
     * @return builder
     */
    public static CartDiscountRemoveStoreActionBuilder of() {
        return new CartDiscountRemoveStoreActionBuilder();
    }

    /**
     * create builder for CartDiscountRemoveStoreAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountRemoveStoreActionBuilder of(final CartDiscountRemoveStoreAction template) {
        CartDiscountRemoveStoreActionBuilder builder = new CartDiscountRemoveStoreActionBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
