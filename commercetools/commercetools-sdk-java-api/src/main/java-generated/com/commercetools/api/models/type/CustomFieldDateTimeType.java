
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Field type for <a href="ctp:api:type:DateTime">DateTime</a> values.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomFieldDateTimeTypeImpl.class)
public interface CustomFieldDateTimeType extends FieldType {

    String DATE_TIME = "DateTime";

    public static CustomFieldDateTimeType of() {
        return new CustomFieldDateTimeTypeImpl();
    }

    public static CustomFieldDateTimeType of(final CustomFieldDateTimeType template) {
        CustomFieldDateTimeTypeImpl instance = new CustomFieldDateTimeTypeImpl();
        return instance;
    }

    public static CustomFieldDateTimeTypeBuilder builder() {
        return CustomFieldDateTimeTypeBuilder.of();
    }

    public static CustomFieldDateTimeTypeBuilder builder(final CustomFieldDateTimeType template) {
        return CustomFieldDateTimeTypeBuilder.of(template);
    }

    default <T> T withCustomFieldDateTimeType(Function<CustomFieldDateTimeType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomFieldDateTimeType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFieldDateTimeType>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFieldDateTimeType>";
            }
        };
    }
}
