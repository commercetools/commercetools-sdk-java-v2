package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListSetSlugActionImpl;

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
@JsonDeserialize(as = ShoppingListSetSlugActionImpl.class)
public interface ShoppingListSetSlugAction extends ShoppingListUpdateAction {

    
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    public void setSlug(final LocalizedString slug);

    public static ShoppingListSetSlugAction of(){
        return new ShoppingListSetSlugActionImpl();
    }
    

    public static ShoppingListSetSlugAction of(final ShoppingListSetSlugAction template) {
        ShoppingListSetSlugActionImpl instance = new ShoppingListSetSlugActionImpl();
        instance.setSlug(template.getSlug());
        return instance;
    }

    public static ShoppingListSetSlugActionBuilder builder(){
        return ShoppingListSetSlugActionBuilder.of();
    }
    
    public static ShoppingListSetSlugActionBuilder builder(final ShoppingListSetSlugAction template){
        return ShoppingListSetSlugActionBuilder.of(template);
    }
    

    default <T> T withShoppingListSetSlugAction(Function<ShoppingListSetSlugAction, T> helper) {
        return helper.apply(this);
    }
}
