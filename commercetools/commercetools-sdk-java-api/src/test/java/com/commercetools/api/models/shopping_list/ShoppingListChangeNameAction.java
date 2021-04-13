package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListChangeNameActionImpl;

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
@JsonDeserialize(as = ShoppingListChangeNameActionImpl.class)
public interface ShoppingListChangeNameAction extends ShoppingListUpdateAction {

    String CHANGE_NAME = "changeName";

    
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    
    public void setName(final LocalizedString name);
    

    public static ShoppingListChangeNameAction of(){
        return new ShoppingListChangeNameActionImpl();
    }
    

    public static ShoppingListChangeNameAction of(final ShoppingListChangeNameAction template) {
        ShoppingListChangeNameActionImpl instance = new ShoppingListChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static ShoppingListChangeNameActionBuilder builder(){
        return ShoppingListChangeNameActionBuilder.of();
    }
    
    public static ShoppingListChangeNameActionBuilder builder(final ShoppingListChangeNameAction template){
        return ShoppingListChangeNameActionBuilder.of(template);
    }
    

    default <T> T withShoppingListChangeNameAction(Function<ShoppingListChangeNameAction, T> helper) {
        return helper.apply(this);
    }
}
