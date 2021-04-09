
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
@JsonDeserialize(as = RemoveLocalizedEnumValuesChangeImpl.class)
public interface RemoveLocalizedEnumValuesChange extends Change {

    String REMOVE_LOCALIZED_ENUM_VALUES_CHANGE = "RemoveLocalizedEnumValuesChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>removeEnumValues</code> on product types</p>
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
    @JsonProperty("previousValue")
    public LocalizedEnumValue getPreviousValue();

    public void setChange(final String change);

    public void setAttributeName(final String attributeName);

    public void setPreviousValue(final LocalizedEnumValue previousValue);

    public static RemoveLocalizedEnumValuesChange of() {
        return new RemoveLocalizedEnumValuesChangeImpl();
    }

    public static RemoveLocalizedEnumValuesChange of(final RemoveLocalizedEnumValuesChange template) {
        RemoveLocalizedEnumValuesChangeImpl instance = new RemoveLocalizedEnumValuesChangeImpl();
        instance.setChange(template.getChange());
        instance.setAttributeName(template.getAttributeName());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static RemoveLocalizedEnumValuesChangeBuilder builder() {
        return RemoveLocalizedEnumValuesChangeBuilder.of();
    }

    public static RemoveLocalizedEnumValuesChangeBuilder builder(final RemoveLocalizedEnumValuesChange template) {
        return RemoveLocalizedEnumValuesChangeBuilder.of(template);
    }

    default <T> T withRemoveLocalizedEnumValuesChange(Function<RemoveLocalizedEnumValuesChange, T> helper) {
        return helper.apply(this);
    }
}
