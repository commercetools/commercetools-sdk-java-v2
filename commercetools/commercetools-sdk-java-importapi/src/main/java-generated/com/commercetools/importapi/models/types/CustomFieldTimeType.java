package com.commercetools.importapi.models.types;

import com.commercetools.importapi.models.types.FieldType;
import com.commercetools.importapi.models.types.CustomFieldTimeTypeImpl;

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
 *  <p>Field type for Time values.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldTimeType customFieldTimeType = CustomFieldTimeType.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CustomFieldTimeTypeImpl.class)
public interface CustomFieldTimeType extends FieldType {

    /**
     * discriminator value for CustomFieldTimeType
     */
    String TIME = "Time";



    /**
     * factory method
     * @return instance of CustomFieldTimeType
     */
    public static CustomFieldTimeType of(){
        return new CustomFieldTimeTypeImpl();
    }
    

    /**
     * factory method to create a shallow copy CustomFieldTimeType
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomFieldTimeType of(final CustomFieldTimeType template) {
        CustomFieldTimeTypeImpl instance = new CustomFieldTimeTypeImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomFieldTimeType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomFieldTimeType deepCopy(@Nullable final CustomFieldTimeType template) {
        if (template == null) {
            return null;
        }
        CustomFieldTimeTypeImpl instance = new CustomFieldTimeTypeImpl();
        return instance;
    }

    /**
     * builder factory method for CustomFieldTimeType
     * @return builder
     */
    public static CustomFieldTimeTypeBuilder builder() {
        return CustomFieldTimeTypeBuilder.of();
    }
    
    /**
     * create builder for CustomFieldTimeType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldTimeTypeBuilder builder(final CustomFieldTimeType template) {
        return CustomFieldTimeTypeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomFieldTimeType(Function<CustomFieldTimeType, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomFieldTimeType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFieldTimeType>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFieldTimeType>";
            }
        };
    }
}
