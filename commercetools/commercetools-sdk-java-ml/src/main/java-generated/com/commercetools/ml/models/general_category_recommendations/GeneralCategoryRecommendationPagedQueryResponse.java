
package com.commercetools.ml.models.general_category_recommendations;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = GeneralCategoryRecommendationPagedQueryResponseImpl.class)
public interface GeneralCategoryRecommendationPagedQueryResponse {

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

    @JsonIgnore
    public void setResults(final GeneralCategoryRecommendation... results);

    public void setResults(final List<GeneralCategoryRecommendation> results);

    public static GeneralCategoryRecommendationPagedQueryResponse of() {
        return new GeneralCategoryRecommendationPagedQueryResponseImpl();
    }

    public static GeneralCategoryRecommendationPagedQueryResponse of(
            final GeneralCategoryRecommendationPagedQueryResponse template) {
        GeneralCategoryRecommendationPagedQueryResponseImpl instance = new GeneralCategoryRecommendationPagedQueryResponseImpl();
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static GeneralCategoryRecommendationPagedQueryResponseBuilder builder() {
        return GeneralCategoryRecommendationPagedQueryResponseBuilder.of();
    }

    public static GeneralCategoryRecommendationPagedQueryResponseBuilder builder(
            final GeneralCategoryRecommendationPagedQueryResponse template) {
        return GeneralCategoryRecommendationPagedQueryResponseBuilder.of(template);
    }

    default <T> T withGeneralCategoryRecommendationPagedQueryResponse(
            Function<GeneralCategoryRecommendationPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
}
