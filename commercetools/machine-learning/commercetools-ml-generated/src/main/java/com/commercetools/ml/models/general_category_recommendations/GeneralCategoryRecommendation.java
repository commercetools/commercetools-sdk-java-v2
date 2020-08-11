package com.commercetools.ml.models.general_category_recommendations;


import com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationImpl;

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
@JsonDeserialize(as = GeneralCategoryRecommendationImpl.class)
public interface GeneralCategoryRecommendation  {

   /**
   *  <p>An English category name that is recommended for a product.</p>
   */
   @NotNull
   @JsonProperty("categoryName")
   public String getCategoryName();
   /**
   *  <p>Probability score for the category recommendation.</p>
   */
   @NotNull
   @JsonProperty("confidence")
   public Integer getConfidence();

   public void setCategoryName(final String categoryName);

   public void setConfidence(final Integer confidence);

   public static GeneralCategoryRecommendationImpl of(){
      return new GeneralCategoryRecommendationImpl();
   }


   public static GeneralCategoryRecommendationImpl of(final GeneralCategoryRecommendation template) {
      GeneralCategoryRecommendationImpl instance = new GeneralCategoryRecommendationImpl();
      instance.setCategoryName(template.getCategoryName());
      instance.setConfidence(template.getConfidence());
      return instance;
   }

}
