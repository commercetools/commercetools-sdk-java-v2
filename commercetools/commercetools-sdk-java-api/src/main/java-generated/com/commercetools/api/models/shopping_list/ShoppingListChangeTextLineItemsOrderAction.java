package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemsOrderActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ShoppingListChangeTextLineItemsOrderActionImpl.class)
public interface ShoppingListChangeTextLineItemsOrderAction extends ShoppingListUpdateAction {

    
    @NotNull
    @JsonProperty("textLineItemOrder")
    public List<String> getTextLineItemOrder();

    public void setTextLineItemOrder(final List<String> textLineItemOrder);

    public static ShoppingListChangeTextLineItemsOrderActionImpl of(){
        return new ShoppingListChangeTextLineItemsOrderActionImpl();
    }
    

    public static ShoppingListChangeTextLineItemsOrderActionImpl of(final ShoppingListChangeTextLineItemsOrderAction template) {
        ShoppingListChangeTextLineItemsOrderActionImpl instance = new ShoppingListChangeTextLineItemsOrderActionImpl();
        instance.setTextLineItemOrder(template.getTextLineItemOrder());
        return instance;
    }

    default <T> T withShoppingListChangeTextLineItemsOrderAction(Function<ShoppingListChangeTextLineItemsOrderAction, T> helper) {
        return helper.apply(this);
    }
}
