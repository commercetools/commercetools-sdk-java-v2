package com.commercetools.models.product_discount;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.common.Reference;
import com.commercetools.models.product_discount.ProductDiscountValue;
import java.time.ZonedDateTime;
import com.commercetools.models.product_discount.ProductDiscountImpl;

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
@JsonDeserialize(as = ProductDiscountImpl.class)
public interface ProductDiscount extends LoggedResource {

   
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
   public ProductDiscountValue getValue();
   
   @NotNull
   @JsonProperty("predicate")
   public String getPredicate();
   
   @NotNull
   @JsonProperty("sortOrder")
   public String getSortOrder();
   
   @NotNull
   @JsonProperty("isActive")
   public Boolean getIsActive();
   
   @NotNull
   @Valid
   @JsonProperty("references")
   public List<Reference> getReferences();
   
   
   @JsonProperty("validFrom")
   public ZonedDateTime getValidFrom();
   
   
   @JsonProperty("validUntil")
   public ZonedDateTime getValidUntil();

   public void setName(final LocalizedString name);
   
   public void setKey(final String key);
   
   public void setDescription(final LocalizedString description);
   
   public void setValue(final ProductDiscountValue value);
   
   public void setPredicate(final String predicate);
   
   public void setSortOrder(final String sortOrder);
   
   public void setIsActive(final Boolean isActive);
   
   public void setReferences(final List<Reference> references);
   
   public void setValidFrom(final ZonedDateTime validFrom);
   
   public void setValidUntil(final ZonedDateTime validUntil);
   
   public static ProductDiscountImpl of(){
      return new ProductDiscountImpl();
   }
   

   public static ProductDiscountImpl of(final ProductDiscount template) {
      ProductDiscountImpl instance = new ProductDiscountImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setPredicate(template.getPredicate());
      instance.setReferences(template.getReferences());
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