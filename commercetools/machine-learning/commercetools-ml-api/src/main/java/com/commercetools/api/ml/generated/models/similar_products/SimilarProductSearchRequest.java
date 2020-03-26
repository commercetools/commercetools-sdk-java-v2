package com.commercetools.api.ml.generated.models.similar_products;

import com.commercetools.api.ml.generated.models.similar_products.ProductSetSelector;
import com.commercetools.api.ml.generated.models.similar_products.SimilarityMeasures;
import com.commercetools.api.ml.generated.models.similar_products.SimilarProductSearchRequestImpl;

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
@JsonDeserialize(as = SimilarProductSearchRequestImpl.class)
public interface SimilarProductSearchRequest  {

   
   
   @JsonProperty("limit")
   public Long getLimit();
   
   
   @JsonProperty("offset")
   public Long getOffset();
   /**
   *  <p>language tag used to prioritize language for text comparisons.</p>
   */
   
   @JsonProperty("language")
   public String getLanguage();
   /**
   *  <p>The three-digit  currency code to compare prices in. When a product has multiple prices, all prices for the product are converted to the currency provided by the currency attribute and the median price is calculated for comparison. Currencies are converted using the ECB currency exchange rates at the time the request is made. Of the currency codes, only currencies with currency exchange rates provided by the ECB are supported.</p>
   */
   
   @JsonProperty("currencyCode")
   public String getCurrencyCode();
   /**
   *  <p><code>similarityMeasures</code> defines the attributes taken into account to measure product similarity.</p>
   */
   @Valid
   @JsonProperty("similarityMeasures")
   public SimilarityMeasures getSimilarityMeasures();
   /**
   *  <p>Array of length 2 of ProductSetSelector</p>
   */
   @Valid
   @JsonProperty("productSetSelectors")
   public List<ProductSetSelector> getProductSetSelectors();
   
   
   @JsonProperty("confidenceMin")
   public Integer getConfidenceMin();
   
   
   @JsonProperty("confidenceMax")
   public Integer getConfidenceMax();

   public void setLimit(final Long limit);
   
   public void setOffset(final Long offset);
   
   public void setLanguage(final String language);
   
   public void setCurrencyCode(final String currencyCode);
   
   public void setSimilarityMeasures(final SimilarityMeasures similarityMeasures);
   
   public void setProductSetSelectors(final List<ProductSetSelector> productSetSelectors);
   
   public void setConfidenceMin(final Integer confidenceMin);
   
   public void setConfidenceMax(final Integer confidenceMax);
   
   public static SimilarProductSearchRequestImpl of(){
      return new SimilarProductSearchRequestImpl();
   }
   

   public static SimilarProductSearchRequestImpl of(final SimilarProductSearchRequest template) {
      SimilarProductSearchRequestImpl instance = new SimilarProductSearchRequestImpl();
      instance.setLimit(template.getLimit());
      instance.setOffset(template.getOffset());
      instance.setLanguage(template.getLanguage());
      instance.setCurrencyCode(template.getCurrencyCode());
      instance.setSimilarityMeasures(template.getSimilarityMeasures());
      instance.setProductSetSelectors(template.getProductSetSelectors());
      instance.setConfidenceMin(template.getConfidenceMin());
      instance.setConfidenceMax(template.getConfidenceMax());
      return instance;
   }

}
