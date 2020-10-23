package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.models.me.MyShoppingListChangeTextLineItemsOrderActionImpl;

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
@JsonDeserialize(as = MyShoppingListChangeTextLineItemsOrderActionImpl.class)
public interface MyShoppingListChangeTextLineItemsOrderAction extends MyShoppingListUpdateAction {

    
    @NotNull
    @JsonProperty("textLineItemOrder")
    public List<String> getTextLineItemOrder();

    public void setTextLineItemOrder(final List<String> textLineItemOrder);

    public static MyShoppingListChangeTextLineItemsOrderActionImpl of(){
        return new MyShoppingListChangeTextLineItemsOrderActionImpl();
    }
    

    public static MyShoppingListChangeTextLineItemsOrderActionImpl of(final MyShoppingListChangeTextLineItemsOrderAction template) {
        MyShoppingListChangeTextLineItemsOrderActionImpl instance = new MyShoppingListChangeTextLineItemsOrderActionImpl();
        instance.setTextLineItemOrder(template.getTextLineItemOrder());
        return instance;
    }

    default <T> T withMyShoppingListChangeTextLineItemsOrderAction(Function<MyShoppingListChangeTextLineItemsOrderAction, T> helper) {
        return helper.apply(this);
    }
}
