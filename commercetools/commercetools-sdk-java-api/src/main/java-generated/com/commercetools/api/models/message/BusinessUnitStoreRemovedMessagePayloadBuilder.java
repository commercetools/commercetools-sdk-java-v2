package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.message.BusinessUnitStoreRemovedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class BusinessUnitStoreRemovedMessagePayloadBuilder implements Builder<BusinessUnitStoreRemovedMessagePayload> {

    
    
    private com.commercetools.api.models.store.StoreKeyReference store;

    
    /**
     *  <p>The Store that was removed from the Business Unit.</p>
     * @param builder function to build the store value
     * @return Builder
     */
    
    public BusinessUnitStoreRemovedMessagePayloadBuilder store(Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>The Store that was removed from the Business Unit.</p>
     * @param builder function to build the store value
     * @return Builder
     */
    
    public BusinessUnitStoreRemovedMessagePayloadBuilder withStore(Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>The Store that was removed from the Business Unit.</p>
     * @param store value to be set
     * @return Builder
     */
    
    public BusinessUnitStoreRemovedMessagePayloadBuilder store( final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }
    
    

    /**
     *  <p>The Store that was removed from the Business Unit.</p>
     * @return store
     */
    
    
    public com.commercetools.api.models.store.StoreKeyReference getStore(){
        return this.store;
    }

    /**
     * builds BusinessUnitStoreRemovedMessagePayload with checking for non-null required values
     * @return BusinessUnitStoreRemovedMessagePayload
     */
    public BusinessUnitStoreRemovedMessagePayload build() {
        Objects.requireNonNull(store, BusinessUnitStoreRemovedMessagePayload.class + ": store is missing");
        return new BusinessUnitStoreRemovedMessagePayloadImpl(store);
    }
    
    /**
     * builds BusinessUnitStoreRemovedMessagePayload without checking for non-null required values
     * @return BusinessUnitStoreRemovedMessagePayload
     */
    public BusinessUnitStoreRemovedMessagePayload buildUnchecked() {
        return new BusinessUnitStoreRemovedMessagePayloadImpl(store);
    }

    /**
     * factory method for an instance of BusinessUnitStoreRemovedMessagePayloadBuilder
     * @return builder 
     */
    public static BusinessUnitStoreRemovedMessagePayloadBuilder of() {
        return new BusinessUnitStoreRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitStoreRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitStoreRemovedMessagePayloadBuilder of(final BusinessUnitStoreRemovedMessagePayload template) {
        BusinessUnitStoreRemovedMessagePayloadBuilder builder = new BusinessUnitStoreRemovedMessagePayloadBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
