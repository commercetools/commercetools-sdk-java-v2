package com.commercetools.models.DiscountCode;

import com.commercetools.models.CartDiscount.CartDiscountResourceIdentifier;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Type.CustomFieldsDraft;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DiscountCodeDraftImpl implements DiscountCodeDraft {

   private java.util.List<com.commercetools.models.CartDiscount.CartDiscountResourceIdentifier> cartDiscounts;
   
   private java.lang.String code;
   
   private java.lang.String cartPredicate;
   
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   private com.commercetools.models.Common.LocalizedString name;
   
   private java.time.ZonedDateTime validUntil;
   
   private java.util.List<java.lang.String> groups;
   
   private com.commercetools.models.Common.LocalizedString description;
   
   private java.time.ZonedDateTime validFrom;
   
   private java.lang.Long maxApplicationsPerCustomer;
   
   private java.lang.Boolean isActive;
   
   private java.lang.Long maxApplications;

   @JsonCreator
   DiscountCodeDraftImpl(@JsonProperty("cartDiscounts") final java.util.List<com.commercetools.models.CartDiscount.CartDiscountResourceIdentifier> cartDiscounts, @JsonProperty("code") final java.lang.String code, @JsonProperty("cartPredicate") final java.lang.String cartPredicate, @JsonProperty("custom") final com.commercetools.models.Type.CustomFieldsDraft custom, @JsonProperty("name") final com.commercetools.models.Common.LocalizedString name, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil, @JsonProperty("groups") final java.util.List<java.lang.String> groups, @JsonProperty("description") final com.commercetools.models.Common.LocalizedString description, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("maxApplicationsPerCustomer") final java.lang.Long maxApplicationsPerCustomer, @JsonProperty("isActive") final java.lang.Boolean isActive, @JsonProperty("maxApplications") final java.lang.Long maxApplications) {
      this.cartDiscounts = cartDiscounts;
      this.code = code;
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
   public DiscountCodeDraftImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.models.CartDiscount.CartDiscountResourceIdentifier> getCartDiscounts(){
      return this.cartDiscounts;
   }
   
   
   public java.lang.String getCode(){
      return this.code;
   }
   
   
   public java.lang.String getCartPredicate(){
      return this.cartPredicate;
   }
   
   
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
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

   public void setCartDiscounts(final java.util.List<com.commercetools.models.CartDiscount.CartDiscountResourceIdentifier> cartDiscounts){
      this.cartDiscounts = cartDiscounts;
   }
   
   public void setCode(final java.lang.String code){
      this.code = code;
   }
   
   public void setCartPredicate(final java.lang.String cartPredicate){
      this.cartPredicate = cartPredicate;
   }
   
   public void setCustom(final com.commercetools.models.Type.CustomFieldsDraft custom){
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