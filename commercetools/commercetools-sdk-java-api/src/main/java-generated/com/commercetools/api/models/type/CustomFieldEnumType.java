
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
@JsonDeserialize(as = CustomFieldEnumTypeImpl.class)
public interface CustomFieldEnumType extends FieldType {

    String ENUM = "Enum";

    @NotNull
    @Valid
    @JsonProperty("values")
    public List<CustomFieldEnumValue> getValues();

    @JsonIgnore
    public void setValues(final CustomFieldEnumValue... values);

    public void setValues(final List<CustomFieldEnumValue> values);

    public static CustomFieldEnumType of() {
        return new CustomFieldEnumTypeImpl();
    }

    public static CustomFieldEnumType of(final CustomFieldEnumType template) {
        CustomFieldEnumTypeImpl instance = new CustomFieldEnumTypeImpl();
        instance.setValues(template.getValues());
        return instance;
    }

    public static CustomFieldEnumTypeBuilder builder() {
        return CustomFieldEnumTypeBuilder.of();
    }

    public static CustomFieldEnumTypeBuilder builder(final CustomFieldEnumType template) {
        return CustomFieldEnumTypeBuilder.of(template);
    }

    default <T> T withCustomFieldEnumType(Function<CustomFieldEnumType, T> helper) {
        return helper.apply(this);
    }
}
