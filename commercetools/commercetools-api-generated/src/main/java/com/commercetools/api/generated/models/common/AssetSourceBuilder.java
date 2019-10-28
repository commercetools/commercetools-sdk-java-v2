package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.common.AssetDimensions;
import com.commercetools.api.generated.models.common.AssetSource;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AssetSourceBuilder {
   
   @Nullable
   private String contentType;
   
   
   private String uri;
   
   @Nullable
   private String key;
   
   @Nullable
   private com.commercetools.api.generated.models.common.AssetDimensions dimensions;
   
   public AssetSourceBuilder contentType(@Nullable final String contentType) {
      this.contentType = contentType;
      return this;
   }
   
   public AssetSourceBuilder uri( final String uri) {
      this.uri = uri;
      return this;
   }
   
   public AssetSourceBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   public AssetSourceBuilder dimensions(@Nullable final com.commercetools.api.generated.models.common.AssetDimensions dimensions) {
      this.dimensions = dimensions;
      return this;
   }
   
   @Nullable
   public String getContentType(){
      return this.contentType;
   }
   
   
   public String getUri(){
      return this.uri;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.AssetDimensions getDimensions(){
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