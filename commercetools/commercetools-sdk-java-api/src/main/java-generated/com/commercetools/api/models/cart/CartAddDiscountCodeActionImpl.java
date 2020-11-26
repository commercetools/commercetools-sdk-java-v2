package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
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
public final class CartAddDiscountCodeActionImpl implements CartAddDiscountCodeAction {

    private String action;
    
    private String code;

    @JsonCreator
    CartAddDiscountCodeActionImpl(@JsonProperty("code") final String code) {
        this.code = code;
        this.action = "addDiscountCode";
    }
    public CartAddDiscountCodeActionImpl() {
        this.action = "addDiscountCode";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getCode(){
        return this.code;
    }

    public void setCode(final String code){
        this.code = code;
    }

}
