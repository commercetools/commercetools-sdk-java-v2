package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.StoreDeletedMessagePayloadImpl;

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
 *  <p>Generated after a successful Delete Store request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreDeletedMessagePayload storeDeletedMessagePayload = StoreDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = StoreDeletedMessagePayloadImpl.class)
public interface StoreDeletedMessagePayload extends MessagePayload {

    /**
     * discriminator value for StoreDeletedMessagePayload
     */
    String STORE_DELETED = "StoreDeleted";



    /**
     * factory method
     * @return instance of StoreDeletedMessagePayload
     */
    public static StoreDeletedMessagePayload of(){
        return new StoreDeletedMessagePayloadImpl();
    }
    

    /**
     * factory method to create a shallow copy StoreDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreDeletedMessagePayload of(final StoreDeletedMessagePayload template) {
        StoreDeletedMessagePayloadImpl instance = new StoreDeletedMessagePayloadImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of StoreDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreDeletedMessagePayload deepCopy(@Nullable final StoreDeletedMessagePayload template) {
        if (template == null) {
            return null;
        }
        StoreDeletedMessagePayloadImpl instance = new StoreDeletedMessagePayloadImpl();
        return instance;
    }

    /**
     * builder factory method for StoreDeletedMessagePayload
     * @return builder
     */
    public static StoreDeletedMessagePayloadBuilder builder() {
        return StoreDeletedMessagePayloadBuilder.of();
    }
    
    /**
     * create builder for StoreDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreDeletedMessagePayloadBuilder builder(final StoreDeletedMessagePayload template) {
        return StoreDeletedMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreDeletedMessagePayload(Function<StoreDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StoreDeletedMessagePayload>";
            }
        };
    }
}
