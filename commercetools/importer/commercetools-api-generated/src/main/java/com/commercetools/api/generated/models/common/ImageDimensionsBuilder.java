package com.commercetools.api.generated.models.common;


import com.commercetools.api.generated.models.common.ImageDimensions;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImageDimensionsBuilder {
   
   
   private Integer w;
   
   
   private Integer h;
   
   public ImageDimensionsBuilder w( final Integer w) {
      this.w = w;
      return this;
   }
   
   public ImageDimensionsBuilder h( final Integer h) {
      this.h = h;
      return this;
   }
   
   
   public Integer getW(){
      return this.w;
   }
   
   
   public Integer getH(){
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