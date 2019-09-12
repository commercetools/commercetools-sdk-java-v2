package com.commercetools.models.Product;

import com.commercetools.models.Category.CategoryResourceIdentifier;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Product.CategoryOrderHints;
import com.commercetools.models.Product.ProductVariantDraft;
import com.commercetools.models.Product.SearchKeywords;
import com.commercetools.models.ProductType.ProductTypeResourceIdentifier;
import com.commercetools.models.State.StateResourceIdentifier;
import com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.Product.ProductDraftImpl;

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
@JsonDeserialize(as = ProductDraftImpl.class)
public interface ProductDraft  {

   
   @NotNull
   @Valid
   @JsonProperty("productType")
   public ProductTypeResourceIdentifier getProductType();
   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   
   @NotNull
   @Valid
   @JsonProperty("slug")
   public LocalizedString getSlug();
   
   
   @JsonProperty("key")
   public String getKey();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   
   @Valid
   @JsonProperty("categories")
   public List<CategoryResourceIdentifier> getCategories();
   
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
   @JsonProperty("masterVariant")
   public ProductVariantDraft getMasterVariant();
   
   @Valid
   @JsonProperty("variants")
   public List<ProductVariantDraft> getVariants();
   
   @Valid
   @JsonProperty("taxCategory")
   public TaxCategoryResourceIdentifier getTaxCategory();
   
   @Valid
   @JsonProperty("searchKeywords")
   public SearchKeywords getSearchKeywords();
   
   @Valid
   @JsonProperty("state")
   public StateResourceIdentifier getState();
   
   
   @JsonProperty("publish")
   public Boolean getPublish();

   public void setProductType(final ProductTypeResourceIdentifier productType);
   
   public void setName(final LocalizedString name);
   
   public void setSlug(final LocalizedString slug);
   
   public void setKey(final String key);
   
   public void setDescription(final LocalizedString description);
   
   public void setCategories(final List<CategoryResourceIdentifier> categories);
   
   public void setCategoryOrderHints(final CategoryOrderHints categoryOrderHints);
   
   public void setMetaTitle(final LocalizedString metaTitle);
   
   public void setMetaDescription(final LocalizedString metaDescription);
   
   public void setMetaKeywords(final LocalizedString metaKeywords);
   
   public void setMasterVariant(final ProductVariantDraft masterVariant);
   
   public void setVariants(final List<ProductVariantDraft> variants);
   
   public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);
   
   public void setSearchKeywords(final SearchKeywords searchKeywords);
   
   public void setState(final StateResourceIdentifier state);
   
   public void setPublish(final Boolean publish);
   
   public static ProductDraftImpl of(){
      return new ProductDraftImpl();
   }
   

   public static ProductDraftImpl of(final ProductDraft template) {
      ProductDraftImpl instance = new ProductDraftImpl();
      instance.setSearchKeywords(template.getSearchKeywords());
      instance.setDescription(template.getDescription());
      instance.setVariants(template.getVariants());
      instance.setMetaDescription(template.getMetaDescription());
      instance.setTaxCategory(template.getTaxCategory());
      instance.setMetaKeywords(template.getMetaKeywords());
      instance.setCategoryOrderHints(template.getCategoryOrderHints());
      instance.setPublish(template.getPublish());
      instance.setMetaTitle(template.getMetaTitle());
      instance.setName(template.getName());
      instance.setState(template.getState());
      instance.setMasterVariant(template.getMasterVariant());
      instance.setCategories(template.getCategories());
      instance.setKey(template.getKey());
      instance.setSlug(template.getSlug());
      instance.setProductType(template.getProductType());
      return instance;
   }

}