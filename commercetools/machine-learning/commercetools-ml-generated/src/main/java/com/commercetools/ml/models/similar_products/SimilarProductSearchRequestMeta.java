package com.commercetools.ml.models.similar_products;

import com.commercetools.ml.models.similar_products.SimilarityMeasures;
import com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMetaImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = SimilarProductSearchRequestMetaImpl.class)
public interface SimilarProductSearchRequestMeta  {

   /**
   *  <p>The SimilarityMeasures used in this search.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("similarityMeasures")
   public SimilarityMeasures getSimilarityMeasures();

   public void setSimilarityMeasures(final SimilarityMeasures similarityMeasures);
   
   public static SimilarProductSearchRequestMetaImpl of(){
      return new SimilarProductSearchRequestMetaImpl();
   }
   

   public static SimilarProductSearchRequestMetaImpl of(final SimilarProductSearchRequestMeta template) {
      SimilarProductSearchRequestMetaImpl instance = new SimilarProductSearchRequestMetaImpl();
      instance.setSimilarityMeasures(template.getSimilarityMeasures());
      return instance;
   }

}
