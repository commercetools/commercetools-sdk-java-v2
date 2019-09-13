package com.commercetools.models.shipping_method;

import com.commercetools.models.common.BaseResource;
import com.commercetools.models.shipping_method.ZoneRate;
import com.commercetools.models.tax_category.TaxCategoryReference;
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
public final class ShippingMethodImpl implements ShippingMethod {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.String id;
   
   private java.lang.Long version;
   
   private java.util.List<com.commercetools.models.shipping_method.ZoneRate> zoneRates;
   
   private java.lang.String predicate;
   
   private java.lang.Boolean isDefault;
   
   private java.lang.String name;
   
   private java.lang.String description;
   
   private java.lang.String key;
   
   private com.commercetools.models.tax_category.TaxCategoryReference taxCategory;

   @JsonCreator
   ShippingMethodImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("zoneRates") final java.util.List<com.commercetools.models.shipping_method.ZoneRate> zoneRates, @JsonProperty("predicate") final java.lang.String predicate, @JsonProperty("isDefault") final java.lang.Boolean isDefault, @JsonProperty("name") final java.lang.String name, @JsonProperty("description") final java.lang.String description, @JsonProperty("key") final java.lang.String key, @JsonProperty("taxCategory") final com.commercetools.models.tax_category.TaxCategoryReference taxCategory) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.zoneRates = zoneRates;
      this.predicate = predicate;
      this.isDefault = isDefault;
      this.name = name;
      this.description = description;
      this.key = key;
      this.taxCategory = taxCategory;
   }
   public ShippingMethodImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   
   public java.util.List<com.commercetools.models.shipping_method.ZoneRate> getZoneRates(){
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
   
   
   public com.commercetools.models.tax_category.TaxCategoryReference getTaxCategory(){
      return this.taxCategory;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }
   
   public void setZoneRates(final java.util.List<com.commercetools.models.shipping_method.ZoneRate> zoneRates){
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
   
   public void setTaxCategory(final com.commercetools.models.tax_category.TaxCategoryReference taxCategory){
      this.taxCategory = taxCategory;
   }

}