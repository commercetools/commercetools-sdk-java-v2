package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListSetDescriptionActionImpl;

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
@JsonDeserialize(as = ShoppingListSetDescriptionActionImpl.class)
public interface ShoppingListSetDescriptionAction extends ShoppingListUpdateAction {

    String SET_DESCRIPTION = "setDescription";

    
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    
    public void setDescription(final LocalizedString description);
    

    public static ShoppingListSetDescriptionAction of(){
        return new ShoppingListSetDescriptionActionImpl();
    }
    

    public static ShoppingListSetDescriptionAction of(final ShoppingListSetDescriptionAction template) {
        ShoppingListSetDescriptionActionImpl instance = new ShoppingListSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static ShoppingListSetDescriptionActionBuilder builder(){
        return ShoppingListSetDescriptionActionBuilder.of();
    }
    
    public static ShoppingListSetDescriptionActionBuilder builder(final ShoppingListSetDescriptionAction template){
        return ShoppingListSetDescriptionActionBuilder.of(template);
    }
    

    default <T> T withShoppingListSetDescriptionAction(Function<ShoppingListSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }
}
