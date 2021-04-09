
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.TextLineItemValue;
import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetTextLineItemDescriptionChangeImpl.class)
public interface SetTextLineItemDescriptionChange extends Change {

    String SET_TEXT_LINE_ITEM_DESCRIPTION_CHANGE = "SetTextLineItemDescriptionChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("textLineItem")
    public TextLineItemValue getTextLineItem();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public LocalizedString getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LocalizedString getNextValue();

    public void setChange(final String change);

    public void setTextLineItem(final TextLineItemValue textLineItem);

    public void setPreviousValue(final LocalizedString previousValue);

    public void setNextValue(final LocalizedString nextValue);

    public static SetTextLineItemDescriptionChange of() {
        return new SetTextLineItemDescriptionChangeImpl();
    }

    public static SetTextLineItemDescriptionChange of(final SetTextLineItemDescriptionChange template) {
        SetTextLineItemDescriptionChangeImpl instance = new SetTextLineItemDescriptionChangeImpl();
        instance.setChange(template.getChange());
        instance.setTextLineItem(template.getTextLineItem());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetTextLineItemDescriptionChangeBuilder builder() {
        return SetTextLineItemDescriptionChangeBuilder.of();
    }

    public static SetTextLineItemDescriptionChangeBuilder builder(final SetTextLineItemDescriptionChange template) {
        return SetTextLineItemDescriptionChangeBuilder.of(template);
    }

    default <T> T withSetTextLineItemDescriptionChange(Function<SetTextLineItemDescriptionChange, T> helper) {
        return helper.apply(this);
    }
}
