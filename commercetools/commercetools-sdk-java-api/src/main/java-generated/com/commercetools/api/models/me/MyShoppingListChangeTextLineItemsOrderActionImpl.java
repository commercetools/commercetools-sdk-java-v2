package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
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
public final class MyShoppingListChangeTextLineItemsOrderActionImpl implements MyShoppingListChangeTextLineItemsOrderAction {

    private String action;
    
    private java.util.List<String> textLineItemOrder;

    @JsonCreator
    MyShoppingListChangeTextLineItemsOrderActionImpl(@JsonProperty("textLineItemOrder") final java.util.List<String> textLineItemOrder) {
        this.textLineItemOrder = textLineItemOrder;
        this.action = "changeTextLineItemsOrder";
    }
    public MyShoppingListChangeTextLineItemsOrderActionImpl() {
        this.action = "changeTextLineItemsOrder";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public java.util.List<String> getTextLineItemOrder(){
        return this.textLineItemOrder;
    }

    public void setTextLineItemOrder(final String ...textLineItemOrder){
       this.textLineItemOrder = new ArrayList<>(Arrays.asList(textLineItemOrder));
    }
    
    public void setTextLineItemOrder(final java.util.List<String> textLineItemOrder){
       this.textLineItemOrder = textLineItemOrder;
    }

}
