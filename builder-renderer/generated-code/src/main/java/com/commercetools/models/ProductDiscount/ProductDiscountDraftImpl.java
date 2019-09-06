package com.commercetools.models.ProductDiscount;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.ProductDiscount.ProductDiscountValue;
import java.lang.Boolean;
import java.lang.String;
import java.time.ZonedDateTime;
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
public final class ProductDiscountDraftImpl implements ProductDiscountDraft {

   private java.lang.String predicate;
   
   private java.lang.String sortOrder;
   
   private com.commercetools.models.Common.LocalizedString name;
   
   private java.time.ZonedDateTime validUntil;
   
   private com.commercetools.models.Common.LocalizedString description;
   
   private java.time.ZonedDateTime validFrom;
   
   private java.lang.Boolean isActive;
   
   private com.commercetools.models.ProductDiscount.ProductDiscountValue value;
   
   private java.lang.String key;

   @JsonCreator
   ProductDiscountDraftImpl(@JsonProperty("predicate") final java.lang.String predicate, @JsonProperty("sortOrder") final java.lang.String sortOrder, @JsonProperty("name") final com.commercetools.models.Common.LocalizedString name, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil, @JsonProperty("description") final com.commercetools.models.Common.LocalizedString description, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("isActive") final java.lang.Boolean isActive, @JsonProperty("value") final com.commercetools.models.ProductDiscount.ProductDiscountValue value, @JsonProperty("key") final java.lang.String key) {
      this.predicate = predicate;
      this.sortOrder = sortOrder;
      this.name = name;
      this.validUntil = validUntil;
      this.description = description;
      this.validFrom = validFrom;
      this.isActive = isActive;
      this.value = value;
      this.key = key;
   }
   public ProductDiscountDraftImpl() {
      
   }
   
   
   public java.lang.String getPredicate(){
      return this.predicate;
   }
   
   
   public java.lang.String getSortOrder(){
      return this.sortOrder;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   
   public java.lang.Boolean getIsActive(){
      return this.isActive;
   }
   
   
   public com.commercetools.models.ProductDiscount.ProductDiscountValue getValue(){
      return this.value;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setPredicate(final java.lang.String predicate){
      this.predicate = predicate;
   }
   
   public void setSortOrder(final java.lang.String sortOrder){
      this.sortOrder = sortOrder;
   }
   
   public void setName(final com.commercetools.models.Common.LocalizedString name){
      this.name = name;
   }
   
   public void setValidUntil(final java.time.ZonedDateTime validUntil){
      this.validUntil = validUntil;
   }
   
   public void setDescription(final com.commercetools.models.Common.LocalizedString description){
      this.description = description;
   }
   
   public void setValidFrom(final java.time.ZonedDateTime validFrom){
      this.validFrom = validFrom;
   }
   
   public void setIsActive(final java.lang.Boolean isActive){
      this.isActive = isActive;
   }
   
   public void setValue(final com.commercetools.models.ProductDiscount.ProductDiscountValue value){
      this.value = value;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}