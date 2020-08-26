package com.commercetools.ml.models.general_category_recommendations;


import com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendation;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class GeneralCategoryRecommendationBuilder {
   
   
   private String categoryName;
   
   
   private Integer confidence;
   
   public GeneralCategoryRecommendationBuilder categoryName( final String categoryName) {
      this.categoryName = categoryName;
      return this;
   }
   
   public GeneralCategoryRecommendationBuilder confidence( final Integer confidence) {
      this.confidence = confidence;
      return this;
   }
   
   
   public String getCategoryName(){
      return this.categoryName;
   }
   
   
   public Integer getConfidence(){
      return this.confidence;
   }

   public GeneralCategoryRecommendation build() {
       return new GeneralCategoryRecommendationImpl(categoryName, confidence);
   }
   
   public static GeneralCategoryRecommendationBuilder of() {
      return new GeneralCategoryRecommendationBuilder();
   }
   
   public static GeneralCategoryRecommendationBuilder of(final GeneralCategoryRecommendation template) {
      GeneralCategoryRecommendationBuilder builder = new GeneralCategoryRecommendationBuilder();
      builder.categoryName = template.getCategoryName();
      builder.confidence = template.getConfidence();
      return builder;
   }
   
}
