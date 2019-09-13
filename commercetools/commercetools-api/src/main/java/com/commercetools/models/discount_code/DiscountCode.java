package com.commercetools.models.discount_code;

import com.commercetools.models.cart_discount.CartDiscountReference;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.common.Reference;
import com.commercetools.models.type.CustomFields;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.discount_code.DiscountCodeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = DiscountCodeImpl.class)
public interface DiscountCode extends LoggedResource {

   
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
   public List<CartDiscountReference> getCartDiscounts();
   
   
   @JsonProperty("cartPredicate")
   public String getCartPredicate();
   
   @NotNull
   @JsonProperty("isActive")
   public Boolean getIsActive();
   
   @NotNull
   @Valid
   @JsonProperty("references")
   public List<Reference> getReferences();
   
   
   @JsonProperty("maxApplications")
   public Long getMaxApplications();
   
   
   @JsonProperty("maxApplicationsPerCustomer")
   public Long getMaxApplicationsPerCustomer();
   
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();
   
   @NotNull
   @JsonProperty("groups")
   public List<String> getGroups();
   
   
   @JsonProperty("validFrom")
   public ZonedDateTime getValidFrom();
   
   
   @JsonProperty("validUntil")
   public ZonedDateTime getValidUntil();

   public void setName(final LocalizedString name);
   
   public void setDescription(final LocalizedString description);
   
   public void setCode(final String code);
   
   public void setCartDiscounts(final List<CartDiscountReference> cartDiscounts);
   
   public void setCartPredicate(final String cartPredicate);
   
   public void setIsActive(final Boolean isActive);
   
   public void setReferences(final List<Reference> references);
   
   public void setMaxApplications(final Long maxApplications);
   
   public void setMaxApplicationsPerCustomer(final Long maxApplicationsPerCustomer);
   
   public void setCustom(final CustomFields custom);
   
   public void setGroups(final List<String> groups);
   
   public void setValidFrom(final ZonedDateTime validFrom);
   
   public void setValidUntil(final ZonedDateTime validUntil);
   
   public static DiscountCodeImpl of(){
      return new DiscountCodeImpl();
   }
   

   public static DiscountCodeImpl of(final DiscountCode template) {
      DiscountCodeImpl instance = new DiscountCodeImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setCartDiscounts(template.getCartDiscounts());
      instance.setCode(template.getCode());
      instance.setReferences(template.getReferences());
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