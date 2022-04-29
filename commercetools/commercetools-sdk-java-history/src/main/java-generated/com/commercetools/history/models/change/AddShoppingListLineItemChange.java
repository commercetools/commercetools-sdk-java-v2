
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
@JsonDeserialize(as = AddShoppingListLineItemChangeImpl.class)
public interface AddShoppingListLineItemChange extends Change {

    String ADD_SHOPPING_LIST_LINE_ITEM_CHANGE = "AddShoppingListLineItemChange";

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

    public static AddShoppingListLineItemChange of() {
        return new AddShoppingListLineItemChangeImpl();
    }

    public static AddShoppingListLineItemChange of(final AddShoppingListLineItemChange template) {
        AddShoppingListLineItemChangeImpl instance = new AddShoppingListLineItemChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static AddShoppingListLineItemChangeBuilder builder() {
        return AddShoppingListLineItemChangeBuilder.of();
    }

    public static AddShoppingListLineItemChangeBuilder builder(final AddShoppingListLineItemChange template) {
        return AddShoppingListLineItemChangeBuilder.of(template);
    }

    default <T> T withAddShoppingListLineItemChange(Function<AddShoppingListLineItemChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AddShoppingListLineItemChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddShoppingListLineItemChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddShoppingListLineItemChange>";
            }
        };
    }
}
