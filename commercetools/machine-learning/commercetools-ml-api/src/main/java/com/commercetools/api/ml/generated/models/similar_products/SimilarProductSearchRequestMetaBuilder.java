package com.commercetools.api.ml.generated.models.similar_products;

import com.commercetools.api.ml.generated.models.similar_products.SimilarityMeasures;
import com.commercetools.api.ml.generated.models.similar_products.SimilarProductSearchRequestMeta;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SimilarProductSearchRequestMetaBuilder {
   
   
   private SimilarityMeasures similarityMeasures;
   
   public SimilarProductSearchRequestMetaBuilder similarityMeasures( final SimilarityMeasures similarityMeasures) {
      this.similarityMeasures = similarityMeasures;
      return this;
   }
   
   
   public SimilarityMeasures getSimilarityMeasures(){
      return this.similarityMeasures;
   }

   public SimilarProductSearchRequestMeta build() {
       return new SimilarProductSearchRequestMetaImpl(similarityMeasures);
   }
   
   public static SimilarProductSearchRequestMetaBuilder of() {
      return new SimilarProductSearchRequestMetaBuilder();
   }
   
   public static SimilarProductSearchRequestMetaBuilder of(final SimilarProductSearchRequestMeta template) {
      SimilarProductSearchRequestMetaBuilder builder = new SimilarProductSearchRequestMetaBuilder();
      builder.similarityMeasures = template.getSimilarityMeasures();
      return builder;
   }
   
}
