
package com.commercetools.ml.models.general_category_recommendations;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * GeneralCategoryRecommendationPagedQueryResponse
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GeneralCategoryRecommendationPagedQueryResponse generalCategoryRecommendationPagedQueryResponse = GeneralCategoryRecommendationPagedQueryResponse.builder()
 *             .count(0.3)
 *             .total(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GeneralCategoryRecommendationPagedQueryResponseImpl.class)
public interface GeneralCategoryRecommendationPagedQueryResponse {

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

    public static com.fasterxml.jackson.core.type.TypeReference<GeneralCategoryRecommendationPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GeneralCategoryRecommendationPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<GeneralCategoryRecommendationPagedQueryResponse>";
            }
        };
    }
}
