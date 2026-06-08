
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Attribute type for <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> type values.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeReferenceType attributeReferenceType = AttributeReferenceType.builder()
 *             .referenceTypeId(AttributeReferenceTypeId.ASSOCIATE_ROLE)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("reference")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeReferenceTypeImpl.class)
public interface AttributeReferenceType extends AttributeType {

    /**
     * discriminator value for AttributeReferenceType
     */
    String REFERENCE = "reference";

    /**
     *  <p>Name of the resource type that the value should reference.</p>
     * @return referenceTypeId
     */
    @NotNull
    @JsonProperty("referenceTypeId")
    public AttributeReferenceTypeId getReferenceTypeId();

    /**
     *  <p>Name of the resource type that the value should reference.</p>
     * @param referenceTypeId value to be set
     */

    public void setReferenceTypeId(final AttributeReferenceTypeId referenceTypeId);

    /**
     * factory method
     * @return instance of AttributeReferenceType
     */
    public static AttributeReferenceType of() {
        return new AttributeReferenceTypeImpl();
    }

    /**
     * factory method to create a shallow copy AttributeReferenceType
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeReferenceType of(final AttributeReferenceType template) {
        AttributeReferenceTypeImpl instance = new AttributeReferenceTypeImpl();
        instance.setReferenceTypeId(template.getReferenceTypeId());
        return instance;
    }

    public AttributeReferenceType copyDeep();

    /**
     * factory method to create a deep copy of AttributeReferenceType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeReferenceType deepCopy(@Nullable final AttributeReferenceType template) {
        if (template == null) {
            return null;
        }
        AttributeReferenceTypeImpl instance = new AttributeReferenceTypeImpl();
        instance.setReferenceTypeId(template.getReferenceTypeId());
        return instance;
    }

    /**
     * builder factory method for AttributeReferenceType
     * @return builder
     */
    public static AttributeReferenceTypeBuilder builder() {
        return AttributeReferenceTypeBuilder.of();
    }

    /**
     * create builder for AttributeReferenceType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeReferenceTypeBuilder builder(final AttributeReferenceType template) {
        return AttributeReferenceTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeReferenceType(Function<AttributeReferenceType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeReferenceType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeReferenceType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeReferenceType>";
            }
        };
    }
}
