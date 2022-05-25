
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetStoreActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetStoreAction orderSetStoreAction = OrderSetStoreAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetStoreActionBuilder implements Builder<OrderSetStoreAction> {

    @Nullable
    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    /**
     *
     */

    public OrderSetStoreActionBuilder store(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public OrderSetStoreActionBuilder store(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    public OrderSetStoreAction build() {
        return new OrderSetStoreActionImpl(store);
    }

    /**
     * builds OrderSetStoreAction without checking for non null required values
     */
    public OrderSetStoreAction buildUnchecked() {
        return new OrderSetStoreActionImpl(store);
    }

    public static OrderSetStoreActionBuilder of() {
        return new OrderSetStoreActionBuilder();
    }

    public static OrderSetStoreActionBuilder of(final OrderSetStoreAction template) {
        OrderSetStoreActionBuilder builder = new OrderSetStoreActionBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
