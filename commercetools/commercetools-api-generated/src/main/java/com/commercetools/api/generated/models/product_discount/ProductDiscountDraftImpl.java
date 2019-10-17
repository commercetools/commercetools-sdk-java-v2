package com.commercetools.api.generated.models.product_discount;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.product_discount.ProductDiscountValueDraft;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDiscountDraftImpl implements ProductDiscountDraft {

   private String predicate;
   
   private String sortOrder;
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   private java.time.ZonedDateTime validUntil;
   
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   private java.time.ZonedDateTime validFrom;
   
   private Boolean isActive;
   
   private com.commercetools.api.generated.models.product_discount.ProductDiscountValueDraft value;
   
   private String key;

   @JsonCreator
   ProductDiscountDraftImpl(@JsonProperty("predicate") final String predicate, @JsonProperty("sortOrder") final String sortOrder, @JsonProperty("name") final com.commercetools.api.generated.models.common.LocalizedString name, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil, @JsonProperty("description") final com.commercetools.api.generated.models.common.LocalizedString description, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("isActive") final Boolean isActive, @JsonProperty("value") final com.commercetools.api.generated.models.product_discount.ProductDiscountValueDraft value, @JsonProperty("key") final String key) {
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
   
   
   public String getPredicate(){
      return this.predicate;
   }
   
   
   public String getSortOrder(){
      return this.sortOrder;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   
   public Boolean getIsActive(){
      return this.isActive;
   }
   
   
   public com.commercetools.api.generated.models.product_discount.ProductDiscountValueDraft getValue(){
      return this.value;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public void setPredicate(final String predicate){
      this.predicate = predicate;
   }
   
   public void setSortOrder(final String sortOrder){
      this.sortOrder = sortOrder;
   }
   
   public void setName(final com.commercetools.api.generated.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setValidUntil(final java.time.ZonedDateTime validUntil){
      this.validUntil = validUntil;
   }
   
   public void setDescription(final com.commercetools.api.generated.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setValidFrom(final java.time.ZonedDateTime validFrom){
      this.validFrom = validFrom;
   }
   
   public void setIsActive(final Boolean isActive){
      this.isActive = isActive;
   }
   
   public void setValue(final com.commercetools.api.generated.models.product_discount.ProductDiscountValueDraft value){
      this.value = value;
   }
   
   public void setKey(final String key){
      this.key = key;
   }

}