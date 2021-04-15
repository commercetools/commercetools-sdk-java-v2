
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetTextLineItemCustomFieldActionImpl.class)
public interface ShoppingListSetTextLineItemCustomFieldAction extends ShoppingListUpdateAction {

    String SET_TEXT_LINE_ITEM_CUSTOM_FIELD = "setTextLineItemCustomField";

    @NotNull
    @JsonProperty("textLineItemId")
    public String getTextLineItemId();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setTextLineItemId(final String textLineItemId);

    public void setName(final String name);

    public void setValue(final Object value);

    public static ShoppingListSetTextLineItemCustomFieldAction of() {
        return new ShoppingListSetTextLineItemCustomFieldActionImpl();
    }

    public static ShoppingListSetTextLineItemCustomFieldAction of(
            final ShoppingListSetTextLineItemCustomFieldAction template) {
        ShoppingListSetTextLineItemCustomFieldActionImpl instance = new ShoppingListSetTextLineItemCustomFieldActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static ShoppingListSetTextLineItemCustomFieldActionBuilder builder() {
        return ShoppingListSetTextLineItemCustomFieldActionBuilder.of();
    }

    public static ShoppingListSetTextLineItemCustomFieldActionBuilder builder(
            final ShoppingListSetTextLineItemCustomFieldAction template) {
        return ShoppingListSetTextLineItemCustomFieldActionBuilder.of(template);
    }

    default <T> T withShoppingListSetTextLineItemCustomFieldAction(
            Function<ShoppingListSetTextLineItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
