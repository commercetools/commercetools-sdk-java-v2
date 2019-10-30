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

   
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   
   @NotNull
   @JsonProperty("code")
   public String getCode();
   
   @NotNull
   @Valid
   @JsonProperty("cartDiscounts")
   public List<CartDiscountResourceIdentifier> getCartDiscounts();
   
   
   @JsonProperty("cartPredicate")
   public String getCartPredicate();
   
   
   @JsonProperty("isActive")
   public Boolean getIsActive();
   
   
   @JsonProperty("maxApplications")
   public Long getMaxApplications();
   
   
   @JsonProperty("maxApplicationsPerCustomer")
   public Long getMaxApplicationsPerCustomer();
   
   @Valid
   @JsonProperty("custom")
   public CustomFieldsDraft getCustom();
   
   
   @JsonProperty("groups")
   public List<String> getGroups();
   
   
   @JsonProperty("validFrom")
   public ZonedDateTime getValidFrom();
   
   
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