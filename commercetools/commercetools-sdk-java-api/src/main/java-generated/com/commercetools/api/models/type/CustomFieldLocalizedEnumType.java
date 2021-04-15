
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomFieldLocalizedEnumTypeImpl.class)
public interface CustomFieldLocalizedEnumType extends FieldType {

    String LOCALIZED_ENUM = "LocalizedEnum";

    @NotNull
    @Valid
    @JsonProperty("values")
    public List<CustomFieldLocalizedEnumValue> getValues();

    @JsonIgnore
    public void setValues(final CustomFieldLocalizedEnumValue... values);

    public void setValues(final List<CustomFieldLocalizedEnumValue> values);

    public static CustomFieldLocalizedEnumType of() {
        return new CustomFieldLocalizedEnumTypeImpl();
    }

    public static CustomFieldLocalizedEnumType of(final CustomFieldLocalizedEnumType template) {
        CustomFieldLocalizedEnumTypeImpl instance = new CustomFieldLocalizedEnumTypeImpl();
        instance.setValues(template.getValues());
        return instance;
    }

    public static CustomFieldLocalizedEnumTypeBuilder builder() {
        return CustomFieldLocalizedEnumTypeBuilder.of();
    }

    public static CustomFieldLocalizedEnumTypeBuilder builder(final CustomFieldLocalizedEnumType template) {
        return CustomFieldLocalizedEnumTypeBuilder.of(template);
    }

    default <T> T withCustomFieldLocalizedEnumType(Function<CustomFieldLocalizedEnumType, T> helper) {
        return helper.apply(this);
    }
}
