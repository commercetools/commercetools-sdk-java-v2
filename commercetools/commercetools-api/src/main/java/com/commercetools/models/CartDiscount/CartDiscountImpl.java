package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountTarget;
import com.commercetools.models.CartDiscount.CartDiscountValue;
import com.commercetools.models.CartDiscount.StackingMode;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Common.Reference;
import com.commercetools.models.Type.CustomFields;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountImpl implements CartDiscount {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.String id;
   
   private java.lang.Long version;
   
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
   private java.lang.Boolean requiresDiscountCode;
   
   private java.util.List<com.commercetools.models.Common.Reference> references;
   
   private java.lang.String cartPredicate;
   
   private com.commercetools.models.Type.CustomFields custom;
   
   private com.commercetools.models.Common.LocalizedString description;
   
   private java.time.ZonedDateTime validFrom;
   
   private java.lang.Boolean isActive;
   
   private com.commercetools.models.CartDiscount.CartDiscountTarget target;
   
   private com.commercetools.models.CartDiscount.StackingMode stackingMode;
   
   private java.lang.String sortOrder;
   
   private com.commercetools.models.Common.LocalizedString name;
   
   private java.time.ZonedDateTime validUntil;
   
   private com.commercetools.models.CartDiscount.CartDiscountValue value;
   
   private java.lang.String key;

   @JsonCreator
   CartDiscountImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("createdBy") final com.commercetools.models.Common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.models.Common.LastModifiedBy lastModifiedBy, @JsonProperty("requiresDiscountCode") final java.lang.Boolean requiresDiscountCode, @JsonProperty("references") final java.util.List<com.commercetools.models.Common.Reference> references, @JsonProperty("cartPredicate") final java.lang.String cartPredicate, @JsonProperty("custom") final com.commercetools.models.Type.CustomFields custom, @JsonProperty("description") final com.commercetools.models.Common.LocalizedString description, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("isActive") final java.lang.Boolean isActive, @JsonProperty("target") final com.commercetools.models.CartDiscount.CartDiscountTarget target, @JsonProperty("stackingMode") final com.commercetools.models.CartDiscount.StackingMode stackingMode, @JsonProperty("sortOrder") final java.lang.String sortOrder, @JsonProperty("name") final com.commercetools.models.Common.LocalizedString name, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil, @JsonProperty("value") final com.commercetools.models.CartDiscount.CartDiscountValue value, @JsonProperty("key") final java.lang.String key) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.requiresDiscountCode = requiresDiscountCode;
      this.references = references;
      this.cartPredicate = cartPredicate;
      this.custom = custom;
      this.description = description;
      this.validFrom = validFrom;
      this.isActive = isActive;
      this.target = target;
      this.stackingMode = stackingMode;
      this.sortOrder = sortOrder;
      this.name = name;
      this.validUntil = validUntil;
      this.value = value;
      this.key = key;
   }
   public CartDiscountImpl() {
      
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
   
   
   public java.lang.Boolean getRequiresDiscountCode(){
      return this.requiresDiscountCode;
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
   
   
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   
   public java.lang.Boolean getIsActive(){
      return this.isActive;
   }
   
   
   public com.commercetools.models.CartDiscount.CartDiscountTarget getTarget(){
      return this.target;
   }
   
   /**
   	<p>Specifies whether the application of this discount causes the following discounts to be ignored.
   	Defaults to Stacking.</p>
   */
   public com.commercetools.models.CartDiscount.StackingMode getStackingMode(){
      return this.stackingMode;
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
   
   
   public com.commercetools.models.CartDiscount.CartDiscountValue getValue(){
      return this.value;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
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
   
   public void setRequiresDiscountCode(final java.lang.Boolean requiresDiscountCode){
      this.requiresDiscountCode = requiresDiscountCode;
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
   
   public void setDescription(final com.commercetools.models.Common.LocalizedString description){
      this.description = description;
   }
   
   public void setValidFrom(final java.time.ZonedDateTime validFrom){
      this.validFrom = validFrom;
   }
   
   public void setIsActive(final java.lang.Boolean isActive){
      this.isActive = isActive;
   }
   
   public void setTarget(final com.commercetools.models.CartDiscount.CartDiscountTarget target){
      this.target = target;
   }
   
   public void setStackingMode(final com.commercetools.models.CartDiscount.StackingMode stackingMode){
      this.stackingMode = stackingMode;
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
   
   public void setValue(final com.commercetools.models.CartDiscount.CartDiscountValue value){
      this.value = value;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}