package com.commercetools.api.ml.generated.models.similar_products;

import com.commercetools.api.ml.generated.models.similar_products.ProductSetSelector;
import com.commercetools.api.ml.generated.models.similar_products.SimilarityMeasures;
import com.commercetools.api.ml.generated.models.similar_products.SimilarProductSearchRequest;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SimilarProductSearchRequestBuilder {
   
   @Nullable
   private Long limit;
   
   @Nullable
   private Long offset;
   
   @Nullable
   private String language;
   
   @Nullable
   private String currencyCode;
   
   @Nullable
   private SimilarityMeasures similarityMeasures;
   
   @Nullable
   private List<ProductSetSelector> productSetSelectors;
   
   @Nullable
   private Integer confidenceMin;
   
   @Nullable
   private Integer confidenceMax;
   
   public SimilarProductSearchRequestBuilder limit(@Nullable final Long limit) {
      this.limit = limit;
      return this;
   }
   
   public SimilarProductSearchRequestBuilder offset(@Nullable final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public SimilarProductSearchRequestBuilder language(@Nullable final String language) {
      this.language = language;
      return this;
   }
   
   public SimilarProductSearchRequestBuilder currencyCode(@Nullable final String currencyCode) {
      this.currencyCode = currencyCode;
      return this;
   }
   
   public SimilarProductSearchRequestBuilder similarityMeasures(@Nullable final SimilarityMeasures similarityMeasures) {
      this.similarityMeasures = similarityMeasures;
      return this;
   }
   
   public SimilarProductSearchRequestBuilder productSetSelectors(@Nullable final List<ProductSetSelector> productSetSelectors) {
      this.productSetSelectors = productSetSelectors;
      return this;
   }
   
   public SimilarProductSearchRequestBuilder confidenceMin(@Nullable final Integer confidenceMin) {
      this.confidenceMin = confidenceMin;
      return this;
   }
   
   public SimilarProductSearchRequestBuilder confidenceMax(@Nullable final Integer confidenceMax) {
      this.confidenceMax = confidenceMax;
      return this;
   }
   
   @Nullable
   public Long getLimit(){
      return this.limit;
   }
   
   @Nullable
   public Long getOffset(){
      return this.offset;
   }
   
   @Nullable
   public String getLanguage(){
      return this.language;
   }
   
   @Nullable
   public String getCurrencyCode(){
      return this.currencyCode;
   }
   
   @Nullable
   public SimilarityMeasures getSimilarityMeasures(){
      return this.similarityMeasures;
   }
   
   @Nullable
   public List<ProductSetSelector> getProductSetSelectors(){
      return this.productSetSelectors;
   }
   
   @Nullable
   public Integer getConfidenceMin(){
      return this.confidenceMin;
   }
   
   @Nullable
   public Integer getConfidenceMax(){
      return this.confidenceMax;
   }

   public SimilarProductSearchRequest build() {
       return new SimilarProductSearchRequestImpl(limit, offset, language, currencyCode, similarityMeasures, productSetSelectors, confidenceMin, confidenceMax);
   }
   
   public static SimilarProductSearchRequestBuilder of() {
      return new SimilarProductSearchRequestBuilder();
   }
   
   public static SimilarProductSearchRequestBuilder of(final SimilarProductSearchRequest template) {
      SimilarProductSearchRequestBuilder builder = new SimilarProductSearchRequestBuilder();
      builder.limit = template.getLimit();
      builder.offset = template.getOffset();
      builder.language = template.getLanguage();
      builder.currencyCode = template.getCurrencyCode();
      builder.similarityMeasures = template.getSimilarityMeasures();
      builder.productSetSelectors = template.getProductSetSelectors();
      builder.confidenceMin = template.getConfidenceMin();
      builder.confidenceMax = template.getConfidenceMax();
      return builder;
   }
   
}
