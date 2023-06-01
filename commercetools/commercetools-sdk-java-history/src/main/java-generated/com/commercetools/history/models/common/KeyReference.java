package com.commercetools.history.models.common;

import com.commercetools.history.models.common.ReferenceTypeId;
import com.commercetools.history.models.common.KeyReferenceImpl;

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
 * KeyReference
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     KeyReference keyReference = KeyReference.builder()
 *             .key("{key}")
 *             .typeId(ReferenceTypeId.CART)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = KeyReferenceImpl.class)
public interface KeyReference  {


    /**
     *
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();
    /**
     *
     * @return typeId
     */
    @NotNull
    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();

    /**
     * set key
     * @param key value to be set
     */
    
    public void setKey(final String key);
    
    
    /**
     * set typeId
     * @param typeId value to be set
     */
    
    public void setTypeId(final ReferenceTypeId typeId);
    

    /**
     * factory method
     * @return instance of KeyReference
     */
    public static KeyReference of(){
        return new KeyReferenceImpl();
    }
    

    /**
     * factory method to create a shallow copy KeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static KeyReference of(final KeyReference template) {
        KeyReferenceImpl instance = new KeyReferenceImpl();
        instance.setKey(template.getKey());
        instance.setTypeId(template.getTypeId());
        return instance;
    }

    /**
     * factory method to create a deep copy of KeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static KeyReference deepCopy(@Nullable final KeyReference template) {
        if (template == null) {
            return null;
        }
        KeyReferenceImpl instance = new KeyReferenceImpl();
        instance.setKey(template.getKey());
        instance.setTypeId(template.getTypeId());
        return instance;
    }

    /**
     * builder factory method for KeyReference
     * @return builder
     */
    public static KeyReferenceBuilder builder() {
        return KeyReferenceBuilder.of();
    }
    
    /**
     * create builder for KeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static KeyReferenceBuilder builder(final KeyReference template) {
        return KeyReferenceBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withKeyReference(Function<KeyReference, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<KeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<KeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<KeyReference>";
            }
        };
    }
}
