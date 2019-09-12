package com.commercetools.models.Common;

import java.lang.Integer;
import com.commercetools.models.Common.ImageDimensions;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ImageDimensionsBuilder {
   
   
   private java.lang.Integer w;
   
   
   private java.lang.Integer h;
   
   public ImageDimensionsBuilder w( final java.lang.Integer w) {
      this.w = w;
      return this;
   }
   
   public ImageDimensionsBuilder h( final java.lang.Integer h) {
      this.h = h;
      return this;
   }
   
   
   public java.lang.Integer getW(){
      return this.w;
   }
   
   
   public java.lang.Integer getH(){
      return this.h;
   }

   public ImageDimensions build() {
       return new ImageDimensionsImpl(w, h);
   }
   
   public static ImageDimensionsBuilder of() {
      return new ImageDimensionsBuilder();
   }
   
   public static ImageDimensionsBuilder of(final ImageDimensions template) {
      ImageDimensionsBuilder builder = new ImageDimensionsBuilder();
      builder.w = template.getW();
      builder.h = template.getH();
      return builder;
   }
   
}