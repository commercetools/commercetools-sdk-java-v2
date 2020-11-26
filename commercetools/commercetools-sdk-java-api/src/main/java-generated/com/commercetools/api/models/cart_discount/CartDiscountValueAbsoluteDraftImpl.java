package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountValueDraft;
import com.commercetools.api.models.common.Money;
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
public final class CartDiscountValueAbsoluteDraftImpl implements CartDiscountValueAbsoluteDraft {

    private String type;
    
    private java.util.List<com.commercetools.api.models.common.Money> money;

    @JsonCreator
    CartDiscountValueAbsoluteDraftImpl(@JsonProperty("money") final java.util.List<com.commercetools.api.models.common.Money> money) {
        this.money = money;
        this.type = "absolute";
    }
    public CartDiscountValueAbsoluteDraftImpl() {
        this.type = "absolute";
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public java.util.List<com.commercetools.api.models.common.Money> getMoney(){
        return this.money;
    }

    public void setMoney(final com.commercetools.api.models.common.Money ...money){
       this.money = new ArrayList<>(Arrays.asList(money));
    }
    
    public void setMoney(final java.util.List<com.commercetools.api.models.common.Money> money){
       this.money = money;
    }

}
