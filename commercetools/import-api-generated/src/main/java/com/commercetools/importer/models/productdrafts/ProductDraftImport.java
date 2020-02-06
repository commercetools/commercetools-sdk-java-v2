package com.commercetools.importer.models.productdrafts;

import com.commercetools.importer.models.common.CategoryKeyReference;
import com.commercetools.importer.models.common.LocalizedString;
import com.commercetools.importer.models.common.ProductTypeKeyReference;
import com.commercetools.importer.models.common.StateKeyReference;
import com.commercetools.importer.models.common.TaxCategoryKeyReference;
import com.commercetools.importer.models.productdrafts.ProductVariantDraftImport;
import com.commercetools.importer.models.products.SearchKeywords;
import com.commercetools.importer.models.productdrafts.ProductDraftImportImpl;

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
@JsonDeserialize(as = ProductDraftImportImpl.class)
public interface ProductDraftImport  {

   /**
   *  <p>A predefined product type assigned to the product.
   *  All products must have a product type.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("productType")
   public ProductTypeKeyReference getProductType();
   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   /**
   *  <p>Human-readable identifiers usually used as deep-link URLs for the product.
   *  A slug must be unique across a project, but a product can have the same slug for different languages.
   *  Slugs have a maximum size of 256.
   *  Valid characters are alphabetic characters (<code>A-Z, a-z</code>), numeric characters (<code>0-9</code>), underscores (<code>_</code>) and hyphens (<code>-</code>).</p>
   */
   @NotNull
   @Valid
   @JsonProperty("slug")
   public LocalizedString getSlug();
   /**
   *  <p>User-specific unique identifier for the product.</p>
   */
   
   @JsonProperty("key")
   public String getKey();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   /**
   *  <p>Categories assigned to the product.</p>
   */
   @Valid
   @JsonProperty("categories")
   public List<CategoryKeyReference> getCategories();
   
   @Valid
   @JsonProperty("metaTitle")
   public LocalizedString getMetaTitle();
   
   @Valid
   @JsonProperty("metaDescription")
   public LocalizedString getMetaDescription();
   
   @Valid
   @JsonProperty("metaKeywords")
   public LocalizedString getMetaKeywords();
   /**
   *  <p>The master product variant.
   *  Required if the <code>variants</code> array has product variants.</p>
   */
   @Valid
   @JsonProperty("masterVariant")
   public ProductVariantDraftImport getMasterVariant();
   /**
   *  <p>An array of related product variants.</p>
   */
   @Valid
   @JsonProperty("variants")
   public List<ProductVariantDraftImport> getVariants();
   
   @Valid
   @JsonProperty("taxCategory")
   public TaxCategoryKeyReference getTaxCategory();
   
   @Valid
   @JsonProperty("searchKeywords")
   public SearchKeywords getSearchKeywords();
   
   @Valid
   @JsonProperty("state")
   public StateKeyReference getState();
   /**
   *  <p>If <code>true</code>, the product is published immediately.</p>
   */
   
   @JsonProperty("publish")
   public Boolean getPublish();

   public void setProductType(final ProductTypeKeyReference productType);
   
   public void setName(final LocalizedString name);
   
   public void setSlug(final LocalizedString slug);
   
   public void setKey(final String key);
   
   public void setDescription(final LocalizedString description);
   
   public void setCategories(final List<CategoryKeyReference> categories);
   
   public void setMetaTitle(final LocalizedString metaTitle);
   
   public void setMetaDescription(final LocalizedString metaDescription);
   
   public void setMetaKeywords(final LocalizedString metaKeywords);
   
   public void setMasterVariant(final ProductVariantDraftImport masterVariant);
   
   public void setVariants(final List<ProductVariantDraftImport> variants);
   
   public void setTaxCategory(final TaxCategoryKeyReference taxCategory);
   
   public void setSearchKeywords(final SearchKeywords searchKeywords);
   
   public void setState(final StateKeyReference state);
   
   public void setPublish(final Boolean publish);
   
   public static ProductDraftImportImpl of(){
      return new ProductDraftImportImpl();
   }
   

   public static ProductDraftImportImpl of(final ProductDraftImport template) {
      ProductDraftImportImpl instance = new ProductDraftImportImpl();
      instance.setProductType(template.getProductType());
      instance.setName(template.getName());
      instance.setSlug(template.getSlug());
      instance.setKey(template.getKey());
      instance.setDescription(template.getDescription());
      instance.setCategories(template.getCategories());
      instance.setMetaTitle(template.getMetaTitle());
      instance.setMetaDescription(template.getMetaDescription());
      instance.setMetaKeywords(template.getMetaKeywords());
      instance.setMasterVariant(template.getMasterVariant());
      instance.setVariants(template.getVariants());
      instance.setTaxCategory(template.getTaxCategory());
      instance.setSearchKeywords(template.getSearchKeywords());
      instance.setState(template.getState());
      instance.setPublish(template.getPublish());
      return instance;
   }

}