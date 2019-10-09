package com.commercetools.models.error;

import com.commercetools.models.common.PriceDraft;
import com.commercetools.models.product.Attribute;
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
public final class VariantValuesImpl implements VariantValues {

   private java.util.List<com.commercetools.models.product.Attribute> attributes;
   
   private java.util.List<com.commercetools.models.common.PriceDraft> prices;
   
   private String sku;

   @JsonCreator
   VariantValuesImpl(@JsonProperty("attributes") final java.util.List<com.commercetools.models.product.Attribute> attributes, @JsonProperty("prices") final java.util.List<com.commercetools.models.common.PriceDraft> prices, @JsonProperty("sku") final String sku) {
      this.attributes = attributes;
      this.prices = prices;
      this.sku = sku;
   }
   public VariantValuesImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.models.product.Attribute> getAttributes(){
      return this.attributes;
   }
   
   
   public java.util.List<com.commercetools.models.common.PriceDraft> getPrices(){
      return this.prices;
   }
   
   
   public String getSku(){
      return this.sku;
   }

   public void setAttributes(final java.util.List<com.commercetools.models.product.Attribute> attributes){
      this.attributes = attributes;
   }
   
   public void setPrices(final java.util.List<com.commercetools.models.common.PriceDraft> prices){
      this.prices = prices;
   }
   
   public void setSku(final String sku){
      this.sku = sku;
   }

}