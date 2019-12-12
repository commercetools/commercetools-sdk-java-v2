package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
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
   
   private com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   private String lineItemId;

   @JsonCreator
   CartSetLineItemTaxRateActionImpl(@JsonProperty("externalTaxRate") final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate, @JsonProperty("lineItemId") final String lineItemId) {
      this.externalTaxRate = externalTaxRate;
      this.lineItemId = lineItemId;
      this.action = "setLineItemTaxRate";
   }
   public CartSetLineItemTaxRateActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.generated.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }

   public void setExternalTaxRate(final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate){
      this.externalTaxRate = externalTaxRate;
   }
   
   public void setLineItemId(final String lineItemId){
      this.lineItemId = lineItemId;
   }

}