package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.models.me.MyShoppingListChangeLineItemQuantityActionImpl;

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
@JsonDeserialize(as = MyShoppingListChangeLineItemQuantityActionImpl.class)
public interface MyShoppingListChangeLineItemQuantityAction extends MyShoppingListUpdateAction {

    
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();
    
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    public void setLineItemId(final String lineItemId);
    
    public void setQuantity(final Long quantity);

    public static MyShoppingListChangeLineItemQuantityActionImpl of(){
        return new MyShoppingListChangeLineItemQuantityActionImpl();
    }
    

    public static MyShoppingListChangeLineItemQuantityActionImpl of(final MyShoppingListChangeLineItemQuantityAction template) {
        MyShoppingListChangeLineItemQuantityActionImpl instance = new MyShoppingListChangeLineItemQuantityActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    default <T> T withMyShoppingListChangeLineItemQuantityAction(Function<MyShoppingListChangeLineItemQuantityAction, T> helper) {
        return helper.apply(this);
    }
}
