
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
@JsonDeserialize(as = TypeAddEnumValueActionImpl.class)
public interface TypeAddEnumValueAction extends TypeUpdateAction {

    String ADD_ENUM_VALUE = "addEnumValue";

    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    @NotNull
    @Valid
    @JsonProperty("value")
    public CustomFieldEnumValue getValue();

    public void setFieldName(final String fieldName);

    public void setValue(final CustomFieldEnumValue value);

    public static TypeAddEnumValueAction of() {
        return new TypeAddEnumValueActionImpl();
    }

    public static TypeAddEnumValueAction of(final TypeAddEnumValueAction template) {
        TypeAddEnumValueActionImpl instance = new TypeAddEnumValueActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static TypeAddEnumValueActionBuilder builder() {
        return TypeAddEnumValueActionBuilder.of();
    }

    public static TypeAddEnumValueActionBuilder builder(final TypeAddEnumValueAction template) {
        return TypeAddEnumValueActionBuilder.of(template);
    }

    default <T> T withTypeAddEnumValueAction(Function<TypeAddEnumValueAction, T> helper) {
        return helper.apply(this);
    }
}
