
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeEnumValueLabelChangeImpl.class)
public interface ChangeEnumValueLabelChange extends Change {

    String CHANGE_ENUM_VALUE_LABEL_CHANGE = "ChangeEnumValueLabelChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>changeEnumValueLabel</code> on types</p>
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
    *  <p>Key of the values that was updated</p>
    */
    @NotNull
    @JsonProperty("valueKey")
    public String getValueKey();

    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    public void setChange(final String change);

    public void setFieldName(final String fieldName);

    public void setValueKey(final String valueKey);

    public void setPreviousValue(final String previousValue);

    public void setNextValue(final String nextValue);

    public static ChangeEnumValueLabelChange of() {
        return new ChangeEnumValueLabelChangeImpl();
    }

    public static ChangeEnumValueLabelChange of(final ChangeEnumValueLabelChange template) {
        ChangeEnumValueLabelChangeImpl instance = new ChangeEnumValueLabelChangeImpl();
        instance.setChange(template.getChange());
        instance.setFieldName(template.getFieldName());
        instance.setValueKey(template.getValueKey());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeEnumValueLabelChangeBuilder builder() {
        return ChangeEnumValueLabelChangeBuilder.of();
    }

    public static ChangeEnumValueLabelChangeBuilder builder(final ChangeEnumValueLabelChange template) {
        return ChangeEnumValueLabelChangeBuilder.of(template);
    }

    default <T> T withChangeEnumValueLabelChange(Function<ChangeEnumValueLabelChange, T> helper) {
        return helper.apply(this);
    }
}
