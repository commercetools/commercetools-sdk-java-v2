package com.commercetools.importer.models.products;

import com.commercetools.importer.models.common.CategoryKeyReference;
import com.commercetools.importer.models.common.ImportResource;
import com.commercetools.importer.models.common.LocalizedString;
import com.commercetools.importer.models.common.ProductTypeKeyReference;
import com.commercetools.importer.models.common.StateKeyReference;
import com.commercetools.importer.models.common.TaxCategoryKeyReference;
import com.commercetools.importer.models.products.SearchKeywords;
import com.commercetools.importer.models.products.ProductImport;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductImportBuilder {
   
   
   private String key;
   
   @Nullable
   private com.commercetools.importer.models.common.LocalizedString metaKeywords;
   
   @Nullable
   private com.commercetools.importer.models.products.SearchKeywords searchKeywords;
   
   @Nullable
   private com.commercetools.importer.models.common.LocalizedString metaTitle;
   
   
   private com.commercetools.importer.models.common.LocalizedString name;
   
   @Nullable
   private com.commercetools.importer.models.common.LocalizedString description;
   
   @Nullable
   private com.commercetools.importer.models.common.StateKeyReference state;
   
   @Nullable
   private java.util.List<com.commercetools.importer.models.common.CategoryKeyReference> categories;
   
   @Nullable
   private com.commercetools.importer.models.common.LocalizedString metaDescription;
   
   
   private com.commercetools.importer.models.common.LocalizedString slug;
   
   
   private com.commercetools.importer.models.common.ProductTypeKeyReference productType;
   
   @Nullable
   private com.commercetools.importer.models.common.TaxCategoryKeyReference taxCategory;
   
   public ProductImportBuilder key( final String key) {
      this.key = key;
      return this;
   }
   
   public ProductImportBuilder metaKeywords(@Nullable final com.commercetools.importer.models.common.LocalizedString metaKeywords) {
      this.metaKeywords = metaKeywords;
      return this;
   }
   
   public ProductImportBuilder searchKeywords(@Nullable final com.commercetools.importer.models.products.SearchKeywords searchKeywords) {
      this.searchKeywords = searchKeywords;
      return this;
   }
   
   public ProductImportBuilder metaTitle(@Nullable final com.commercetools.importer.models.common.LocalizedString metaTitle) {
      this.metaTitle = metaTitle;
      return this;
   }
   
   public ProductImportBuilder name( final com.commercetools.importer.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public ProductImportBuilder description(@Nullable final com.commercetools.importer.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public ProductImportBuilder state(@Nullable final com.commercetools.importer.models.common.StateKeyReference state) {
      this.state = state;
      return this;
   }
   
   public ProductImportBuilder categories(@Nullable final java.util.List<com.commercetools.importer.models.common.CategoryKeyReference> categories) {
      this.categories = categories;
      return this;
   }
   
   public ProductImportBuilder metaDescription(@Nullable final com.commercetools.importer.models.common.LocalizedString metaDescription) {
      this.metaDescription = metaDescription;
      return this;
   }
   
   public ProductImportBuilder slug( final com.commercetools.importer.models.common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   public ProductImportBuilder productType( final com.commercetools.importer.models.common.ProductTypeKeyReference productType) {
      this.productType = productType;
      return this;
   }
   
   public ProductImportBuilder taxCategory(@Nullable final com.commercetools.importer.models.common.TaxCategoryKeyReference taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   
   public String getKey(){
      return this.key;
   }
   
   @Nullable
   public com.commercetools.importer.models.common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }
   
   @Nullable
   public com.commercetools.importer.models.products.SearchKeywords getSearchKeywords(){
      return this.searchKeywords;
   }
   
   @Nullable
   public com.commercetools.importer.models.common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }
   
   
   public com.commercetools.importer.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.importer.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public com.commercetools.importer.models.common.StateKeyReference getState(){
      return this.state;
   }
   
   @Nullable
   public java.util.List<com.commercetools.importer.models.common.CategoryKeyReference> getCategories(){
      return this.categories;
   }
   
   @Nullable
   public com.commercetools.importer.models.common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }
   
   
   public com.commercetools.importer.models.common.LocalizedString getSlug(){
      return this.slug;
   }
   
   
   public com.commercetools.importer.models.common.ProductTypeKeyReference getProductType(){
      return this.productType;
   }
   
   @Nullable
   public com.commercetools.importer.models.common.TaxCategoryKeyReference getTaxCategory(){
      return this.taxCategory;
   }

   public ProductImport build() {
       return new ProductImportImpl(key, metaKeywords, searchKeywords, metaTitle, name, description, state, categories, metaDescription, slug, productType, taxCategory);
   }
   
   public static ProductImportBuilder of() {
      return new ProductImportBuilder();
   }
   
   public static ProductImportBuilder of(final ProductImport template) {
      ProductImportBuilder builder = new ProductImportBuilder();
      builder.key = template.getKey();
      builder.metaKeywords = template.getMetaKeywords();
      builder.searchKeywords = template.getSearchKeywords();
      builder.metaTitle = template.getMetaTitle();
      builder.name = template.getName();
      builder.description = template.getDescription();
      builder.state = template.getState();
      builder.categories = template.getCategories();
      builder.metaDescription = template.getMetaDescription();
      builder.slug = template.getSlug();
      builder.productType = template.getProductType();
      builder.taxCategory = template.getTaxCategory();
      return builder;
   }
   
}