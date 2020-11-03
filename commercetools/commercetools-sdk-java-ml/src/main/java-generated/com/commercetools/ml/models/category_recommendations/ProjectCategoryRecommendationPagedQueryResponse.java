package com.commercetools.ml.models.category_recommendations;

import com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendation;
import com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationMeta;
import com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationPagedQueryResponseImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProjectCategoryRecommendationPagedQueryResponseImpl.class)
public interface ProjectCategoryRecommendationPagedQueryResponse  {

    
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
    public List<ProjectCategoryRecommendation> getResults();
    
    @NotNull
    @Valid
    @JsonProperty("meta")
    public ProjectCategoryRecommendationMeta getMeta();

    public void setCount(final Long count);
    
    public void setTotal(final Long total);
    
    public void setOffset(final Long offset);
    
    @JsonIgnore
    public void setResults(final ProjectCategoryRecommendation ...results);
    public void setResults(final List<ProjectCategoryRecommendation> results);
    
    public void setMeta(final ProjectCategoryRecommendationMeta meta);

    public static ProjectCategoryRecommendationPagedQueryResponseImpl of(){
        return new ProjectCategoryRecommendationPagedQueryResponseImpl();
    }
    

    public static ProjectCategoryRecommendationPagedQueryResponseImpl of(final ProjectCategoryRecommendationPagedQueryResponse template) {
        ProjectCategoryRecommendationPagedQueryResponseImpl instance = new ProjectCategoryRecommendationPagedQueryResponseImpl();
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        instance.setMeta(template.getMeta());
        return instance;
    }

    default <T> T withProjectCategoryRecommendationPagedQueryResponse(Function<ProjectCategoryRecommendationPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
}
