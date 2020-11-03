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
public final class CartSetShippingMethodTaxRateActionImpl implements CartSetShippingMethodTaxRateAction {

    private String action;
    
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    @JsonCreator
    CartSetShippingMethodTaxRateActionImpl(@JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        this.action = "setShippingMethodTaxRate";
    }
    public CartSetShippingMethodTaxRateActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
        return this.externalTaxRate;
    }

    public void setExternalTaxRate(final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate){
        this.externalTaxRate = externalTaxRate;
    }

}
