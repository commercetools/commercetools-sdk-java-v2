
package com.commercetools.importapi.models.producttypes;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeDateTimeType
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeDateTimeType attributeDateTimeType = AttributeDateTimeType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("datetime")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeDateTimeTypeImpl.class)
public interface AttributeDateTimeType extends AttributeType {

    /**
     * discriminator value for AttributeDateTimeType
     */
    String DATETIME = "datetime";

    /**
     * factory method
     * @return instance of AttributeDateTimeType
     */
    public static AttributeDateTimeType of() {
        return new AttributeDateTimeTypeImpl();
    }

    /**
     * factory method to create a shallow copy AttributeDateTimeType
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeDateTimeType of(final AttributeDateTimeType template) {
        AttributeDateTimeTypeImpl instance = new AttributeDateTimeTypeImpl();
        return instance;
    }

    public AttributeDateTimeType copyDeep();

    /**
     * factory method to create a deep copy of AttributeDateTimeType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeDateTimeType deepCopy(@Nullable final AttributeDateTimeType template) {
        if (template == null) {
            return null;
        }
        AttributeDateTimeTypeImpl instance = new AttributeDateTimeTypeImpl();
        return instance;
    }

    /**
     * builder factory method for AttributeDateTimeType
     * @return builder
     */
    public static AttributeDateTimeTypeBuilder builder() {
        return AttributeDateTimeTypeBuilder.of();
    }

    /**
     * create builder for AttributeDateTimeType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeDateTimeTypeBuilder builder(final AttributeDateTimeType template) {
        return AttributeDateTimeTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeDateTimeType(Function<AttributeDateTimeType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeDateTimeType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeDateTimeType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeDateTimeType>";
            }
        };
    }
}
