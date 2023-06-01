package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.TaxCalculationMode;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
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
 * StagedOrderChangeTaxCalculationModeAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderChangeTaxCalculationModeActionImpl implements StagedOrderChangeTaxCalculationModeAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderChangeTaxCalculationModeActionImpl(@JsonProperty("taxCalculationMode") final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
        this.action =  CHANGE_TAX_CALCULATION_MODE;
    }
    /**
     * create empty instance
     */
    public StagedOrderChangeTaxCalculationModeActionImpl() {
        this.action =  CHANGE_TAX_CALCULATION_MODE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Determines in which Tax calculation mode taxed prices are calculated.</p>
     */
    
    public com.commercetools.api.models.cart.TaxCalculationMode getTaxCalculationMode(){
        return this.taxCalculationMode;
    }

    
    public void setTaxCalculationMode(final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode){
        this.taxCalculationMode = taxCalculationMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StagedOrderChangeTaxCalculationModeActionImpl that = (StagedOrderChangeTaxCalculationModeActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(taxCalculationMode, that.taxCalculationMode)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(taxCalculationMode)
            .toHashCode();
    }

}
