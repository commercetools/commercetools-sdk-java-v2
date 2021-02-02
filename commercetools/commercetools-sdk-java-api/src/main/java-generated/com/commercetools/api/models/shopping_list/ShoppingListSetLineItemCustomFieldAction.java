
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetLineItemCustomFieldActionImpl.class)
public interface ShoppingListSetLineItemCustomFieldAction extends ShoppingListUpdateAction {

    String SET_LINE_ITEM_CUSTOM_FIELD = "setLineItemCustomField";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setLineItemId(final String lineItemId);

    public void setName(final String name);

    public void setValue(final Object value);

    public static ShoppingListSetLineItemCustomFieldAction of() {
        return new ShoppingListSetLineItemCustomFieldActionImpl();
    }

    public static ShoppingListSetLineItemCustomFieldAction of(final ShoppingListSetLineItemCustomFieldAction template) {
        ShoppingListSetLineItemCustomFieldActionImpl instance = new ShoppingListSetLineItemCustomFieldActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static ShoppingListSetLineItemCustomFieldActionBuilder builder() {
        return ShoppingListSetLineItemCustomFieldActionBuilder.of();
    }

    public static ShoppingListSetLineItemCustomFieldActionBuilder builder(
            final ShoppingListSetLineItemCustomFieldAction template) {
        return ShoppingListSetLineItemCustomFieldActionBuilder.of(template);
    }

    default <T> T withShoppingListSetLineItemCustomFieldAction(
            Function<ShoppingListSetLineItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
