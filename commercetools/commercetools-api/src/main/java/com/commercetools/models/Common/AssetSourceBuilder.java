package com.commercetools.models.common;

import com.commercetools.models.common.AssetDimensions;
import java.lang.String;
import com.commercetools.models.common.AssetSource;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AssetSourceBuilder {
   
   @Nullable
   private java.lang.String contentType;
   
   
   private java.lang.String uri;
   
   @Nullable
   private java.lang.String key;
   
   @Nullable
   private com.commercetools.models.common.AssetDimensions dimensions;
   
   public AssetSourceBuilder contentType(@Nullable final java.lang.String contentType) {
      this.contentType = contentType;
      return this;
   }
   
   public AssetSourceBuilder uri( final java.lang.String uri) {
      this.uri = uri;
      return this;
   }
   
   public AssetSourceBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   public AssetSourceBuilder dimensions(@Nullable final com.commercetools.models.common.AssetDimensions dimensions) {
      this.dimensions = dimensions;
      return this;
   }
   
   @Nullable
   public java.lang.String getContentType(){
      return this.contentType;
   }
   
   
   public java.lang.String getUri(){
      return this.uri;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }
   
   @Nullable
   public com.commercetools.models.common.AssetDimensions getDimensions(){
      return this.dimensions;
   }

   public AssetSource build() {
       return new AssetSourceImpl(contentType, uri, key, dimensions);
   }
   
   public static AssetSourceBuilder of() {
      return new AssetSourceBuilder();
   }
   
   public static AssetSourceBuilder of(final AssetSource template) {
      AssetSourceBuilder builder = new AssetSourceBuilder();
      builder.contentType = template.getContentType();
      builder.uri = template.getUri();
      builder.key = template.getKey();
      builder.dimensions = template.getDimensions();
      return builder;
   }
   
}