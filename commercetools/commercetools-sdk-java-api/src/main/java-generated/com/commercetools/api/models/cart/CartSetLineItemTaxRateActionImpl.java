package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ExternalTaxRateDraft;
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
public final class CartSetLineItemTaxRateActionImpl implements CartSetLineItemTaxRateAction {

    private String action;
    
    private String lineItemId;
    
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    @JsonCreator
    CartSetLineItemTaxRateActionImpl(@JsonProperty("lineItemId") final String lineItemId, @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.lineItemId = lineItemId;
        this.externalTaxRate = externalTaxRate;
        this.action = "setLineItemTaxRate";
    }
    public CartSetLineItemTaxRateActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getLineItemId(){
        return this.lineItemId;
    }
    
    
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
        return this.externalTaxRate;
    }

    public void setLineItemId(final String lineItemId){
        this.lineItemId = lineItemId;
    }
    
    public void setExternalTaxRate(final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate){
        this.externalTaxRate = externalTaxRate;
    }

}
