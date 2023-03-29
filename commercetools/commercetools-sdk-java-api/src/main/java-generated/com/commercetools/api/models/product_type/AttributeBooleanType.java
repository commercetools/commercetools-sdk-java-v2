
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Attribute type for Boolean values. Valid values for the Attribute are <code>true</code> and <code>false</code> (JSON Boolean).</p>
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
     * factory method to create a shallow copy AttributeBooleanType
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeBooleanType of(final AttributeBooleanType template) {
        AttributeBooleanTypeImpl instance = new AttributeBooleanTypeImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of AttributeBooleanType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeBooleanType deepCopy(@Nullable final AttributeBooleanType template) {
        if (template == null) {
            return null;
        }
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
