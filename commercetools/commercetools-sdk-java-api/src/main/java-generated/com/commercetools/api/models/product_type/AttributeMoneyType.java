
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Attribute type for Money type values.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeMoneyType attributeMoneyType = AttributeMoneyType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("money")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeMoneyTypeImpl.class)
public interface AttributeMoneyType extends AttributeType {

    /**
     * discriminator value for AttributeMoneyType
     */
    String MONEY = "money";

    /**
     * factory method
     * @return instance of AttributeMoneyType
     */
    public static AttributeMoneyType of() {
        return new AttributeMoneyTypeImpl();
    }

    /**
     * factory method to create a shallow copy AttributeMoneyType
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeMoneyType of(final AttributeMoneyType template) {
        AttributeMoneyTypeImpl instance = new AttributeMoneyTypeImpl();
        return instance;
    }

    public AttributeMoneyType copyDeep();

    /**
     * factory method to create a deep copy of AttributeMoneyType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeMoneyType deepCopy(@Nullable final AttributeMoneyType template) {
        if (template == null) {
            return null;
        }
        AttributeMoneyTypeImpl instance = new AttributeMoneyTypeImpl();
        return instance;
    }

    /**
     * builder factory method for AttributeMoneyType
     * @return builder
     */
    public static AttributeMoneyTypeBuilder builder() {
        return AttributeMoneyTypeBuilder.of();
    }

    /**
     * create builder for AttributeMoneyType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeMoneyTypeBuilder builder(final AttributeMoneyType template) {
        return AttributeMoneyTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeMoneyType(Function<AttributeMoneyType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeMoneyType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeMoneyType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeMoneyType>";
            }
        };
    }
}
