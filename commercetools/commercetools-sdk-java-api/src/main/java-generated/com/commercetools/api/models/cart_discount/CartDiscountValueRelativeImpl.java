package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountValue;
import io.vrap.rmf.base.client.utils.Generated;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountValueRelativeImpl implements CartDiscountValueRelative {

    
    private String type;
    
    
    private Long permyriad;

    @JsonCreator
    CartDiscountValueRelativeImpl(@JsonProperty("permyriad") final Long permyriad) {
        this.permyriad = permyriad;
        this.type =  RELATIVE;
    }
    public CartDiscountValueRelativeImpl() {
        this.type =  RELATIVE;
    }

    
    public String getType(){
        return this.type;
    }
    
    
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
