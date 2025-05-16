
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@io.vrap.rmf.base.client.utils.json.SubType("Time")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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
    public static CustomFieldTimeType of() {
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

    public CustomFieldTimeType copyDeep();

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
