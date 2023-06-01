package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.customer.CustomerAddStoreAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerAddStoreActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddStoreAction customerAddStoreAction = CustomerAddStoreAction.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerAddStoreActionBuilder implements Builder<CustomerAddStoreAction> {

    
    
    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    
    /**
     *  <p>ResourceIdentifier of the Store to add.</p>
     * @param builder function to build the store value
     * @return Builder
     */
    
    public CustomerAddStoreActionBuilder store(Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>ResourceIdentifier of the Store to add.</p>
     * @param builder function to build the store value
     * @return Builder
     */
    
    public CustomerAddStoreActionBuilder withStore(Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>ResourceIdentifier of the Store to add.</p>
     * @param store value to be set
     * @return Builder
     */
    
    public CustomerAddStoreActionBuilder store( final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }
    
    

    /**
     *  <p>ResourceIdentifier of the Store to add.</p>
     * @return store
     */
    
    
    public com.commercetools.api.models.store.StoreResourceIdentifier getStore(){
        return this.store;
    }

    /**
     * builds CustomerAddStoreAction with checking for non-null required values
     * @return CustomerAddStoreAction
     */
    public CustomerAddStoreAction build() {
        Objects.requireNonNull(store, CustomerAddStoreAction.class + ": store is missing");
        return new CustomerAddStoreActionImpl(store);
    }
    
    /**
     * builds CustomerAddStoreAction without checking for non-null required values
     * @return CustomerAddStoreAction
     */
    public CustomerAddStoreAction buildUnchecked() {
        return new CustomerAddStoreActionImpl(store);
    }

    /**
     * factory method for an instance of CustomerAddStoreActionBuilder
     * @return builder 
     */
    public static CustomerAddStoreActionBuilder of() {
        return new CustomerAddStoreActionBuilder();
    }

    /**
     * create builder for CustomerAddStoreAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddStoreActionBuilder of(final CustomerAddStoreAction template) {
        CustomerAddStoreActionBuilder builder = new CustomerAddStoreActionBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
