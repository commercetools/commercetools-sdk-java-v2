package com.commercetools.api.models.message;

import com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.api.models.cart.TaxedItemPrice;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.message.MessagePayload;
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
public final class OrderLineItemDiscountSetMessagePayloadImpl implements OrderLineItemDiscountSetMessagePayload {

    private String type;
    
    private String lineItemId;
    
    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;
    
    private com.commercetools.api.models.common.Money totalPrice;
    
    private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;

    @JsonCreator
    OrderLineItemDiscountSetMessagePayloadImpl(@JsonProperty("lineItemId") final String lineItemId, @JsonProperty("discountedPricePerQuantity") final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity, @JsonProperty("totalPrice") final com.commercetools.api.models.common.Money totalPrice, @JsonProperty("taxedPrice") final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.lineItemId = lineItemId;
        this.discountedPricePerQuantity = discountedPricePerQuantity;
        this.totalPrice = totalPrice;
        this.taxedPrice = taxedPrice;
        this.type = "OrderLineItemDiscountSet";
    }
    public OrderLineItemDiscountSetMessagePayloadImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public String getLineItemId(){
        return this.lineItemId;
    }
    
    
    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity(){
        return this.discountedPricePerQuantity;
    }
    
    
    public com.commercetools.api.models.common.Money getTotalPrice(){
        return this.totalPrice;
    }
    
    
    public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice(){
        return this.taxedPrice;
    }

    public void setLineItemId(final String lineItemId){
        this.lineItemId = lineItemId;
    }
    
    public void setDiscountedPricePerQuantity(final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity ...discountedPricePerQuantity){
       this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
    }
    
    public void setDiscountedPricePerQuantity(final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity){
       this.discountedPricePerQuantity = discountedPricePerQuantity;
    }
    
    public void setTotalPrice(final com.commercetools.api.models.common.Money totalPrice){
        this.totalPrice = totalPrice;
    }
    
    public void setTaxedPrice(final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice){
        this.taxedPrice = taxedPrice;
    }

}
