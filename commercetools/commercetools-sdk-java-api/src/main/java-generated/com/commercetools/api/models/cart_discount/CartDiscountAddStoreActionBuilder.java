
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountAddStoreActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountAddStoreAction cartDiscountAddStoreAction = CartDiscountAddStoreAction.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountAddStoreActionBuilder implements Builder<CartDiscountAddStoreAction> {

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> to add.</p>
     *  <p>A failed update can return the following errors:</p>
     *  <ul>
     *   <li>If the referenced Stores exceed the <span>limit</span>, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxStoreReferencesReachedError" rel="nofollow">MaxStoreReferencesReached</a> error is returned.</li>
     *   <li>If the referenced Stores exceed the <span>limit</span> for Cart Discounts that do not require a Discount Code, a <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCartDiscountsLimitReachedError" rel="nofollow">StoreCartDiscountsLimitReached</a> error is returned.</li>
     *  </ul>
     * @param builder function to build the store value
     * @return Builder
     */

    public CartDiscountAddStoreActionBuilder store(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> to add.</p>
     *  <p>A failed update can return the following errors:</p>
     *  <ul>
     *   <li>If the referenced Stores exceed the <span>limit</span>, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxStoreReferencesReachedError" rel="nofollow">MaxStoreReferencesReached</a> error is returned.</li>
     *   <li>If the referenced Stores exceed the <span>limit</span> for Cart Discounts that do not require a Discount Code, a <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCartDiscountsLimitReachedError" rel="nofollow">StoreCartDiscountsLimitReached</a> error is returned.</li>
     *  </ul>
     * @param builder function to build the store value
     * @return Builder
     */

    public CartDiscountAddStoreActionBuilder withStore(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> to add.</p>
     *  <p>A failed update can return the following errors:</p>
     *  <ul>
     *   <li>If the referenced Stores exceed the <span>limit</span>, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxStoreReferencesReachedError" rel="nofollow">MaxStoreReferencesReached</a> error is returned.</li>
     *   <li>If the referenced Stores exceed the <span>limit</span> for Cart Discounts that do not require a Discount Code, a <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCartDiscountsLimitReachedError" rel="nofollow">StoreCartDiscountsLimitReached</a> error is returned.</li>
     *  </ul>
     * @param store value to be set
     * @return Builder
     */

    public CartDiscountAddStoreActionBuilder store(
            final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> to add.</p>
     *  <p>A failed update can return the following errors:</p>
     *  <ul>
     *   <li>If the referenced Stores exceed the <span>limit</span>, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxStoreReferencesReachedError" rel="nofollow">MaxStoreReferencesReached</a> error is returned.</li>
     *   <li>If the referenced Stores exceed the <span>limit</span> for Cart Discounts that do not require a Discount Code, a <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCartDiscountsLimitReachedError" rel="nofollow">StoreCartDiscountsLimitReached</a> error is returned.</li>
     *  </ul>
     * @return store
     */

    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    /**
     * builds CartDiscountAddStoreAction with checking for non-null required values
     * @return CartDiscountAddStoreAction
     */
    public CartDiscountAddStoreAction build() {
        Objects.requireNonNull(store, CartDiscountAddStoreAction.class + ": store is missing");
        return new CartDiscountAddStoreActionImpl(store);
    }

    /**
     * builds CartDiscountAddStoreAction without checking for non-null required values
     * @return CartDiscountAddStoreAction
     */
    public CartDiscountAddStoreAction buildUnchecked() {
        return new CartDiscountAddStoreActionImpl(store);
    }

    /**
     * factory method for an instance of CartDiscountAddStoreActionBuilder
     * @return builder
     */
    public static CartDiscountAddStoreActionBuilder of() {
        return new CartDiscountAddStoreActionBuilder();
    }

    /**
     * create builder for CartDiscountAddStoreAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountAddStoreActionBuilder of(final CartDiscountAddStoreAction template) {
        CartDiscountAddStoreActionBuilder builder = new CartDiscountAddStoreActionBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
