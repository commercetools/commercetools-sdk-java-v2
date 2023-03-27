
package com.commercetools.importapi.models.producttypes;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeBooleanType
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeBooleanType attributeBooleanType = AttributeBooleanType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeBooleanTypeImpl.class)
public interface AttributeBooleanType extends AttributeType {

    /**
     * discriminator value for AttributeBooleanType
     */
    String BOOLEAN = "boolean";

    /**
     * factory method
     * @return instance of AttributeBooleanType
     */
    public static AttributeBooleanType of() {
        return new AttributeBooleanTypeImpl();
    }

    /**
     * factory method to copy an instance of AttributeBooleanType
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeBooleanType of(final AttributeBooleanType template) {
        AttributeBooleanTypeImpl instance = new AttributeBooleanTypeImpl();
        return instance;
    }

    /**
     * builder factory method for AttributeBooleanType
     * @return builder
     */
    public static AttributeBooleanTypeBuilder builder() {
        return AttributeBooleanTypeBuilder.of();
    }

    /**
     * create builder for AttributeBooleanType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeBooleanTypeBuilder builder(final AttributeBooleanType template) {
        return AttributeBooleanTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeBooleanType(Function<AttributeBooleanType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeBooleanType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeBooleanType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeBooleanType>";
            }
        };
    }
}
