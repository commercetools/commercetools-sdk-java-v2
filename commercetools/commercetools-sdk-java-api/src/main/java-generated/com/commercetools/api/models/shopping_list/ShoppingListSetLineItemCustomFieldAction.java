
package com.commercetools.api.models.shopping_list;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomFieldActionImpl;
import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetLineItemCustomFieldActionImpl.class)
public interface ShoppingListSetLineItemCustomFieldAction extends ShoppingListUpdateAction {

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public JsonNode getValue();

    public void setLineItemId(final String lineItemId);

    public void setName(final String name);

    public void setValue(final JsonNode value);

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
