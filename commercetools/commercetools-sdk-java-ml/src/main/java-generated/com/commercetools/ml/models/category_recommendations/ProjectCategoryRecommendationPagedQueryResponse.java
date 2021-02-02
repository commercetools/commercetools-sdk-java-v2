
package com.commercetools.ml.models.category_recommendations;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProjectCategoryRecommendationPagedQueryResponseImpl.class)
public interface ProjectCategoryRecommendationPagedQueryResponse {

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
    public void setResults(final ProjectCategoryRecommendation... results);

    public void setResults(final List<ProjectCategoryRecommendation> results);

    public void setMeta(final ProjectCategoryRecommendationMeta meta);

    public static ProjectCategoryRecommendationPagedQueryResponse of() {
        return new ProjectCategoryRecommendationPagedQueryResponseImpl();
    }

    public static ProjectCategoryRecommendationPagedQueryResponse of(
            final ProjectCategoryRecommendationPagedQueryResponse template) {
        ProjectCategoryRecommendationPagedQueryResponseImpl instance = new ProjectCategoryRecommendationPagedQueryResponseImpl();
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        instance.setMeta(template.getMeta());
        return instance;
    }

    public static ProjectCategoryRecommendationPagedQueryResponseBuilder builder() {
        return ProjectCategoryRecommendationPagedQueryResponseBuilder.of();
    }

    public static ProjectCategoryRecommendationPagedQueryResponseBuilder builder(
            final ProjectCategoryRecommendationPagedQueryResponse template) {
        return ProjectCategoryRecommendationPagedQueryResponseBuilder.of(template);
    }

    default <T> T withProjectCategoryRecommendationPagedQueryResponse(
            Function<ProjectCategoryRecommendationPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
}
