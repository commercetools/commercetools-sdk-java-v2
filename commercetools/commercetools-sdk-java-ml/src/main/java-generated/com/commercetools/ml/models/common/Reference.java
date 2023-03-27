
package com.commercetools.ml.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * Reference
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Reference reference = Reference.categoryBuilder()
 *             id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.ml.models.common.CategoryReferenceImpl.class, name = CategoryReference.CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.ml.models.common.ProductReferenceImpl.class, name = ProductReference.PRODUCT),
        @JsonSubTypes.Type(value = com.commercetools.ml.models.common.ProductTypeReferenceImpl.class, name = ProductTypeReference.PRODUCT_TYPE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "typeId", defaultImpl = ReferenceImpl.class, visible = true)
@JsonDeserialize(as = ReferenceImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface Reference {

    /**
     *
     * @return typeId
     */
    @NotNull
    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();

    /**
     *
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     * set id
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * builder for category subtype
     * @return builder
     */
    public static com.commercetools.ml.models.common.CategoryReferenceBuilder categoryBuilder() {
        return com.commercetools.ml.models.common.CategoryReferenceBuilder.of();
    }

    /**
     * builder for product subtype
     * @return builder
     */
    public static com.commercetools.ml.models.common.ProductReferenceBuilder productBuilder() {
        return com.commercetools.ml.models.common.ProductReferenceBuilder.of();
    }

    /**
     * builder for productType subtype
     * @return builder
     */
    public static com.commercetools.ml.models.common.ProductTypeReferenceBuilder productTypeBuilder() {
        return com.commercetools.ml.models.common.ProductTypeReferenceBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReference(Function<Reference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Reference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Reference>() {
            @Override
            public String toString() {
                return "TypeReference<Reference>";
            }
        };
    }
}
