
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountStoreAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountStoreAddedMessagePayload cartDiscountStoreAddedMessagePayload = CartDiscountStoreAddedMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountStoreAddedMessagePayloadBuilder implements Builder<CartDiscountStoreAddedMessagePayload> {

    private com.commercetools.api.models.store.StoreKeyReference store;

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discount</a>.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public CartDiscountStoreAddedMessagePayloadBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discount</a>.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public CartDiscountStoreAddedMessagePayloadBuilder withStore(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discount</a>.</p>
     * @param store value to be set
     * @return Builder
     */

    public CartDiscountStoreAddedMessagePayloadBuilder store(
            final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discount</a>.</p>
     * @return store
     */

    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    /**
     * builds CartDiscountStoreAddedMessagePayload with checking for non-null required values
     * @return CartDiscountStoreAddedMessagePayload
     */
    public CartDiscountStoreAddedMessagePayload build() {
        Objects.requireNonNull(store, CartDiscountStoreAddedMessagePayload.class + ": store is missing");
        return new CartDiscountStoreAddedMessagePayloadImpl(store);
    }

    /**
     * builds CartDiscountStoreAddedMessagePayload without checking for non-null required values
     * @return CartDiscountStoreAddedMessagePayload
     */
    public CartDiscountStoreAddedMessagePayload buildUnchecked() {
        return new CartDiscountStoreAddedMessagePayloadImpl(store);
    }

    /**
     * factory method for an instance of CartDiscountStoreAddedMessagePayloadBuilder
     * @return builder
     */
    public static CartDiscountStoreAddedMessagePayloadBuilder of() {
        return new CartDiscountStoreAddedMessagePayloadBuilder();
    }

    /**
     * create builder for CartDiscountStoreAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountStoreAddedMessagePayloadBuilder of(final CartDiscountStoreAddedMessagePayload template) {
        CartDiscountStoreAddedMessagePayloadBuilder builder = new CartDiscountStoreAddedMessagePayloadBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
