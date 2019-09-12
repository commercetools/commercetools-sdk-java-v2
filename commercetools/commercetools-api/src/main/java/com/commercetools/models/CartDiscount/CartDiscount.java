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
import com.commercetools.models.CartDiscount.CartDiscountImpl;

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
@JsonDeserialize(as = CartDiscountImpl.class)
public interface CartDiscount extends LoggedResource {

   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   
   
   @JsonProperty("key")
   public String getKey();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   
   @NotNull
   @Valid
   @JsonProperty("value")
   public CartDiscountValue getValue();
   
   @NotNull
   @JsonProperty("cartPredicate")
   public String getCartPredicate();
   
   @Valid
   @JsonProperty("target")
   public CartDiscountTarget getTarget();
   
   @NotNull
   @JsonProperty("sortOrder")
   public String getSortOrder();
   
   @NotNull
   @JsonProperty("isActive")
   public Boolean getIsActive();
   
   
   @JsonProperty("validFrom")
   public ZonedDateTime getValidFrom();
   
   
   @JsonProperty("validUntil")
   public ZonedDateTime getValidUntil();
   
   @NotNull
   @JsonProperty("requiresDiscountCode")
   public Boolean getRequiresDiscountCode();
   
   @NotNull
   @Valid
   @JsonProperty("references")
   public List<Reference> getReferences();
   /**
   	<p>Specifies whether the application of this discount causes the following discounts to be ignored.
   	Defaults to Stacking.</p>
   */
   @NotNull
   @JsonProperty("stackingMode")
   public StackingMode getStackingMode();
   
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();

   public void setName(final LocalizedString name);
   
   public void setKey(final String key);
   
   public void setDescription(final LocalizedString description);
   
   public void setValue(final CartDiscountValue value);
   
   public void setCartPredicate(final String cartPredicate);
   
   public void setTarget(final CartDiscountTarget target);
   
   public void setSortOrder(final String sortOrder);
   
   public void setIsActive(final Boolean isActive);
   
   public void setValidFrom(final ZonedDateTime validFrom);
   
   public void setValidUntil(final ZonedDateTime validUntil);
   
   public void setRequiresDiscountCode(final Boolean requiresDiscountCode);
   
   public void setReferences(final List<Reference> references);
   
   public void setStackingMode(final StackingMode stackingMode);
   
   public void setCustom(final CustomFields custom);
   
   public static CartDiscountImpl of(){
      return new CartDiscountImpl();
   }
   

   public static CartDiscountImpl of(final CartDiscount template) {
      CartDiscountImpl instance = new CartDiscountImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setRequiresDiscountCode(template.getRequiresDiscountCode());
      instance.setReferences(template.getReferences());
      instance.setCartPredicate(template.getCartPredicate());
      instance.setCustom(template.getCustom());
      instance.setDescription(template.getDescription());
      instance.setValidFrom(template.getValidFrom());
      instance.setIsActive(template.getIsActive());
      instance.setTarget(template.getTarget());
      instance.setStackingMode(template.getStackingMode());
      instance.setSortOrder(template.getSortOrder());
      instance.setName(template.getName());
      instance.setValidUntil(template.getValidUntil());
      instance.setValue(template.getValue());
      instance.setKey(template.getKey());
      return instance;
   }

}