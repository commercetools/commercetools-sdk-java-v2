package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListUpdateImpl;

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
@JsonDeserialize(as = ShoppingListUpdateImpl.class)
public interface ShoppingListUpdate  {

    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ShoppingListUpdateAction> getActions();

    public void setVersion(final Long version);
    
    @JsonIgnore
    public void setActions(final ShoppingListUpdateAction ...actions);
    public void setActions(final List<ShoppingListUpdateAction> actions);

    public static ShoppingListUpdateImpl of(){
        return new ShoppingListUpdateImpl();
    }
    

    public static ShoppingListUpdateImpl of(final ShoppingListUpdate template) {
        ShoppingListUpdateImpl instance = new ShoppingListUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    default <T> T withShoppingListUpdate(Function<ShoppingListUpdate, T> helper) {
        return helper.apply(this);
    }
}
