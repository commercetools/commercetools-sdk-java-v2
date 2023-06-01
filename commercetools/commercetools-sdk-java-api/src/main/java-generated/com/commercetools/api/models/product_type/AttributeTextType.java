package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeType;
import com.commercetools.api.models.product_type.AttributeTextTypeImpl;

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
 *  <p>Attribute type for plain text values.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeTextType attributeTextType = AttributeTextType.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = AttributeTextTypeImpl.class)
public interface AttributeTextType extends AttributeType {

    /**
     * discriminator value for AttributeTextType
     */
    String TEXT = "text";



    /**
     * factory method
     * @return instance of AttributeTextType
     */
    public static AttributeTextType of(){
        return new AttributeTextTypeImpl();
    }
    

    /**
     * factory method to create a shallow copy AttributeTextType
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeTextType of(final AttributeTextType template) {
        AttributeTextTypeImpl instance = new AttributeTextTypeImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of AttributeTextType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeTextType deepCopy(@Nullable final AttributeTextType template) {
        if (template == null) {
            return null;
        }
        AttributeTextTypeImpl instance = new AttributeTextTypeImpl();
        return instance;
    }

    /**
     * builder factory method for AttributeTextType
     * @return builder
     */
    public static AttributeTextTypeBuilder builder() {
        return AttributeTextTypeBuilder.of();
    }
    
    /**
     * create builder for AttributeTextType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeTextTypeBuilder builder(final AttributeTextType template) {
        return AttributeTextTypeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeTextType(Function<AttributeTextType, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeTextType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeTextType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeTextType>";
            }
        };
    }
}
