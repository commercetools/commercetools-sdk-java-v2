package com.commercetools.models.message;

import com.commercetools.models.common.LocalizedString;
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

   private String orderNumber;
   
   private String externalId;
   
   private String sku;
   
   private String customerNumber;
   
   private com.commercetools.models.common.LocalizedString slug;
   
   private String key;

   @JsonCreator
   UserProvidedIdentifiersImpl(@JsonProperty("orderNumber") final String orderNumber, @JsonProperty("externalId") final String externalId, @JsonProperty("sku") final String sku, @JsonProperty("customerNumber") final String customerNumber, @JsonProperty("slug") final com.commercetools.models.common.LocalizedString slug, @JsonProperty("key") final String key) {
      this.orderNumber = orderNumber;
      this.externalId = externalId;
      this.sku = sku;
      this.customerNumber = customerNumber;
      this.slug = slug;
      this.key = key;
   }
   public UserProvidedIdentifiersImpl() {
      
   }
   
   
   public String getOrderNumber(){
      return this.orderNumber;
   }
   
   
   public String getExternalId(){
      return this.externalId;
   }
   
   
   public String getSku(){
      return this.sku;
   }
   
   
   public String getCustomerNumber(){
      return this.customerNumber;
   }
   
   
   public com.commercetools.models.common.LocalizedString getSlug(){
      return this.slug;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public void setOrderNumber(final String orderNumber){
      this.orderNumber = orderNumber;
   }
   
   public void setExternalId(final String externalId){
      this.externalId = externalId;
   }
   
   public void setSku(final String sku){
      this.sku = sku;
   }
   
   public void setCustomerNumber(final String customerNumber){
      this.customerNumber = customerNumber;
   }
   
   public void setSlug(final com.commercetools.models.common.LocalizedString slug){
      this.slug = slug;
   }
   
   public void setKey(final String key){
      this.key = key;
   }

}