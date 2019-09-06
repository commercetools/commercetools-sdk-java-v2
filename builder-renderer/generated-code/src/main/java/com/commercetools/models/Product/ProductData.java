package com.commercetools.models.Product;

import com.commercetools.models.Category.CategoryReference;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Product.CategoryOrderHints;
import com.commercetools.models.Product.ProductVariant;
import com.commercetools.models.Product.SearchKeywords;
import com.commercetools.models.Product.ProductDataImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductDataImpl.class)
public interface ProductData  {

   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   
   @NotNull
   @Valid
   @JsonProperty("categories")
   public List<CategoryReference> getCategories();
   
   @Valid
   @JsonProperty("categoryOrderHints")
   public CategoryOrderHints getCategoryOrderHints();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   
   @NotNull
   @Valid
   @JsonProperty("slug")
   public LocalizedString getSlug();
   
   @Valid
   @JsonProperty("metaTitle")
   public LocalizedString getMetaTitle();
   
   @Valid
   @JsonProperty("metaDescription")
   public LocalizedString getMetaDescription();
   
   @Valid
   @JsonProperty("metaKeywords")
   public LocalizedString getMetaKeywords();
   
   @NotNull
   @Valid
   @JsonProperty("masterVariant")
   public ProductVariant getMasterVariant();
   
   @NotNull
   @Valid
   @JsonProperty("variants")
   public List<ProductVariant> getVariants();
   
   @NotNull
   @Valid
   @JsonProperty("searchKeywords")
   public SearchKeywords getSearchKeywords();

   public void setName(final LocalizedString name);
   
   public void setCategories(final List<CategoryReference> categories);
   
   public void setCategoryOrderHints(final CategoryOrderHints categoryOrderHints);
   
   public void setDescription(final LocalizedString description);
   
   public void setSlug(final LocalizedString slug);
   
   public void setMetaTitle(final LocalizedString metaTitle);
   
   public void setMetaDescription(final LocalizedString metaDescription);
   
   public void setMetaKeywords(final LocalizedString metaKeywords);
   
   public void setMasterVariant(final ProductVariant masterVariant);
   
   public void setVariants(final List<ProductVariant> variants);
   
   public void setSearchKeywords(final SearchKeywords searchKeywords);
   
   public static ProductDataImpl of(){
      return new ProductDataImpl();
   }
   

   public static ProductDataImpl of(final ProductData template) {
      ProductDataImpl instance = new ProductDataImpl();
      instance.setMetaKeywords(template.getMetaKeywords());
      instance.setCategoryOrderHints(template.getCategoryOrderHints());
      instance.setSearchKeywords(template.getSearchKeywords());
      instance.setMetaTitle(template.getMetaTitle());
      instance.setName(template.getName());
      instance.setDescription(template.getDescription());
      instance.setVariants(template.getVariants());
      instance.setMasterVariant(template.getMasterVariant());
      instance.setCategories(template.getCategories());
      instance.setMetaDescription(template.getMetaDescription());
      instance.setSlug(template.getSlug());
      return instance;
   }

}