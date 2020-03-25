package com.commercetools.api.ml.generated.models.category_recommendations;

import com.commercetools.api.ml.generated.models.category_recommendations.ProjectCategoryRecommendation;
import com.commercetools.api.ml.generated.models.category_recommendations.ProjectCategoryRecommendationMeta;
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
public final class ProjectCategoryRecommendationPagedQueryResponseImpl implements ProjectCategoryRecommendationPagedQueryResponse {

   private Long count;
   
   private Long total;
   
   private Long offset;
   
   private List<ProjectCategoryRecommendation> results;
   
   private ProjectCategoryRecommendationMeta meta;

   @JsonCreator
   ProjectCategoryRecommendationPagedQueryResponseImpl(@JsonProperty("count") final Long count, @JsonProperty("total") final Long total, @JsonProperty("offset") final Long offset, @JsonProperty("results") final List<ProjectCategoryRecommendation> results, @JsonProperty("meta") final ProjectCategoryRecommendationMeta meta) {
      this.count = count;
      this.total = total;
      this.offset = offset;
      this.results = results;
      this.meta = meta;
   }
   public ProjectCategoryRecommendationPagedQueryResponseImpl() {
      
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

   public void setCount(final Long count){
      this.count = count;
   }
   
   public void setTotal(final Long total){
      this.total = total;
   }
   
   public void setOffset(final Long offset){
      this.offset = offset;
   }
   
   public void setResults(final List<ProjectCategoryRecommendation> results){
      this.results = results;
   }
   
   public void setMeta(final ProjectCategoryRecommendationMeta meta){
      this.meta = meta;
   }

}
