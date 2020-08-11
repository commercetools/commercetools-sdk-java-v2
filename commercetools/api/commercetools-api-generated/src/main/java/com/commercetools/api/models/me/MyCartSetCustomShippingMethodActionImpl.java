package com.commercetools.api.models.me;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
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
public final class MyCartSetCustomShippingMethodActionImpl implements MyCartSetCustomShippingMethodAction {

   private String action;
   
   private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;
   
   private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   private String shippingMethodName;
   
   private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

   @JsonCreator
   MyCartSetCustomShippingMethodActionImpl(@JsonProperty("shippingRate") final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate, @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate, @JsonProperty("shippingMethodName") final String shippingMethodName, @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
      this.shippingRate = shippingRate;
      this.externalTaxRate = externalTaxRate;
      this.shippingMethodName = shippingMethodName;
      this.taxCategory = taxCategory;
      this.action = "setCustomShippingMethod";
   }
   public MyCartSetCustomShippingMethodActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.models.shipping_method.ShippingRateDraft getShippingRate(){
      return this.shippingRate;
   }
   
   
   public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   
   public String getShippingMethodName(){
      return this.shippingMethodName;
   }
   
   
   public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }

   public void setShippingRate(final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate){
      this.shippingRate = shippingRate;
   }
   
   public void setExternalTaxRate(final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate){
      this.externalTaxRate = externalTaxRate;
   }
   
   public void setShippingMethodName(final String shippingMethodName){
      this.shippingMethodName = shippingMethodName;
   }
   
   public void setTaxCategory(final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory){
      this.taxCategory = taxCategory;
   }

}
