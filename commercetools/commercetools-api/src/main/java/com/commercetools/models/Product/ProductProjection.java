package com.commercetools.models.product;

import com.commercetools.models.category.CategoryReference;
import com.commercetools.models.common.BaseResource;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.product.CategoryOrderHints;
import com.commercetools.models.product.ProductVariant;
import com.commercetools.models.product.SearchKeywords;
import com.commercetools.models.product_type.ProductTypeReference;
import com.commercetools.models.review.ReviewRatingStatistics;
import com.commercetools.models.state.StateReference;
import com.commercetools.models.tax_category.TaxCategoryReference;
import com.commercetools.models.product.ProductProjectionImpl;

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
@JsonDeserialize(as = ProductProjectionImpl.class)
public interface ProductProjection extends BaseResource {

   
   
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
   @Valid
   @JsonProperty("productType")
   public ProductTypeReference getProductType();
   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   
   @NotNull
   @Valid
   @JsonProperty("slug")
   public LocalizedString getSlug();
   
   @NotNull
   @Valid
   @JsonProperty("categories")
   public List<CategoryReference> getCategories();
   
   @Valid
   @JsonProperty("categoryOrderHints")
   public CategoryOrderHints getCategoryOrderHints();
   
   @Valid
   @JsonProperty("metaTitle")
   public LocalizedString getMetaTitle();
   
   @Valid
   @JsonProperty("metaDescription")
   public LocalizedString getMetaDescription();
   
   @Valid
   @JsonProperty("metaKeywords")
   public LocalizedString getMetaKeywords();
   
   @Valid
   @JsonProperty("searchKeywords")
   public SearchKeywords getSearchKeywords();
   
   
   @JsonProperty("hasStagedChanges")
   public Boolean getHasStagedChanges();
   
   
   @JsonProperty("published")
   public Boolean getPublished();
   
   @NotNull
   @Valid
   @JsonProperty("masterVariant")
   public ProductVariant getMasterVariant();
   
   @NotNull
   @Valid
   @JsonProperty("variants")
   public List<ProductVariant> getVariants();
   
   @Valid
   @JsonProperty("taxCategory")
   public TaxCategoryReference getTaxCategory();
   
   @Valid
   @JsonProperty("state")
   public StateReference getState();
   
   @Valid
   @JsonProperty("reviewRatingStatistics")
   public ReviewRatingStatistics getReviewRatingStatistics();

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