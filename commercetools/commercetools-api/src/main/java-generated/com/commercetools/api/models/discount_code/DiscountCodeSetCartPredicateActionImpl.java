package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
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
public final class DiscountCodeSetCartPredicateActionImpl implements DiscountCodeSetCartPredicateAction {

    private String action;
    
    private String cartPredicate;

    @JsonCreator
    DiscountCodeSetCartPredicateActionImpl(@JsonProperty("cartPredicate") final String cartPredicate) {
        this.cartPredicate = cartPredicate;
        this.action = "setCartPredicate";
    }
    public DiscountCodeSetCartPredicateActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>If the <code>cartPredicate</code> parameter is not included, the field will be emptied.</p>
    */
    public String getCartPredicate(){
        return this.cartPredicate;
    }

    public void setCartPredicate(final String cartPredicate){
        this.cartPredicate = cartPredicate;
    }

}
