
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LineItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = RemoveShoppingListLineItemChangeImpl.class)
public interface RemoveShoppingListLineItemChange extends Change {

    String REMOVE_SHOPPING_LIST_LINE_ITEM_CHANGE = "RemoveShoppingListLineItemChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public LineItem getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LineItem getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final LineItem previousValue);

    public void setNextValue(final LineItem nextValue);

    public static RemoveShoppingListLineItemChange of() {
        return new RemoveShoppingListLineItemChangeImpl();
    }

    public static RemoveShoppingListLineItemChange of(final RemoveShoppingListLineItemChange template) {
        RemoveShoppingListLineItemChangeImpl instance = new RemoveShoppingListLineItemChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static RemoveShoppingListLineItemChangeBuilder builder() {
        return RemoveShoppingListLineItemChangeBuilder.of();
    }

    public static RemoveShoppingListLineItemChangeBuilder builder(final RemoveShoppingListLineItemChange template) {
        return RemoveShoppingListLineItemChangeBuilder.of(template);
    }

    default <T> T withRemoveShoppingListLineItemChange(Function<RemoveShoppingListLineItemChange, T> helper) {
        return helper.apply(this);
    }
}
