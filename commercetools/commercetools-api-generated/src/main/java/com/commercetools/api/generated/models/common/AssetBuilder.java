package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.common.AssetSource;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.type.CustomFields;
import com.commercetools.api.generated.models.common.Asset;
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
public final class AssetBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.common.AssetSource> sources;
   
   @Nullable
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   
   private String id;
   
   @Nullable
   private String key;
   
   @Nullable
   private java.util.List<String> tags;
   
   public AssetBuilder sources( final java.util.List<com.commercetools.api.generated.models.common.AssetSource> sources) {
      this.sources = sources;
      return this;
   }
   
   public AssetBuilder custom(@Nullable final com.commercetools.api.generated.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public AssetBuilder name( final com.commercetools.api.generated.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public AssetBuilder description(@Nullable final com.commercetools.api.generated.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public AssetBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public AssetBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   public AssetBuilder tags(@Nullable final java.util.List<String> tags) {
      this.tags = tags;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.common.AssetSource> getSources(){
      return this.sources;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }
   
   @Nullable
   public java.util.List<String> getTags(){
      return this.tags;
   }

   public Asset build() {
       return new AssetImpl(sources, custom, name, description, id, key, tags);
   }
   
   public static AssetBuilder of() {
      return new AssetBuilder();
   }
   
   public static AssetBuilder of(final Asset template) {
      AssetBuilder builder = new AssetBuilder();
      builder.sources = template.getSources();
      builder.custom = template.getCustom();
      builder.name = template.getName();
      builder.description = template.getDescription();
      builder.id = template.getId();
      builder.key = template.getKey();
      builder.tags = template.getTags();
      return builder;
   }
   
}