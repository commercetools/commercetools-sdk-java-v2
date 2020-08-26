package com.commercetools.api.models.me;

import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.me.MyCartUpdateAction;
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
public final class MyCartRemoveLineItemActionImpl implements MyCartRemoveLineItemAction {

    private String action;
    
    private String lineItemId;
    
    private Double quantity;
    
    private com.commercetools.api.models.common.Money externalPrice;
    
    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;
    
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove;

    @JsonCreator
    MyCartRemoveLineItemActionImpl(@JsonProperty("lineItemId") final String lineItemId, @JsonProperty("quantity") final Double quantity, @JsonProperty("externalPrice") final com.commercetools.api.models.common.Money externalPrice, @JsonProperty("externalTotalPrice") final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice, @JsonProperty("shippingDetailsToRemove") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove) {
        this.lineItemId = lineItemId;
        this.quantity = quantity;
        this.externalPrice = externalPrice;
        this.externalTotalPrice = externalTotalPrice;
        this.shippingDetailsToRemove = shippingDetailsToRemove;
        this.action = "removeLineItem";
    }
    public MyCartRemoveLineItemActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getLineItemId(){
        return this.lineItemId;
    }
    
    
    public Double getQuantity(){
        return this.quantity;
    }
    
    
    public com.commercetools.api.models.common.Money getExternalPrice(){
        return this.externalPrice;
    }
    
    
    public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
        return this.externalTotalPrice;
    }
    
    
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetailsToRemove(){
        return this.shippingDetailsToRemove;
    }

    public void setLineItemId(final String lineItemId){
        this.lineItemId = lineItemId;
    }
    
    public void setQuantity(final Double quantity){
        this.quantity = quantity;
    }
    
    public void setExternalPrice(final com.commercetools.api.models.common.Money externalPrice){
        this.externalPrice = externalPrice;
    }
    
    public void setExternalTotalPrice(final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice){
        this.externalTotalPrice = externalTotalPrice;
    }
    
    public void setShippingDetailsToRemove(final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove){
        this.shippingDetailsToRemove = shippingDetailsToRemove;
    }

}
