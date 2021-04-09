
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.CustomLineItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = RemoveCustomLineItemChangeImpl.class)
public interface RemoveCustomLineItemChange extends Change {

    String REMOVE_CUSTOM_LINE_ITEM_CHANGE = "RemoveCustomLineItemChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for adding and removing custom line items</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomLineItem getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public CustomLineItem getPreviousValue();

    public void setChange(final String change);

    public void setNextValue(final CustomLineItem nextValue);

    public void setPreviousValue(final CustomLineItem previousValue);

    public static RemoveCustomLineItemChange of() {
        return new RemoveCustomLineItemChangeImpl();
    }

    public static RemoveCustomLineItemChange of(final RemoveCustomLineItemChange template) {
        RemoveCustomLineItemChangeImpl instance = new RemoveCustomLineItemChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static RemoveCustomLineItemChangeBuilder builder() {
        return RemoveCustomLineItemChangeBuilder.of();
    }

    public static RemoveCustomLineItemChangeBuilder builder(final RemoveCustomLineItemChange template) {
        return RemoveCustomLineItemChangeBuilder.of(template);
    }

    default <T> T withRemoveCustomLineItemChange(Function<RemoveCustomLineItemChange, T> helper) {
        return helper.apply(this);
    }
}
