package com.commercetools.api.ml.generated.models.category_recommendations;

import com.commercetools.api.ml.generated.models.common.CategoryReference;
import com.commercetools.api.ml.generated.models.category_recommendations.ProjectCategoryRecommendation;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProjectCategoryRecommendationBuilder {
   
   
   private com.commercetools.api.ml.generated.models.common.CategoryReference category;
   
   
   private Integer confidence;
   
   
   private String path;
   
   public ProjectCategoryRecommendationBuilder category( final com.commercetools.api.ml.generated.models.common.CategoryReference category) {
      this.category = category;
      return this;
   }
   
   public ProjectCategoryRecommendationBuilder confidence( final Integer confidence) {
      this.confidence = confidence;
      return this;
   }
   
   public ProjectCategoryRecommendationBuilder path( final String path) {
      this.path = path;
      return this;
   }
   
   
   public com.commercetools.api.ml.generated.models.common.CategoryReference getCategory(){
      return this.category;
   }
   
   
   public Integer getConfidence(){
      return this.confidence;
   }
   
   
   public String getPath(){
      return this.path;
   }

   public ProjectCategoryRecommendation build() {
       return new ProjectCategoryRecommendationImpl(category, confidence, path);
   }
   
   public static ProjectCategoryRecommendationBuilder of() {
      return new ProjectCategoryRecommendationBuilder();
   }
   
   public static ProjectCategoryRecommendationBuilder of(final ProjectCategoryRecommendation template) {
      ProjectCategoryRecommendationBuilder builder = new ProjectCategoryRecommendationBuilder();
      builder.category = template.getCategory();
      builder.confidence = template.getConfidence();
      builder.path = template.getPath();
      return builder;
   }
   
}
