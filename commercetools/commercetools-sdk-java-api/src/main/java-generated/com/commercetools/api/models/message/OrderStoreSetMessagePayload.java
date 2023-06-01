package com.commercetools.api.models.message;

import com.commercetools.api.models.message.OrderMessagePayload;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.message.OrderStoreSetMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Generated after a successful Set Store update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderStoreSetMessagePayload orderStoreSetMessagePayload = OrderStoreSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderStoreSetMessagePayloadImpl.class)
public interface OrderStoreSetMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderStoreSetMessagePayload
     */
    String ORDER_STORE_SET = "OrderStoreSet";

    /**
     *  <p>Store that was set.</p>
     * @return store
     */
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    /**
     *  <p>Store that was set.</p>
     * @param store value to be set
     */
    
    public void setStore(final StoreKeyReference store);
    

    /**
     * factory method
     * @return instance of OrderStoreSetMessagePayload
     */
    public static OrderStoreSetMessagePayload of(){
        return new OrderStoreSetMessagePayloadImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderStoreSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderStoreSetMessagePayload of(final OrderStoreSetMessagePayload template) {
        OrderStoreSetMessagePayloadImpl instance = new OrderStoreSetMessagePayloadImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderStoreSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderStoreSetMessagePayload deepCopy(@Nullable final OrderStoreSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderStoreSetMessagePayloadImpl instance = new OrderStoreSetMessagePayloadImpl();
        instance.setStore(com.commercetools.api.models.store.StoreKeyReference.deepCopy(template.getStore()));
        return instance;
    }

    /**
     * builder factory method for OrderStoreSetMessagePayload
     * @return builder
     */
    public static OrderStoreSetMessagePayloadBuilder builder() {
        return OrderStoreSetMessagePayloadBuilder.of();
    }
    
    /**
     * create builder for OrderStoreSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderStoreSetMessagePayloadBuilder builder(final OrderStoreSetMessagePayload template) {
        return OrderStoreSetMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderStoreSetMessagePayload(Function<OrderStoreSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderStoreSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderStoreSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderStoreSetMessagePayload>";
            }
        };
    }
}
