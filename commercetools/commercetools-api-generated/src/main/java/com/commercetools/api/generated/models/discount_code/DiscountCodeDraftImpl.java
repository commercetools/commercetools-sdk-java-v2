package com.commercetools.api.generated.models.discount_code;

import com.commercetools.api.generated.models.cart_discount.CartDiscountResourceIdentifier;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
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
public final class DiscountCodeDraftImpl implements DiscountCodeDraft {

   private java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscountResourceIdentifier> cartDiscounts;
   
   private String code;
   
   private String cartPredicate;
   
   private com.commercetools.api.generated.models.type.CustomFieldsDraft custom;
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   private java.time.ZonedDateTime validUntil;
   
   private java.util.List<String> groups;
   
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   private java.time.ZonedDateTime validFrom;
   
   private Long maxApplicationsPerCustomer;
   
   private Boolean isActive;
   
   private Long maxApplications;

   @JsonCreator
   DiscountCodeDraftImpl(@JsonProperty("cartDiscounts") final java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscountResourceIdentifier> cartDiscounts, @JsonProperty("code") final String code, @JsonProperty("cartPredicate") final String cartPredicate, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFieldsDraft custom, @JsonProperty("name") final com.commercetools.api.generated.models.common.LocalizedString name, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil, @JsonProperty("groups") final java.util.List<String> groups, @JsonProperty("description") final com.commercetools.api.generated.models.common.LocalizedString description, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("maxApplicationsPerCustomer") final Long maxApplicationsPerCustomer, @JsonProperty("isActive") final Boolean isActive, @JsonProperty("maxApplications") final Long maxApplications) {
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
   
   /**
   	<p>The referenced matching cart discounts can be applied to the cart once the discount code is added.
   	The number of cart discounts in a discount code is limited to <strong>{{ site.data.api-limits.cartDiscountsPerDiscountCodeCount }}</strong>.</p>
   */
   public java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscountResourceIdentifier> getCartDiscounts(){
      return this.cartDiscounts;
   }
   
   /**
   	<p>Unique identifier of this discount code.
   	This value is added to the cart
   	to enable the related cart discounts in the cart.</p>
   */
   public String getCode(){
      return this.code;
   }
   
   /**
   	<p>The discount code can only be applied to carts that match this predicate.</p>
   */
   public String getCartPredicate(){
      return this.cartPredicate;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   /**
   	<p>The time until the discount can be applied on a cart.
   	After that time the code is invalid.</p>
   */
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   /**
   	<p>The groups to which this discount code shall belong to.</p>
   */
   public java.util.List<String> getGroups(){
      return this.groups;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   /**
   	<p>The time from which the discount can be applied on a cart.
   	Before that time the code is invalid.</p>
   */
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   /**
   	
   */
   public Long getMaxApplicationsPerCustomer(){
      return this.maxApplicationsPerCustomer;
   }
   
   /**
   	
   */
   public Boolean getIsActive(){
      return this.isActive;
   }
   
   /**
   	
   */
   public Long getMaxApplications(){
      return this.maxApplications;
   }

   public void setCartDiscounts(final java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscountResourceIdentifier> cartDiscounts){
      this.cartDiscounts = cartDiscounts;
   }
   
   public void setCode(final String code){
      this.code = code;
   }
   
   public void setCartPredicate(final String cartPredicate){
      this.cartPredicate = cartPredicate;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setName(final com.commercetools.api.generated.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setValidUntil(final java.time.ZonedDateTime validUntil){
      this.validUntil = validUntil;
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