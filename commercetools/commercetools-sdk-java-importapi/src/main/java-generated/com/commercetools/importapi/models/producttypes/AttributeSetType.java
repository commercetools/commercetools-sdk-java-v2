
package com.commercetools.importapi.models.producttypes;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AttributeSetTypeImpl.class)
public interface AttributeSetType extends AttributeType {

    String SET = "set";

    @NotNull
    @Valid
    @JsonProperty("elementType")
    public AttributeType getElementType();

    public void setElementType(final AttributeType elementType);

    public static AttributeSetType of() {
        return new AttributeSetTypeImpl();
    }

    public static AttributeSetType of(final AttributeSetType template) {
        AttributeSetTypeImpl instance = new AttributeSetTypeImpl();
        instance.setElementType(template.getElementType());
        return instance;
    }

    public static AttributeSetTypeBuilder builder() {
        return AttributeSetTypeBuilder.of();
    }

    public static AttributeSetTypeBuilder builder(final AttributeSetType template) {
        return AttributeSetTypeBuilder.of(template);
    }

    default <T> T withAttributeSetType(Function<AttributeSetType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeSetType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeSetType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeSetType>";
            }
        };
    }
}
