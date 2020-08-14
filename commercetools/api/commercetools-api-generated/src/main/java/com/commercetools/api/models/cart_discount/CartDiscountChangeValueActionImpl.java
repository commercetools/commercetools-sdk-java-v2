package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.models.cart_discount.CartDiscountValueDraft;
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
public final class CartDiscountChangeValueActionImpl implements CartDiscountChangeValueAction {

    private String action;
    
    private com.commercetools.api.models.cart_discount.CartDiscountValueDraft value;

    @JsonCreator
    CartDiscountChangeValueActionImpl(@JsonProperty("value") final com.commercetools.api.models.cart_discount.CartDiscountValueDraft value) {
        this.value = value;
        this.action = "changeValue";
    }
    public CartDiscountChangeValueActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.cart_discount.CartDiscountValueDraft getValue(){
        return this.value;
    }

    public void setValue(final com.commercetools.api.models.cart_discount.CartDiscountValueDraft value){
        this.value = value;
    }

}
