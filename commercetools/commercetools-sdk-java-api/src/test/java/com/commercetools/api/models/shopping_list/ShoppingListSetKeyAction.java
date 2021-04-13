package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListSetKeyActionImpl;

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
@JsonDeserialize(as = ShoppingListSetKeyActionImpl.class)
public interface ShoppingListSetKeyAction extends ShoppingListUpdateAction {

    String SET_KEY = "setKey";

    /**
    *  <p>User-specific unique identifier for the shopping list.</p>
    */
    
    @JsonProperty("key")
    public String getKey();

    
    public void setKey(final String key);
    

    public static ShoppingListSetKeyAction of(){
        return new ShoppingListSetKeyActionImpl();
    }
    

    public static ShoppingListSetKeyAction of(final ShoppingListSetKeyAction template) {
        ShoppingListSetKeyActionImpl instance = new ShoppingListSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static ShoppingListSetKeyActionBuilder builder(){
        return ShoppingListSetKeyActionBuilder.of();
    }
    
    public static ShoppingListSetKeyActionBuilder builder(final ShoppingListSetKeyAction template){
        return ShoppingListSetKeyActionBuilder.of(template);
    }
    

    default <T> T withShoppingListSetKeyAction(Function<ShoppingListSetKeyAction, T> helper) {
        return helper.apply(this);
    }
}
