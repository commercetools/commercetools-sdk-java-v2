package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.RoundingMode;
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
public final class CartChangeTaxRoundingModeActionImpl implements CartChangeTaxRoundingModeAction {

    
    private String action;
    
    
    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

    @JsonCreator
    CartChangeTaxRoundingModeActionImpl(@JsonProperty("taxRoundingMode") final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
        this.action =  CHANGE_TAX_ROUNDING_MODE;
    }
    public CartChangeTaxRoundingModeActionImpl() {
        this.action =  CHANGE_TAX_ROUNDING_MODE;
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode(){
        return this.taxRoundingMode;
    }

    
    public void setTaxRoundingMode(final com.commercetools.api.models.cart.RoundingMode taxRoundingMode){
        this.taxRoundingMode = taxRoundingMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CartChangeTaxRoundingModeActionImpl that = (CartChangeTaxRoundingModeActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(taxRoundingMode, that.taxRoundingMode)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(taxRoundingMode)
            .toHashCode();
    }

}
