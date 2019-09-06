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
import com.commercetools.models.Product.ProductDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDraftBuilder {
   
   @Nullable
   private com.commercetools.models.Product.SearchKeywords searchKeywords;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString description;
   
   @Nullable
   private java.util.List<com.commercetools.models.Product.ProductVariantDraft> variants;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString metaDescription;
   
   @Nullable
   private com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString metaKeywords;
   
   @Nullable
   private com.commercetools.models.Product.CategoryOrderHints categoryOrderHints;
   
   @Nullable
   private java.lang.Boolean publish;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString metaTitle;
   
   
   private com.commercetools.models.Common.LocalizedString name;
   
   @Nullable
   private com.commercetools.models.State.StateResourceIdentifier state;
   
   @Nullable
   private com.commercetools.models.Product.ProductVariantDraft masterVariant;
   
   @Nullable
   private java.util.List<com.commercetools.models.Category.CategoryResourceIdentifier> categories;
   
   @Nullable
   private java.lang.String key;
   
   
   private com.commercetools.models.Common.LocalizedString slug;
   
   
   private com.commercetools.models.ProductType.ProductTypeResourceIdentifier productType;
   
   public ProductDraftBuilder searchKeywords(@Nullable final com.commercetools.models.Product.SearchKeywords searchKeywords) {
      this.searchKeywords = searchKeywords;
      return this;
   }
   
   public ProductDraftBuilder description(@Nullable final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public ProductDraftBuilder variants(@Nullable final java.util.List<com.commercetools.models.Product.ProductVariantDraft> variants) {
      this.variants = variants;
      return this;
   }
   
   public ProductDraftBuilder metaDescription(@Nullable final com.commercetools.models.Common.LocalizedString metaDescription) {
      this.metaDescription = metaDescription;
      return this;
   }
   
   public ProductDraftBuilder taxCategory(@Nullable final com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   public ProductDraftBuilder metaKeywords(@Nullable final com.commercetools.models.Common.LocalizedString metaKeywords) {
      this.metaKeywords = metaKeywords;
      return this;
   }
   
   public ProductDraftBuilder categoryOrderHints(@Nullable final com.commercetools.models.Product.CategoryOrderHints categoryOrderHints) {
      this.categoryOrderHints = categoryOrderHints;
      return this;
   }
   
   public ProductDraftBuilder publish(@Nullable final java.lang.Boolean publish) {
      this.publish = publish;
      return this;
   }
   
   public ProductDraftBuilder metaTitle(@Nullable final com.commercetools.models.Common.LocalizedString metaTitle) {
      this.metaTitle = metaTitle;
      return this;
   }
   
   public ProductDraftBuilder name( final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public ProductDraftBuilder state(@Nullable final com.commercetools.models.State.StateResourceIdentifier state) {
      this.state = state;
      return this;
   }
   
   public ProductDraftBuilder masterVariant(@Nullable final com.commercetools.models.Product.ProductVariantDraft masterVariant) {
      this.masterVariant = masterVariant;
      return this;
   }
   
   public ProductDraftBuilder categories(@Nullable final java.util.List<com.commercetools.models.Category.CategoryResourceIdentifier> categories) {
      this.categories = categories;
      return this;
   }
   
   public ProductDraftBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   public ProductDraftBuilder slug( final com.commercetools.models.Common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   public ProductDraftBuilder productType( final com.commercetools.models.ProductType.ProductTypeResourceIdentifier productType) {
      this.productType = productType;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Product.SearchKeywords getSearchKeywords(){
      return this.searchKeywords;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Product.ProductVariantDraft> getVariants(){
      return this.variants;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }
   
   @Nullable
   public com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }
   
   @Nullable
   public com.commercetools.models.Product.CategoryOrderHints getCategoryOrderHints(){
      return this.categoryOrderHints;
   }
   
   @Nullable
   public java.lang.Boolean getPublish(){
      return this.publish;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.models.State.StateResourceIdentifier getState(){
      return this.state;
   }
   
   @Nullable
   public com.commercetools.models.Product.ProductVariantDraft getMasterVariant(){
      return this.masterVariant;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Category.CategoryResourceIdentifier> getCategories(){
      return this.categories;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getSlug(){
      return this.slug;
   }
   
   
   public com.commercetools.models.ProductType.ProductTypeResourceIdentifier getProductType(){
      return this.productType;
   }

   public ProductDraft build() {
       return new ProductDraftImpl(searchKeywords, description, variants, metaDescription, taxCategory, metaKeywords, categoryOrderHints, publish, metaTitle, name, state, masterVariant, categories, key, slug, productType);
   }
   
   public static ProductDraftBuilder of() {
      return new ProductDraftBuilder();
   }
   
   public static ProductDraftBuilder of(final ProductDraft template) {
      ProductDraftBuilder builder = new ProductDraftBuilder();
      builder.searchKeywords = template.getSearchKeywords();
      builder.description = template.getDescription();
      builder.variants = template.getVariants();
      builder.metaDescription = template.getMetaDescription();
      builder.taxCategory = template.getTaxCategory();
      builder.metaKeywords = template.getMetaKeywords();
      builder.categoryOrderHints = template.getCategoryOrderHints();
      builder.publish = template.getPublish();
      builder.metaTitle = template.getMetaTitle();
      builder.name = template.getName();
      builder.state = template.getState();
      builder.masterVariant = template.getMasterVariant();
      builder.categories = template.getCategories();
      builder.key = template.getKey();
      builder.slug = template.getSlug();
      builder.productType = template.getProductType();
      return builder;
   }
   
}