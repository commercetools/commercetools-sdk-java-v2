package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountTarget;
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
 *  <p>Discount is applied to CustomLineItems matching the <code>predicate</code>.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartDiscountCustomLineItemsTargetImpl implements CartDiscountCustomLineItemsTarget, ModelBase {

    
    private String type;
    
    
    private String predicate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartDiscountCustomLineItemsTargetImpl(@JsonProperty("predicate") final String predicate) {
        this.predicate = predicate;
        this.type =  CUSTOM_LINE_ITEMS;
    }
    /**
     * create empty instance
     */
    public CartDiscountCustomLineItemsTargetImpl() {
        this.type =  CUSTOM_LINE_ITEMS;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Valid CustomLineItem target predicate.</p>
     */
    
    public String getPredicate(){
        return this.predicate;
    }

    
    public void setPredicate(final String predicate){
        this.predicate = predicate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CartDiscountCustomLineItemsTargetImpl that = (CartDiscountCustomLineItemsTargetImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(predicate, that.predicate)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(predicate)
            .toHashCode();
    }

}
