package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.order.OrderSetStoreAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSetStoreActionBuilder implements Builder<OrderSetStoreAction> {

    
    @Nullable
    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    
    /**
     *  <p>ResourceIdentifier to a Store.</p>
     * @param builder function to build the store value
     * @return Builder
     */
    
    public OrderSetStoreActionBuilder store(Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>ResourceIdentifier to a Store.</p>
     * @param builder function to build the store value
     * @return Builder
     */
    
    public OrderSetStoreActionBuilder withStore(Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>ResourceIdentifier to a Store.</p>
     * @param store value to be set
     * @return Builder
     */
    
    public OrderSetStoreActionBuilder store(@Nullable final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }
    
    

    /**
     *  <p>ResourceIdentifier to a Store.</p>
     * @return store
     */
    
    @Nullable
    public com.commercetools.api.models.store.StoreResourceIdentifier getStore(){
        return this.store;
    }

    /**
     * builds OrderSetStoreAction with checking for non-null required values
     * @return OrderSetStoreAction
     */
    public OrderSetStoreAction build() {
        return new OrderSetStoreActionImpl(store);
    }
    
    /**
     * builds OrderSetStoreAction without checking for non-null required values
     * @return OrderSetStoreAction
     */
    public OrderSetStoreAction buildUnchecked() {
        return new OrderSetStoreActionImpl(store);
    }

    /**
     * factory method for an instance of OrderSetStoreActionBuilder
     * @return builder 
     */
    public static OrderSetStoreActionBuilder of() {
        return new OrderSetStoreActionBuilder();
    }

    /**
     * create builder for OrderSetStoreAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetStoreActionBuilder of(final OrderSetStoreAction template) {
        OrderSetStoreActionBuilder builder = new OrderSetStoreActionBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
