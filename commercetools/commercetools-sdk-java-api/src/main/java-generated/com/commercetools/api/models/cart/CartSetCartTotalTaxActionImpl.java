package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.TaxPortionDraft;
import com.commercetools.api.models.common.Money;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartSetCartTotalTaxActionImpl implements CartSetCartTotalTaxAction {

    private String action;
    
    private com.commercetools.api.models.common.Money externalTotalGross;
    
    private java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions;

    @JsonCreator
    CartSetCartTotalTaxActionImpl(@JsonProperty("externalTotalGross") final com.commercetools.api.models.common.Money externalTotalGross, @JsonProperty("externalTaxPortions") final java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions) {
        this.externalTotalGross = externalTotalGross;
        this.externalTaxPortions = externalTaxPortions;
        this.action = "setCartTotalTax";
    }
    public CartSetCartTotalTaxActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>The total gross amount of the cart (totalNet + taxes).</p>
    */
    public com.commercetools.api.models.common.Money getExternalTotalGross(){
        return this.externalTotalGross;
    }
    
    
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

}
