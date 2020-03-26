package com.commercetools.api.ml.generated.models.category_recommendations;

import com.commercetools.api.ml.generated.models.category_recommendations.ProjectCategoryRecommendation;
import com.commercetools.api.ml.generated.models.category_recommendations.ProjectCategoryRecommendationMeta;
import com.commercetools.api.ml.generated.models.category_recommendations.ProjectCategoryRecommendationPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProjectCategoryRecommendationPagedQueryResponseBuilder {
   
   
   private Long count;
   
   
   private Long total;
   
   
   private Long offset;
   
   
   private List<ProjectCategoryRecommendation> results;
   
   
   private ProjectCategoryRecommendationMeta meta;
   
   public ProjectCategoryRecommendationPagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public ProjectCategoryRecommendationPagedQueryResponseBuilder total( final Long total) {
      this.total = total;
      return this;
   }
   
   public ProjectCategoryRecommendationPagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public ProjectCategoryRecommendationPagedQueryResponseBuilder results( final List<ProjectCategoryRecommendation> results) {
      this.results = results;
      return this;
   }
   
   public ProjectCategoryRecommendationPagedQueryResponseBuilder meta( final ProjectCategoryRecommendationMeta meta) {
      this.meta = meta;
      return this;
   }
   
   
   public Long getCount(){
      return this.count;
   }
   
   
   public Long getTotal(){
      return this.total;
   }
   
   
   public Long getOffset(){
      return this.offset;
   }
   
   
   public List<ProjectCategoryRecommendation> getResults(){
      return this.results;
   }
   
   
   public ProjectCategoryRecommendationMeta getMeta(){
      return this.meta;
   }

   public ProjectCategoryRecommendationPagedQueryResponse build() {
       return new ProjectCategoryRecommendationPagedQueryResponseImpl(count, total, offset, results, meta);
   }
   
   public static ProjectCategoryRecommendationPagedQueryResponseBuilder of() {
      return new ProjectCategoryRecommendationPagedQueryResponseBuilder();
   }
   
   public static ProjectCategoryRecommendationPagedQueryResponseBuilder of(final ProjectCategoryRecommendationPagedQueryResponse template) {
      ProjectCategoryRecommendationPagedQueryResponseBuilder builder = new ProjectCategoryRecommendationPagedQueryResponseBuilder();
      builder.count = template.getCount();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.results = template.getResults();
      builder.meta = template.getMeta();
      return builder;
   }
   
}
