
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.EnumValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AddPlainEnumValueChangeImpl.class)
public interface AddPlainEnumValueChange extends Change {

    String ADD_PLAIN_ENUM_VALUE_CHANGE = "AddPlainEnumValueChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>addPlainEnumValue</code> on product types</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
    *  <p>The name of the attribute updated.</p>
    */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public EnumValue getNextValue();

    public void setChange(final String change);

    public void setAttributeName(final String attributeName);

    public void setNextValue(final EnumValue nextValue);

    public static AddPlainEnumValueChange of() {
        return new AddPlainEnumValueChangeImpl();
    }

    public static AddPlainEnumValueChange of(final AddPlainEnumValueChange template) {
        AddPlainEnumValueChangeImpl instance = new AddPlainEnumValueChangeImpl();
        instance.setChange(template.getChange());
        instance.setAttributeName(template.getAttributeName());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static AddPlainEnumValueChangeBuilder builder() {
        return AddPlainEnumValueChangeBuilder.of();
    }

    public static AddPlainEnumValueChangeBuilder builder(final AddPlainEnumValueChange template) {
        return AddPlainEnumValueChangeBuilder.of(template);
    }

    default <T> T withAddPlainEnumValueChange(Function<AddPlainEnumValueChange, T> helper) {
        return helper.apply(this);
    }
}
