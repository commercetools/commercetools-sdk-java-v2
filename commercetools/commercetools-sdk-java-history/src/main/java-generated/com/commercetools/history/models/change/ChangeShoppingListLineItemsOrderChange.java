
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
@JsonDeserialize(as = ChangeShoppingListLineItemsOrderChangeImpl.class)
public interface ChangeShoppingListLineItemsOrderChange extends Change {

    String CHANGE_SHOPPING_LIST_LINE_ITEMS_ORDER_CHANGE = "ChangeShoppingListLineItemsOrderChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<ShoppingListLineItemValue> getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<ShoppingListLineItemValue> getNextValue();

    public void setChange(final String change);

    @JsonIgnore
    public void setPreviousValue(final ShoppingListLineItemValue... previousValue);

    public void setPreviousValue(final List<ShoppingListLineItemValue> previousValue);

    @JsonIgnore
    public void setNextValue(final ShoppingListLineItemValue... nextValue);

    public void setNextValue(final List<ShoppingListLineItemValue> nextValue);

    public static ChangeShoppingListLineItemsOrderChange of() {
        return new ChangeShoppingListLineItemsOrderChangeImpl();
    }

    public static ChangeShoppingListLineItemsOrderChange of(final ChangeShoppingListLineItemsOrderChange template) {
        ChangeShoppingListLineItemsOrderChangeImpl instance = new ChangeShoppingListLineItemsOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeShoppingListLineItemsOrderChangeBuilder builder() {
        return ChangeShoppingListLineItemsOrderChangeBuilder.of();
    }

    public static ChangeShoppingListLineItemsOrderChangeBuilder builder(
            final ChangeShoppingListLineItemsOrderChange template) {
        return ChangeShoppingListLineItemsOrderChangeBuilder.of(template);
    }

    default <T> T withChangeShoppingListLineItemsOrderChange(
            Function<ChangeShoppingListLineItemsOrderChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeShoppingListLineItemsOrderChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeShoppingListLineItemsOrderChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeShoppingListLineItemsOrderChange>";
            }
        };
    }
}
