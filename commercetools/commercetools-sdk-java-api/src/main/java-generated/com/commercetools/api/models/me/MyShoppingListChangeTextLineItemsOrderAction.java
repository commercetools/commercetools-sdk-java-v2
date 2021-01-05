package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.models.me.MyShoppingListChangeTextLineItemsOrderActionImpl;

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
@JsonDeserialize(as = MyShoppingListChangeTextLineItemsOrderActionImpl.class)
public interface MyShoppingListChangeTextLineItemsOrderAction extends MyShoppingListUpdateAction {

    
    @NotNull
    @JsonProperty("textLineItemOrder")
    public List<String> getTextLineItemOrder();

    @JsonIgnore
    public void setTextLineItemOrder(final String ...textLineItemOrder);
    public void setTextLineItemOrder(final List<String> textLineItemOrder);

    public static MyShoppingListChangeTextLineItemsOrderAction of(){
        return new MyShoppingListChangeTextLineItemsOrderActionImpl();
    }
    

    public static MyShoppingListChangeTextLineItemsOrderAction of(final MyShoppingListChangeTextLineItemsOrderAction template) {
        MyShoppingListChangeTextLineItemsOrderActionImpl instance = new MyShoppingListChangeTextLineItemsOrderActionImpl();
        instance.setTextLineItemOrder(template.getTextLineItemOrder());
        return instance;
    }

    public static MyShoppingListChangeTextLineItemsOrderActionBuilder builder(){
        return MyShoppingListChangeTextLineItemsOrderActionBuilder.of();
    }
    
    public static MyShoppingListChangeTextLineItemsOrderActionBuilder builder(final MyShoppingListChangeTextLineItemsOrderAction template){
        return MyShoppingListChangeTextLineItemsOrderActionBuilder.of(template);
    }
    

    default <T> T withMyShoppingListChangeTextLineItemsOrderAction(Function<MyShoppingListChangeTextLineItemsOrderAction, T> helper) {
        return helper.apply(this);
    }
}
