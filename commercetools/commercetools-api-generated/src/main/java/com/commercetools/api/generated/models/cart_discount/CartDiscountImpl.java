package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountTarget;
import com.commercetools.api.generated.models.cart_discount.CartDiscountValue;
import com.commercetools.api.generated.models.cart_discount.StackingMode;
import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.type.CustomFields;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
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
   
   private String id;
   
   private Long version;
   
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   private Boolean requiresDiscountCode;
   
   private java.util.List<com.commercetools.api.generated.models.common.Reference> references;
   
   private String cartPredicate;
   
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   private java.time.ZonedDateTime validFrom;
   
   private Boolean isActive;
   
   private com.commercetools.api.generated.models.cart_discount.CartDiscountTarget target;
   
   private com.commercetools.api.generated.models.cart_discount.StackingMode stackingMode;
   
   private String sortOrder;
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   private java.time.ZonedDateTime validUntil;
   
   private com.commercetools.api.generated.models.cart_discount.CartDiscountValue value;
   
   private String key;

   @JsonCreator
   CartDiscountImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.api.generated.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("requiresDiscountCode") final Boolean requiresDiscountCode, @JsonProperty("references") final java.util.List<com.commercetools.api.generated.models.common.Reference> references, @JsonProperty("cartPredicate") final String cartPredicate, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFields custom, @JsonProperty("description") final com.commercetools.api.generated.models.common.LocalizedString description, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("isActive") final Boolean isActive, @JsonProperty("target") final com.commercetools.api.generated.models.cart_discount.CartDiscountTarget target, @JsonProperty("stackingMode") final com.commercetools.api.generated.models.cart_discount.StackingMode stackingMode, @JsonProperty("sortOrder") final String sortOrder, @JsonProperty("name") final com.commercetools.api.generated.models.common.LocalizedString name, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil, @JsonProperty("value") final com.commercetools.api.generated.models.cart_discount.CartDiscountValue value, @JsonProperty("key") final String key) {
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
   
   /**
   *  <p>The unique ID of the cart discount.</p>
   */
   public String getId(){
      return this.id;
   }
   
   /**
   *  <p>The current version of the cart discount.</p>
   */
   public Long getVersion(){
      return this.version;
   }
   
   /**
   *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
   */
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   /**
   *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
   */
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   /**
   *  <p>States whether the discount can only be used in a connection with a DiscountCode.</p>
   */
   public Boolean getRequiresDiscountCode(){
      return this.requiresDiscountCode;
   }
   
   /**
   *  <p>The platform will generate this array from the predicate.
   *  It contains the references of all the resources that are addressed in the predicate.</p>
   */
   public java.util.List<com.commercetools.api.generated.models.common.Reference> getReferences(){
      return this.references;
   }
   
   /**
   *  <p>A valid Cart predicate.</p>
   */
   public String getCartPredicate(){
      return this.cartPredicate;
   }
   
   
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   /**
   *  <p>Only active discount can be applied to the cart.</p>
   */
   public Boolean getIsActive(){
      return this.isActive;
   }
   
   /**
   *  <p>Empty when the <code>value</code> has type <code>giftLineItem</code>, otherwise a CartDiscountTarget is set.</p>
   */
   public com.commercetools.api.generated.models.cart_discount.CartDiscountTarget getTarget(){
      return this.target;
   }
   
   /**
   *  <p>Specifies whether the application of this discount causes the following discounts to be ignored.
   *  Defaults to Stacking.</p>
   */
   public com.commercetools.api.generated.models.cart_discount.StackingMode getStackingMode(){
      return this.stackingMode;
   }
   
   /**
   *  <p>The string must contain a number between 0 and 1.
   *  All matching cart discounts are applied to a cart in the order defined by this field.
   *  A discount with greater sort order is prioritized higher than a discount with lower sort order.
   *  The sort order is unambiguous among all cart discounts.</p>
   */
   public String getSortOrder(){
      return this.sortOrder;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   
   public com.commercetools.api.generated.models.cart_discount.CartDiscountValue getValue(){
      return this.value;
   }
   
   /**
   *  <p>User-specific unique identifier for a cart discount.
   *  Must be unique across a project.</p>
   */
   public String getKey(){
      return this.key;
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
   
   public void setRequiresDiscountCode(final Boolean requiresDiscountCode){
      this.requiresDiscountCode = requiresDiscountCode;
   }
   
   public void setReferences(final java.util.List<com.commercetools.api.generated.models.common.Reference> references){
      this.references = references;
   }
   
   public void setCartPredicate(final String cartPredicate){
      this.cartPredicate = cartPredicate;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFields custom){
      this.custom = custom;
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
   
   public void setTarget(final com.commercetools.api.generated.models.cart_discount.CartDiscountTarget target){
      this.target = target;
   }
   
   public void setStackingMode(final com.commercetools.api.generated.models.cart_discount.StackingMode stackingMode){
      this.stackingMode = stackingMode;
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
   
   public void setValue(final com.commercetools.api.generated.models.cart_discount.CartDiscountValue value){
      this.value = value;
   }
   
   public void setKey(final String key){
      this.key = key;
   }

}