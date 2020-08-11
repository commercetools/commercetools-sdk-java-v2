package com.commercetools.ml.models.general_category_recommendations;


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
public final class GeneralCategoryRecommendationImpl implements GeneralCategoryRecommendation {

   private String categoryName;

   private Integer confidence;

   @JsonCreator
   GeneralCategoryRecommendationImpl(@JsonProperty("categoryName") final String categoryName, @JsonProperty("confidence") final Integer confidence) {
      this.categoryName = categoryName;
      this.confidence = confidence;
   }
   public GeneralCategoryRecommendationImpl() {

   }

   /**
   *  <p>An English category name that is recommended for a product.</p>
   */
   public String getCategoryName(){
      return this.categoryName;
   }

   /**
   *  <p>Probability score for the category recommendation.</p>
   */
   public Integer getConfidence(){
      return this.confidence;
   }

   public void setCategoryName(final String categoryName){
      this.categoryName = categoryName;
   }

   public void setConfidence(final Integer confidence){
      this.confidence = confidence;
   }

}
