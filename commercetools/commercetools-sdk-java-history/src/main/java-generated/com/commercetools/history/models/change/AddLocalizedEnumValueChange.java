
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.LocalizedEnumValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AddLocalizedEnumValueChangeImpl.class)
public interface AddLocalizedEnumValueChange extends Change {

    String ADD_LOCALIZED_ENUM_VALUE_CHANGE = "AddLocalizedEnumValueChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>addLocalizedEnumValue</code> on types</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
    *  <p>The name of the field definition updated.</p>
    */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    /**
    *  <p>The name of the attribute updated.</p>
    */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LocalizedEnumValue getNextValue();

    public void setChange(final String change);

    public void setFieldName(final String fieldName);

    public void setAttributeName(final String attributeName);

    public void setNextValue(final LocalizedEnumValue nextValue);

    public static AddLocalizedEnumValueChange of() {
        return new AddLocalizedEnumValueChangeImpl();
    }

    public static AddLocalizedEnumValueChange of(final AddLocalizedEnumValueChange template) {
        AddLocalizedEnumValueChangeImpl instance = new AddLocalizedEnumValueChangeImpl();
        instance.setChange(template.getChange());
        instance.setFieldName(template.getFieldName());
        instance.setAttributeName(template.getAttributeName());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static AddLocalizedEnumValueChangeBuilder builder() {
        return AddLocalizedEnumValueChangeBuilder.of();
    }

    public static AddLocalizedEnumValueChangeBuilder builder(final AddLocalizedEnumValueChange template) {
        return AddLocalizedEnumValueChangeBuilder.of(template);
    }

    default <T> T withAddLocalizedEnumValueChange(Function<AddLocalizedEnumValueChange, T> helper) {
        return helper.apply(this);
    }
}
