package com.commercetools.api.generated.models.product_discount;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.product_discount.ProductDiscountValueDraft;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.product_discount.ProductDiscountDraftImpl;

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
@JsonDeserialize(as = ProductDiscountDraftImpl.class)
public interface ProductDiscountDraft  {

   
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
   public ProductDiscountValueDraft getValue();
   
   @NotNull
   @JsonProperty("predicate")
   public String getPredicate();
   
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

   public void setName(final LocalizedString name);
   
   public void setKey(final String key);
   
   public void setDescription(final LocalizedString description);
   
   public void setValue(final ProductDiscountValueDraft value);
   
   public void setPredicate(final String predicate);
   
   public void setSortOrder(final String sortOrder);
   
   public void setIsActive(final Boolean isActive);
   
   public void setValidFrom(final ZonedDateTime validFrom);
   
   public void setValidUntil(final ZonedDateTime validUntil);
   
   public static ProductDiscountDraftImpl of(){
      return new ProductDiscountDraftImpl();
   }
   

   public static ProductDiscountDraftImpl of(final ProductDiscountDraft template) {
      ProductDiscountDraftImpl instance = new ProductDiscountDraftImpl();
      instance.setPredicate(template.getPredicate());
      instance.setSortOrder(template.getSortOrder());
      instance.setName(template.getName());
      instance.setValidUntil(template.getValidUntil());
      instance.setDescription(template.getDescription());
      instance.setValidFrom(template.getValidFrom());
      instance.setIsActive(template.getIsActive());
      instance.setValue(template.getValue());
      instance.setKey(template.getKey());
      return instance;
   }

}