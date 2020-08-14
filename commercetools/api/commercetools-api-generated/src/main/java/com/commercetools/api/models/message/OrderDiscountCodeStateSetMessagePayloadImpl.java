package com.commercetools.api.models.message;

import com.commercetools.api.models.cart.DiscountCodeState;
import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.commercetools.api.models.message.MessagePayload;
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
public final class OrderDiscountCodeStateSetMessagePayloadImpl implements OrderDiscountCodeStateSetMessagePayload {

    private String type;
    
    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;
    
    private com.commercetools.api.models.cart.DiscountCodeState state;
    
    private com.commercetools.api.models.cart.DiscountCodeState oldState;

    @JsonCreator
    OrderDiscountCodeStateSetMessagePayloadImpl(@JsonProperty("discountCode") final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode, @JsonProperty("state") final com.commercetools.api.models.cart.DiscountCodeState state, @JsonProperty("oldState") final com.commercetools.api.models.cart.DiscountCodeState oldState) {
        this.discountCode = discountCode;
        this.state = state;
        this.oldState = oldState;
        this.type = "OrderDiscountCodeStateSet";
    }
    public OrderDiscountCodeStateSetMessagePayloadImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode(){
        return this.discountCode;
    }
    
    
    public com.commercetools.api.models.cart.DiscountCodeState getState(){
        return this.state;
    }
    
    
    public com.commercetools.api.models.cart.DiscountCodeState getOldState(){
        return this.oldState;
    }

    public void setDiscountCode(final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode){
        this.discountCode = discountCode;
    }
    
    public void setState(final com.commercetools.api.models.cart.DiscountCodeState state){
        this.state = state;
    }
    
    public void setOldState(final com.commercetools.api.models.cart.DiscountCodeState oldState){
        this.oldState = oldState;
    }

}
