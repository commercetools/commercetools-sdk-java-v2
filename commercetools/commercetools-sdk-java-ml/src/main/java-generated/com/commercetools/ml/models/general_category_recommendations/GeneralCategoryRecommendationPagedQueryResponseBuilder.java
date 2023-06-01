package com.commercetools.ml.models.general_category_recommendations;

import com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendation;
import com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GeneralCategoryRecommendationPagedQueryResponseBuilder
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
public class GeneralCategoryRecommendationPagedQueryResponseBuilder implements Builder<GeneralCategoryRecommendationPagedQueryResponse> {

    
    
    private Long count;
    
    
    
    private Long total;
    
    
    
    private Long offset;
    
    
    
    private java.util.List<com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendation> results;

    
    /**
     * set the value to the count
     * @param count value to be set
     * @return Builder
     */
    
    public GeneralCategoryRecommendationPagedQueryResponseBuilder count( final Long count) {
        this.count = count;
        return this;
    }
    
    
    
    
    /**
     * set the value to the total
     * @param total value to be set
     * @return Builder
     */
    
    public GeneralCategoryRecommendationPagedQueryResponseBuilder total( final Long total) {
        this.total = total;
        return this;
    }
    
    
    
    
    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */
    
    public GeneralCategoryRecommendationPagedQueryResponseBuilder offset( final Long offset) {
        this.offset = offset;
        return this;
    }
    
    
    
    /**
     * set values to the results
     * @param results value to be set
     * @return Builder
     */
    
    public GeneralCategoryRecommendationPagedQueryResponseBuilder results( final com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendation ...results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }
    
    /**
     * set value to the results
     * @param results value to be set
     * @return Builder
     */
    
    public GeneralCategoryRecommendationPagedQueryResponseBuilder results( final java.util.List<com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendation> results) {
        this.results = results;
        return this;
    }
    
    /**
     * add values to the results
     * @param results value to be set
     * @return Builder
     */
    
    public GeneralCategoryRecommendationPagedQueryResponseBuilder plusResults( final com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendation ...results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }
    
    
    
    /**
     * add the value to the results using the builder function
     * @param builder function to build the results value
     * @return Builder
     */
    
    public GeneralCategoryRecommendationPagedQueryResponseBuilder plusResults(Function<com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationBuilder, com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the results using the builder function
     * @param builder function to build the results value
     * @return Builder
     */
    
    public GeneralCategoryRecommendationPagedQueryResponseBuilder withResults(Function<com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationBuilder, com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the results using the builder function
     * @param builder function to build the results value
     * @return Builder
     */
    
    public GeneralCategoryRecommendationPagedQueryResponseBuilder addResults(Function<com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationBuilder, com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendation> builder) {
        return plusResults(builder.apply(com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationBuilder.of()));
    }
    
    /**
     * set the value to the results using the builder function
     * @param builder function to build the results value
     * @return Builder
     */
    
    public GeneralCategoryRecommendationPagedQueryResponseBuilder setResults(Function<com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationBuilder, com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendation> builder) {
        return results(builder.apply(com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationBuilder.of()));
    }
                    

    /**
     * value of count}
     * @return count
     */
    
    
    public Long getCount(){
        return this.count;
    }
    
    /**
     * value of total}
     * @return total
     */
    
    
    public Long getTotal(){
        return this.total;
    }
    
    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */
    
    
    public Long getOffset(){
        return this.offset;
    }
    
    /**
     * value of results}
     * @return results
     */
    
    
    public java.util.List<com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendation> getResults(){
        return this.results;
    }

    /**
     * builds GeneralCategoryRecommendationPagedQueryResponse with checking for non-null required values
     * @return GeneralCategoryRecommendationPagedQueryResponse
     */
    public GeneralCategoryRecommendationPagedQueryResponse build() {
        Objects.requireNonNull(count, GeneralCategoryRecommendationPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(total, GeneralCategoryRecommendationPagedQueryResponse.class + ": total is missing");
        Objects.requireNonNull(offset, GeneralCategoryRecommendationPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, GeneralCategoryRecommendationPagedQueryResponse.class + ": results is missing");
        return new GeneralCategoryRecommendationPagedQueryResponseImpl(count, total, offset, results);
    }
    
    /**
     * builds GeneralCategoryRecommendationPagedQueryResponse without checking for non-null required values
     * @return GeneralCategoryRecommendationPagedQueryResponse
     */
    public GeneralCategoryRecommendationPagedQueryResponse buildUnchecked() {
        return new GeneralCategoryRecommendationPagedQueryResponseImpl(count, total, offset, results);
    }

    /**
     * factory method for an instance of GeneralCategoryRecommendationPagedQueryResponseBuilder
     * @return builder 
     */
    public static GeneralCategoryRecommendationPagedQueryResponseBuilder of() {
        return new GeneralCategoryRecommendationPagedQueryResponseBuilder();
    }

    /**
     * create builder for GeneralCategoryRecommendationPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GeneralCategoryRecommendationPagedQueryResponseBuilder of(final GeneralCategoryRecommendationPagedQueryResponse template) {
        GeneralCategoryRecommendationPagedQueryResponseBuilder builder = new GeneralCategoryRecommendationPagedQueryResponseBuilder();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
