
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = FieldTypeImpl.class)
public interface FieldType {

    @NotNull
    @JsonProperty("name")
    public String getName();

    public void setName(final String name);

    public static FieldType of() {
        return new FieldTypeImpl();
    }

    public static FieldType of(final FieldType template) {
        FieldTypeImpl instance = new FieldTypeImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static FieldTypeBuilder builder() {
        return FieldTypeBuilder.of();
    }

    public static FieldTypeBuilder builder(final FieldType template) {
        return FieldTypeBuilder.of(template);
    }

    default <T> T withFieldType(Function<FieldType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<FieldType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<FieldType>() {
            @Override
            public String toString() {
                return "TypeReference<FieldType>";
            }
        };
    }
}
