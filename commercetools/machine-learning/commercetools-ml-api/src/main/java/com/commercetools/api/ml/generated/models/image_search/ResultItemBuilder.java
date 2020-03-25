package com.commercetools.api.ml.generated.models.image_search;

import com.commercetools.api.ml.generated.models.common.ProductVariant;
import com.commercetools.api.ml.generated.models.image_search.ResultItem;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ResultItemBuilder {
   
   
   private String imageUrl;
   
   
   private List<ProductVariant> productVariants;
   
   public ResultItemBuilder imageUrl( final String imageUrl) {
      this.imageUrl = imageUrl;
      return this;
   }
   
   public ResultItemBuilder productVariants( final List<ProductVariant> productVariants) {
      this.productVariants = productVariants;
      return this;
   }
   
   
   public String getImageUrl(){
      return this.imageUrl;
   }
   
   
   public List<ProductVariant> getProductVariants(){
      return this.productVariants;
   }

   public ResultItem build() {
       return new ResultItemImpl(imageUrl, productVariants);
   }
   
   public static ResultItemBuilder of() {
      return new ResultItemBuilder();
   }
   
   public static ResultItemBuilder of(final ResultItem template) {
      ResultItemBuilder builder = new ResultItemBuilder();
      builder.imageUrl = template.getImageUrl();
      builder.productVariants = template.getProductVariants();
      return builder;
   }
   
}
