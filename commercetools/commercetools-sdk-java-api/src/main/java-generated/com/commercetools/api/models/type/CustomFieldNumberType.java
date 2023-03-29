
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Field type for number values.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldNumberType customFieldNumberType = CustomFieldNumberType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomFieldNumberTypeImpl.class)
public interface CustomFieldNumberType extends FieldType {

    /**
     * discriminator value for CustomFieldNumberType
     */
    String NUMBER = "Number";

    /**
     * factory method
     * @return instance of CustomFieldNumberType
     */
    public static CustomFieldNumberType of() {
        return new CustomFieldNumberTypeImpl();
    }

    /**
     * factory method to create a shallow copy CustomFieldNumberType
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomFieldNumberType of(final CustomFieldNumberType template) {
        CustomFieldNumberTypeImpl instance = new CustomFieldNumberTypeImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomFieldNumberType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomFieldNumberType deepCopy(@Nullable final CustomFieldNumberType template) {
        if (template == null) {
            return null;
        }
        CustomFieldNumberTypeImpl instance = new CustomFieldNumberTypeImpl();
        return instance;
    }

    /**
     * builder factory method for CustomFieldNumberType
     * @return builder
     */
    public static CustomFieldNumberTypeBuilder builder() {
        return CustomFieldNumberTypeBuilder.of();
    }

    /**
     * create builder for CustomFieldNumberType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldNumberTypeBuilder builder(final CustomFieldNumberType template) {
        return CustomFieldNumberTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomFieldNumberType(Function<CustomFieldNumberType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomFieldNumberType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFieldNumberType>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFieldNumberType>";
            }
        };
    }
}
