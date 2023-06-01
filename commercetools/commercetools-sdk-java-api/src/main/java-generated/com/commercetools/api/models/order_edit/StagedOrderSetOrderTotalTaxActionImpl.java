package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.TaxPortionDraft;
import com.commercetools.api.models.common.Money;
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
 * StagedOrderSetOrderTotalTaxAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderSetOrderTotalTaxActionImpl implements StagedOrderSetOrderTotalTaxAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.common.Money externalTotalGross;
    
    
    private java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderSetOrderTotalTaxActionImpl(@JsonProperty("externalTotalGross") final com.commercetools.api.models.common.Money externalTotalGross, @JsonProperty("externalTaxPortions") final java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions) {
        this.externalTotalGross = externalTotalGross;
        this.externalTaxPortions = externalTaxPortions;
        this.action =  SET_ORDER_TOTAL_TAX;
    }
    /**
     * create empty instance
     */
    public StagedOrderSetOrderTotalTaxActionImpl() {
        this.action =  SET_ORDER_TOTAL_TAX;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Draft type that stores amounts only in cent precision for the specified currency.</p>
     */
    
    public com.commercetools.api.models.common.Money getExternalTotalGross(){
        return this.externalTotalGross;
    }
    
    /**
     *
     */
    
    public java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> getExternalTaxPortions(){
        return this.externalTaxPortions;
    }

    
    public void setExternalTotalGross(final com.commercetools.api.models.common.Money externalTotalGross){
        this.externalTotalGross = externalTotalGross;
    }
    
    
    public void setExternalTaxPortions(final com.commercetools.api.models.cart.TaxPortionDraft ...externalTaxPortions){
       this.externalTaxPortions = new ArrayList<>(Arrays.asList(externalTaxPortions));
    }
    
    
    public void setExternalTaxPortions(final java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions){
       this.externalTaxPortions = externalTaxPortions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StagedOrderSetOrderTotalTaxActionImpl that = (StagedOrderSetOrderTotalTaxActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(externalTotalGross, that.externalTotalGross)
                .append(externalTaxPortions, that.externalTaxPortions)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(externalTotalGross)
            .append(externalTaxPortions)
            .toHashCode();
    }

}
