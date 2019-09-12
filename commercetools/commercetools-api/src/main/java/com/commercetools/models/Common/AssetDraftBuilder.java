package com.commercetools.models.Common;

import com.commercetools.models.Common.AssetSource;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.String;
import com.commercetools.models.Common.AssetDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AssetDraftBuilder {
   
   
   private java.util.List<com.commercetools.models.Common.AssetSource> sources;
   
   @Nullable
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   
   private com.commercetools.models.Common.LocalizedString name;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString description;
   
   @Nullable
   private java.lang.String key;
   
   @Nullable
   private java.util.List<java.lang.String> tags;
   
   public AssetDraftBuilder sources( final java.util.List<com.commercetools.models.Common.AssetSource> sources) {
      this.sources = sources;
      return this;
   }
   
   public AssetDraftBuilder custom(@Nullable final com.commercetools.models.Type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public AssetDraftBuilder name( final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public AssetDraftBuilder description(@Nullable final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public AssetDraftBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   public AssetDraftBuilder tags(@Nullable final java.util.List<java.lang.String> tags) {
      this.tags = tags;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.Common.AssetSource> getSources(){
      return this.sources;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }
   
   @Nullable
   public java.util.List<java.lang.String> getTags(){
      return this.tags;
   }

   public AssetDraft build() {
       return new AssetDraftImpl(sources, custom, name, description, key, tags);
   }
   
   public static AssetDraftBuilder of() {
      return new AssetDraftBuilder();
   }
   
   public static AssetDraftBuilder of(final AssetDraft template) {
      AssetDraftBuilder builder = new AssetDraftBuilder();
      builder.sources = template.getSources();
      builder.custom = template.getCustom();
      builder.name = template.getName();
      builder.description = template.getDescription();
      builder.key = template.getKey();
      builder.tags = template.getTags();
      return builder;
   }
   
}