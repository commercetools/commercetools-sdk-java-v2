package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountTarget;
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
public final class CartDiscountCustomLineItemsTargetImpl implements CartDiscountCustomLineItemsTarget {

    private String type;
    
    private String predicate;

    @JsonCreator
    CartDiscountCustomLineItemsTargetImpl(@JsonProperty("predicate") final String predicate) {
        this.predicate = predicate;
        this.type = "customLineItems";
    }
    public CartDiscountCustomLineItemsTargetImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public String getPredicate(){
        return this.predicate;
    }

    public void setPredicate(final String predicate){
        this.predicate = predicate;
    }

}
