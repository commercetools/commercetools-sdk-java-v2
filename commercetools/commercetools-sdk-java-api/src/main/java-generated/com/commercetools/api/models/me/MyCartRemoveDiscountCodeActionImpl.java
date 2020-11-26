package com.commercetools.api.models.me;

import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.commercetools.api.models.me.MyCartUpdateAction;
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
public final class MyCartRemoveDiscountCodeActionImpl implements MyCartRemoveDiscountCodeAction {

    private String action;
    
    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    @JsonCreator
    MyCartRemoveDiscountCodeActionImpl(@JsonProperty("discountCode") final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
        this.action = "removeDiscountCode";
    }
    public MyCartRemoveDiscountCodeActionImpl() {
        this.action = "removeDiscountCode";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode(){
        return this.discountCode;
    }

    public void setDiscountCode(final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode){
        this.discountCode = discountCode;
    }

}
