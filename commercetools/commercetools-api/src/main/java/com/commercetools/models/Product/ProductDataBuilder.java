package com.commercetools.models.Product;

import com.commercetools.models.Category.CategoryReference;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Product.CategoryOrderHints;
import com.commercetools.models.Product.ProductVariant;
import com.commercetools.models.Product.SearchKeywords;
import com.commercetools.models.Product.ProductData;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDataBuilder {
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString metaKeywords;
   
   @Nullable
   private com.commercetools.models.Product.CategoryOrderHints categoryOrderHints;
   
   
   private com.commercetools.models.Product.SearchKeywords searchKeywords;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString metaTitle;
   
   
   private com.commercetools.models.Common.LocalizedString name;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString description;
   
   
   private java.util.List<com.commercetools.models.Product.ProductVariant> variants;
   
   
   private com.commercetools.models.Product.ProductVariant masterVariant;
   
   
   private java.util.List<com.commercetools.models.Category.CategoryReference> categories;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString metaDescription;
   
   
   private com.commercetools.models.Common.LocalizedString slug;
   
   public ProductDataBuilder metaKeywords(@Nullable final com.commercetools.models.Common.LocalizedString metaKeywords) {
      this.metaKeywords = metaKeywords;
      return this;
   }
   
   public ProductDataBuilder categoryOrderHints(@Nullable final com.commercetools.models.Product.CategoryOrderHints categoryOrderHints) {
      this.categoryOrderHints = categoryOrderHints;
      return this;
   }
   
   public ProductDataBuilder searchKeywords( final com.commercetools.models.Product.SearchKeywords searchKeywords) {
      this.searchKeywords = searchKeywords;
      return this;
   }
   
   public ProductDataBuilder metaTitle(@Nullable final com.commercetools.models.Common.LocalizedString metaTitle) {
      this.metaTitle = metaTitle;
      return this;
   }
   
   public ProductDataBuilder name( final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public ProductDataBuilder description(@Nullable final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public ProductDataBuilder variants( final java.util.List<com.commercetools.models.Product.ProductVariant> variants) {
      this.variants = variants;
      return this;
   }
   
   public ProductDataBuilder masterVariant( final com.commercetools.models.Product.ProductVariant masterVariant) {
      this.masterVariant = masterVariant;
      return this;
   }
   
   public ProductDataBuilder categories( final java.util.List<com.commercetools.models.Category.CategoryReference> categories) {
      this.categories = categories;
      return this;
   }
   
   public ProductDataBuilder metaDescription(@Nullable final com.commercetools.models.Common.LocalizedString metaDescription) {
      this.metaDescription = metaDescription;
      return this;
   }
   
   public ProductDataBuilder slug( final com.commercetools.models.Common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }
   
   @Nullable
   public com.commercetools.models.Product.CategoryOrderHints getCategoryOrderHints(){
      return this.categoryOrderHints;
   }
   
   
   public com.commercetools.models.Product.SearchKeywords getSearchKeywords(){
      return this.searchKeywords;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.util.List<com.commercetools.models.Product.ProductVariant> getVariants(){
      return this.variants;
   }
   
   
   public com.commercetools.models.Product.ProductVariant getMasterVariant(){
      return this.masterVariant;
   }
   
   
   public java.util.List<com.commercetools.models.Category.CategoryReference> getCategories(){
      return this.categories;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getSlug(){
      return this.slug;
   }

   public ProductData build() {
       return new ProductDataImpl(metaKeywords, categoryOrderHints, searchKeywords, metaTitle, name, description, variants, masterVariant, categories, metaDescription, slug);
   }
   
   public static ProductDataBuilder of() {
      return new ProductDataBuilder();
   }
   
   public static ProductDataBuilder of(final ProductData template) {
      ProductDataBuilder builder = new ProductDataBuilder();
      builder.metaKeywords = template.getMetaKeywords();
      builder.categoryOrderHints = template.getCategoryOrderHints();
      builder.searchKeywords = template.getSearchKeywords();
      builder.metaTitle = template.getMetaTitle();
      builder.name = template.getName();
      builder.description = template.getDescription();
      builder.variants = template.getVariants();
      builder.masterVariant = template.getMasterVariant();
      builder.categories = template.getCategories();
      builder.metaDescription = template.getMetaDescription();
      builder.slug = template.getSlug();
      return builder;
   }
   
}