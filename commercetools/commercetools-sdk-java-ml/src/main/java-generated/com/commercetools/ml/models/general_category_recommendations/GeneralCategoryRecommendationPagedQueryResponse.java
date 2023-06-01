package com.commercetools.ml.models.general_category_recommendations;

import com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendation;
import com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationPagedQueryResponseImpl;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = GeneralCategoryRecommendationPagedQueryResponseImpl.class)
public interface GeneralCategoryRecommendationPagedQueryResponse  {


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
    public void setResults(final GeneralCategoryRecommendation ...results);
    /**
     * set results
     * @param results values to be set
     */
    
    public void setResults(final List<GeneralCategoryRecommendation> results);

    /**
     * factory method
     * @return instance of GeneralCategoryRecommendationPagedQueryResponse
     */
    public static GeneralCategoryRecommendationPagedQueryResponse of(){
        return new GeneralCategoryRecommendationPagedQueryResponseImpl();
    }
    

    /**
     * factory method to create a shallow copy GeneralCategoryRecommendationPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static GeneralCategoryRecommendationPagedQueryResponse of(final GeneralCategoryRecommendationPagedQueryResponse template) {
        GeneralCategoryRecommendationPagedQueryResponseImpl instance = new GeneralCategoryRecommendationPagedQueryResponseImpl();
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    /**
     * factory method to create a deep copy of GeneralCategoryRecommendationPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GeneralCategoryRecommendationPagedQueryResponse deepCopy(@Nullable final GeneralCategoryRecommendationPagedQueryResponse template) {
        if (template == null) {
            return null;
        }
        GeneralCategoryRecommendationPagedQueryResponseImpl instance = new GeneralCategoryRecommendationPagedQueryResponseImpl();
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream().map(com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendation::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for GeneralCategoryRecommendationPagedQueryResponse
     * @return builder
     */
    public static GeneralCategoryRecommendationPagedQueryResponseBuilder builder() {
        return GeneralCategoryRecommendationPagedQueryResponseBuilder.of();
    }
    
    /**
     * create builder for GeneralCategoryRecommendationPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GeneralCategoryRecommendationPagedQueryResponseBuilder builder(final GeneralCategoryRecommendationPagedQueryResponse template) {
        return GeneralCategoryRecommendationPagedQueryResponseBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGeneralCategoryRecommendationPagedQueryResponse(Function<GeneralCategoryRecommendationPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GeneralCategoryRecommendationPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GeneralCategoryRecommendationPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<GeneralCategoryRecommendationPagedQueryResponse>";
            }
        };
    }
}
