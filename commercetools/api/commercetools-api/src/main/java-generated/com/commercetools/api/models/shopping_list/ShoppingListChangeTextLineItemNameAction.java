package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemNameActionImpl;

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
@JsonDeserialize(as = ShoppingListChangeTextLineItemNameActionImpl.class)
public interface ShoppingListChangeTextLineItemNameAction extends ShoppingListUpdateAction {

    
    @NotNull
    @JsonProperty("textLineItemId")
    public String getTextLineItemId();
    
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setTextLineItemId(final String textLineItemId);
    
    public void setName(final LocalizedString name);

    public static ShoppingListChangeTextLineItemNameActionImpl of(){
        return new ShoppingListChangeTextLineItemNameActionImpl();
    }
    

    public static ShoppingListChangeTextLineItemNameActionImpl of(final ShoppingListChangeTextLineItemNameAction template) {
        ShoppingListChangeTextLineItemNameActionImpl instance = new ShoppingListChangeTextLineItemNameActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setName(template.getName());
        return instance;
    }

}
