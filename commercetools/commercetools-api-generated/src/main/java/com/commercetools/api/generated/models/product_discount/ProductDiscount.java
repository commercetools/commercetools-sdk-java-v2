package com.commercetools.api.generated.models.product_discount;

import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.product_discount.ProductDiscountValue;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.product_discount.ProductDiscountImpl;

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
@JsonDeserialize(as = ProductDiscountImpl.class)
public interface ProductDiscount extends LoggedResource {

   /**
   *  <p>The unique ID of the product discount</p>
   */
   @NotNull
   @JsonProperty("id")
   public String getId();
   /**
   *  <p>The current version of the product discount.</p>
   */
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @JsonProperty("createdAt")
   public ZonedDateTime getCreatedAt();
   
   @NotNull
   @JsonProperty("lastModifiedAt")
   public ZonedDateTime getLastModifiedAt();
   /**
   *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
   */
   @Valid
   @JsonProperty("lastModifiedBy")
   public LastModifiedBy getLastModifiedBy();
   /**
   *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
   */
   @Valid
   @JsonProperty("createdBy")
   public CreatedBy getCreatedBy();
   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   /**
   *  <p>User-specific unique identifier for a product discount.
   *  Must be unique across a project.</p>
   */
   
   @JsonProperty("key")
   public String getKey();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   
   @NotNull
   @Valid
   @JsonProperty("value")
   public ProductDiscountValue getValue();
   /**
   *  <p>A valid ProductDiscount Predicate.</p>
   */
   @NotNull
   @JsonProperty("predicate")
   public String getPredicate();
   /**
   *  <p>The string contains a number between 0 and 1.
   *  A discount with greater sortOrder is prioritized higher than a discount with lower sortOrder.
   *  A sortOrder must be unambiguous.</p>
   */
   @NotNull
   @JsonProperty("sortOrder")
   public String getSortOrder();
   /**
   *  <p>Only active discount will be applied to product prices.</p>
   */
   @NotNull
   @JsonProperty("isActive")
   public Boolean getIsActive();
   /**
   *  <p>The platform will generate this array from the predicate.
   *  It contains the references of all the resources that are addressed in the predicate.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("references")
   public List<Reference> getReferences();
   /**
   *  <p>The time from which the discount should be effective.
   *  Please take Eventual Consistency into account for calculated product discount values.</p>
   */
   
   @JsonProperty("validFrom")
   public ZonedDateTime getValidFrom();
   /**
   *  <p>The time from which the discount should be ineffective.
   *  Please take Eventual Consistency into account for calculated undiscounted values.</p>
   */
   
   @JsonProperty("validUntil")
   public ZonedDateTime getValidUntil();

   public void setId(final String id);
   
   public void setVersion(final Long version);
   
   public void setCreatedAt(final ZonedDateTime createdAt);
   
   public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);
   
   public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);
   
   public void setCreatedBy(final CreatedBy createdBy);
   
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
      instance.setReferences(template.getReferences());
      instance.setDescription(template.getDescription());
      instance.setValidFrom(template.getValidFrom());
      instance.setIsActive(template.getIsActive());
      instance.setPredicate(template.getPredicate());
      instance.setSortOrder(template.getSortOrder());
      instance.setName(template.getName());
      instance.setValidUntil(template.getValidUntil());
      instance.setValue(template.getValue());
      instance.setKey(template.getKey());
      return instance;
   }

}