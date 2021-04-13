
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.TextLineItemValue;
import com.commercetools.history.models.common.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetTextLineItemCustomTypeChangeImpl.class)
public interface SetTextLineItemCustomTypeChange extends Change {

    String SET_TEXT_LINE_ITEM_CUSTOM_TYPE_CHANGE = "SetTextLineItemCustomTypeChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setTextLineItemCustomType</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("textLineItem")
    public TextLineItemValue getTextLineItem();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomFields getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public CustomFields getPreviousValue();

    public void setChange(final String change);

    public void setTextLineItem(final TextLineItemValue textLineItem);

    public void setNextValue(final CustomFields nextValue);

    public void setPreviousValue(final CustomFields previousValue);

    public static SetTextLineItemCustomTypeChange of() {
        return new SetTextLineItemCustomTypeChangeImpl();
    }

    public static SetTextLineItemCustomTypeChange of(final SetTextLineItemCustomTypeChange template) {
        SetTextLineItemCustomTypeChangeImpl instance = new SetTextLineItemCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setTextLineItem(template.getTextLineItem());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetTextLineItemCustomTypeChangeBuilder builder() {
        return SetTextLineItemCustomTypeChangeBuilder.of();
    }

    public static SetTextLineItemCustomTypeChangeBuilder builder(final SetTextLineItemCustomTypeChange template) {
        return SetTextLineItemCustomTypeChangeBuilder.of(template);
    }

    default <T> T withSetTextLineItemCustomTypeChange(Function<SetTextLineItemCustomTypeChange, T> helper) {
        return helper.apply(this);
    }
}
