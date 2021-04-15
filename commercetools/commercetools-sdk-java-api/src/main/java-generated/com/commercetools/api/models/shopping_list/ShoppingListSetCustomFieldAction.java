
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetCustomFieldActionImpl.class)
public interface ShoppingListSetCustomFieldAction extends ShoppingListUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

    public static ShoppingListSetCustomFieldAction of() {
        return new ShoppingListSetCustomFieldActionImpl();
    }

    public static ShoppingListSetCustomFieldAction of(final ShoppingListSetCustomFieldAction template) {
        ShoppingListSetCustomFieldActionImpl instance = new ShoppingListSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static ShoppingListSetCustomFieldActionBuilder builder() {
        return ShoppingListSetCustomFieldActionBuilder.of();
    }

    public static ShoppingListSetCustomFieldActionBuilder builder(final ShoppingListSetCustomFieldAction template) {
        return ShoppingListSetCustomFieldActionBuilder.of(template);
    }

    default <T> T withShoppingListSetCustomFieldAction(Function<ShoppingListSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
