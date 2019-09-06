package com.commercetools.models.DiscountCode;

import com.commercetools.models.CartDiscount.CartDiscountReference;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Common.Reference;
import com.commercetools.models.Type.CustomFields;
import java.lang.Boolean;
import java.lang.Long;
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
public final class DiscountCodeImpl implements DiscountCode {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.String id;
   
   private java.lang.Long version;
   
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
   private java.util.List<com.commercetools.models.CartDiscount.CartDiscountReference> cartDiscounts;
   
   private java.lang.String code;
   
   private java.util.List<com.commercetools.models.Common.Reference> references;
   
   private java.lang.String cartPredicate;
   
   private com.commercetools.models.Type.CustomFields custom;
   
   private com.commercetools.models.Common.LocalizedString name;
   
   private java.time.ZonedDateTime validUntil;
   
   private java.util.List<java.lang.String> groups;
   
   private com.commercetools.models.Common.LocalizedString description;
   
   private java.time.ZonedDateTime validFrom;
   
   private java.lang.Long maxApplicationsPerCustomer;
   
   private java.lang.Boolean isActive;
   
   private java.lang.Long maxApplications;

   @JsonCreator
   DiscountCodeImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("createdBy") final com.commercetools.models.Common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.models.Common.LastModifiedBy lastModifiedBy, @JsonProperty("cartDiscounts") final java.util.List<com.commercetools.models.CartDiscount.CartDiscountReference> cartDiscounts, @JsonProperty("code") final java.lang.String code, @JsonProperty("references") final java.util.List<com.commercetools.models.Common.Reference> references, @JsonProperty("cartPredicate") final java.lang.String cartPredicate, @JsonProperty("custom") final com.commercetools.models.Type.CustomFields custom, @JsonProperty("name") final com.commercetools.models.Common.LocalizedString name, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil, @JsonProperty("groups") final java.util.List<java.lang.String> groups, @JsonProperty("description") final com.commercetools.models.Common.LocalizedString description, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("maxApplicationsPerCustomer") final java.lang.Long maxApplicationsPerCustomer, @JsonProperty("isActive") final java.lang.Boolean isActive, @JsonProperty("maxApplications") final java.lang.Long maxApplications) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.cartDiscounts = cartDiscounts;
      this.code = code;
      this.references = references;
      this.cartPredicate = cartPredicate;
      this.custom = custom;
      this.name = name;
      this.validUntil = validUntil;
      this.groups = groups;
      this.description = description;
      this.validFrom = validFrom;
      this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
      this.isActive = isActive;
      this.maxApplications = maxApplications;
   }
   public DiscountCodeImpl() {
      
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
   
   
   public com.commercetools.models.Common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.models.Common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public java.util.List<com.commercetools.models.CartDiscount.CartDiscountReference> getCartDiscounts(){
      return this.cartDiscounts;
   }
   
   
   public java.lang.String getCode(){
      return this.code;
   }
   
   
   public java.util.List<com.commercetools.models.Common.Reference> getReferences(){
      return this.references;
   }
   
   
   public java.lang.String getCartPredicate(){
      return this.cartPredicate;
   }
   
   
   public com.commercetools.models.Type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   
   public java.util.List<java.lang.String> getGroups(){
      return this.groups;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   
   public java.lang.Long getMaxApplicationsPerCustomer(){
      return this.maxApplicationsPerCustomer;
   }
   
   
   public java.lang.Boolean getIsActive(){
      return this.isActive;
   }
   
   
   public java.lang.Long getMaxApplications(){
      return this.maxApplications;
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
   
   public void setCreatedBy(final com.commercetools.models.Common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.models.Common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setCartDiscounts(final java.util.List<com.commercetools.models.CartDiscount.CartDiscountReference> cartDiscounts){
      this.cartDiscounts = cartDiscounts;
   }
   
   public void setCode(final java.lang.String code){
      this.code = code;
   }
   
   public void setReferences(final java.util.List<com.commercetools.models.Common.Reference> references){
      this.references = references;
   }
   
   public void setCartPredicate(final java.lang.String cartPredicate){
      this.cartPredicate = cartPredicate;
   }
   
   public void setCustom(final com.commercetools.models.Type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setName(final com.commercetools.models.Common.LocalizedString name){
      this.name = name;
   }
   
   public void setValidUntil(final java.time.ZonedDateTime validUntil){
      this.validUntil = validUntil;
   }
   
   public void setGroups(final java.util.List<java.lang.String> groups){
      this.groups = groups;
   }
   
   public void setDescription(final com.commercetools.models.Common.LocalizedString description){
      this.description = description;
   }
   
   public void setValidFrom(final java.time.ZonedDateTime validFrom){
      this.validFrom = validFrom;
   }
   
   public void setMaxApplicationsPerCustomer(final java.lang.Long maxApplicationsPerCustomer){
      this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
   }
   
   public void setIsActive(final java.lang.Boolean isActive){
      this.isActive = isActive;
   }
   
   public void setMaxApplications(final java.lang.Long maxApplications){
      this.maxApplications = maxApplications;
   }

}