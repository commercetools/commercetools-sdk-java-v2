package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.ExternalTaxAmountDraft;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartSetCustomLineItemTaxAmountActionImpl implements CartSetCustomLineItemTaxAmountAction {

   private java.lang.String action;
   
   private java.lang.String customLineItemId;
   
   private com.commercetools.models.cart.ExternalTaxAmountDraft externalTaxAmount;

   @JsonCreator
   CartSetCustomLineItemTaxAmountActionImpl(@JsonProperty("customLineItemId") final java.lang.String customLineItemId, @JsonProperty("externalTaxAmount") final com.commercetools.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
      this.customLineItemId = customLineItemId;
      this.externalTaxAmount = externalTaxAmount;
      this.action = "setCustomLineItemTaxAmount";
   }
   public CartSetCustomLineItemTaxAmountActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public com.commercetools.models.cart.ExternalTaxAmountDraft getExternalTaxAmount(){
      return this.externalTaxAmount;
   }

   public void setCustomLineItemId(final java.lang.String customLineItemId){
      this.customLineItemId = customLineItemId;
   }
   
   public void setExternalTaxAmount(final com.commercetools.models.cart.ExternalTaxAmountDraft externalTaxAmount){
      this.externalTaxAmount = externalTaxAmount;
   }

}