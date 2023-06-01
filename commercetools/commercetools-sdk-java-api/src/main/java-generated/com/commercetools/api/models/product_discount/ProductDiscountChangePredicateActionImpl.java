package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountUpdateAction;
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
 * ProductDiscountChangePredicateAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductDiscountChangePredicateActionImpl implements ProductDiscountChangePredicateAction, ModelBase {

    
    private String action;
    
    
    private String predicate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductDiscountChangePredicateActionImpl(@JsonProperty("predicate") final String predicate) {
        this.predicate = predicate;
        this.action =  CHANGE_PREDICATE;
    }
    /**
     * create empty instance
     */
    public ProductDiscountChangePredicateActionImpl() {
        this.action =  CHANGE_PREDICATE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>New value to set. Must be a valid ProductDiscount predicate.</p>
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
    
        ProductDiscountChangePredicateActionImpl that = (ProductDiscountChangePredicateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(predicate, that.predicate)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(predicate)
            .toHashCode();
    }

}
