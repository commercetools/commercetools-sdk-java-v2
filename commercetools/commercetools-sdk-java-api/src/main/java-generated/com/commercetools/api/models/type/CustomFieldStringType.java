
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Field type for string values.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomFieldStringTypeImpl.class)
public interface CustomFieldStringType extends FieldType {

    String STRING = "String";

    public static CustomFieldStringType of() {
        return new CustomFieldStringTypeImpl();
    }

    public static CustomFieldStringType of(final CustomFieldStringType template) {
        CustomFieldStringTypeImpl instance = new CustomFieldStringTypeImpl();
        return instance;
    }

    public static CustomFieldStringTypeBuilder builder() {
        return CustomFieldStringTypeBuilder.of();
    }

    public static CustomFieldStringTypeBuilder builder(final CustomFieldStringType template) {
        return CustomFieldStringTypeBuilder.of(template);
    }

    default <T> T withCustomFieldStringType(Function<CustomFieldStringType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomFieldStringType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFieldStringType>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFieldStringType>";
            }
        };
    }
}
