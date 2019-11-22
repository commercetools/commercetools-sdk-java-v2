package com.commercetools.api.generated.models.discount_code;

import com.commercetools.api.generated.models.cart_discount.CartDiscountResourceIdentifier;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.discount_code.DiscountCodeDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = DiscountCodeDraftImpl.class)
public interface DiscountCodeDraft  {

   /**
   	
   */
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   /**
   	
   */
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   /**
   	<p>Unique identifier of this discount code.
   	This value is added to the cart
   	to enable the related cart discounts in the cart.</p>
   */
   @NotNull
   @JsonProperty("code")
   public String getCode();
   /**
   	<p>The referenced matching cart discounts can be applied to the cart once the discount code is added.
   	The number of cart discounts in a discount code is limited to <strong>{{ site.data.api-limits.cartDiscountsPerDiscountCodeCount }}</strong>.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("cartDiscounts")
   public List<CartDiscountResourceIdentifier> getCartDiscounts();
   /**
   	<p>The discount code can only be applied to carts that match this predicate.</p>
   */
   
   @JsonProperty("cartPredicate")
   public String getCartPredicate();
   /**
   	
   */
   
   @JsonProperty("isActive")
   public Boolean getIsActive();
   /**
   	
   */
   
   @JsonProperty("maxApplications")
   public Long getMaxApplications();
   /**
   	
   */
   
   @JsonProperty("maxApplicationsPerCustomer")
   public Long getMaxApplicationsPerCustomer();
   /**
   	
   */
   @Valid
   @JsonProperty("custom")
   public CustomFieldsDraft getCustom();
   /**
   	<p>The groups to which this discount code shall belong to.</p>
   */
   
   @JsonProperty("groups")
   public List<String> getGroups();
   /**
   	<p>The time from which the discount can be applied on a cart.
   	Before that time the code is invalid.</p>
   */
   
   @JsonProperty("validFrom")
   public ZonedDateTime getValidFrom();
   /**
   	<p>The time until the discount can be applied on a cart.
   	After that time the code is invalid.</p>
   */
   
   @JsonProperty("validUntil")
   public ZonedDateTime getValidUntil();

   public void setName(final LocalizedString name);
   
   public void setDescription(final LocalizedString description);
   
   public void setCode(final String code);
   
   public void setCartDiscounts(final List<CartDiscountResourceIdentifier> cartDiscounts);
   
   public void setCartPredicate(final String cartPredicate);
   
   public void setIsActive(final Boolean isActive);
   
   public void setMaxApplications(final Long maxApplications);
   
   public void setMaxApplicationsPerCustomer(final Long maxApplicationsPerCustomer);
   
   public void setCustom(final CustomFieldsDraft custom);
   
   public void setGroups(final List<String> groups);
   
   public void setValidFrom(final ZonedDateTime validFrom);
   
   public void setValidUntil(final ZonedDateTime validUntil);
   
   public static DiscountCodeDraftImpl of(){
      return new DiscountCodeDraftImpl();
   }
   

   public static DiscountCodeDraftImpl of(final DiscountCodeDraft template) {
      DiscountCodeDraftImpl instance = new DiscountCodeDraftImpl();
      instance.setCartDiscounts(template.getCartDiscounts());
      instance.setCode(template.getCode());
      instance.setCartPredicate(template.getCartPredicate());
      instance.setCustom(template.getCustom());
      instance.setName(template.getName());
      instance.setValidUntil(template.getValidUntil());
      instance.setGroups(template.getGroups());
      instance.setDescription(template.getDescription());
      instance.setValidFrom(template.getValidFrom());
      instance.setMaxApplicationsPerCustomer(template.getMaxApplicationsPerCustomer());
      instance.setIsActive(template.getIsActive());
      instance.setMaxApplications(template.getMaxApplications());
      return instance;
   }

}