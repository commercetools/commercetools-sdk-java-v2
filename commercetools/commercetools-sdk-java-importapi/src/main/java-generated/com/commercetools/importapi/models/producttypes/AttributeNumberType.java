
package com.commercetools.importapi.models.producttypes;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeNumberType
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeNumberType attributeNumberType = AttributeNumberType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("number")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeNumberTypeImpl.class)
public interface AttributeNumberType extends AttributeType {

    /**
     * discriminator value for AttributeNumberType
     */
    String NUMBER = "number";

    /**
     * factory method
     * @return instance of AttributeNumberType
     */
    public static AttributeNumberType of() {
        return new AttributeNumberTypeImpl();
    }

    /**
     * factory method to create a shallow copy AttributeNumberType
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeNumberType of(final AttributeNumberType template) {
        AttributeNumberTypeImpl instance = new AttributeNumberTypeImpl();
        return instance;
    }

    public AttributeNumberType copyDeep();

    /**
     * factory method to create a deep copy of AttributeNumberType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeNumberType deepCopy(@Nullable final AttributeNumberType template) {
        if (template == null) {
            return null;
        }
        AttributeNumberTypeImpl instance = new AttributeNumberTypeImpl();
        return instance;
    }

    /**
     * builder factory method for AttributeNumberType
     * @return builder
     */
    public static AttributeNumberTypeBuilder builder() {
        return AttributeNumberTypeBuilder.of();
    }

    /**
     * create builder for AttributeNumberType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeNumberTypeBuilder builder(final AttributeNumberType template) {
        return AttributeNumberTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeNumberType(Function<AttributeNumberType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeNumberType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeNumberType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeNumberType>";
            }
        };
    }
}
