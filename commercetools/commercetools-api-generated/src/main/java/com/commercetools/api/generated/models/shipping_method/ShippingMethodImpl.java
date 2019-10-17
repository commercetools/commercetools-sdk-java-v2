package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.shipping_method.ZoneRate;
import com.commercetools.api.generated.models.tax_category.TaxCategoryReference;
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
   
   private String id;
   
   private Long version;
   
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   private java.util.List<com.commercetools.api.generated.models.shipping_method.ZoneRate> zoneRates;
   
   private String predicate;
   
   private Boolean isDefault;
   
   private String name;
   
   private String description;
   
   private String key;
   
   private com.commercetools.api.generated.models.tax_category.TaxCategoryReference taxCategory;

   @JsonCreator
   ShippingMethodImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.api.generated.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("zoneRates") final java.util.List<com.commercetools.api.generated.models.shipping_method.ZoneRate> zoneRates, @JsonProperty("predicate") final String predicate, @JsonProperty("isDefault") final Boolean isDefault, @JsonProperty("name") final String name, @JsonProperty("description") final String description, @JsonProperty("key") final String key, @JsonProperty("taxCategory") final com.commercetools.api.generated.models.tax_category.TaxCategoryReference taxCategory) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
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
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.shipping_method.ZoneRate> getZoneRates(){
      return this.zoneRates;
   }
   
   
   public String getPredicate(){
      return this.predicate;
   }
   
   
   public Boolean getIsDefault(){
      return this.isDefault;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public String getDescription(){
      return this.description;
   }
   
   
   public String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.api.generated.models.tax_category.TaxCategoryReference getTaxCategory(){
      return this.taxCategory;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setCreatedBy(final com.commercetools.api.generated.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setZoneRates(final java.util.List<com.commercetools.api.generated.models.shipping_method.ZoneRate> zoneRates){
      this.zoneRates = zoneRates;
   }
   
   public void setPredicate(final String predicate){
      this.predicate = predicate;
   }
   
   public void setIsDefault(final Boolean isDefault){
      this.isDefault = isDefault;
   }
   
   public void setName(final String name){
      this.name = name;
   }
   
   public void setDescription(final String description){
      this.description = description;
   }
   
   public void setKey(final String key){
      this.key = key;
   }
   
   public void setTaxCategory(final com.commercetools.api.generated.models.tax_category.TaxCategoryReference taxCategory){
      this.taxCategory = taxCategory;
   }

}