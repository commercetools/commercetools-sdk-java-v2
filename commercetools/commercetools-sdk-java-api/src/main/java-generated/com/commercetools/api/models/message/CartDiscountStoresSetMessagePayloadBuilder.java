
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountStoresSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountStoresSetMessagePayload cartDiscountStoresSetMessagePayload = CartDiscountStoresSetMessagePayload.builder()
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountStoresSetMessagePayloadBuilder implements Builder<CartDiscountStoresSetMessagePayload> {

    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discount</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CartDiscountStoresSetMessagePayloadBuilder stores(
            final com.commercetools.api.models.store.StoreKeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discount</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CartDiscountStoresSetMessagePayloadBuilder stores(
            final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discount</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CartDiscountStoresSetMessagePayloadBuilder plusStores(
            final com.commercetools.api.models.store.StoreKeyReference... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discount</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CartDiscountStoresSetMessagePayloadBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discount</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CartDiscountStoresSetMessagePayloadBuilder withStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discount</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CartDiscountStoresSetMessagePayloadBuilder addStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        return plusStores(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()));
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discount</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CartDiscountStoresSetMessagePayloadBuilder setStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        return stores(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()));
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discount</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @return stores
     */

    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getStores() {
        return this.stores;
    }

    /**
     * builds CartDiscountStoresSetMessagePayload with checking for non-null required values
     * @return CartDiscountStoresSetMessagePayload
     */
    public CartDiscountStoresSetMessagePayload build() {
        Objects.requireNonNull(stores, CartDiscountStoresSetMessagePayload.class + ": stores is missing");
        return new CartDiscountStoresSetMessagePayloadImpl(stores);
    }

    /**
     * builds CartDiscountStoresSetMessagePayload without checking for non-null required values
     * @return CartDiscountStoresSetMessagePayload
     */
    public CartDiscountStoresSetMessagePayload buildUnchecked() {
        return new CartDiscountStoresSetMessagePayloadImpl(stores);
    }

    /**
     * factory method for an instance of CartDiscountStoresSetMessagePayloadBuilder
     * @return builder
     */
    public static CartDiscountStoresSetMessagePayloadBuilder of() {
        return new CartDiscountStoresSetMessagePayloadBuilder();
    }

    /**
     * create builder for CartDiscountStoresSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountStoresSetMessagePayloadBuilder of(final CartDiscountStoresSetMessagePayload template) {
        CartDiscountStoresSetMessagePayloadBuilder builder = new CartDiscountStoresSetMessagePayloadBuilder();
        builder.stores = template.getStores();
        return builder;
    }

}
