
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
@JsonDeserialize(as = ChangeTextLineItemNameChangeImpl.class)
public interface ChangeTextLineItemNameChange extends Change {

    String CHANGE_TEXT_LINE_ITEM_NAME_CHANGE = "ChangeTextLineItemNameChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>changeTextLineItemName</code></p>
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
    public LocalizedString getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public LocalizedString getPreviousValue();

    public void setChange(final String change);

    public void setTextLineItem(final TextLineItemValue textLineItem);

    public void setNextValue(final LocalizedString nextValue);

    public void setPreviousValue(final LocalizedString previousValue);

    public static ChangeTextLineItemNameChange of() {
        return new ChangeTextLineItemNameChangeImpl();
    }

    public static ChangeTextLineItemNameChange of(final ChangeTextLineItemNameChange template) {
        ChangeTextLineItemNameChangeImpl instance = new ChangeTextLineItemNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setTextLineItem(template.getTextLineItem());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static ChangeTextLineItemNameChangeBuilder builder() {
        return ChangeTextLineItemNameChangeBuilder.of();
    }

    public static ChangeTextLineItemNameChangeBuilder builder(final ChangeTextLineItemNameChange template) {
        return ChangeTextLineItemNameChangeBuilder.of(template);
    }

    default <T> T withChangeTextLineItemNameChange(Function<ChangeTextLineItemNameChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTextLineItemNameChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTextLineItemNameChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTextLineItemNameChange>";
            }
        };
    }
}
