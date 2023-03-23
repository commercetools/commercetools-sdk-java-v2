
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitStoreAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitStoreAddedMessagePayload businessUnitStoreAddedMessagePayload = BusinessUnitStoreAddedMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitStoreAddedMessagePayloadBuilder implements Builder<BusinessUnitStoreAddedMessagePayload> {

    private com.commercetools.api.models.store.StoreKeyReference store;

    /**
     *  <p>The Store that was added to the Business Unit.</p>
     * @return Builder
     */

    public BusinessUnitStoreAddedMessagePayloadBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Store that was added to the Business Unit.</p>
     * @param store
     * @return Builder
     */

    public BusinessUnitStoreAddedMessagePayloadBuilder store(
            final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    public BusinessUnitStoreAddedMessagePayload build() {
        Objects.requireNonNull(store, BusinessUnitStoreAddedMessagePayload.class + ": store is missing");
        return new BusinessUnitStoreAddedMessagePayloadImpl(store);
    }

    /**
     * builds BusinessUnitStoreAddedMessagePayload without checking for non null required values
     */
    public BusinessUnitStoreAddedMessagePayload buildUnchecked() {
        return new BusinessUnitStoreAddedMessagePayloadImpl(store);
    }

    public static BusinessUnitStoreAddedMessagePayloadBuilder of() {
        return new BusinessUnitStoreAddedMessagePayloadBuilder();
    }

    public static BusinessUnitStoreAddedMessagePayloadBuilder of(final BusinessUnitStoreAddedMessagePayload template) {
        BusinessUnitStoreAddedMessagePayloadBuilder builder = new BusinessUnitStoreAddedMessagePayloadBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
