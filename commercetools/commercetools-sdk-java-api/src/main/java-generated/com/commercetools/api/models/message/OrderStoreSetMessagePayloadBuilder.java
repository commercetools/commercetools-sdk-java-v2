
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
     *  <p>Store that was set.</p>
     */

    public OrderStoreSetMessagePayloadBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Store that was set.</p>
     */

    public OrderStoreSetMessagePayloadBuilder store(
            @Nullable final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    public OrderStoreSetMessagePayload build() {
        return new OrderStoreSetMessagePayloadImpl(store);
    }

    /**
     * builds OrderStoreSetMessagePayload without checking for non null required values
     */
    public OrderStoreSetMessagePayload buildUnchecked() {
        return new OrderStoreSetMessagePayloadImpl(store);
    }

    public static OrderStoreSetMessagePayloadBuilder of() {
        return new OrderStoreSetMessagePayloadBuilder();
    }

    public static OrderStoreSetMessagePayloadBuilder of(final OrderStoreSetMessagePayload template) {
        OrderStoreSetMessagePayloadBuilder builder = new OrderStoreSetMessagePayloadBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
