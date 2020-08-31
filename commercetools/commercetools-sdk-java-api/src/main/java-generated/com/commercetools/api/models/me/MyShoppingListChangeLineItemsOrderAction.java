package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.models.me.MyShoppingListChangeLineItemsOrderActionImpl;

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
@JsonDeserialize(as = MyShoppingListChangeLineItemsOrderActionImpl.class)
public interface MyShoppingListChangeLineItemsOrderAction extends MyShoppingListUpdateAction {

    
    @NotNull
    @JsonProperty("lineItemOrder")
    public List<String> getLineItemOrder();

    public void setLineItemOrder(final List<String> lineItemOrder);

    public static MyShoppingListChangeLineItemsOrderActionImpl of(){
        return new MyShoppingListChangeLineItemsOrderActionImpl();
    }
    

    public static MyShoppingListChangeLineItemsOrderActionImpl of(final MyShoppingListChangeLineItemsOrderAction template) {
        MyShoppingListChangeLineItemsOrderActionImpl instance = new MyShoppingListChangeLineItemsOrderActionImpl();
        instance.setLineItemOrder(template.getLineItemOrder());
        return instance;
    }

}
