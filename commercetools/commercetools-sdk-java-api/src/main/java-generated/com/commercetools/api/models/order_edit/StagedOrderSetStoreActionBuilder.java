
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetStoreActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetStoreAction stagedOrderSetStoreAction = StagedOrderSetStoreAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetStoreActionBuilder implements Builder<StagedOrderSetStoreAction> {

    @Nullable
    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     *  <p>If <code>store</code> references the same Store the Order is currently assigned to or if you try to remove the value when no Store is currently assigned, a <code>400</code> error is returned.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public StagedOrderSetStoreActionBuilder store(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     *  <p>If <code>store</code> references the same Store the Order is currently assigned to or if you try to remove the value when no Store is currently assigned, a <code>400</code> error is returned.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public StagedOrderSetStoreActionBuilder withStore(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     *  <p>If <code>store</code> references the same Store the Order is currently assigned to or if you try to remove the value when no Store is currently assigned, a <code>400</code> error is returned.</p>
     * @param store value to be set
     * @return Builder
     */

    public StagedOrderSetStoreActionBuilder store(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     *  <p>If <code>store</code> references the same Store the Order is currently assigned to or if you try to remove the value when no Store is currently assigned, a <code>400</code> error is returned.</p>
     * @return store
     */

    @Nullable
    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    /**
     * builds StagedOrderSetStoreAction with checking for non-null required values
     * @return StagedOrderSetStoreAction
     */
    public StagedOrderSetStoreAction build() {
        return new StagedOrderSetStoreActionImpl(store);
    }

    /**
     * builds StagedOrderSetStoreAction without checking for non-null required values
     * @return StagedOrderSetStoreAction
     */
    public StagedOrderSetStoreAction buildUnchecked() {
        return new StagedOrderSetStoreActionImpl(store);
    }

    /**
     * factory method for an instance of StagedOrderSetStoreActionBuilder
     * @return builder
     */
    public static StagedOrderSetStoreActionBuilder of() {
        return new StagedOrderSetStoreActionBuilder();
    }

    /**
     * create builder for StagedOrderSetStoreAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetStoreActionBuilder of(final StagedOrderSetStoreAction template) {
        StagedOrderSetStoreActionBuilder builder = new StagedOrderSetStoreActionBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
