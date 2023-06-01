package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * DiscountCodeSetCartPredicateAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DiscountCodeSetCartPredicateActionImpl implements DiscountCodeSetCartPredicateAction, ModelBase {

    
    private String action;
    
    
    private String cartPredicate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountCodeSetCartPredicateActionImpl(@JsonProperty("cartPredicate") final String cartPredicate) {
        this.cartPredicate = cartPredicate;
        this.action =  SET_CART_PREDICATE;
    }
    /**
     * create empty instance
     */
    public DiscountCodeSetCartPredicateActionImpl() {
        this.action =  SET_CART_PREDICATE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
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
    
        DiscountCodeSetCartPredicateActionImpl that = (DiscountCodeSetCartPredicateActionImpl) o;
    
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
