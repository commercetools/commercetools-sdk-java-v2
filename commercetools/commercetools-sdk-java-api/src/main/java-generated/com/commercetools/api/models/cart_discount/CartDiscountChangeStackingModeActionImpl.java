package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.models.cart_discount.StackingMode;
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
public final class CartDiscountChangeStackingModeActionImpl implements CartDiscountChangeStackingModeAction {

    private String action;
    
    private com.commercetools.api.models.cart_discount.StackingMode stackingMode;

    @JsonCreator
    CartDiscountChangeStackingModeActionImpl(@JsonProperty("stackingMode") final com.commercetools.api.models.cart_discount.StackingMode stackingMode) {
        this.stackingMode = stackingMode;
        this.action = "changeStackingMode";
    }
    public CartDiscountChangeStackingModeActionImpl() {
        this.action = "changeStackingMode";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.cart_discount.StackingMode getStackingMode(){
        return this.stackingMode;
    }

    public void setStackingMode(final com.commercetools.api.models.cart_discount.StackingMode stackingMode){
        this.stackingMode = stackingMode;
    }

}
