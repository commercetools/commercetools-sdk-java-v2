package com.commercetools.api.models.cart_discount;

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
public final class CartDiscountChangeCartPredicateActionImpl implements CartDiscountChangeCartPredicateAction {

    private String action;
    
    private String cartPredicate;

    @JsonCreator
    CartDiscountChangeCartPredicateActionImpl(@JsonProperty("cartPredicate") final String cartPredicate) {
        this.cartPredicate = cartPredicate;
        this.action = "changeCartPredicate";
    }
    public CartDiscountChangeCartPredicateActionImpl() {
        this.action = "changeCartPredicate";
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>A valid Cart predicate.</p>
    */
    public String getCartPredicate(){
        return this.cartPredicate;
    }

    public void setCartPredicate(final String cartPredicate){
        this.cartPredicate = cartPredicate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CartDiscountChangeCartPredicateActionImpl that = (CartDiscountChangeCartPredicateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(cartPredicate, that.cartPredicate)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(cartPredicate)
            .toHashCode();
    }

}
