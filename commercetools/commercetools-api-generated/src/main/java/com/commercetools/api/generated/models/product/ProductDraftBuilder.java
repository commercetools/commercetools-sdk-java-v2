package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.category.CategoryResourceIdentifier;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.product.CategoryOrderHints;
import com.commercetools.api.generated.models.product.ProductVariantDraft;
import com.commercetools.api.generated.models.product.SearchKeywords;
import com.commercetools.api.generated.models.product_type.ProductTypeResourceIdentifier;
import com.commercetools.api.generated.models.state.StateResourceIdentifier;
import com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.generated.models.product.ProductDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDraftBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.product.SearchKeywords searchKeywords;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.product.ProductVariantDraft> variants;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString metaDescription;
   
   @Nullable
   private com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString metaKeywords;
   
   @Nullable
   private com.commercetools.api.generated.models.product.CategoryOrderHints categoryOrderHints;
   
   @Nullable
   private Boolean publish;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString metaTitle;
   
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   @Nullable
   private com.commercetools.api.generated.models.state.StateResourceIdentifier state;
   
   @Nullable
   private com.commercetools.api.generated.models.product.ProductVariantDraft masterVariant;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.category.CategoryResourceIdentifier> categories;
   
   @Nullable
   private String key;
   
   
   private com.commercetools.api.generated.models.common.LocalizedString slug;
   
   
   private com.commercetools.api.generated.models.product_type.ProductTypeResourceIdentifier productType;
   
   public ProductDraftBuilder searchKeywords(@Nullable final com.commercetools.api.generated.models.product.SearchKeywords searchKeywords) {
      this.searchKeywords = searchKeywords;
      return this;
   }
   
   public ProductDraftBuilder description(@Nullable final com.commercetools.api.generated.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public ProductDraftBuilder variants(@Nullable final java.util.List<com.commercetools.api.generated.models.product.ProductVariantDraft> variants) {
      this.variants = variants;
      return this;
   }
   
   public ProductDraftBuilder metaDescription(@Nullable final com.commercetools.api.generated.models.common.LocalizedString metaDescription) {
      this.metaDescription = metaDescription;
      return this;
   }
   
   public ProductDraftBuilder taxCategory(@Nullable final com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   public ProductDraftBuilder metaKeywords(@Nullable final com.commercetools.api.generated.models.common.LocalizedString metaKeywords) {
      this.metaKeywords = metaKeywords;
      return this;
   }
   
   public ProductDraftBuilder categoryOrderHints(@Nullable final com.commercetools.api.generated.models.product.CategoryOrderHints categoryOrderHints) {
      this.categoryOrderHints = categoryOrderHints;
      return this;
   }
   
   public ProductDraftBuilder publish(@Nullable final Boolean publish) {
      this.publish = publish;
      return this;
   }
   
   public ProductDraftBuilder metaTitle(@Nullable final com.commercetools.api.generated.models.common.LocalizedString metaTitle) {
      this.metaTitle = metaTitle;
      return this;
   }
   
   public ProductDraftBuilder name( final com.commercetools.api.generated.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public ProductDraftBuilder state(@Nullable final com.commercetools.api.generated.models.state.StateResourceIdentifier state) {
      this.state = state;
      return this;
   }
   
   public ProductDraftBuilder masterVariant(@Nullable final com.commercetools.api.generated.models.product.ProductVariantDraft masterVariant) {
      this.masterVariant = masterVariant;
      return this;
   }
   
   public ProductDraftBuilder categories(@Nullable final java.util.List<com.commercetools.api.generated.models.category.CategoryResourceIdentifier> categories) {
      this.categories = categories;
      return this;
   }
   
   public ProductDraftBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   public ProductDraftBuilder slug( final com.commercetools.api.generated.models.common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   public ProductDraftBuilder productType( final com.commercetools.api.generated.models.product_type.ProductTypeResourceIdentifier productType) {
      this.productType = productType;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.product.SearchKeywords getSearchKeywords(){
      return this.searchKeywords;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.product.ProductVariantDraft> getVariants(){
      return this.variants;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.product.CategoryOrderHints getCategoryOrderHints(){
      return this.categoryOrderHints;
   }
   
   @Nullable
   public Boolean getPublish(){
      return this.publish;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.state.StateResourceIdentifier getState(){
      return this.state;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.product.ProductVariantDraft getMasterVariant(){
      return this.masterVariant;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.category.CategoryResourceIdentifier> getCategories(){
      return this.categories;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getSlug(){
      return this.slug;
   }
   
   
   public com.commercetools.api.generated.models.product_type.ProductTypeResourceIdentifier getProductType(){
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