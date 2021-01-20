
package com.commercetools.api.models.type;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.CustomFieldDateTypeImpl;
import com.commercetools.api.models.type.FieldType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomFieldDateTypeImpl.class)
public interface CustomFieldDateType extends FieldType {

    public static CustomFieldDateType of() {
        return new CustomFieldDateTypeImpl();
    }

    public static CustomFieldDateType of(final CustomFieldDateType template) {
        CustomFieldDateTypeImpl instance = new CustomFieldDateTypeImpl();
        return instance;
    }

    public static CustomFieldDateTypeBuilder builder() {
        return CustomFieldDateTypeBuilder.of();
    }

    public static CustomFieldDateTypeBuilder builder(final CustomFieldDateType template) {
        return CustomFieldDateTypeBuilder.of(template);
    }

    default <T> T withCustomFieldDateType(Function<CustomFieldDateType, T> helper) {
        return helper.apply(this);
    }
}
