
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
@JsonDeserialize(as = SetCustomLineItemCustomFieldChangeImpl.class)
public interface SetCustomLineItemCustomFieldChange extends Change {

    String SET_CUSTOM_LINE_ITEM_CUSTOM_FIELD_CHANGE = "SetCustomLineItemCustomFieldChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setCustomLineItemCustomField</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @NotNull
    @Valid
    @JsonProperty("customLineItem")
    public LocalizedString getCustomLineItem();

    @NotNull
    @JsonProperty("nextValue")
    public Object getNextValue();

    @NotNull
    @JsonProperty("previousValue")
    public Object getPreviousValue();

    public void setChange(final String change);

    public void setName(final String name);

    public void setCustomLineItem(final LocalizedString customLineItem);

    public void setNextValue(final Object nextValue);

    public void setPreviousValue(final Object previousValue);

    public static SetCustomLineItemCustomFieldChange of() {
        return new SetCustomLineItemCustomFieldChangeImpl();
    }

    public static SetCustomLineItemCustomFieldChange of(final SetCustomLineItemCustomFieldChange template) {
        SetCustomLineItemCustomFieldChangeImpl instance = new SetCustomLineItemCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setName(template.getName());
        instance.setCustomLineItem(template.getCustomLineItem());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetCustomLineItemCustomFieldChangeBuilder builder() {
        return SetCustomLineItemCustomFieldChangeBuilder.of();
    }

    public static SetCustomLineItemCustomFieldChangeBuilder builder(final SetCustomLineItemCustomFieldChange template) {
        return SetCustomLineItemCustomFieldChangeBuilder.of(template);
    }

    default <T> T withSetCustomLineItemCustomFieldChange(Function<SetCustomLineItemCustomFieldChange, T> helper) {
        return helper.apply(this);
    }
}
