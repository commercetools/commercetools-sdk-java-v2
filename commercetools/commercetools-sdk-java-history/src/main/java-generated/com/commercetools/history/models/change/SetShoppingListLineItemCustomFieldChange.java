
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
@JsonDeserialize(as = SetShoppingListLineItemCustomFieldChangeImpl.class)
public interface SetShoppingListLineItemCustomFieldChange extends Change {

    String SET_SHOPPING_LIST_LINE_ITEM_CUSTOM_FIELD_CHANGE = "SetShoppingListLineItemCustomFieldChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setLineItemCustomField</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @NotNull
    @JsonProperty("customTypeId")
    public String getCustomTypeId();

    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public ShoppingListLineItemValue getLineItem();

    @NotNull
    @JsonProperty("nextValue")
    public Object getNextValue();

    @NotNull
    @JsonProperty("previousValue")
    public Object getPreviousValue();

    public void setChange(final String change);

    public void setName(final String name);

    public void setCustomTypeId(final String customTypeId);

    public void setLineItem(final ShoppingListLineItemValue lineItem);

    public void setNextValue(final Object nextValue);

    public void setPreviousValue(final Object previousValue);

    public static SetShoppingListLineItemCustomFieldChange of() {
        return new SetShoppingListLineItemCustomFieldChangeImpl();
    }

    public static SetShoppingListLineItemCustomFieldChange of(final SetShoppingListLineItemCustomFieldChange template) {
        SetShoppingListLineItemCustomFieldChangeImpl instance = new SetShoppingListLineItemCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setLineItem(template.getLineItem());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetShoppingListLineItemCustomFieldChangeBuilder builder() {
        return SetShoppingListLineItemCustomFieldChangeBuilder.of();
    }

    public static SetShoppingListLineItemCustomFieldChangeBuilder builder(
            final SetShoppingListLineItemCustomFieldChange template) {
        return SetShoppingListLineItemCustomFieldChangeBuilder.of(template);
    }

    default <T> T withSetShoppingListLineItemCustomFieldChange(
            Function<SetShoppingListLineItemCustomFieldChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetShoppingListLineItemCustomFieldChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetShoppingListLineItemCustomFieldChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetShoppingListLineItemCustomFieldChange>";
            }
        };
    }
}
