
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Attribute type for LocalizedString values.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeLocalizableTextType attributeLocalizableTextType = AttributeLocalizableTextType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeLocalizableTextTypeImpl.class)
public interface AttributeLocalizableTextType extends AttributeType {

    /**
     * discriminator value for AttributeLocalizableTextType
     */
    String LTEXT = "ltext";

    /**
     * factory method
     * @return instance of AttributeLocalizableTextType
     */
    public static AttributeLocalizableTextType of() {
        return new AttributeLocalizableTextTypeImpl();
    }

    /**
     * factory method to create a shallow copy AttributeLocalizableTextType
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeLocalizableTextType of(final AttributeLocalizableTextType template) {
        AttributeLocalizableTextTypeImpl instance = new AttributeLocalizableTextTypeImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of AttributeLocalizableTextType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeLocalizableTextType deepCopy(@Nullable final AttributeLocalizableTextType template) {
        if (template == null) {
            return null;
        }
        AttributeLocalizableTextTypeImpl instance = new AttributeLocalizableTextTypeImpl();
        return instance;
    }

    /**
     * builder factory method for AttributeLocalizableTextType
     * @return builder
     */
    public static AttributeLocalizableTextTypeBuilder builder() {
        return AttributeLocalizableTextTypeBuilder.of();
    }

    /**
     * create builder for AttributeLocalizableTextType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeLocalizableTextTypeBuilder builder(final AttributeLocalizableTextType template) {
        return AttributeLocalizableTextTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeLocalizableTextType(Function<AttributeLocalizableTextType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeLocalizableTextType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeLocalizableTextType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeLocalizableTextType>";
            }
        };
    }
}
