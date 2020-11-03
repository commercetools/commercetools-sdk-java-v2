package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemsOrderActionImpl;

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
@JsonDeserialize(as = ShoppingListChangeLineItemsOrderActionImpl.class)
public interface ShoppingListChangeLineItemsOrderAction extends ShoppingListUpdateAction {

    
    @NotNull
    @JsonProperty("lineItemOrder")
    public List<String> getLineItemOrder();

    @JsonIgnore
    public void setLineItemOrder(final String ...lineItemOrder);
    public void setLineItemOrder(final List<String> lineItemOrder);

    public static ShoppingListChangeLineItemsOrderActionImpl of(){
        return new ShoppingListChangeLineItemsOrderActionImpl();
    }
    

    public static ShoppingListChangeLineItemsOrderActionImpl of(final ShoppingListChangeLineItemsOrderAction template) {
        ShoppingListChangeLineItemsOrderActionImpl instance = new ShoppingListChangeLineItemsOrderActionImpl();
        instance.setLineItemOrder(template.getLineItemOrder());
        return instance;
    }

    default <T> T withShoppingListChangeLineItemsOrderAction(Function<ShoppingListChangeLineItemsOrderAction, T> helper) {
        return helper.apply(this);
    }
}
