package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountValue;
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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountValueAbsoluteImpl implements CartDiscountValueAbsolute {

    private String type;
    
    private java.util.List<com.commercetools.api.models.common.TypedMoney> money;

    @JsonCreator
    CartDiscountValueAbsoluteImpl(@JsonProperty("money") final java.util.List<com.commercetools.api.models.common.TypedMoney> money) {
        this.money = money;
        this.type = "absolute";
    }
    public CartDiscountValueAbsoluteImpl() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CartDiscountValueAbsoluteImpl that = (CartDiscountValueAbsoluteImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(money, that.money)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(money)
            .toHashCode();
    }

}
