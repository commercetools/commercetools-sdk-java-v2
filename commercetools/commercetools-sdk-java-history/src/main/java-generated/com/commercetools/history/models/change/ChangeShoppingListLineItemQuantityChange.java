
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.ShoppingListLineItemValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeShoppingListLineItemQuantityChangeImpl.class)
public interface ChangeShoppingListLineItemQuantityChange extends Change {

    String CHANGE_SHOPPING_LIST_LINE_ITEM_QUANTITY_CHANGE = "ChangeShoppingListLineItemQuantityChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public ShoppingListLineItemValue getLineItem();

    @NotNull
    @JsonProperty("previousValue")
    public Integer getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public Integer getNextValue();

    public void setChange(final String change);

    public void setLineItem(final ShoppingListLineItemValue lineItem);

    public void setPreviousValue(final Integer previousValue);

    public void setNextValue(final Integer nextValue);

    public static ChangeShoppingListLineItemQuantityChange of() {
        return new ChangeShoppingListLineItemQuantityChangeImpl();
    }

    public static ChangeShoppingListLineItemQuantityChange of(final ChangeShoppingListLineItemQuantityChange template) {
        ChangeShoppingListLineItemQuantityChangeImpl instance = new ChangeShoppingListLineItemQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(template.getLineItem());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeShoppingListLineItemQuantityChangeBuilder builder() {
        return ChangeShoppingListLineItemQuantityChangeBuilder.of();
    }

    public static ChangeShoppingListLineItemQuantityChangeBuilder builder(
            final ChangeShoppingListLineItemQuantityChange template) {
        return ChangeShoppingListLineItemQuantityChangeBuilder.of(template);
    }

    default <T> T withChangeShoppingListLineItemQuantityChange(
            Function<ChangeShoppingListLineItemQuantityChange, T> helper) {
        return helper.apply(this);
    }
}
