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
public final class MyShoppingListChangeLineItemQuantityActionImpl implements MyShoppingListChangeLineItemQuantityAction {

    private String action;
    
    private String lineItemId;
    
    private Long quantity;

    @JsonCreator
    MyShoppingListChangeLineItemQuantityActionImpl(@JsonProperty("lineItemId") final String lineItemId, @JsonProperty("quantity") final Long quantity) {
        this.lineItemId = lineItemId;
        this.quantity = quantity;
        this.action = "changeLineItemQuantity";
    }
    public MyShoppingListChangeLineItemQuantityActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getLineItemId(){
        return this.lineItemId;
    }
    
    
    public Long getQuantity(){
        return this.quantity;
    }

    public void setLineItemId(final String lineItemId){
        this.lineItemId = lineItemId;
    }
    
    public void setQuantity(final Long quantity){
        this.quantity = quantity;
    }

}
