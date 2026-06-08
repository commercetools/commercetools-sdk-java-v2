
package com.commercetools.importapi.models.producttypes;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * AttributeSetType
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeSetType attributeSetType = AttributeSetType.builder()
 *             .elementType(elementTypeBuilder -> elementTypeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("set")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeSetTypeImpl.class)
public interface AttributeSetType extends AttributeType {

    /**
     * discriminator value for AttributeSetType
     */
    String SET = "set";

    /**
     *
     * @return elementType
     */
    @NotNull
    @Valid
    @JsonProperty("elementType")
    public AttributeType getElementType();

    /**
     * set elementType
     * @param elementType value to be set
     */

    public void setElementType(final AttributeType elementType);

    /**
     * factory method
     * @return instance of AttributeSetType
     */
    public static AttributeSetType of() {
        return new AttributeSetTypeImpl();
    }

    /**
     * factory method to create a shallow copy AttributeSetType
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeSetType of(final AttributeSetType template) {
        AttributeSetTypeImpl instance = new AttributeSetTypeImpl();
        instance.setElementType(template.getElementType());
        return instance;
    }

    public AttributeSetType copyDeep();

    /**
     * factory method to create a deep copy of AttributeSetType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeSetType deepCopy(@Nullable final AttributeSetType template) {
        if (template == null) {
            return null;
        }
        AttributeSetTypeImpl instance = new AttributeSetTypeImpl();
        instance.setElementType(
            com.commercetools.importapi.models.producttypes.AttributeType.deepCopy(template.getElementType()));
        return instance;
    }

    /**
     * builder factory method for AttributeSetType
     * @return builder
     */
    public static AttributeSetTypeBuilder builder() {
        return AttributeSetTypeBuilder.of();
    }

    /**
     * create builder for AttributeSetType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeSetTypeBuilder builder(final AttributeSetType template) {
        return AttributeSetTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeSetType(Function<AttributeSetType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeSetType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeSetType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeSetType>";
            }
        };
    }
}
