package com.commercetools.importapi.models.types;

import com.commercetools.importapi.models.types.FieldType;
import com.commercetools.importapi.models.types.CustomFieldLocalizedStringTypeImpl;

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
 *  <p>Field type for LocalizedString values.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldLocalizedStringType customFieldLocalizedStringType = CustomFieldLocalizedStringType.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CustomFieldLocalizedStringTypeImpl.class)
public interface CustomFieldLocalizedStringType extends FieldType {

    /**
     * discriminator value for CustomFieldLocalizedStringType
     */
    String LOCALIZED_STRING = "LocalizedString";



    /**
     * factory method
     * @return instance of CustomFieldLocalizedStringType
     */
    public static CustomFieldLocalizedStringType of(){
        return new CustomFieldLocalizedStringTypeImpl();
    }
    

    /**
     * factory method to create a shallow copy CustomFieldLocalizedStringType
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomFieldLocalizedStringType of(final CustomFieldLocalizedStringType template) {
        CustomFieldLocalizedStringTypeImpl instance = new CustomFieldLocalizedStringTypeImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomFieldLocalizedStringType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomFieldLocalizedStringType deepCopy(@Nullable final CustomFieldLocalizedStringType template) {
        if (template == null) {
            return null;
        }
        CustomFieldLocalizedStringTypeImpl instance = new CustomFieldLocalizedStringTypeImpl();
        return instance;
    }

    /**
     * builder factory method for CustomFieldLocalizedStringType
     * @return builder
     */
    public static CustomFieldLocalizedStringTypeBuilder builder() {
        return CustomFieldLocalizedStringTypeBuilder.of();
    }
    
    /**
     * create builder for CustomFieldLocalizedStringType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldLocalizedStringTypeBuilder builder(final CustomFieldLocalizedStringType template) {
        return CustomFieldLocalizedStringTypeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomFieldLocalizedStringType(Function<CustomFieldLocalizedStringType, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomFieldLocalizedStringType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFieldLocalizedStringType>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFieldLocalizedStringType>";
            }
        };
    }
}
