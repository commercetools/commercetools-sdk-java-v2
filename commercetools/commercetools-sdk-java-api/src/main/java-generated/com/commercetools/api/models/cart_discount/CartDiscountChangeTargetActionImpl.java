package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountTarget;
import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
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
public final class CartDiscountChangeTargetActionImpl implements CartDiscountChangeTargetAction {

    private String action;
    
    private com.commercetools.api.models.cart_discount.CartDiscountTarget target;

    @JsonCreator
    CartDiscountChangeTargetActionImpl(@JsonProperty("target") final com.commercetools.api.models.cart_discount.CartDiscountTarget target) {
        this.target = target;
        this.action = "changeTarget";
    }
    public CartDiscountChangeTargetActionImpl() {
        this.action = "changeTarget";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.cart_discount.CartDiscountTarget getTarget(){
        return this.target;
    }

    public void setTarget(final com.commercetools.api.models.cart_discount.CartDiscountTarget target){
        this.target = target;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CartDiscountChangeTargetActionImpl that = (CartDiscountChangeTargetActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(target, that.target)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(target)
            .toHashCode();
    }

}
