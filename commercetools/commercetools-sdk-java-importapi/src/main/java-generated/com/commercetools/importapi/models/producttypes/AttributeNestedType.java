
package com.commercetools.importapi.models.producttypes;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.ProductTypeKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * AttributeNestedType
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeNestedType attributeNestedType = AttributeNestedType.builder()
 *             .typeReference(typeReferenceBuilder -> typeReferenceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("nested")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeNestedTypeImpl.class)
public interface AttributeNestedType extends AttributeType {

    /**
     * discriminator value for AttributeNestedType
     */
    String NESTED = "nested";

    /**
     *  <p>References a ProductType by <code>key</code>.</p>
     * @return typeReference
     */
    @NotNull
    @Valid
    @JsonProperty("typeReference")
    public ProductTypeKeyReference getTypeReference();

    /**
     *  <p>References a ProductType by <code>key</code>.</p>
     * @param typeReference value to be set
     */

    public void setTypeReference(final ProductTypeKeyReference typeReference);

    /**
     * factory method
     * @return instance of AttributeNestedType
     */
    public static AttributeNestedType of() {
        return new AttributeNestedTypeImpl();
    }

    /**
     * factory method to create a shallow copy AttributeNestedType
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeNestedType of(final AttributeNestedType template) {
        AttributeNestedTypeImpl instance = new AttributeNestedTypeImpl();
        instance.setTypeReference(template.getTypeReference());
        return instance;
    }

    public AttributeNestedType copyDeep();

    /**
     * factory method to create a deep copy of AttributeNestedType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeNestedType deepCopy(@Nullable final AttributeNestedType template) {
        if (template == null) {
            return null;
        }
        AttributeNestedTypeImpl instance = new AttributeNestedTypeImpl();
        instance.setTypeReference(
            com.commercetools.importapi.models.common.ProductTypeKeyReference.deepCopy(template.getTypeReference()));
        return instance;
    }

    /**
     * builder factory method for AttributeNestedType
     * @return builder
     */
    public static AttributeNestedTypeBuilder builder() {
        return AttributeNestedTypeBuilder.of();
    }

    /**
     * create builder for AttributeNestedType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeNestedTypeBuilder builder(final AttributeNestedType template) {
        return AttributeNestedTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeNestedType(Function<AttributeNestedType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeNestedType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeNestedType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeNestedType>";
            }
        };
    }
}
