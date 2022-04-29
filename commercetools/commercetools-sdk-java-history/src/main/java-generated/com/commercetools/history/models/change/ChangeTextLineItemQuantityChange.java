
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.TextLineItemValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeTextLineItemQuantityChangeImpl.class)
public interface ChangeTextLineItemQuantityChange extends Change {

    String CHANGE_TEXT_LINE_ITEM_QUANTITY_CHANGE = "ChangeTextLineItemQuantityChange";

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
    @JsonProperty("previousValue")
    public Integer getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public Integer getNextValue();

    public void setChange(final String change);

    public void setTextLineItem(final TextLineItemValue textLineItem);

    public void setPreviousValue(final Integer previousValue);

    public void setNextValue(final Integer nextValue);

    public static ChangeTextLineItemQuantityChange of() {
        return new ChangeTextLineItemQuantityChangeImpl();
    }

    public static ChangeTextLineItemQuantityChange of(final ChangeTextLineItemQuantityChange template) {
        ChangeTextLineItemQuantityChangeImpl instance = new ChangeTextLineItemQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setTextLineItem(template.getTextLineItem());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeTextLineItemQuantityChangeBuilder builder() {
        return ChangeTextLineItemQuantityChangeBuilder.of();
    }

    public static ChangeTextLineItemQuantityChangeBuilder builder(final ChangeTextLineItemQuantityChange template) {
        return ChangeTextLineItemQuantityChangeBuilder.of(template);
    }

    default <T> T withChangeTextLineItemQuantityChange(Function<ChangeTextLineItemQuantityChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTextLineItemQuantityChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTextLineItemQuantityChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTextLineItemQuantityChange>";
            }
        };
    }
}
