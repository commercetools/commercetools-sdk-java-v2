package com.commercetools.models.ShippingMethod;

import com.commercetools.models.ShippingMethod.ZoneRateDraft;
import com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier;
import java.lang.Boolean;
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
public final class ShippingMethodDraftImpl implements ShippingMethodDraft {

   private java.util.List<com.commercetools.models.ShippingMethod.ZoneRateDraft> zoneRates;
   
   private java.lang.String predicate;
   
   private java.lang.Boolean isDefault;
   
   private java.lang.String name;
   
   private java.lang.String description;
   
   private java.lang.String key;
   
   private com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory;

   @JsonCreator
   ShippingMethodDraftImpl(@JsonProperty("zoneRates") final java.util.List<com.commercetools.models.ShippingMethod.ZoneRateDraft> zoneRates, @JsonProperty("predicate") final java.lang.String predicate, @JsonProperty("isDefault") final java.lang.Boolean isDefault, @JsonProperty("name") final java.lang.String name, @JsonProperty("description") final java.lang.String description, @JsonProperty("key") final java.lang.String key, @JsonProperty("taxCategory") final com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory) {
      this.zoneRates = zoneRates;
      this.predicate = predicate;
      this.isDefault = isDefault;
      this.name = name;
      this.description = description;
      this.key = key;
      this.taxCategory = taxCategory;
   }
   public ShippingMethodDraftImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.models.ShippingMethod.ZoneRateDraft> getZoneRates(){
      return this.zoneRates;
   }
   
   
   public java.lang.String getPredicate(){
      return this.predicate;
   }
   
   
   public java.lang.Boolean getIsDefault(){
      return this.isDefault;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   
   public java.lang.String getDescription(){
      return this.description;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }

   public void setZoneRates(final java.util.List<com.commercetools.models.ShippingMethod.ZoneRateDraft> zoneRates){
      this.zoneRates = zoneRates;
   }
   
   public void setPredicate(final java.lang.String predicate){
      this.predicate = predicate;
   }
   
   public void setIsDefault(final java.lang.Boolean isDefault){
      this.isDefault = isDefault;
   }
   
   public void setName(final java.lang.String name){
      this.name = name;
   }
   
   public void setDescription(final java.lang.String description){
      this.description = description;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }
   
   public void setTaxCategory(final com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory){
      this.taxCategory = taxCategory;
   }

}