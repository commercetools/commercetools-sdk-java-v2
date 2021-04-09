
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
@JsonDeserialize(as = ChangeEnumValueOrderChangeImpl.class)
public interface ChangeEnumValueOrderChange extends Change {

    String CHANGE_ENUM_VALUE_ORDER_CHANGE = "ChangeEnumValueOrderChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>changeEnumValueOrder</code> on types</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
    *  <p>The name of the field/attribute definition updated.</p>
    */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<EnumValue> getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<EnumValue> getPreviousValue();

    public void setChange(final String change);

    public void setFieldName(final String fieldName);

    @JsonIgnore
    public void setNextValue(final EnumValue... nextValue);

    public void setNextValue(final List<EnumValue> nextValue);

    @JsonIgnore
    public void setPreviousValue(final EnumValue... previousValue);

    public void setPreviousValue(final List<EnumValue> previousValue);

    public static ChangeEnumValueOrderChange of() {
        return new ChangeEnumValueOrderChangeImpl();
    }

    public static ChangeEnumValueOrderChange of(final ChangeEnumValueOrderChange template) {
        ChangeEnumValueOrderChangeImpl instance = new ChangeEnumValueOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setFieldName(template.getFieldName());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static ChangeEnumValueOrderChangeBuilder builder() {
        return ChangeEnumValueOrderChangeBuilder.of();
    }

    public static ChangeEnumValueOrderChangeBuilder builder(final ChangeEnumValueOrderChange template) {
        return ChangeEnumValueOrderChangeBuilder.of(template);
    }

    default <T> T withChangeEnumValueOrderChange(Function<ChangeEnumValueOrderChange, T> helper) {
        return helper.apply(this);
    }
}
