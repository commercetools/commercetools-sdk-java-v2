package com.commercetools.models.Error;

import com.commercetools.models.Common.PriceDraft;
import com.commercetools.models.Product.Attribute;
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
public final class VariantValuesImpl implements VariantValues {

   private java.util.List<com.commercetools.models.Product.Attribute> attributes;
   
   private java.util.List<com.commercetools.models.Common.PriceDraft> prices;
   
   private java.lang.String sku;

   @JsonCreator
   VariantValuesImpl(@JsonProperty("attributes") final java.util.List<com.commercetools.models.Product.Attribute> attributes, @JsonProperty("prices") final java.util.List<com.commercetools.models.Common.PriceDraft> prices, @JsonProperty("sku") final java.lang.String sku) {
      this.attributes = attributes;
      this.prices = prices;
      this.sku = sku;
   }
   public VariantValuesImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.models.Product.Attribute> getAttributes(){
      return this.attributes;
   }
   
   
   public java.util.List<com.commercetools.models.Common.PriceDraft> getPrices(){
      return this.prices;
   }
   
   
   public java.lang.String getSku(){
      return this.sku;
   }

   public void setAttributes(final java.util.List<com.commercetools.models.Product.Attribute> attributes){
      this.attributes = attributes;
   }
   
   public void setPrices(final java.util.List<com.commercetools.models.Common.PriceDraft> prices){
      this.prices = prices;
   }
   
   public void setSku(final java.lang.String sku){
      this.sku = sku;
   }

}