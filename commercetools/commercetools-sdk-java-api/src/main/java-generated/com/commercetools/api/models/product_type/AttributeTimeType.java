
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Attribute type for Time type values.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeTimeType attributeTimeType = AttributeTimeType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("time")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeTimeTypeImpl.class)
public interface AttributeTimeType extends AttributeType {

    /**
     * discriminator value for AttributeTimeType
     */
    String TIME = "time";

    /**
     * factory method
     * @return instance of AttributeTimeType
     */
    public static AttributeTimeType of() {
        return new AttributeTimeTypeImpl();
    }

    /**
     * factory method to create a shallow copy AttributeTimeType
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeTimeType of(final AttributeTimeType template) {
        AttributeTimeTypeImpl instance = new AttributeTimeTypeImpl();
        return instance;
    }

    public AttributeTimeType copyDeep();

    /**
     * factory method to create a deep copy of AttributeTimeType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeTimeType deepCopy(@Nullable final AttributeTimeType template) {
        if (template == null) {
            return null;
        }
        AttributeTimeTypeImpl instance = new AttributeTimeTypeImpl();
        return instance;
    }

    /**
     * builder factory method for AttributeTimeType
     * @return builder
     */
    public static AttributeTimeTypeBuilder builder() {
        return AttributeTimeTypeBuilder.of();
    }

    /**
     * create builder for AttributeTimeType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeTimeTypeBuilder builder(final AttributeTimeType template) {
        return AttributeTimeTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeTimeType(Function<AttributeTimeType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeTimeType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeTimeType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeTimeType>";
            }
        };
    }
}
