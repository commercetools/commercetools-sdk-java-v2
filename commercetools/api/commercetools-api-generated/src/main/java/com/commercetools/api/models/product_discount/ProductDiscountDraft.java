package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product_discount.ProductDiscountValueDraft;
import java.time.ZonedDateTime;
import com.commercetools.api.models.product_discount.ProductDiscountDraftImpl;

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
   /**
   *  <p>User-specific unique identifier for a product discount.
   *  Must be unique across a project.
   *  The field can be reset using the Set Key UpdateAction</p>
   */

   @JsonProperty("key")
   public String getKey();

   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();

   @NotNull
   @Valid
   @JsonProperty("value")
   public ProductDiscountValueDraft getValue();
   /**
   *  <p>A valid ProductDiscount Predicate.</p>
   */
   @NotNull
   @JsonProperty("predicate")
   public String getPredicate();
   /**
   *  <p>The string must contain a decimal number between 0 and 1.
   *  A discount with greater sortOrder is prioritized higher than a discount with lower sortOrder.</p>
   */
   @NotNull
   @JsonProperty("sortOrder")
   public String getSortOrder();
   /**
   *  <p>If set to <code>true</code> the discount will be applied to product prices.</p>
   */
   @NotNull
   @JsonProperty("isActive")
   public Boolean getIsActive();
   /**
   *  <p>The time from which the discount should be effective.
   *  Please take Eventual Consistency into account for calculated product discount values.</p>
   */

   @JsonProperty("validFrom")
   public ZonedDateTime getValidFrom();
   /**
   *  <p>The time from which the discount should be effective.
   *  Please take Eventual Consistency into account for calculated undiscounted values.</p>
   */

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
