package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldType;
import com.commercetools.api.models.type.CustomFieldDateTimeTypeImpl;

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
 *  <p>Field type for DateTime values.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldDateTimeType customFieldDateTimeType = CustomFieldDateTimeType.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CustomFieldDateTimeTypeImpl.class)
public interface CustomFieldDateTimeType extends FieldType {

    /**
     * discriminator value for CustomFieldDateTimeType
     */
    String DATE_TIME = "DateTime";



    /**
     * factory method
     * @return instance of CustomFieldDateTimeType
     */
    public static CustomFieldDateTimeType of(){
        return new CustomFieldDateTimeTypeImpl();
    }
    

    /**
     * factory method to create a shallow copy CustomFieldDateTimeType
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomFieldDateTimeType of(final CustomFieldDateTimeType template) {
        CustomFieldDateTimeTypeImpl instance = new CustomFieldDateTimeTypeImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomFieldDateTimeType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomFieldDateTimeType deepCopy(@Nullable final CustomFieldDateTimeType template) {
        if (template == null) {
            return null;
        }
        CustomFieldDateTimeTypeImpl instance = new CustomFieldDateTimeTypeImpl();
        return instance;
    }

    /**
     * builder factory method for CustomFieldDateTimeType
     * @return builder
     */
    public static CustomFieldDateTimeTypeBuilder builder() {
        return CustomFieldDateTimeTypeBuilder.of();
    }
    
    /**
     * create builder for CustomFieldDateTimeType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldDateTimeTypeBuilder builder(final CustomFieldDateTimeType template) {
        return CustomFieldDateTimeTypeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomFieldDateTimeType(Function<CustomFieldDateTimeType, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomFieldDateTimeType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFieldDateTimeType>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFieldDateTimeType>";
            }
        };
    }
}
