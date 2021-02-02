
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
@JsonDeserialize(as = TypeAddLocalizedEnumValueActionImpl.class)
public interface TypeAddLocalizedEnumValueAction extends TypeUpdateAction {

    String ADD_LOCALIZED_ENUM_VALUE = "addLocalizedEnumValue";

    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    @NotNull
    @Valid
    @JsonProperty("value")
    public CustomFieldLocalizedEnumValue getValue();

    public void setFieldName(final String fieldName);

    public void setValue(final CustomFieldLocalizedEnumValue value);

    public static TypeAddLocalizedEnumValueAction of() {
        return new TypeAddLocalizedEnumValueActionImpl();
    }

    public static TypeAddLocalizedEnumValueAction of(final TypeAddLocalizedEnumValueAction template) {
        TypeAddLocalizedEnumValueActionImpl instance = new TypeAddLocalizedEnumValueActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static TypeAddLocalizedEnumValueActionBuilder builder() {
        return TypeAddLocalizedEnumValueActionBuilder.of();
    }

    public static TypeAddLocalizedEnumValueActionBuilder builder(final TypeAddLocalizedEnumValueAction template) {
        return TypeAddLocalizedEnumValueActionBuilder.of(template);
    }

    default <T> T withTypeAddLocalizedEnumValueAction(Function<TypeAddLocalizedEnumValueAction, T> helper) {
        return helper.apply(this);
    }
}
