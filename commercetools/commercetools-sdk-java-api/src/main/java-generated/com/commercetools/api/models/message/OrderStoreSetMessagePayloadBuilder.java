
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderStoreSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderStoreSetMessagePayload orderStoreSetMessagePayload = OrderStoreSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderStoreSetMessagePayloadBuilder implements Builder<OrderStoreSetMessagePayload> {

    @Nullable
    private com.commercetools.api.models.store.StoreKeyReference store;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was set.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public OrderStoreSetMessagePayloadBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was set.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public OrderStoreSetMessagePayloadBuilder withStore(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was set.</p>
     * @param store value to be set
     * @return Builder
     */

    public OrderStoreSetMessagePayloadBuilder store(
            @Nullable final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was set.</p>
     * @return store
     */

    @Nullable
    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    /**
     * builds OrderStoreSetMessagePayload with checking for non-null required values
     * @return OrderStoreSetMessagePayload
     */
    public OrderStoreSetMessagePayload build() {
        return new OrderStoreSetMessagePayloadImpl(store);
    }

    /**
     * builds OrderStoreSetMessagePayload without checking for non-null required values
     * @return OrderStoreSetMessagePayload
     */
    public OrderStoreSetMessagePayload buildUnchecked() {
        return new OrderStoreSetMessagePayloadImpl(store);
    }

    /**
     * factory method for an instance of OrderStoreSetMessagePayloadBuilder
     * @return builder
     */
    public static OrderStoreSetMessagePayloadBuilder of() {
        return new OrderStoreSetMessagePayloadBuilder();
    }

    /**
     * create builder for OrderStoreSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderStoreSetMessagePayloadBuilder of(final OrderStoreSetMessagePayload template) {
        OrderStoreSetMessagePayloadBuilder builder = new OrderStoreSetMessagePayloadBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
