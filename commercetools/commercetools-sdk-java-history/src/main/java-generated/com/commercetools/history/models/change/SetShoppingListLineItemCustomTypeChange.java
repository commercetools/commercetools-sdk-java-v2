
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.ShoppingListLineItemValue;
import com.commercetools.history.models.common.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetShoppingListLineItemCustomTypeChangeImpl.class)
public interface SetShoppingListLineItemCustomTypeChange extends Change {

    String SET_SHOPPING_LIST_LINE_ITEM_CUSTOM_TYPE_CHANGE = "SetShoppingListLineItemCustomTypeChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setLineItemCustomType</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public ShoppingListLineItemValue getLineItem();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomFields getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public CustomFields getPreviousValue();

    public void setChange(final String change);

    public void setLineItem(final ShoppingListLineItemValue lineItem);

    public void setNextValue(final CustomFields nextValue);

    public void setPreviousValue(final CustomFields previousValue);

    public static SetShoppingListLineItemCustomTypeChange of() {
        return new SetShoppingListLineItemCustomTypeChangeImpl();
    }

    public static SetShoppingListLineItemCustomTypeChange of(final SetShoppingListLineItemCustomTypeChange template) {
        SetShoppingListLineItemCustomTypeChangeImpl instance = new SetShoppingListLineItemCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(template.getLineItem());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetShoppingListLineItemCustomTypeChangeBuilder builder() {
        return SetShoppingListLineItemCustomTypeChangeBuilder.of();
    }

    public static SetShoppingListLineItemCustomTypeChangeBuilder builder(
            final SetShoppingListLineItemCustomTypeChange template) {
        return SetShoppingListLineItemCustomTypeChangeBuilder.of(template);
    }

    default <T> T withSetShoppingListLineItemCustomTypeChange(
            Function<SetShoppingListLineItemCustomTypeChange, T> helper) {
        return helper.apply(this);
    }
}
