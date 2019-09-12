package com.commercetools.models.Common;

import java.lang.Integer;
import com.commercetools.models.Common.AssetDimensions;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AssetDimensionsBuilder {
   
   
   private java.lang.Integer w;
   
   
   private java.lang.Integer h;
   
   public AssetDimensionsBuilder w( final java.lang.Integer w) {
      this.w = w;
      return this;
   }
   
   public AssetDimensionsBuilder h( final java.lang.Integer h) {
      this.h = h;
      return this;
   }
   
   
   public java.lang.Integer getW(){
      return this.w;
   }
   
   
   public java.lang.Integer getH(){
      return this.h;
   }

   public AssetDimensions build() {
       return new AssetDimensionsImpl(w, h);
   }
   
   public static AssetDimensionsBuilder of() {
      return new AssetDimensionsBuilder();
   }
   
   public static AssetDimensionsBuilder of(final AssetDimensions template) {
      AssetDimensionsBuilder builder = new AssetDimensionsBuilder();
      builder.w = template.getW();
      builder.h = template.getH();
      return builder;
   }
   
}