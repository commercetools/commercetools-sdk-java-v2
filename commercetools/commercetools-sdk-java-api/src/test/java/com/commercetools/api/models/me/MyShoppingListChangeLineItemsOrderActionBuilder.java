package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.models.me.MyShoppingListChangeLineItemsOrderAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyShoppingListChangeLineItemsOrderActionBuilder {

    
    
    private java.util.List<String> lineItemOrder;

    
    public MyShoppingListChangeLineItemsOrderActionBuilder lineItemOrder( final String ...lineItemOrder) {
        this.lineItemOrder = new ArrayList<>(Arrays.asList(lineItemOrder));
        return this;
    }
    
    
    public MyShoppingListChangeLineItemsOrderActionBuilder lineItemOrder( final java.util.List<String> lineItemOrder) {
        this.lineItemOrder = lineItemOrder;
        return this;
    }

    
    
    public java.util.List<String> getLineItemOrder(){
        return this.lineItemOrder;
    }

    public MyShoppingListChangeLineItemsOrderAction build() {
        return new MyShoppingListChangeLineItemsOrderActionImpl(lineItemOrder);
    }

    public static MyShoppingListChangeLineItemsOrderActionBuilder of() {
        return new MyShoppingListChangeLineItemsOrderActionBuilder();
    }

    public static MyShoppingListChangeLineItemsOrderActionBuilder of(final MyShoppingListChangeLineItemsOrderAction template) {
        MyShoppingListChangeLineItemsOrderActionBuilder builder = new MyShoppingListChangeLineItemsOrderActionBuilder();
        builder.lineItemOrder = template.getLineItemOrder();
        return builder;
    }

}
