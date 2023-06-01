package com.commercetools.api.models.product;

import com.commercetools.api.models.product.FacetResults;
import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.api.models.product.ProductProjectionPagedSearchResponse;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductProjectionPagedSearchResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductProjectionPagedSearchResponse productProjectionPagedSearchResponse = ProductProjectionPagedSearchResponse.builder()
 *             .limit(0.3)
 *             .count(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .facets(facetsBuilder -> facetsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductProjectionPagedSearchResponseBuilder implements Builder<ProductProjectionPagedSearchResponse> {

    
    
    private Long limit;
    
    
    
    private Long count;
    
    
    @Nullable
    private Long total;
    
    
    
    private Long offset;
    
    
    
    private java.util.List<com.commercetools.api.models.product.ProductProjection> results;
    
    
    
    private com.commercetools.api.models.product.FacetResults facets;

    
    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */
    
    public ProductProjectionPagedSearchResponseBuilder limit( final Long limit) {
        this.limit = limit;
        return this;
    }
    
    
    
    
    /**
     * set the value to the count
     * @param count value to be set
     * @return Builder
     */
    
    public ProductProjectionPagedSearchResponseBuilder count( final Long count) {
        this.count = count;
        return this;
    }
    
    
    
    
    /**
     * set the value to the total
     * @param total value to be set
     * @return Builder
     */
    
    public ProductProjectionPagedSearchResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }
    
    
    
    
    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */
    
    public ProductProjectionPagedSearchResponseBuilder offset( final Long offset) {
        this.offset = offset;
        return this;
    }
    
    
    
    /**
     * set values to the results
     * @param results value to be set
     * @return Builder
     */
    
    public ProductProjectionPagedSearchResponseBuilder results( final com.commercetools.api.models.product.ProductProjection ...results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }
    
    /**
     * set value to the results
     * @param results value to be set
     * @return Builder
     */
    
    public ProductProjectionPagedSearchResponseBuilder results( final java.util.List<com.commercetools.api.models.product.ProductProjection> results) {
        this.results = results;
        return this;
    }
    
    /**
     * add values to the results
     * @param results value to be set
     * @return Builder
     */
    
    public ProductProjectionPagedSearchResponseBuilder plusResults( final com.commercetools.api.models.product.ProductProjection ...results) {
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
    
    public ProductProjectionPagedSearchResponseBuilder plusResults(Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjectionBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the results using the builder function
     * @param builder function to build the results value
     * @return Builder
     */
    
    public ProductProjectionPagedSearchResponseBuilder withResults(Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjectionBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the results using the builder function
     * @param builder function to build the results value
     * @return Builder
     */
    
    public ProductProjectionPagedSearchResponseBuilder addResults(Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjection> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of()));
    }
    
    /**
     * set the value to the results using the builder function
     * @param builder function to build the results value
     * @return Builder
     */
    
    public ProductProjectionPagedSearchResponseBuilder setResults(Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjection> builder) {
        return results(builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of()));
    }
                    
    
    
    /**
     * set the value to the facets using the builder function
     * @param builder function to build the facets value
     * @return Builder
     */
    
    public ProductProjectionPagedSearchResponseBuilder facets(Function<com.commercetools.api.models.product.FacetResultsBuilder, com.commercetools.api.models.product.FacetResultsBuilder> builder) {
        this.facets = builder.apply(com.commercetools.api.models.product.FacetResultsBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the facets using the builder function
     * @param builder function to build the facets value
     * @return Builder
     */
    
    public ProductProjectionPagedSearchResponseBuilder withFacets(Function<com.commercetools.api.models.product.FacetResultsBuilder, com.commercetools.api.models.product.FacetResults> builder) {
        this.facets = builder.apply(com.commercetools.api.models.product.FacetResultsBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the facets
     * @param facets value to be set
     * @return Builder
     */
    
    public ProductProjectionPagedSearchResponseBuilder facets( final com.commercetools.api.models.product.FacetResults facets) {
        this.facets = facets;
        return this;
    }
    
    

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */
    
    
    public Long getLimit(){
        return this.limit;
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
    
    @Nullable
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
    
    
    public java.util.List<com.commercetools.api.models.product.ProductProjection> getResults(){
        return this.results;
    }
    
    /**
     * value of facets}
     * @return facets
     */
    
    
    public com.commercetools.api.models.product.FacetResults getFacets(){
        return this.facets;
    }

    /**
     * builds ProductProjectionPagedSearchResponse with checking for non-null required values
     * @return ProductProjectionPagedSearchResponse
     */
    public ProductProjectionPagedSearchResponse build() {
        Objects.requireNonNull(limit, ProductProjectionPagedSearchResponse.class + ": limit is missing");
        Objects.requireNonNull(count, ProductProjectionPagedSearchResponse.class + ": count is missing");
        Objects.requireNonNull(offset, ProductProjectionPagedSearchResponse.class + ": offset is missing");
        Objects.requireNonNull(results, ProductProjectionPagedSearchResponse.class + ": results is missing");
        Objects.requireNonNull(facets, ProductProjectionPagedSearchResponse.class + ": facets is missing");
        return new ProductProjectionPagedSearchResponseImpl(limit, count, total, offset, results, facets);
    }
    
    /**
     * builds ProductProjectionPagedSearchResponse without checking for non-null required values
     * @return ProductProjectionPagedSearchResponse
     */
    public ProductProjectionPagedSearchResponse buildUnchecked() {
        return new ProductProjectionPagedSearchResponseImpl(limit, count, total, offset, results, facets);
    }

    /**
     * factory method for an instance of ProductProjectionPagedSearchResponseBuilder
     * @return builder 
     */
    public static ProductProjectionPagedSearchResponseBuilder of() {
        return new ProductProjectionPagedSearchResponseBuilder();
    }

    /**
     * create builder for ProductProjectionPagedSearchResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductProjectionPagedSearchResponseBuilder of(final ProductProjectionPagedSearchResponse template) {
        ProductProjectionPagedSearchResponseBuilder builder = new ProductProjectionPagedSearchResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        builder.facets = template.getFacets();
        return builder;
    }

}
