package com.commercetools.importer.models.common;

import com.commercetools.importer.models.common.AssetDimensions;
import com.commercetools.importer.models.common.Image;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImageBuilder {
   
   @Nullable
   private String label;
   
   
   private String url;
   
   
   private com.commercetools.importer.models.common.AssetDimensions dimensions;
   
   public ImageBuilder label(@Nullable final String label) {
      this.label = label;
      return this;
   }
   
   public ImageBuilder url( final String url) {
      this.url = url;
      return this;
   }
   
   public ImageBuilder dimensions( final com.commercetools.importer.models.common.AssetDimensions dimensions) {
      this.dimensions = dimensions;
      return this;
   }
   
   @Nullable
   public String getLabel(){
      return this.label;
   }
   
   
   public String getUrl(){
      return this.url;
   }
   
   
   public com.commercetools.importer.models.common.AssetDimensions getDimensions(){
      return this.dimensions;
   }

   public Image build() {
       return new ImageImpl(label, url, dimensions);
   }
   
   public static ImageBuilder of() {
      return new ImageBuilder();
   }
   
   public static ImageBuilder of(final Image template) {
      ImageBuilder builder = new ImageBuilder();
      builder.label = template.getLabel();
      builder.url = template.getUrl();
      builder.dimensions = template.getDimensions();
      return builder;
   }
   
}