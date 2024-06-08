
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * FieldType
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FieldType fieldType = FieldType.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = FieldTypeImpl.class)
public interface FieldType {

    /**
     *
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     * set name
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of FieldType
     */
    public static FieldType of() {
        return new FieldTypeImpl();
    }

    /**
     * factory method to create a shallow copy FieldType
     * @param template instance to be copied
     * @return copy instance
     */
    public static FieldType of(final FieldType template) {
        FieldTypeImpl instance = new FieldTypeImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * factory method to create a deep copy of FieldType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static FieldType deepCopy(@Nullable final FieldType template) {
        if (template == null) {
            return null;
        }
        FieldTypeImpl instance = new FieldTypeImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for FieldType
     * @return builder
     */
    public static FieldTypeBuilder builder() {
        return FieldTypeBuilder.of();
    }

    /**
     * create builder for FieldType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static FieldTypeBuilder builder(final FieldType template) {
        return FieldTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withFieldType(Function<FieldType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<FieldType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<FieldType>() {
            @Override
            public String toString() {
                return "TypeReference<FieldType>";
            }
        };
    }
}
