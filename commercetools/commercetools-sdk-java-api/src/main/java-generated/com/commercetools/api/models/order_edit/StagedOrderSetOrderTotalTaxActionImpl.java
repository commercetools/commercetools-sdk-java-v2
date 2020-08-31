package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.TaxPortionDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderSetOrderTotalTaxActionImpl implements StagedOrderSetOrderTotalTaxAction {

    private String action;
    
    private com.commercetools.api.models.common.Money externalTotalGross;
    
    private java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions;

    @JsonCreator
    StagedOrderSetOrderTotalTaxActionImpl(@JsonProperty("externalTotalGross") final com.commercetools.api.models.common.Money externalTotalGross, @JsonProperty("externalTaxPortions") final java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions) {
        this.externalTotalGross = externalTotalGross;
        this.externalTaxPortions = externalTaxPortions;
        this.action = "setOrderTotalTax";
    }
    public StagedOrderSetOrderTotalTaxActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.common.Money getExternalTotalGross(){
        return this.externalTotalGross;
    }
    
    
    public java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> getExternalTaxPortions(){
        return this.externalTaxPortions;
    }

    public void setExternalTotalGross(final com.commercetools.api.models.common.Money externalTotalGross){
        this.externalTotalGross = externalTotalGross;
    }
    
    public void setExternalTaxPortions(final java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions){
        this.externalTaxPortions = externalTaxPortions;
    }

}
