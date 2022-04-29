
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AttributeTypeImpl.class)
public interface AttributeType {

    @NotNull
    @JsonProperty("name")
    public String getName();

    public void setName(final String name);

    public static AttributeType of() {
        return new AttributeTypeImpl();
    }

    public static AttributeType of(final AttributeType template) {
        AttributeTypeImpl instance = new AttributeTypeImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static AttributeTypeBuilder builder() {
        return AttributeTypeBuilder.of();
    }

    public static AttributeTypeBuilder builder(final AttributeType template) {
        return AttributeTypeBuilder.of(template);
    }

    default <T> T withAttributeType(Function<AttributeType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeType>";
            }
        };
    }
}
