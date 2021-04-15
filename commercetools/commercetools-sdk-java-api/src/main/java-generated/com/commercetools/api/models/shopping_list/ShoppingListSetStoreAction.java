package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.shopping_list.ShoppingListSetStoreActionImpl;

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
@JsonDeserialize(as = ShoppingListSetStoreActionImpl.class)
public interface ShoppingListSetStoreAction extends ShoppingListUpdateAction {

    String SET_STORE = "setStore";

    
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    
    public void setStore(final StoreResourceIdentifier store);
    

    public static ShoppingListSetStoreAction of(){
        return new ShoppingListSetStoreActionImpl();
    }
    

    public static ShoppingListSetStoreAction of(final ShoppingListSetStoreAction template) {
        ShoppingListSetStoreActionImpl instance = new ShoppingListSetStoreActionImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    public static ShoppingListSetStoreActionBuilder builder(){
        return ShoppingListSetStoreActionBuilder.of();
    }
    
    public static ShoppingListSetStoreActionBuilder builder(final ShoppingListSetStoreAction template){
        return ShoppingListSetStoreActionBuilder.of(template);
    }
    

    default <T> T withShoppingListSetStoreAction(Function<ShoppingListSetStoreAction, T> helper) {
        return helper.apply(this);
    }
}
