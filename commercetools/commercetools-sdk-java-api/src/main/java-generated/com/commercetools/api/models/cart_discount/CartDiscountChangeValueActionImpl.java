package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.models.cart_discount.CartDiscountValueDraft;
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
 * CartDiscountChangeValueAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartDiscountChangeValueActionImpl implements CartDiscountChangeValueAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.cart_discount.CartDiscountValueDraft value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartDiscountChangeValueActionImpl(@JsonProperty("value") final com.commercetools.api.models.cart_discount.CartDiscountValueDraft value) {
        this.value = value;
        this.action =  CHANGE_VALUE;
    }
    /**
     * create empty instance
     */
    public CartDiscountChangeValueActionImpl() {
        this.action =  CHANGE_VALUE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>New value to set.</p>
     */
    
    public com.commercetools.api.models.cart_discount.CartDiscountValueDraft getValue(){
        return this.value;
    }

    
    public void setValue(final com.commercetools.api.models.cart_discount.CartDiscountValueDraft value){
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CartDiscountChangeValueActionImpl that = (CartDiscountChangeValueActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(value, that.value)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(value)
            .toHashCode();
    }

}
