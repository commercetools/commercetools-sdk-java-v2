package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListUpdateImpl;

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

}
