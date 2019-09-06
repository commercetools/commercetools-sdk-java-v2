package com.commercetools.models.OrderEdit;

import com.commercetools.models.Cart.ExternalTaxRateDraft;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import com.commercetools.models.ShippingMethod.ShippingRateDraft;
import com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderSetCustomShippingMethodActionImpl implements StagedOrderSetCustomShippingMethodAction {

   private java.lang.String action;
   
   private com.commercetools.models.ShippingMethod.ShippingRateDraft shippingRate;
   
   private com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate;
   
   private java.lang.String shippingMethodName;
   
   private com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory;

   @JsonCreator
   StagedOrderSetCustomShippingMethodActionImpl(@JsonProperty("shippingRate") final com.commercetools.models.ShippingMethod.ShippingRateDraft shippingRate, @JsonProperty("externalTaxRate") final com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate, @JsonProperty("shippingMethodName") final java.lang.String shippingMethodName, @JsonProperty("taxCategory") final com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory) {
      this.shippingRate = shippingRate;
      this.externalTaxRate = externalTaxRate;
      this.shippingMethodName = shippingMethodName;
      this.taxCategory = taxCategory;
      this.action = "setCustomShippingMethod";
   }
   public StagedOrderSetCustomShippingMethodActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.ShippingMethod.ShippingRateDraft getShippingRate(){
      return this.shippingRate;
   }
   
   
   public com.commercetools.models.Cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   
   public java.lang.String getShippingMethodName(){
      return this.shippingMethodName;
   }
   
   
   public com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }

   public void setShippingRate(final com.commercetools.models.ShippingMethod.ShippingRateDraft shippingRate){
      this.shippingRate = shippingRate;
   }
   
   public void setExternalTaxRate(final com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate){
      this.externalTaxRate = externalTaxRate;
   }
   
   public void setShippingMethodName(final java.lang.String shippingMethodName){
      this.shippingMethodName = shippingMethodName;
   }
   
   public void setTaxCategory(final com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory){
      this.taxCategory = taxCategory;
   }

}