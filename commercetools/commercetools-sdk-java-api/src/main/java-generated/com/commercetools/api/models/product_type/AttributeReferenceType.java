
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AttributeReferenceTypeImpl.class)
public interface AttributeReferenceType extends AttributeType {

    String REFERENCE = "reference";

    @NotNull
    @JsonProperty("referenceTypeId")
    public ReferenceTypeId getReferenceTypeId();

    public void setReferenceTypeId(final ReferenceTypeId referenceTypeId);

    public static AttributeReferenceType of() {
        return new AttributeReferenceTypeImpl();
    }

    public static AttributeReferenceType of(final AttributeReferenceType template) {
        AttributeReferenceTypeImpl instance = new AttributeReferenceTypeImpl();
        instance.setReferenceTypeId(template.getReferenceTypeId());
        return instance;
    }

    public static AttributeReferenceTypeBuilder builder() {
        return AttributeReferenceTypeBuilder.of();
    }

    public static AttributeReferenceTypeBuilder builder(final AttributeReferenceType template) {
        return AttributeReferenceTypeBuilder.of(template);
    }

    default <T> T withAttributeReferenceType(Function<AttributeReferenceType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeReferenceType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeReferenceType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeReferenceType>";
            }
        };
    }
}
