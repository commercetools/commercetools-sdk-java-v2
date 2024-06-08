
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
 * AttributeType
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeType attributeType = AttributeType.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeTypeImpl.class)
public interface AttributeType {

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
     * @return instance of AttributeType
     */
    public static AttributeType of() {
        return new AttributeTypeImpl();
    }

    /**
     * factory method to create a shallow copy AttributeType
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeType of(final AttributeType template) {
        AttributeTypeImpl instance = new AttributeTypeImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * factory method to create a deep copy of AttributeType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeType deepCopy(@Nullable final AttributeType template) {
        if (template == null) {
            return null;
        }
        AttributeTypeImpl instance = new AttributeTypeImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for AttributeType
     * @return builder
     */
    public static AttributeTypeBuilder builder() {
        return AttributeTypeBuilder.of();
    }

    /**
     * create builder for AttributeType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeTypeBuilder builder(final AttributeType template) {
        return AttributeTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeType(Function<AttributeType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeType>";
            }
        };
    }
}
