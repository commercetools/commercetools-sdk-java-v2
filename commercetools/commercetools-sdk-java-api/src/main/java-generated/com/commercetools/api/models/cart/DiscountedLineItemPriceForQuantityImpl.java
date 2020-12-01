package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.DiscountedLineItemPrice;
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
public final class DiscountedLineItemPriceForQuantityImpl implements DiscountedLineItemPriceForQuantity {

    private Double quantity;
    
    private com.commercetools.api.models.cart.DiscountedLineItemPrice discountedPrice;

    @JsonCreator
    DiscountedLineItemPriceForQuantityImpl(@JsonProperty("quantity") final Double quantity, @JsonProperty("discountedPrice") final com.commercetools.api.models.cart.DiscountedLineItemPrice discountedPrice) {
        this.quantity = quantity;
        this.discountedPrice = discountedPrice;
    }
    public DiscountedLineItemPriceForQuantityImpl() {
    }

    
    public Double getQuantity(){
        return this.quantity;
    }
    
    
    public com.commercetools.api.models.cart.DiscountedLineItemPrice getDiscountedPrice(){
        return this.discountedPrice;
    }

    public void setQuantity(final Double quantity){
        this.quantity = quantity;
    }
    
    public void setDiscountedPrice(final com.commercetools.api.models.cart.DiscountedLineItemPrice discountedPrice){
        this.discountedPrice = discountedPrice;
    }

}
