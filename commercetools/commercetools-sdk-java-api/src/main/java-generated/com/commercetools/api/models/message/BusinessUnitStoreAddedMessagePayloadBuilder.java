package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.message.BusinessUnitStoreAddedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class BusinessUnitStoreAddedMessagePayloadBuilder implements Builder<BusinessUnitStoreAddedMessagePayload> {

    
    
    private com.commercetools.api.models.store.StoreKeyReference store;

    
    /**
     *  <p>The Store that was added to the Business Unit.</p>
     * @param builder function to build the store value
     * @return Builder
     */
    
    public BusinessUnitStoreAddedMessagePayloadBuilder store(Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>The Store that was added to the Business Unit.</p>
     * @param builder function to build the store value
     * @return Builder
     */
    
    public BusinessUnitStoreAddedMessagePayloadBuilder withStore(Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>The Store that was added to the Business Unit.</p>
     * @param store value to be set
     * @return Builder
     */
    
    public BusinessUnitStoreAddedMessagePayloadBuilder store( final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }
    
    

    /**
     *  <p>The Store that was added to the Business Unit.</p>
     * @return store
     */
    
    
    public com.commercetools.api.models.store.StoreKeyReference getStore(){
        return this.store;
    }

    /**
     * builds BusinessUnitStoreAddedMessagePayload with checking for non-null required values
     * @return BusinessUnitStoreAddedMessagePayload
     */
    public BusinessUnitStoreAddedMessagePayload build() {
        Objects.requireNonNull(store, BusinessUnitStoreAddedMessagePayload.class + ": store is missing");
        return new BusinessUnitStoreAddedMessagePayloadImpl(store);
    }
    
    /**
     * builds BusinessUnitStoreAddedMessagePayload without checking for non-null required values
     * @return BusinessUnitStoreAddedMessagePayload
     */
    public BusinessUnitStoreAddedMessagePayload buildUnchecked() {
        return new BusinessUnitStoreAddedMessagePayloadImpl(store);
    }

    /**
     * factory method for an instance of BusinessUnitStoreAddedMessagePayloadBuilder
     * @return builder 
     */
    public static BusinessUnitStoreAddedMessagePayloadBuilder of() {
        return new BusinessUnitStoreAddedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitStoreAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitStoreAddedMessagePayloadBuilder of(final BusinessUnitStoreAddedMessagePayload template) {
        BusinessUnitStoreAddedMessagePayloadBuilder builder = new BusinessUnitStoreAddedMessagePayloadBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
