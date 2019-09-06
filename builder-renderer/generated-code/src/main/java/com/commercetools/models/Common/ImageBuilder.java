package com.commercetools.models.Common;

import com.commercetools.models.Common.ImageDimensions;
import java.lang.String;
import com.commercetools.models.Common.Image;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ImageBuilder {
   
   @Nullable
   private java.lang.String label;
   
   
   private java.lang.String url;
   
   
   private com.commercetools.models.Common.ImageDimensions dimensions;
   
   public ImageBuilder label(@Nullable final java.lang.String label) {
      this.label = label;
      return this;
   }
   
   public ImageBuilder url( final java.lang.String url) {
      this.url = url;
      return this;
   }
   
   public ImageBuilder dimensions( final com.commercetools.models.Common.ImageDimensions dimensions) {
      this.dimensions = dimensions;
      return this;
   }
   
   @Nullable
   public java.lang.String getLabel(){
      return this.label;
   }
   
   
   public java.lang.String getUrl(){
      return this.url;
   }
   
   
   public com.commercetools.models.Common.ImageDimensions getDimensions(){
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