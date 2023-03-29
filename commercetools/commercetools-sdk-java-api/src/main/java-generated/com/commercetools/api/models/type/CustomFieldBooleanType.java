
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Field type for Boolean values.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldBooleanType customFieldBooleanType = CustomFieldBooleanType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomFieldBooleanTypeImpl.class)
public interface CustomFieldBooleanType extends FieldType {

    /**
     * discriminator value for CustomFieldBooleanType
     */
    String BOOLEAN = "Boolean";

    /**
     * factory method
     * @return instance of CustomFieldBooleanType
     */
    public static CustomFieldBooleanType of() {
        return new CustomFieldBooleanTypeImpl();
    }

    /**
     * factory method to create a shallow copy CustomFieldBooleanType
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomFieldBooleanType of(final CustomFieldBooleanType template) {
        CustomFieldBooleanTypeImpl instance = new CustomFieldBooleanTypeImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomFieldBooleanType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomFieldBooleanType deepCopy(@Nullable final CustomFieldBooleanType template) {
        if (template == null) {
            return null;
        }
        CustomFieldBooleanTypeImpl instance = new CustomFieldBooleanTypeImpl();
        return instance;
    }

    /**
     * builder factory method for CustomFieldBooleanType
     * @return builder
     */
    public static CustomFieldBooleanTypeBuilder builder() {
        return CustomFieldBooleanTypeBuilder.of();
    }

    /**
     * create builder for CustomFieldBooleanType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldBooleanTypeBuilder builder(final CustomFieldBooleanType template) {
        return CustomFieldBooleanTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomFieldBooleanType(Function<CustomFieldBooleanType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomFieldBooleanType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFieldBooleanType>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFieldBooleanType>";
            }
        };
    }
}
