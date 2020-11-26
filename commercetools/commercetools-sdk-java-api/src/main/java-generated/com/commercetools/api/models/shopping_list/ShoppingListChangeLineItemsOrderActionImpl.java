package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListChangeLineItemsOrderActionImpl implements ShoppingListChangeLineItemsOrderAction {

    private String action;
    
    private java.util.List<String> lineItemOrder;

    @JsonCreator
    ShoppingListChangeLineItemsOrderActionImpl(@JsonProperty("lineItemOrder") final java.util.List<String> lineItemOrder) {
        this.lineItemOrder = lineItemOrder;
        this.action = "changeLineItemsOrder";
    }
    public ShoppingListChangeLineItemsOrderActionImpl() {
        this.action = "changeLineItemsOrder";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public java.util.List<String> getLineItemOrder(){
        return this.lineItemOrder;
    }

    public void setLineItemOrder(final String ...lineItemOrder){
       this.lineItemOrder = new ArrayList<>(Arrays.asList(lineItemOrder));
    }
    
    public void setLineItemOrder(final java.util.List<String> lineItemOrder){
       this.lineItemOrder = lineItemOrder;
    }

}
