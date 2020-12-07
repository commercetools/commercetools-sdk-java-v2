package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import java.time.ZonedDateTime;
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
public final class CartDiscountSetValidFromActionImpl implements CartDiscountSetValidFromAction {

    private String action;
    
    private java.time.ZonedDateTime validFrom;

    @JsonCreator
    CartDiscountSetValidFromActionImpl(@JsonProperty("validFrom") final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        this.action = "setValidFrom";
    }
    public CartDiscountSetValidFromActionImpl() {
        this.action = "setValidFrom";
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>If absent, the field with the value is removed in case a value was set before.</p>
    */
    public java.time.ZonedDateTime getValidFrom(){
        return this.validFrom;
    }

    public void setValidFrom(final java.time.ZonedDateTime validFrom){
        this.validFrom = validFrom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CartDiscountSetValidFromActionImpl that = (CartDiscountSetValidFromActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(validFrom, that.validFrom)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(validFrom)
            .toHashCode();
    }

}
