package com.commercetools.api.generated.models.discount_code;

import com.commercetools.api.generated.models.cart_discount.CartDiscountReference;
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
   
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   private java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscountReference> cartDiscounts;
   
   private String code;
   
   private java.util.List<com.commercetools.api.generated.models.common.Reference> references;
   
   private String cartPredicate;
   
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   private java.util.List<String> groups;
   
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   private java.time.ZonedDateTime validFrom;
   
   private Boolean isActive;
   
   private Long maxApplications;
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   private java.time.ZonedDateTime validUntil;
   
   private Long maxApplicationsPerCustomer;

   @JsonCreator
   DiscountCodeImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.api.generated.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("cartDiscounts") final java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscountReference> cartDiscounts, @JsonProperty("code") final String code, @JsonProperty("references") final java.util.List<com.commercetools.api.generated.models.common.Reference> references, @JsonProperty("cartPredicate") final String cartPredicate, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFields custom, @JsonProperty("groups") final java.util.List<String> groups, @JsonProperty("description") final com.commercetools.api.generated.models.common.LocalizedString description, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("isActive") final Boolean isActive, @JsonProperty("maxApplications") final Long maxApplications, @JsonProperty("name") final com.commercetools.api.generated.models.common.LocalizedString name, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil, @JsonProperty("maxApplicationsPerCustomer") final Long maxApplicationsPerCustomer) {
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
      this.groups = groups;
      this.description = description;
      this.validFrom = validFrom;
      this.isActive = isActive;
      this.maxApplications = maxApplications;
      this.name = name;
      this.validUntil = validUntil;
      this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
   }
   public DiscountCodeImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   /**
   *  <p>The unique ID of the discount code.</p>
   */
   public String getId(){
      return this.id;
   }
   
   
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
   *  <p>The referenced matching cart discounts can be applied to the cart once the DiscountCode is added.</p>
   */
   public java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscountReference> getCartDiscounts(){
      return this.cartDiscounts;
   }
   
   /**
   *  <p>Unique identifier of this discount code.
   *  This value is added to the cart
   *  to enable the related cart discounts in the cart.</p>
   */
   public String getCode(){
      return this.code;
   }
   
   /**
   *  <p>The platform will generate this array from the cart predicate.
   *  It contains the references of all the resources that are addressed in the predicate.</p>
   */
   public java.util.List<com.commercetools.api.generated.models.common.Reference> getReferences(){
      return this.references;
   }
   
   /**
   *  <p>The discount code can only be applied to carts that match this predicate.</p>
   */
   public String getCartPredicate(){
      return this.cartPredicate;
   }
   
   
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   /**
   *  <p>The groups to which this discount code belong.</p>
   */
   public java.util.List<String> getGroups(){
      return this.groups;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   /**
   *  <p>The time from which the discount can be applied on a cart.
   *  Before that time the code is invalid.</p>
   */
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   
   public Boolean getIsActive(){
      return this.isActive;
   }
   
   /**
   *  <p>The discount code can only be applied <code>maxApplications</code> times.</p>
   */
   public Long getMaxApplications(){
      return this.maxApplications;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   /**
   *  <p>The time until the discount can be applied on a cart.
   *  After that time the code is invalid.</p>
   */
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   /**
   *  <p>The discount code can only be applied <code>maxApplicationsPerCustomer</code> times per customer.</p>
   */
   public Long getMaxApplicationsPerCustomer(){
      return this.maxApplicationsPerCustomer;
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
   
   public void setCartDiscounts(final java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscountReference> cartDiscounts){
      this.cartDiscounts = cartDiscounts;
   }
   
   public void setCode(final String code){
      this.code = code;
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
   
   public void setGroups(final java.util.List<String> groups){
      this.groups = groups;
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
   
   public void setMaxApplications(final Long maxApplications){
      this.maxApplications = maxApplications;
   }
   
   public void setName(final com.commercetools.api.generated.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setValidUntil(final java.time.ZonedDateTime validUntil){
      this.validUntil = validUntil;
   }
   
   public void setMaxApplicationsPerCustomer(final Long maxApplicationsPerCustomer){
      this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
   }

}