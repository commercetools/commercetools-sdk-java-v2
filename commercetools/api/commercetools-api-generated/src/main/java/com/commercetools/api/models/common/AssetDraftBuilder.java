package com.commercetools.api.models.common;

import com.commercetools.api.models.common.AssetSource;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.commercetools.api.models.common.AssetDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AssetDraftBuilder {


   private java.util.List<com.commercetools.api.models.common.AssetSource> sources;

   @Nullable
   private com.commercetools.api.models.type.CustomFieldsDraft custom;


   private com.commercetools.api.models.common.LocalizedString name;

   @Nullable
   private com.commercetools.api.models.common.LocalizedString description;

   @Nullable
   private String key;

   @Nullable
   private java.util.List<String> tags;

   public AssetDraftBuilder sources( final java.util.List<com.commercetools.api.models.common.AssetSource> sources) {
      this.sources = sources;
      return this;
   }

   public AssetDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }

   public AssetDraftBuilder name( final com.commercetools.api.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }

   public AssetDraftBuilder description(@Nullable final com.commercetools.api.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }

   public AssetDraftBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }

   public AssetDraftBuilder tags(@Nullable final java.util.List<String> tags) {
      this.tags = tags;
      return this;
   }


   public java.util.List<com.commercetools.api.models.common.AssetSource> getSources(){
      return this.sources;
   }

   @Nullable
   public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }


   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
   }

   @Nullable
   public com.commercetools.api.models.common.LocalizedString getDescription(){
      return this.description;
   }

   @Nullable
   public String getKey(){
      return this.key;
   }

   @Nullable
   public java.util.List<String> getTags(){
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
