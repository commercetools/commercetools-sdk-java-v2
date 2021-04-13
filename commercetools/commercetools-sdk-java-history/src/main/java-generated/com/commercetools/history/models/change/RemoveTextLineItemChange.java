
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.TextLineItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = RemoveTextLineItemChangeImpl.class)
public interface RemoveTextLineItemChange extends Change {

    String REMOVE_TEXT_LINE_ITEM_CHANGE = "RemoveTextLineItemChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public TextLineItem getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public TextLineItem getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final TextLineItem previousValue);

    public void setNextValue(final TextLineItem nextValue);

    public static RemoveTextLineItemChange of() {
        return new RemoveTextLineItemChangeImpl();
    }

    public static RemoveTextLineItemChange of(final RemoveTextLineItemChange template) {
        RemoveTextLineItemChangeImpl instance = new RemoveTextLineItemChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static RemoveTextLineItemChangeBuilder builder() {
        return RemoveTextLineItemChangeBuilder.of();
    }

    public static RemoveTextLineItemChangeBuilder builder(final RemoveTextLineItemChange template) {
        return RemoveTextLineItemChangeBuilder.of(template);
    }

    default <T> T withRemoveTextLineItemChange(Function<RemoveTextLineItemChange, T> helper) {
        return helper.apply(this);
    }
}
