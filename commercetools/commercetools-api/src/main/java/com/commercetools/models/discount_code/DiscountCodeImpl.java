package com.commercetools.models.discount_code;

import com.commercetools.models.cart_discount.CartDiscountReference;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.common.Reference;
import com.commercetools.models.type.CustomFields;
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
public final class DiscountCodeImpl implements DiscountCode {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private String id;
   
   private Long version;
   
   private com.commercetools.models.common.CreatedBy createdBy;
   
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   private java.util.List<com.commercetools.models.cart_discount.CartDiscountReference> cartDiscounts;
   
   private String code;
   
   private java.util.List<com.commercetools.models.common.Reference> references;
   
   private String cartPredicate;
   
   private com.commercetools.models.type.CustomFields custom;
   
   private com.commercetools.models.common.LocalizedString name;
   
   private java.time.ZonedDateTime validUntil;
   
   private java.util.List<String> groups;
   
   private com.commercetools.models.common.LocalizedString description;
   
   private java.time.ZonedDateTime validFrom;
   
   private Long maxApplicationsPerCustomer;
   
   private Boolean isActive;
   
   private Long maxApplications;

   @JsonCreator
   DiscountCodeImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("cartDiscounts") final java.util.List<com.commercetools.models.cart_discount.CartDiscountReference> cartDiscounts, @JsonProperty("code") final String code, @JsonProperty("references") final java.util.List<com.commercetools.models.common.Reference> references, @JsonProperty("cartPredicate") final String cartPredicate, @JsonProperty("custom") final com.commercetools.models.type.CustomFields custom, @JsonProperty("name") final com.commercetools.models.common.LocalizedString name, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil, @JsonProperty("groups") final java.util.List<String> groups, @JsonProperty("description") final com.commercetools.models.common.LocalizedString description, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("maxApplicationsPerCustomer") final Long maxApplicationsPerCustomer, @JsonProperty("isActive") final Boolean isActive, @JsonProperty("maxApplications") final Long maxApplications) {
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
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public java.util.List<com.commercetools.models.cart_discount.CartDiscountReference> getCartDiscounts(){
      return this.cartDiscounts;
   }
   
   
   public String getCode(){
      return this.code;
   }
   
   
   public java.util.List<com.commercetools.models.common.Reference> getReferences(){
      return this.references;
   }
   
   
   public String getCartPredicate(){
      return this.cartPredicate;
   }
   
   
   public com.commercetools.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   
   public java.util.List<String> getGroups(){
      return this.groups;
   }
   
   
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   
   public Long getMaxApplicationsPerCustomer(){
      return this.maxApplicationsPerCustomer;
   }
   
   
   public Boolean getIsActive(){
      return this.isActive;
   }
   
   
   public Long getMaxApplications(){
      return this.maxApplications;
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
   
   public void setCreatedBy(final com.commercetools.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setCartDiscounts(final java.util.List<com.commercetools.models.cart_discount.CartDiscountReference> cartDiscounts){
      this.cartDiscounts = cartDiscounts;
   }
   
   public void setCode(final String code){
      this.code = code;
   }
   
   public void setReferences(final java.util.List<com.commercetools.models.common.Reference> references){
      this.references = references;
   }
   
   public void setCartPredicate(final String cartPredicate){
      this.cartPredicate = cartPredicate;
   }
   
   public void setCustom(final com.commercetools.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setName(final com.commercetools.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setValidUntil(final java.time.ZonedDateTime validUntil){
      this.validUntil = validUntil;
   }
   
   public void setGroups(final java.util.List<String> groups){
      this.groups = groups;
   }
   
   public void setDescription(final com.commercetools.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setValidFrom(final java.time.ZonedDateTime validFrom){
      this.validFrom = validFrom;
   }
   
   public void setMaxApplicationsPerCustomer(final Long maxApplicationsPerCustomer){
      this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
   }
   
   public void setIsActive(final Boolean isActive){
      this.isActive = isActive;
   }
   
   public void setMaxApplications(final Long maxApplications){
      this.maxApplications = maxApplications;
   }

}