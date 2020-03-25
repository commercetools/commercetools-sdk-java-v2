package com.commercetools.api.ml.generated.models.similar_products;

import com.commercetools.api.ml.generated.models.similar_products.SimilarProduct;
import com.commercetools.api.ml.generated.models.similar_products.SimilarProductPair;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SimilarProductPairBuilder {
   
   
   private Integer confidence;
   
   
   private List<SimilarProduct> products;
   
   public SimilarProductPairBuilder confidence( final Integer confidence) {
      this.confidence = confidence;
      return this;
   }
   
   public SimilarProductPairBuilder products( final List<SimilarProduct> products) {
      this.products = products;
      return this;
   }
   
   
   public Integer getConfidence(){
      return this.confidence;
   }
   
   
   public List<SimilarProduct> getProducts(){
      return this.products;
   }

   public SimilarProductPair build() {
       return new SimilarProductPairImpl(confidence, products);
   }
   
   public static SimilarProductPairBuilder of() {
      return new SimilarProductPairBuilder();
   }
   
   public static SimilarProductPairBuilder of(final SimilarProductPair template) {
      SimilarProductPairBuilder builder = new SimilarProductPairBuilder();
      builder.confidence = template.getConfidence();
      builder.products = template.getProducts();
      return builder;
   }
   
}
