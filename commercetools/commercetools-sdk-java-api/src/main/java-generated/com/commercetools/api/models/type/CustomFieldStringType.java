package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldType;
import com.commercetools.api.models.type.CustomFieldStringTypeImpl;

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
 *  <p>Field type for string values.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldStringType customFieldStringType = CustomFieldStringType.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CustomFieldStringTypeImpl.class)
public interface CustomFieldStringType extends FieldType {

    /**
     * discriminator value for CustomFieldStringType
     */
    String STRING = "String";



    /**
     * factory method
     * @return instance of CustomFieldStringType
     */
    public static CustomFieldStringType of(){
        return new CustomFieldStringTypeImpl();
    }
    

    /**
     * factory method to create a shallow copy CustomFieldStringType
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomFieldStringType of(final CustomFieldStringType template) {
        CustomFieldStringTypeImpl instance = new CustomFieldStringTypeImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomFieldStringType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomFieldStringType deepCopy(@Nullable final CustomFieldStringType template) {
        if (template == null) {
            return null;
        }
        CustomFieldStringTypeImpl instance = new CustomFieldStringTypeImpl();
        return instance;
    }

    /**
     * builder factory method for CustomFieldStringType
     * @return builder
     */
    public static CustomFieldStringTypeBuilder builder() {
        return CustomFieldStringTypeBuilder.of();
    }
    
    /**
     * create builder for CustomFieldStringType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldStringTypeBuilder builder(final CustomFieldStringType template) {
        return CustomFieldStringTypeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomFieldStringType(Function<CustomFieldStringType, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomFieldStringType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFieldStringType>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFieldStringType>";
            }
        };
    }
}
