package com.commercetools.ml.models.category_recommendations;

import com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendation;
import com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationMeta;
import com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationPagedQueryResponseImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProjectCategoryRecommendationPagedQueryResponseImpl.class)
public interface ProjectCategoryRecommendationPagedQueryResponse  {


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

    /**
     * set count
     * @param count value to be set
     */
    
    public void setCount(final Long count);
    
    
    /**
     * set total
     * @param total value to be set
     */
    
    public void setTotal(final Long total);
    
    
    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     */
    
    public void setOffset(final Long offset);
    
    
    /**
     * set results
     * @param results values to be set
     */
    
    @JsonIgnore
    public void setResults(final ProjectCategoryRecommendation ...results);
    /**
     * set results
     * @param results values to be set
     */
    
    public void setResults(final List<ProjectCategoryRecommendation> results);
    
    /**
     * set meta
     * @param meta value to be set
     */
    
    public void setMeta(final ProjectCategoryRecommendationMeta meta);
    

    /**
     * factory method
     * @return instance of ProjectCategoryRecommendationPagedQueryResponse
     */
    public static ProjectCategoryRecommendationPagedQueryResponse of(){
        return new ProjectCategoryRecommendationPagedQueryResponseImpl();
    }
    

    /**
     * factory method to create a shallow copy ProjectCategoryRecommendationPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectCategoryRecommendationPagedQueryResponse of(final ProjectCategoryRecommendationPagedQueryResponse template) {
        ProjectCategoryRecommendationPagedQueryResponseImpl instance = new ProjectCategoryRecommendationPagedQueryResponseImpl();
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        instance.setMeta(template.getMeta());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProjectCategoryRecommendationPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectCategoryRecommendationPagedQueryResponse deepCopy(@Nullable final ProjectCategoryRecommendationPagedQueryResponse template) {
        if (template == null) {
            return null;
        }
        ProjectCategoryRecommendationPagedQueryResponseImpl instance = new ProjectCategoryRecommendationPagedQueryResponseImpl();
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream().map(com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendation::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setMeta(com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationMeta.deepCopy(template.getMeta()));
        return instance;
    }

    /**
     * builder factory method for ProjectCategoryRecommendationPagedQueryResponse
     * @return builder
     */
    public static ProjectCategoryRecommendationPagedQueryResponseBuilder builder() {
        return ProjectCategoryRecommendationPagedQueryResponseBuilder.of();
    }
    
    /**
     * create builder for ProjectCategoryRecommendationPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectCategoryRecommendationPagedQueryResponseBuilder builder(final ProjectCategoryRecommendationPagedQueryResponse template) {
        return ProjectCategoryRecommendationPagedQueryResponseBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectCategoryRecommendationPagedQueryResponse(Function<ProjectCategoryRecommendationPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectCategoryRecommendationPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectCategoryRecommendationPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectCategoryRecommendationPagedQueryResponse>";
            }
        };
    }
}
