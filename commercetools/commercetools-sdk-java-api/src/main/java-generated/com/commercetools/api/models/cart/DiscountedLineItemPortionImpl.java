package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart_discount.CartDiscountReference;
import com.commercetools.api.models.common.TypedMoney;
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
public final class DiscountedLineItemPortionImpl implements DiscountedLineItemPortion {

    private com.commercetools.api.models.cart_discount.CartDiscountReference discount;
    
    private com.commercetools.api.models.common.TypedMoney discountedAmount;

    @JsonCreator
    DiscountedLineItemPortionImpl(@JsonProperty("discount") final com.commercetools.api.models.cart_discount.CartDiscountReference discount, @JsonProperty("discountedAmount") final com.commercetools.api.models.common.TypedMoney discountedAmount) {
        this.discount = discount;
        this.discountedAmount = discountedAmount;
    }
    public DiscountedLineItemPortionImpl() {
       
    }

    
    public com.commercetools.api.models.cart_discount.CartDiscountReference getDiscount(){
        return this.discount;
    }
    
    
    public com.commercetools.api.models.common.TypedMoney getDiscountedAmount(){
        return this.discountedAmount;
    }

    public void setDiscount(final com.commercetools.api.models.cart_discount.CartDiscountReference discount){
        this.discount = discount;
    }
    
    public void setDiscountedAmount(final com.commercetools.api.models.common.TypedMoney discountedAmount){
        this.discountedAmount = discountedAmount;
    }

}
