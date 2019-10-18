package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.category.CategoryReference;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.product.CategoryOrderHints;
import com.commercetools.api.generated.models.product.ProductVariant;
import com.commercetools.api.generated.models.product.SearchKeywords;
import com.commercetools.api.generated.models.product.ProductData;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDataBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString metaKeywords;
   
   @Nullable
   private com.commercetools.api.generated.models.product.CategoryOrderHints categoryOrderHints;
   
   
   private com.commercetools.api.generated.models.product.SearchKeywords searchKeywords;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString metaTitle;
   
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   
   private java.util.List<com.commercetools.api.generated.models.product.ProductVariant> variants;
   
   
   private com.commercetools.api.generated.models.product.ProductVariant masterVariant;
   
   
   private java.util.List<com.commercetools.api.generated.models.category.CategoryReference> categories;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString metaDescription;
   
   
   private com.commercetools.api.generated.models.common.LocalizedString slug;
   
   public ProductDataBuilder metaKeywords(@Nullable final com.commercetools.api.generated.models.common.LocalizedString metaKeywords) {
      this.metaKeywords = metaKeywords;
      return this;
   }
   
   public ProductDataBuilder categoryOrderHints(@Nullable final com.commercetools.api.generated.models.product.CategoryOrderHints categoryOrderHints) {
      this.categoryOrderHints = categoryOrderHints;
      return this;
   }
   
   public ProductDataBuilder searchKeywords( final com.commercetools.api.generated.models.product.SearchKeywords searchKeywords) {
      this.searchKeywords = searchKeywords;
      return this;
   }
   
   public ProductDataBuilder metaTitle(@Nullable final com.commercetools.api.generated.models.common.LocalizedString metaTitle) {
      this.metaTitle = metaTitle;
      return this;
   }
   
   public ProductDataBuilder name( final com.commercetools.api.generated.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public ProductDataBuilder description(@Nullable final com.commercetools.api.generated.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public ProductDataBuilder variants( final java.util.List<com.commercetools.api.generated.models.product.ProductVariant> variants) {
      this.variants = variants;
      return this;
   }
   
   public ProductDataBuilder masterVariant( final com.commercetools.api.generated.models.product.ProductVariant masterVariant) {
      this.masterVariant = masterVariant;
      return this;
   }
   
   public ProductDataBuilder categories( final java.util.List<com.commercetools.api.generated.models.category.CategoryReference> categories) {
      this.categories = categories;
      return this;
   }
   
   public ProductDataBuilder metaDescription(@Nullable final com.commercetools.api.generated.models.common.LocalizedString metaDescription) {
      this.metaDescription = metaDescription;
      return this;
   }
   
   public ProductDataBuilder slug( final com.commercetools.api.generated.models.common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.product.CategoryOrderHints getCategoryOrderHints(){
      return this.categoryOrderHints;
   }
   
   
   public com.commercetools.api.generated.models.product.SearchKeywords getSearchKeywords(){
      return this.searchKeywords;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.product.ProductVariant> getVariants(){
      return this.variants;
   }
   
   
   public com.commercetools.api.generated.models.product.ProductVariant getMasterVariant(){
      return this.masterVariant;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.category.CategoryReference> getCategories(){
      return this.categories;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getSlug(){
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