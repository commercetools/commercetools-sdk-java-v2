package com.commercetools.ml.models.missing_data;

import com.commercetools.ml.models.missing_data.MissingImagesCount;
import com.commercetools.ml.models.missing_data.MissingImagesVariantLevel;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MissingImagesVariantLevelBuilder {


   private Long missingImages;


   private Long total;

   public MissingImagesVariantLevelBuilder missingImages( final Long missingImages) {
      this.missingImages = missingImages;
      return this;
   }

   public MissingImagesVariantLevelBuilder total( final Long total) {
      this.total = total;
      return this;
   }


   public Long getMissingImages(){
      return this.missingImages;
   }


   public Long getTotal(){
      return this.total;
   }

   public MissingImagesVariantLevel build() {
       return new MissingImagesVariantLevelImpl(missingImages, total);
   }

   public static MissingImagesVariantLevelBuilder of() {
      return new MissingImagesVariantLevelBuilder();
   }

   public static MissingImagesVariantLevelBuilder of(final MissingImagesVariantLevel template) {
      MissingImagesVariantLevelBuilder builder = new MissingImagesVariantLevelBuilder();
      builder.missingImages = template.getMissingImages();
      builder.total = template.getTotal();
      return builder;
   }

}
