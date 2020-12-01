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
public final class MyShoppingListChangeTextLineItemQuantityActionImpl implements MyShoppingListChangeTextLineItemQuantityAction {

    private String action;
    
    private String textLineItemId;
    
    private Long quantity;

    @JsonCreator
    MyShoppingListChangeTextLineItemQuantityActionImpl(@JsonProperty("textLineItemId") final String textLineItemId, @JsonProperty("quantity") final Long quantity) {
        this.textLineItemId = textLineItemId;
        this.quantity = quantity;
        this.action = "changeTextLineItemQuantity";
    }
    public MyShoppingListChangeTextLineItemQuantityActionImpl() {
        this.action = "changeTextLineItemQuantity";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getTextLineItemId(){
        return this.textLineItemId;
    }
    
    
    public Long getQuantity(){
        return this.quantity;
    }

    public void setTextLineItemId(final String textLineItemId){
        this.textLineItemId = textLineItemId;
    }
    
    public void setQuantity(final Long quantity){
        this.quantity = quantity;
    }

}
