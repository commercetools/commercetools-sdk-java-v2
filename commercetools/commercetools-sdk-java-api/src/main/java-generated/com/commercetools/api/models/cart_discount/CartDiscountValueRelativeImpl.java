package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountValue;
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
 *  <p>Discounts the CartDiscountTarget relative to its price.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartDiscountValueRelativeImpl implements CartDiscountValueRelative, ModelBase {

    
    private String type;
    
    
    private Long permyriad;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartDiscountValueRelativeImpl(@JsonProperty("permyriad") final Long permyriad) {
        this.permyriad = permyriad;
        this.type =  RELATIVE;
    }
    /**
     * create empty instance
     */
    public CartDiscountValueRelativeImpl() {
        this.type =  RELATIVE;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Fraction (per ten thousand) the price is reduced by. For example, <code>1000</code> will result in a 10% price reduction.</p>
     */
    
    public Long getPermyriad(){
        return this.permyriad;
    }

    
    public void setPermyriad(final Long permyriad){
        this.permyriad = permyriad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CartDiscountValueRelativeImpl that = (CartDiscountValueRelativeImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(permyriad, that.permyriad)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(permyriad)
            .toHashCode();
    }

}
