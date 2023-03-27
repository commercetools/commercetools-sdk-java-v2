
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Attribute type for nesting Attributes based on some existing ProductType. It does not support <code>isSearchable</code> and is not supported in queries. The only supported AttributeConstraint is <code>None</code>.</p>
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeNestedTypeImpl.class)
public interface AttributeNestedType extends AttributeType {

    /**
     * discriminator value for AttributeNestedType
     */
    String NESTED = "nested";

    /**
     *  <p>Attributes that can be stored as nested Attributes of the current Attribute.</p>
     * @return typeReference
     */
    @NotNull
    @Valid
    @JsonProperty("typeReference")
    public ProductTypeReference getTypeReference();

    /**
     *  <p>Attributes that can be stored as nested Attributes of the current Attribute.</p>
     * @param typeReference value to be set
     */

    public void setTypeReference(final ProductTypeReference typeReference);

    /**
     * factory method
     * @return instance of AttributeNestedType
     */
    public static AttributeNestedType of() {
        return new AttributeNestedTypeImpl();
    }

    /**
     * factory method to copy an instance of AttributeNestedType
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeNestedType of(final AttributeNestedType template) {
        AttributeNestedTypeImpl instance = new AttributeNestedTypeImpl();
        instance.setTypeReference(template.getTypeReference());
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
