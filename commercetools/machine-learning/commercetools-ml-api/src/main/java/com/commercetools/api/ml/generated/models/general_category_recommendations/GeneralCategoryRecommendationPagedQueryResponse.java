package com.commercetools.api.ml.generated.models.general_category_recommendations;

import com.commercetools.api.ml.generated.models.general_category_recommendations.GeneralCategoryRecommendation;
import com.commercetools.api.ml.generated.models.general_category_recommendations.GeneralCategoryRecommendationPagedQueryResponseImpl;

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
@JsonDeserialize(as = GeneralCategoryRecommendationPagedQueryResponseImpl.class)
public interface GeneralCategoryRecommendationPagedQueryResponse  {

   
   @NotNull
   @JsonProperty("count")
   public Long getCount();
   
   @NotNull
   @JsonProperty("total")
   public Long getTotal();
   
   @NotNull
   @JsonProperty("offset")
   public Long getOffset();
   
   @NotNull
   @Valid
   @JsonProperty("results")
   public List<GeneralCategoryRecommendation> getResults();

   public void setCount(final Long count);
   
   public void setTotal(final Long total);
   
   public void setOffset(final Long offset);
   
   public void setResults(final List<GeneralCategoryRecommendation> results);
   
   public static GeneralCategoryRecommendationPagedQueryResponseImpl of(){
      return new GeneralCategoryRecommendationPagedQueryResponseImpl();
   }
   

   public static GeneralCategoryRecommendationPagedQueryResponseImpl of(final GeneralCategoryRecommendationPagedQueryResponse template) {
      GeneralCategoryRecommendationPagedQueryResponseImpl instance = new GeneralCategoryRecommendationPagedQueryResponseImpl();
      instance.setCount(template.getCount());
      instance.setTotal(template.getTotal());
      instance.setOffset(template.getOffset());
      instance.setResults(template.getResults());
      return instance;
   }

}
