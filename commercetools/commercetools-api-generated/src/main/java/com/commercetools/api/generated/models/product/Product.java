package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.product.ProductCatalogData;
import com.commercetools.api.generated.models.product_type.ProductTypeReference;
import com.commercetools.api.generated.models.review.ReviewRatingStatistics;
import com.commercetools.api.generated.models.state.StateReference;
import com.commercetools.api.generated.models.tax_category.TaxCategoryReference;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.product.ProductImpl;

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
@JsonDeserialize(as = ProductImpl.class)
public interface Product extends LoggedResource {

   /**
   	<p>The unique ID of the product.</p>
   */
   @NotNull
   @JsonProperty("id")
   public String getId();
   /**
   	<p>The current version of the product.</p>
   */
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   /**
   	
   */
   @NotNull
   @JsonProperty("createdAt")
   public ZonedDateTime getCreatedAt();
   /**
   	
   */
   @NotNull
   @JsonProperty("lastModifiedAt")
   public ZonedDateTime getLastModifiedAt();
   /**
   	<p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
   */
   @Valid
   @JsonProperty("lastModifiedBy")
   public LastModifiedBy getLastModifiedBy();
   /**
   	<p>Present on resources created after 1/02/2019 except for events not tracked.</p>
   */
   @Valid
   @JsonProperty("createdBy")
   public CreatedBy getCreatedBy();
   /**
   	<p>User-specific unique identifier for the product.
   	<em>Product keys are different from product variant keys.</em></p>
   */
   
   @JsonProperty("key")
   public String getKey();
   /**
   	
   */
   @NotNull
   @Valid
   @JsonProperty("productType")
   public ProductTypeReference getProductType();
   /**
   	<p>The product data in the master catalog.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("masterData")
   public ProductCatalogData getMasterData();
   /**
   	
   */
   @Valid
   @JsonProperty("taxCategory")
   public TaxCategoryReference getTaxCategory();
   /**
   	
   */
   @Valid
   @JsonProperty("state")
   public StateReference getState();
   /**
   	<p>Statistics about the review ratings taken into account for this product.</p>
   */
   @Valid
   @JsonProperty("reviewRatingStatistics")
   public ReviewRatingStatistics getReviewRatingStatistics();

   public void setId(final String id);
   
   public void setVersion(final Long version);
   
   public void setCreatedAt(final ZonedDateTime createdAt);
   
   public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);
   
   public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);
   
   public void setCreatedBy(final CreatedBy createdBy);
   
   public void setKey(final String key);
   
   public void setProductType(final ProductTypeReference productType);
   
   public void setMasterData(final ProductCatalogData masterData);
   
   public void setTaxCategory(final TaxCategoryReference taxCategory);
   
   public void setState(final StateReference state);
   
   public void setReviewRatingStatistics(final ReviewRatingStatistics reviewRatingStatistics);
   
   public static ProductImpl of(){
      return new ProductImpl();
   }
   

   public static ProductImpl of(final Product template) {
      ProductImpl instance = new ProductImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setMasterData(template.getMasterData());
      instance.setState(template.getState());
      instance.setReviewRatingStatistics(template.getReviewRatingStatistics());
      instance.setProductType(template.getProductType());
      instance.setKey(template.getKey());
      instance.setTaxCategory(template.getTaxCategory());
      return instance;
   }

}