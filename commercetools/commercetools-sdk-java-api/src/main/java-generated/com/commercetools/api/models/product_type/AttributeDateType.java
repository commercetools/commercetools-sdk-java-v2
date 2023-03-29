
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeDateType
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeDateType attributeDateType = AttributeDateType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeDateTypeImpl.class)
public interface AttributeDateType extends AttributeType {

    /**
     * discriminator value for AttributeDateType
     */
    String DATE = "date";

    /**
     * factory method
     * @return instance of AttributeDateType
     */
    public static AttributeDateType of() {
        return new AttributeDateTypeImpl();
    }

    /**
     * factory method to create a shallow copy AttributeDateType
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeDateType of(final AttributeDateType template) {
        AttributeDateTypeImpl instance = new AttributeDateTypeImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of AttributeDateType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeDateType deepCopy(@Nullable final AttributeDateType template) {
        if (template == null) {
            return null;
        }
        AttributeDateTypeImpl instance = new AttributeDateTypeImpl();
        return instance;
    }

    /**
     * builder factory method for AttributeDateType
     * @return builder
     */
    public static AttributeDateTypeBuilder builder() {
        return AttributeDateTypeBuilder.of();
    }

    /**
     * create builder for AttributeDateType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeDateTypeBuilder builder(final AttributeDateType template) {
        return AttributeDateTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeDateType(Function<AttributeDateType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeDateType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeDateType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeDateType>";
            }
        };
    }
}
