package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.StoreKeyReferenceImpl;

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
 *  <p>References a store by key.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreKeyReference storeKeyReference = StoreKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = StoreKeyReferenceImpl.class)
public interface StoreKeyReference extends KeyReference {

    /**
     * discriminator value for StoreKeyReference
     */
    String STORE = "store";



    /**
     * factory method
     * @return instance of StoreKeyReference
     */
    public static StoreKeyReference of(){
        return new StoreKeyReferenceImpl();
    }
    

    /**
     * factory method to create a shallow copy StoreKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreKeyReference of(final StoreKeyReference template) {
        StoreKeyReferenceImpl instance = new StoreKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of StoreKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreKeyReference deepCopy(@Nullable final StoreKeyReference template) {
        if (template == null) {
            return null;
        }
        StoreKeyReferenceImpl instance = new StoreKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for StoreKeyReference
     * @return builder
     */
    public static StoreKeyReferenceBuilder builder() {
        return StoreKeyReferenceBuilder.of();
    }
    
    /**
     * create builder for StoreKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreKeyReferenceBuilder builder(final StoreKeyReference template) {
        return StoreKeyReferenceBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreKeyReference(Function<StoreKeyReference, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<StoreKeyReference>";
            }
        };
    }
}
