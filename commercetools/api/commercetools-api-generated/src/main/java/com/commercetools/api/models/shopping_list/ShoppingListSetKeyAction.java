package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListSetKeyActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ShoppingListSetKeyActionImpl.class)
public interface ShoppingListSetKeyAction extends ShoppingListUpdateAction {

    /**
    *  <p>User-specific unique identifier for the shopping list.</p>
    */
    
    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static ShoppingListSetKeyActionImpl of(){
        return new ShoppingListSetKeyActionImpl();
    }
    

    public static ShoppingListSetKeyActionImpl of(final ShoppingListSetKeyAction template) {
        ShoppingListSetKeyActionImpl instance = new ShoppingListSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

}
