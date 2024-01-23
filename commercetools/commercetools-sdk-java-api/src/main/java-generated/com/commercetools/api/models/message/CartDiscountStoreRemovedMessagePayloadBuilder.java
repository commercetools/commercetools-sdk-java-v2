
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountStoreRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountStoreRemovedMessagePayload cartDiscountStoreRemovedMessagePayload = CartDiscountStoreRemovedMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountStoreRemovedMessagePayloadBuilder implements Builder<CartDiscountStoreRemovedMessagePayload> {

    private com.commercetools.api.models.store.StoreKeyReference store;

    /**
     *  <p>The Store that was removed from the Cart Discount.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public CartDiscountStoreRemovedMessagePayloadBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Store that was removed from the Cart Discount.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public CartDiscountStoreRemovedMessagePayloadBuilder withStore(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Store that was removed from the Cart Discount.</p>
     * @param store value to be set
     * @return Builder
     */

    public CartDiscountStoreRemovedMessagePayloadBuilder store(
            final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>The Store that was removed from the Cart Discount.</p>
     * @return store
     */

    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    /**
     * builds CartDiscountStoreRemovedMessagePayload with checking for non-null required values
     * @return CartDiscountStoreRemovedMessagePayload
     */
    public CartDiscountStoreRemovedMessagePayload build() {
        Objects.requireNonNull(store, CartDiscountStoreRemovedMessagePayload.class + ": store is missing");
        return new CartDiscountStoreRemovedMessagePayloadImpl(store);
    }

    /**
     * builds CartDiscountStoreRemovedMessagePayload without checking for non-null required values
     * @return CartDiscountStoreRemovedMessagePayload
     */
    public CartDiscountStoreRemovedMessagePayload buildUnchecked() {
        return new CartDiscountStoreRemovedMessagePayloadImpl(store);
    }

    /**
     * factory method for an instance of CartDiscountStoreRemovedMessagePayloadBuilder
     * @return builder
     */
    public static CartDiscountStoreRemovedMessagePayloadBuilder of() {
        return new CartDiscountStoreRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for CartDiscountStoreRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountStoreRemovedMessagePayloadBuilder of(
            final CartDiscountStoreRemovedMessagePayload template) {
        CartDiscountStoreRemovedMessagePayloadBuilder builder = new CartDiscountStoreRemovedMessagePayloadBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
