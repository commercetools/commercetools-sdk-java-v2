package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.common.ImageDimensions;
import com.commercetools.api.generated.models.common.Image;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImageBuilder {
   
   @Nullable
   private String label;
   
   
   private String url;
   
   
   private com.commercetools.api.generated.models.common.ImageDimensions dimensions;
   
   public ImageBuilder label(@Nullable final String label) {
      this.label = label;
      return this;
   }
   
   public ImageBuilder url( final String url) {
      this.url = url;
      return this;
   }
   
   public ImageBuilder dimensions( final com.commercetools.api.generated.models.common.ImageDimensions dimensions) {
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
   
   
   public com.commercetools.api.generated.models.common.ImageDimensions getDimensions(){
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