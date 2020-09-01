package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartChangeCustomLineItemQuantityActionImpl implements CartChangeCustomLineItemQuantityAction {

    private String action;
    
    private String customLineItemId;
    
    private Long quantity;

    @JsonCreator
    CartChangeCustomLineItemQuantityActionImpl(@JsonProperty("customLineItemId") final String customLineItemId, @JsonProperty("quantity") final Long quantity) {
        this.customLineItemId = customLineItemId;
        this.quantity = quantity;
        this.action = "changeCustomLineItemQuantity";
    }
    public CartChangeCustomLineItemQuantityActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getCustomLineItemId(){
        return this.customLineItemId;
    }
    
    
    public Long getQuantity(){
        return this.quantity;
    }

    public void setCustomLineItemId(final String customLineItemId){
        this.customLineItemId = customLineItemId;
    }
    
    public void setQuantity(final Long quantity){
        this.quantity = quantity;
    }

}
