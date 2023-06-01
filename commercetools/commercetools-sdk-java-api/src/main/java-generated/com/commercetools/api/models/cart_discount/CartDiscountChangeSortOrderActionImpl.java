package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
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
 * CartDiscountChangeSortOrderAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartDiscountChangeSortOrderActionImpl implements CartDiscountChangeSortOrderAction, ModelBase {

    
    private String action;
    
    
    private String sortOrder;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartDiscountChangeSortOrderActionImpl(@JsonProperty("sortOrder") final String sortOrder) {
        this.sortOrder = sortOrder;
        this.action =  CHANGE_SORT_ORDER;
    }
    /**
     * create empty instance
     */
    public CartDiscountChangeSortOrderActionImpl() {
        this.action =  CHANGE_SORT_ORDER;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>New value to set (between <code>0</code> and <code>1</code>). A Discount with a higher sortOrder is prioritized.</p>
     */
    
    public String getSortOrder(){
        return this.sortOrder;
    }

    
    public void setSortOrder(final String sortOrder){
        this.sortOrder = sortOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CartDiscountChangeSortOrderActionImpl that = (CartDiscountChangeSortOrderActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(sortOrder, that.sortOrder)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(sortOrder)
            .toHashCode();
    }

}
