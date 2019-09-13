package com.commercetools.models.message;

import com.commercetools.models.common.LocalizedString;
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
public final class UserProvidedIdentifiersImpl implements UserProvidedIdentifiers {

   private java.lang.String orderNumber;
   
   private java.lang.String externalId;
   
   private java.lang.String sku;
   
   private java.lang.String customerNumber;
   
   private com.commercetools.models.common.LocalizedString slug;
   
   private java.lang.String key;

   @JsonCreator
   UserProvidedIdentifiersImpl(@JsonProperty("orderNumber") final java.lang.String orderNumber, @JsonProperty("externalId") final java.lang.String externalId, @JsonProperty("sku") final java.lang.String sku, @JsonProperty("customerNumber") final java.lang.String customerNumber, @JsonProperty("slug") final com.commercetools.models.common.LocalizedString slug, @JsonProperty("key") final java.lang.String key) {
      this.orderNumber = orderNumber;
      this.externalId = externalId;
      this.sku = sku;
      this.customerNumber = customerNumber;
      this.slug = slug;
      this.key = key;
   }
   public UserProvidedIdentifiersImpl() {
      
   }
   
   
   public java.lang.String getOrderNumber(){
      return this.orderNumber;
   }
   
   
   public java.lang.String getExternalId(){
      return this.externalId;
   }
   
   
   public java.lang.String getSku(){
      return this.sku;
   }
   
   
   public java.lang.String getCustomerNumber(){
      return this.customerNumber;
   }
   
   
   public com.commercetools.models.common.LocalizedString getSlug(){
      return this.slug;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setOrderNumber(final java.lang.String orderNumber){
      this.orderNumber = orderNumber;
   }
   
   public void setExternalId(final java.lang.String externalId){
      this.externalId = externalId;
   }
   
   public void setSku(final java.lang.String sku){
      this.sku = sku;
   }
   
   public void setCustomerNumber(final java.lang.String customerNumber){
      this.customerNumber = customerNumber;
   }
   
   public void setSlug(final com.commercetools.models.common.LocalizedString slug){
      this.slug = slug;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}