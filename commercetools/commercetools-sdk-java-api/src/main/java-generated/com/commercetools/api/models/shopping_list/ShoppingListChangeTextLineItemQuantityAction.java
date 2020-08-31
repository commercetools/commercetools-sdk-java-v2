package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemQuantityActionImpl;

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
@JsonDeserialize(as = ShoppingListChangeTextLineItemQuantityActionImpl.class)
public interface ShoppingListChangeTextLineItemQuantityAction extends ShoppingListUpdateAction {

    
    @NotNull
    @JsonProperty("textLineItemId")
    public String getTextLineItemId();
    
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    public void setTextLineItemId(final String textLineItemId);
    
    public void setQuantity(final Long quantity);

    public static ShoppingListChangeTextLineItemQuantityActionImpl of(){
        return new ShoppingListChangeTextLineItemQuantityActionImpl();
    }
    

    public static ShoppingListChangeTextLineItemQuantityActionImpl of(final ShoppingListChangeTextLineItemQuantityAction template) {
        ShoppingListChangeTextLineItemQuantityActionImpl instance = new ShoppingListChangeTextLineItemQuantityActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

}
