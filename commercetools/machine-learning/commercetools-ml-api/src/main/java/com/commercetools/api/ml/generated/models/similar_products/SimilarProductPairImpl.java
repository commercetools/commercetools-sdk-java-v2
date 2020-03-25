package com.commercetools.api.ml.generated.models.similar_products;

import com.commercetools.api.ml.generated.models.similar_products.SimilarProduct;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*  <p>A pair of SimilarProducts</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SimilarProductPairImpl implements SimilarProductPair {

   private Integer confidence;
   
   private List<SimilarProduct> products;

   @JsonCreator
   SimilarProductPairImpl(@JsonProperty("confidence") final Integer confidence, @JsonProperty("products") final List<SimilarProduct> products) {
      this.confidence = confidence;
      this.products = products;
   }
   public SimilarProductPairImpl() {
      
   }
   
   /**
   *  <p>The probability of product similarity.</p>
   */
   public Integer getConfidence(){
      return this.confidence;
   }
   
   
   public List<SimilarProduct> getProducts(){
      return this.products;
   }

   public void setConfidence(final Integer confidence){
      this.confidence = confidence;
   }
   
   public void setProducts(final List<SimilarProduct> products){
      this.products = products;
   }

}
