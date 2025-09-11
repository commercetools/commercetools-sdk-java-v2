
package com.commercetools.importapi.models.types;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Field type for <a href="https://docs.commercetools.com/apis/ctp:api:type:Date" rel="nofollow">Date</a> values.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldDateType customFieldDateType = CustomFieldDateType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Date")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomFieldDateTypeImpl.class)
public interface CustomFieldDateType extends FieldType {

    /**
     * discriminator value for CustomFieldDateType
     */
    String DATE = "Date";

    /**
     * factory method
     * @return instance of CustomFieldDateType
     */
    public static CustomFieldDateType of() {
        return new CustomFieldDateTypeImpl();
    }

    /**
     * factory method to create a shallow copy CustomFieldDateType
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomFieldDateType of(final CustomFieldDateType template) {
        CustomFieldDateTypeImpl instance = new CustomFieldDateTypeImpl();
        return instance;
    }

    public CustomFieldDateType copyDeep();

    /**
     * factory method to create a deep copy of CustomFieldDateType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomFieldDateType deepCopy(@Nullable final CustomFieldDateType template) {
        if (template == null) {
            return null;
        }
        CustomFieldDateTypeImpl instance = new CustomFieldDateTypeImpl();
        return instance;
    }

    /**
     * builder factory method for CustomFieldDateType
     * @return builder
     */
    public static CustomFieldDateTypeBuilder builder() {
        return CustomFieldDateTypeBuilder.of();
    }

    /**
     * create builder for CustomFieldDateType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldDateTypeBuilder builder(final CustomFieldDateType template) {
        return CustomFieldDateTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomFieldDateType(Function<CustomFieldDateType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomFieldDateType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFieldDateType>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFieldDateType>";
            }
        };
    }
}
