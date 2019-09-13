package com.commercetools.models.category;

import com.commercetools.models.category.CategoryResourceIdentifier;
import com.commercetools.models.common.AssetDraft;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.type.CustomFieldsDraft;
import java.lang.String;
import com.commercetools.models.category.CategoryDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategoryDraftBuilder {
   
   @Nullable
   private com.commercetools.models.category.CategoryResourceIdentifier parent;
   
   @Nullable
   private java.util.List<com.commercetools.models.common.AssetDraft> assets;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString metaKeywords;
   
   @Nullable
   private java.lang.String orderHint;
   
   @Nullable
   private com.commercetools.models.type.CustomFieldsDraft custom;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString metaTitle;
   
   
   private com.commercetools.models.common.LocalizedString name;
   
   @Nullable
   private java.lang.String externalId;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString description;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString metaDescription;
   
   @Nullable
   private java.lang.String key;
   
   
   private com.commercetools.models.common.LocalizedString slug;
   
   public CategoryDraftBuilder parent(@Nullable final com.commercetools.models.category.CategoryResourceIdentifier parent) {
      this.parent = parent;
      return this;
   }
   
   public CategoryDraftBuilder assets(@Nullable final java.util.List<com.commercetools.models.common.AssetDraft> assets) {
      this.assets = assets;
      return this;
   }
   
   public CategoryDraftBuilder metaKeywords(@Nullable final com.commercetools.models.common.LocalizedString metaKeywords) {
      this.metaKeywords = metaKeywords;
      return this;
   }
   
   public CategoryDraftBuilder orderHint(@Nullable final java.lang.String orderHint) {
      this.orderHint = orderHint;
      return this;
   }
   
   public CategoryDraftBuilder custom(@Nullable final com.commercetools.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public CategoryDraftBuilder metaTitle(@Nullable final com.commercetools.models.common.LocalizedString metaTitle) {
      this.metaTitle = metaTitle;
      return this;
   }
   
   public CategoryDraftBuilder name( final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public CategoryDraftBuilder externalId(@Nullable final java.lang.String externalId) {
      this.externalId = externalId;
      return this;
   }
   
   public CategoryDraftBuilder description(@Nullable final com.commercetools.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public CategoryDraftBuilder metaDescription(@Nullable final com.commercetools.models.common.LocalizedString metaDescription) {
      this.metaDescription = metaDescription;
      return this;
   }
   
   public CategoryDraftBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   public CategoryDraftBuilder slug( final com.commercetools.models.common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.category.CategoryResourceIdentifier getParent(){
      return this.parent;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.common.AssetDraft> getAssets(){
      return this.assets;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }
   
   @Nullable
   public java.lang.String getOrderHint(){
      return this.orderHint;
   }
   
   @Nullable
   public com.commercetools.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.String getExternalId(){
      return this.externalId;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.models.common.LocalizedString getSlug(){
      return this.slug;
   }

   public CategoryDraft build() {
       return new CategoryDraftImpl(parent, assets, metaKeywords, orderHint, custom, metaTitle, name, externalId, description, metaDescription, key, slug);
   }
   
   public static CategoryDraftBuilder of() {
      return new CategoryDraftBuilder();
   }
   
   public static CategoryDraftBuilder of(final CategoryDraft template) {
      CategoryDraftBuilder builder = new CategoryDraftBuilder();
      builder.parent = template.getParent();
      builder.assets = template.getAssets();
      builder.metaKeywords = template.getMetaKeywords();
      builder.orderHint = template.getOrderHint();
      builder.custom = template.getCustom();
      builder.metaTitle = template.getMetaTitle();
      builder.name = template.getName();
      builder.externalId = template.getExternalId();
      builder.description = template.getDescription();
      builder.metaDescription = template.getMetaDescription();
      builder.key = template.getKey();
      builder.slug = template.getSlug();
      return builder;
   }
   
}