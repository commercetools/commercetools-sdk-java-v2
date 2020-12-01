package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.product_discount.ProductDiscountValue;
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
public final class ProductDiscountValueAbsoluteImpl implements ProductDiscountValueAbsolute {

    private String type;
    
    private java.util.List<com.commercetools.api.models.common.TypedMoney> money;

    @JsonCreator
    ProductDiscountValueAbsoluteImpl(@JsonProperty("money") final java.util.List<com.commercetools.api.models.common.TypedMoney> money) {
        this.money = money;
        this.type = "absolute";
    }
    public ProductDiscountValueAbsoluteImpl() {
        this.type = "absolute";
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public java.util.List<com.commercetools.api.models.common.TypedMoney> getMoney(){
        return this.money;
    }

    public void setMoney(final com.commercetools.api.models.common.TypedMoney ...money){
       this.money = new ArrayList<>(Arrays.asList(money));
    }
    
    public void setMoney(final java.util.List<com.commercetools.api.models.common.TypedMoney> money){
       this.money = money;
    }

}
