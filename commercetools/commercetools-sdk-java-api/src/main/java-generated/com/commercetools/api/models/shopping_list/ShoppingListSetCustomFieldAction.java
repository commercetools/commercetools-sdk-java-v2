package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.shopping_list.ShoppingListSetCustomFieldActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ShoppingListSetCustomFieldActionImpl.class)
public interface ShoppingListSetCustomFieldAction extends ShoppingListUpdateAction {

    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("value")
    public JsonNode getValue();

    public void setName(final String name);
    
    public void setValue(final JsonNode value);

    public static ShoppingListSetCustomFieldActionImpl of(){
        return new ShoppingListSetCustomFieldActionImpl();
    }
    

    public static ShoppingListSetCustomFieldActionImpl of(final ShoppingListSetCustomFieldAction template) {
        ShoppingListSetCustomFieldActionImpl instance = new ShoppingListSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    default <T> T withShoppingListSetCustomFieldAction(Function<ShoppingListSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
