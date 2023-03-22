
package com.commercetools.ml.models.category_recommendations;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectCategoryRecommendationPagedQueryResponse
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectCategoryRecommendationPagedQueryResponse projectCategoryRecommendationPagedQueryResponse = ProjectCategoryRecommendationPagedQueryResponse.builder()
 *             .count(0.3)
 *             .total(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .meta(metaBuilder -> metaBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectCategoryRecommendationPagedQueryResponseImpl.class)
public interface ProjectCategoryRecommendationPagedQueryResponse {

    /**
     *
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     *
     * @return total
     */
    @NotNull
    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    /**
     *
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<ProjectCategoryRecommendation> getResults();

    /**
     *
     * @return meta
     */
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

    public static com.fasterxml.jackson.core.type.TypeReference<ProjectCategoryRecommendationPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectCategoryRecommendationPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectCategoryRecommendationPagedQueryResponse>";
            }
        };
    }
}
