
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeLocalizedEnumValueLabelChangeImpl.class)
public interface ChangeLocalizedEnumValueLabelChange extends Change {

    String CHANGE_LOCALIZED_ENUM_VALUE_LABEL_CHANGE = "ChangeLocalizedEnumValueLabelChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>changeLocalizedEnumValueLabel</code> on types</p>
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

    /**
    *  <p>Key of the values that was updated</p>
    */
    @NotNull
    @JsonProperty("valueKey")
    public String getValueKey();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public LocalizedString getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LocalizedString getNextValue();

    public void setChange(final String change);

    public void setFieldName(final String fieldName);

    public void setAttributeName(final String attributeName);

    public void setValueKey(final String valueKey);

    public void setPreviousValue(final LocalizedString previousValue);

    public void setNextValue(final LocalizedString nextValue);

    public static ChangeLocalizedEnumValueLabelChange of() {
        return new ChangeLocalizedEnumValueLabelChangeImpl();
    }

    public static ChangeLocalizedEnumValueLabelChange of(final ChangeLocalizedEnumValueLabelChange template) {
        ChangeLocalizedEnumValueLabelChangeImpl instance = new ChangeLocalizedEnumValueLabelChangeImpl();
        instance.setChange(template.getChange());
        instance.setFieldName(template.getFieldName());
        instance.setAttributeName(template.getAttributeName());
        instance.setValueKey(template.getValueKey());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeLocalizedEnumValueLabelChangeBuilder builder() {
        return ChangeLocalizedEnumValueLabelChangeBuilder.of();
    }

    public static ChangeLocalizedEnumValueLabelChangeBuilder builder(
            final ChangeLocalizedEnumValueLabelChange template) {
        return ChangeLocalizedEnumValueLabelChangeBuilder.of(template);
    }

    default <T> T withChangeLocalizedEnumValueLabelChange(Function<ChangeLocalizedEnumValueLabelChange, T> helper) {
        return helper.apply(this);
    }
}
