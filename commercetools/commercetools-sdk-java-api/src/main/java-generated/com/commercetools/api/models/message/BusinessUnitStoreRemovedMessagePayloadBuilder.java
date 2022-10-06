
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitStoreRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitStoreRemovedMessagePayload businessUnitStoreRemovedMessagePayload = BusinessUnitStoreRemovedMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitStoreRemovedMessagePayloadBuilder implements Builder<BusinessUnitStoreRemovedMessagePayload> {

    private com.commercetools.api.models.store.StoreKeyReference store;

    /**
     *  <p>The Store that was removed from the Business Unit.</p>
     */

    public BusinessUnitStoreRemovedMessagePayloadBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Store that was removed from the Business Unit.</p>
     */

    public BusinessUnitStoreRemovedMessagePayloadBuilder store(
            final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    public BusinessUnitStoreRemovedMessagePayload build() {
        Objects.requireNonNull(store, BusinessUnitStoreRemovedMessagePayload.class + ": store is missing");
        return new BusinessUnitStoreRemovedMessagePayloadImpl(store);
    }

    /**
     * builds BusinessUnitStoreRemovedMessagePayload without checking for non null required values
     */
    public BusinessUnitStoreRemovedMessagePayload buildUnchecked() {
        return new BusinessUnitStoreRemovedMessagePayloadImpl(store);
    }

    public static BusinessUnitStoreRemovedMessagePayloadBuilder of() {
        return new BusinessUnitStoreRemovedMessagePayloadBuilder();
    }

    public static BusinessUnitStoreRemovedMessagePayloadBuilder of(
            final BusinessUnitStoreRemovedMessagePayload template) {
        BusinessUnitStoreRemovedMessagePayloadBuilder builder = new BusinessUnitStoreRemovedMessagePayloadBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
