package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryResourceIdentifier;
import com.commercetools.api.generated.models.common.AssetDraft;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import com.commercetools.api.generated.models.category.CategoryDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategoryDraftBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.category.CategoryResourceIdentifier parent;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.common.AssetDraft> assets;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString metaKeywords;
   
   @Nullable
   private String orderHint;
   
   @Nullable
   private com.commercetools.api.generated.models.type.CustomFieldsDraft custom;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString metaTitle;
   
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   @Nullable
   private String externalId;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString metaDescription;
   
   @Nullable
   private String key;
   
   
   private com.commercetools.api.generated.models.common.LocalizedString slug;
   
   public CategoryDraftBuilder parent(@Nullable final com.commercetools.api.generated.models.category.CategoryResourceIdentifier parent) {
      this.parent = parent;
      return this;
   }
   
   public CategoryDraftBuilder assets(@Nullable final java.util.List<com.commercetools.api.generated.models.common.AssetDraft> assets) {
      this.assets = assets;
      return this;
   }
   
   public CategoryDraftBuilder metaKeywords(@Nullable final com.commercetools.api.generated.models.common.LocalizedString metaKeywords) {
      this.metaKeywords = metaKeywords;
      return this;
   }
   
   public CategoryDraftBuilder orderHint(@Nullable final String orderHint) {
      this.orderHint = orderHint;
      return this;
   }
   
   public CategoryDraftBuilder custom(@Nullable final com.commercetools.api.generated.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public CategoryDraftBuilder metaTitle(@Nullable final com.commercetools.api.generated.models.common.LocalizedString metaTitle) {
      this.metaTitle = metaTitle;
      return this;
   }
   
   public CategoryDraftBuilder name( final com.commercetools.api.generated.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public CategoryDraftBuilder externalId(@Nullable final String externalId) {
      this.externalId = externalId;
      return this;
   }
   
   public CategoryDraftBuilder description(@Nullable final com.commercetools.api.generated.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public CategoryDraftBuilder metaDescription(@Nullable final com.commercetools.api.generated.models.common.LocalizedString metaDescription) {
      this.metaDescription = metaDescription;
      return this;
   }
   
   public CategoryDraftBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   public CategoryDraftBuilder slug( final com.commercetools.api.generated.models.common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.category.CategoryResourceIdentifier getParent(){
      return this.parent;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.common.AssetDraft> getAssets(){
      return this.assets;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }
   
   @Nullable
   public String getOrderHint(){
      return this.orderHint;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public String getExternalId(){
      return this.externalId;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getSlug(){
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