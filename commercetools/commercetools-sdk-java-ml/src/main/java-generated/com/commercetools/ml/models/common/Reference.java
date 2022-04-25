
package com.commercetools.ml.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.ml.models.common.CategoryReferenceImpl.class, name = CategoryReference.CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.ml.models.common.ProductReferenceImpl.class, name = ProductReference.PRODUCT),
        @JsonSubTypes.Type(value = com.commercetools.ml.models.common.ProductTypeReferenceImpl.class, name = ProductTypeReference.PRODUCT_TYPE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "typeId", defaultImpl = ReferenceImpl.class, visible = true)
@JsonDeserialize(as = ReferenceImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface Reference {

    @NotNull
    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();

    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setId(final String id);

    public static com.commercetools.ml.models.common.CategoryReferenceBuilder categoryBuilder() {
        return com.commercetools.ml.models.common.CategoryReferenceBuilder.of();
    }

    public static com.commercetools.ml.models.common.ProductReferenceBuilder productBuilder() {
        return com.commercetools.ml.models.common.ProductReferenceBuilder.of();
    }

    public static com.commercetools.ml.models.common.ProductTypeReferenceBuilder productTypeBuilder() {
        return com.commercetools.ml.models.common.ProductTypeReferenceBuilder.of();
    }

    default <T> T withReference(Function<Reference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Reference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Reference>() {
            @Override
            public String toString() {
                return "TypeReference<Reference>";
            }
        };
    }
}
