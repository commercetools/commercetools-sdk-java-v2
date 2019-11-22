package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.category.CategoryReference;
import com.commercetools.api.generated.models.common.BaseResource;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.product.CategoryOrderHints;
import com.commercetools.api.generated.models.product.ProductVariant;
import com.commercetools.api.generated.models.product.SearchKeywords;
import com.commercetools.api.generated.models.product_type.ProductTypeReference;
import com.commercetools.api.generated.models.review.ReviewRatingStatistics;
import com.commercetools.api.generated.models.state.StateReference;
import com.commercetools.api.generated.models.tax_category.TaxCategoryReference;
import com.commercetools.api.generated.models.product.ProductProjectionImpl;

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
@JsonDeserialize(as = ProductProjectionImpl.class)
public interface ProductProjection extends BaseResource {

   /**
   	<p>The unique ID of the Product.</p>
   */
   @NotNull
   @JsonProperty("id")
   public String getId();
   /**
   	<p>The current version of the Product.</p>
   */
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   /**
   	<p>User-specific unique identifier of the Product.</p>
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
   	
   */
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   /**
   	
   */
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   /**
   	
   */
   @NotNull
   @Valid
   @JsonProperty("slug")
   public LocalizedString getSlug();
   /**
   	<p>References to categories the product is in.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("categories")
   public List<CategoryReference> getCategories();
   /**
   	
   */
   @Valid
   @JsonProperty("categoryOrderHints")
   public CategoryOrderHints getCategoryOrderHints();
   /**
   	
   */
   @Valid
   @JsonProperty("metaTitle")
   public LocalizedString getMetaTitle();
   /**
   	
   */
   @Valid
   @JsonProperty("metaDescription")
   public LocalizedString getMetaDescription();
   /**
   	
   */
   @Valid
   @JsonProperty("metaKeywords")
   public LocalizedString getMetaKeywords();
   /**
   	
   */
   @Valid
   @JsonProperty("searchKeywords")
   public SearchKeywords getSearchKeywords();
   /**
   	
   */
   
   @JsonProperty("hasStagedChanges")
   public Boolean getHasStagedChanges();
   /**
   	
   */
   
   @JsonProperty("published")
   public Boolean getPublished();
   /**
   	
   */
   @NotNull
   @Valid
   @JsonProperty("masterVariant")
   public ProductVariant getMasterVariant();
   /**
   	
   */
   @NotNull
   @Valid
   @JsonProperty("variants")
   public List<ProductVariant> getVariants();
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
   
   public void setKey(final String key);
   
   public void setProductType(final ProductTypeReference productType);
   
   public void setName(final LocalizedString name);
   
   public void setDescription(final LocalizedString description);
   
   public void setSlug(final LocalizedString slug);
   
   public void setCategories(final List<CategoryReference> categories);
   
   public void setCategoryOrderHints(final CategoryOrderHints categoryOrderHints);
   
   public void setMetaTitle(final LocalizedString metaTitle);
   
   public void setMetaDescription(final LocalizedString metaDescription);
   
   public void setMetaKeywords(final LocalizedString metaKeywords);
   
   public void setSearchKeywords(final SearchKeywords searchKeywords);
   
   public void setHasStagedChanges(final Boolean hasStagedChanges);
   
   public void setPublished(final Boolean published);
   
   public void setMasterVariant(final ProductVariant masterVariant);
   
   public void setVariants(final List<ProductVariant> variants);
   
   public void setTaxCategory(final TaxCategoryReference taxCategory);
   
   public void setState(final StateReference state);
   
   public void setReviewRatingStatistics(final ReviewRatingStatistics reviewRatingStatistics);
   
   public static ProductProjectionImpl of(){
      return new ProductProjectionImpl();
   }
   

   public static ProductProjectionImpl of(final ProductProjection template) {
      ProductProjectionImpl instance = new ProductProjectionImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSearchKeywords(template.getSearchKeywords());
      instance.setDescription(template.getDescription());
      instance.setVariants(template.getVariants());
      instance.setPublished(template.getPublished());
      instance.setHasStagedChanges(template.getHasStagedChanges());
      instance.setMetaDescription(template.getMetaDescription());
      instance.setTaxCategory(template.getTaxCategory());
      instance.setMetaKeywords(template.getMetaKeywords());
      instance.setCategoryOrderHints(template.getCategoryOrderHints());
      instance.setMetaTitle(template.getMetaTitle());
      instance.setName(template.getName());
      instance.setState(template.getState());
      instance.setMasterVariant(template.getMasterVariant());
      instance.setCategories(template.getCategories());
      instance.setReviewRatingStatistics(template.getReviewRatingStatistics());
      instance.setSlug(template.getSlug());
      instance.setProductType(template.getProductType());
      instance.setKey(template.getKey());
      return instance;
   }

}