package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.TaxMode;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
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
public final class StagedOrderChangeTaxModeActionImpl implements StagedOrderChangeTaxModeAction {

    
    private String action;
    
    
    private com.commercetools.api.models.cart.TaxMode taxMode;

    @JsonCreator
    StagedOrderChangeTaxModeActionImpl(@JsonProperty("taxMode") final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
        this.action =  CHANGE_TAX_MODE;
    }
    public StagedOrderChangeTaxModeActionImpl() {
        this.action =  CHANGE_TAX_MODE;
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.cart.TaxMode getTaxMode(){
        return this.taxMode;
    }

    
    public void setTaxMode(final com.commercetools.api.models.cart.TaxMode taxMode){
        this.taxMode = taxMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StagedOrderChangeTaxModeActionImpl that = (StagedOrderChangeTaxModeActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(taxMode, that.taxMode)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(taxMode)
            .toHashCode();
    }

}
