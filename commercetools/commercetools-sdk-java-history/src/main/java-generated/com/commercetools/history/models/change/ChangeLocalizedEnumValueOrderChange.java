
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
@JsonDeserialize(as = ChangeLocalizedEnumValueOrderChangeImpl.class)
public interface ChangeLocalizedEnumValueOrderChange extends Change {

    String CHANGE_LOCALIZED_ENUM_VALUE_ORDER_CHANGE = "ChangeLocalizedEnumValueOrderChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>changeLocalizedEnumValueOrder</code> on types and product types</p>
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
    public List<LocalizedEnumValue> getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<LocalizedEnumValue> getPreviousValue();

    public void setChange(final String change);

    public void setFieldName(final String fieldName);

    public void setAttributeName(final String attributeName);

    @JsonIgnore
    public void setNextValue(final LocalizedEnumValue... nextValue);

    public void setNextValue(final List<LocalizedEnumValue> nextValue);

    @JsonIgnore
    public void setPreviousValue(final LocalizedEnumValue... previousValue);

    public void setPreviousValue(final List<LocalizedEnumValue> previousValue);

    public static ChangeLocalizedEnumValueOrderChange of() {
        return new ChangeLocalizedEnumValueOrderChangeImpl();
    }

    public static ChangeLocalizedEnumValueOrderChange of(final ChangeLocalizedEnumValueOrderChange template) {
        ChangeLocalizedEnumValueOrderChangeImpl instance = new ChangeLocalizedEnumValueOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setFieldName(template.getFieldName());
        instance.setAttributeName(template.getAttributeName());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static ChangeLocalizedEnumValueOrderChangeBuilder builder() {
        return ChangeLocalizedEnumValueOrderChangeBuilder.of();
    }

    public static ChangeLocalizedEnumValueOrderChangeBuilder builder(
            final ChangeLocalizedEnumValueOrderChange template) {
        return ChangeLocalizedEnumValueOrderChangeBuilder.of(template);
    }

    default <T> T withChangeLocalizedEnumValueOrderChange(Function<ChangeLocalizedEnumValueOrderChange, T> helper) {
        return helper.apply(this);
    }
}
