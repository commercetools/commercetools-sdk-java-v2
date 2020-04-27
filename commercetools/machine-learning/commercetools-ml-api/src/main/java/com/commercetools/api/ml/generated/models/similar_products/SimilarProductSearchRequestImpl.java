package com.commercetools.api.ml.generated.models.similar_products;

import com.commercetools.api.ml.generated.models.similar_products.ProductSetSelector;
import com.commercetools.api.ml.generated.models.similar_products.SimilarityMeasures;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SimilarProductSearchRequestImpl implements SimilarProductSearchRequest {

   private Long limit;
   
   private Long offset;
   
   private String language;
   
   private String currencyCode;
   
   private com.commercetools.api.ml.generated.models.similar_products.SimilarityMeasures similarityMeasures;
   
   private java.util.List<com.commercetools.api.ml.generated.models.similar_products.ProductSetSelector> productSetSelectors;
   
   private Integer confidenceMin;
   
   private Integer confidenceMax;

   @JsonCreator
   SimilarProductSearchRequestImpl(@JsonProperty("limit") final Long limit, @JsonProperty("offset") final Long offset, @JsonProperty("language") final String language, @JsonProperty("currencyCode") final String currencyCode, @JsonProperty("similarityMeasures") final com.commercetools.api.ml.generated.models.similar_products.SimilarityMeasures similarityMeasures, @JsonProperty("productSetSelectors") final java.util.List<com.commercetools.api.ml.generated.models.similar_products.ProductSetSelector> productSetSelectors, @JsonProperty("confidenceMin") final Integer confidenceMin, @JsonProperty("confidenceMax") final Integer confidenceMax) {
      this.limit = limit;
      this.offset = offset;
      this.language = language;
      this.currencyCode = currencyCode;
      this.similarityMeasures = similarityMeasures;
      this.productSetSelectors = productSetSelectors;
      this.confidenceMin = confidenceMin;
      this.confidenceMax = confidenceMax;
   }
   public SimilarProductSearchRequestImpl() {
      
   }
   
   
   public Long getLimit(){
      return this.limit;
   }
   
   
   public Long getOffset(){
      return this.offset;
   }
   
   /**
   *  <p>language tag used to prioritize language for text comparisons.</p>
   */
   public String getLanguage(){
      return this.language;
   }
   
   /**
   *  <p>The three-digit  currency code to compare prices in. When a product has multiple prices, all prices for the product are converted to the currency provided by the currency attribute and the median price is calculated for comparison. Currencies are converted using the ECB currency exchange rates at the time the request is made. Of the currency codes, only currencies with currency exchange rates provided by the ECB are supported.</p>
   */
   public String getCurrencyCode(){
      return this.currencyCode;
   }
   
   /**
   *  <p><code>similarityMeasures</code> defines the attributes taken into account to measure product similarity.</p>
   */
   public com.commercetools.api.ml.generated.models.similar_products.SimilarityMeasures getSimilarityMeasures(){
      return this.similarityMeasures;
   }
   
   /**
   *  <p>Array of length 2 of ProductSetSelector</p>
   */
   public java.util.List<com.commercetools.api.ml.generated.models.similar_products.ProductSetSelector> getProductSetSelectors(){
      return this.productSetSelectors;
   }
   
   
   public Integer getConfidenceMin(){
      return this.confidenceMin;
   }
   
   
   public Integer getConfidenceMax(){
      return this.confidenceMax;
   }

   public void setLimit(final Long limit){
      this.limit = limit;
   }
   
   public void setOffset(final Long offset){
      this.offset = offset;
   }
   
   public void setLanguage(final String language){
      this.language = language;
   }
   
   public void setCurrencyCode(final String currencyCode){
      this.currencyCode = currencyCode;
   }
   
   public void setSimilarityMeasures(final com.commercetools.api.ml.generated.models.similar_products.SimilarityMeasures similarityMeasures){
      this.similarityMeasures = similarityMeasures;
   }
   
   public void setProductSetSelectors(final java.util.List<com.commercetools.api.ml.generated.models.similar_products.ProductSetSelector> productSetSelectors){
      this.productSetSelectors = productSetSelectors;
   }
   
   public void setConfidenceMin(final Integer confidenceMin){
      this.confidenceMin = confidenceMin;
   }
   
   public void setConfidenceMax(final Integer confidenceMax){
      this.confidenceMax = confidenceMax;
   }

}
