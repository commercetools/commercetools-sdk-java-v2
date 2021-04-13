
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangePlainEnumValueLabelChangeImpl.class)
public interface ChangePlainEnumValueLabelChange extends Change {

    String CHANGE_PLAIN_ENUM_VALUE_LABEL_CHANGE = "ChangePlainEnumValueLabelChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>changePlainEnumValueLabel</code> on types</p>
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

    public void setAttributeName(final String attributeName);

    public void setValueKey(final String valueKey);

    public void setPreviousValue(final String previousValue);

    public void setNextValue(final String nextValue);

    public static ChangePlainEnumValueLabelChange of() {
        return new ChangePlainEnumValueLabelChangeImpl();
    }

    public static ChangePlainEnumValueLabelChange of(final ChangePlainEnumValueLabelChange template) {
        ChangePlainEnumValueLabelChangeImpl instance = new ChangePlainEnumValueLabelChangeImpl();
        instance.setChange(template.getChange());
        instance.setAttributeName(template.getAttributeName());
        instance.setValueKey(template.getValueKey());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangePlainEnumValueLabelChangeBuilder builder() {
        return ChangePlainEnumValueLabelChangeBuilder.of();
    }

    public static ChangePlainEnumValueLabelChangeBuilder builder(final ChangePlainEnumValueLabelChange template) {
        return ChangePlainEnumValueLabelChangeBuilder.of(template);
    }

    default <T> T withChangePlainEnumValueLabelChange(Function<ChangePlainEnumValueLabelChange, T> helper) {
        return helper.apply(this);
    }
}
