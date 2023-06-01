package com.commercetools.api.models.common;

import com.commercetools.api.models.common.BaseResource;
import java.lang.Object;
import com.commercetools.api.models.common.PagedQueryResponse;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PagedQueryResponse pagedQueryResponse = PagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class PagedQueryResponseBuilder implements Builder<PagedQueryResponse> {

    
    
    private Long limit;
    
    
    
    private Long offset;
    
    
    
    private Long count;
    
    
    @Nullable
    private Long total;
    
    
    
    private java.util.List<com.commercetools.api.models.common.BaseResource> results;
    
    
    @Nullable
    private java.lang.Object meta;

    
    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */
    
    public PagedQueryResponseBuilder limit( final Long limit) {
        this.limit = limit;
        return this;
    }
    
    
    
    
    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */
    
    public PagedQueryResponseBuilder offset( final Long offset) {
        this.offset = offset;
        return this;
    }
    
    
    
    
    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */
    
    public PagedQueryResponseBuilder count( final Long count) {
        this.count = count;
        return this;
    }
    
    
    
    
    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */
    
    public PagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }
    
    
    
    /**
     * set values to the results
     * @param results value to be set
     * @return Builder
     */
    
    public PagedQueryResponseBuilder results( final com.commercetools.api.models.common.BaseResource ...results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }
    
    /**
     * set value to the results
     * @param results value to be set
     * @return Builder
     */
    
    public PagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.models.common.BaseResource> results) {
        this.results = results;
        return this;
    }
    
    /**
     * add values to the results
     * @param results value to be set
     * @return Builder
     */
    
    public PagedQueryResponseBuilder plusResults( final com.commercetools.api.models.common.BaseResource ...results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }
    
    
    
    
    
    /**
     * set the value to the meta
     * @param meta value to be set
     * @return Builder
     */
    
    public PagedQueryResponseBuilder meta(@Nullable final java.lang.Object meta) {
        this.meta = meta;
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
     *  <p>Number of elements skipped.</p>
     * @return offset
     */
    
    
    public Long getOffset(){
        return this.offset;
    }
    
    /**
     *  <p>Actual number of results returned.</p>
     * @return count
     */
    
    
    public Long getCount(){
        return this.count;
    }
    
    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @return total
     */
    
    @Nullable
    public Long getTotal(){
        return this.total;
    }
    
    /**
     * value of results}
     * @return results
     */
    
    
    public java.util.List<com.commercetools.api.models.common.BaseResource> getResults(){
        return this.results;
    }
    
    /**
     * value of meta}
     * @return meta
     */
    
    @Nullable
    public java.lang.Object getMeta(){
        return this.meta;
    }

    /**
     * builds PagedQueryResponse with checking for non-null required values
     * @return PagedQueryResponse
     */
    public PagedQueryResponse build() {
        Objects.requireNonNull(limit, PagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, PagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, PagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, PagedQueryResponse.class + ": results is missing");
        return new PagedQueryResponseImpl(limit, offset, count, total, results, meta);
    }
    
    /**
     * builds PagedQueryResponse without checking for non-null required values
     * @return PagedQueryResponse
     */
    public PagedQueryResponse buildUnchecked() {
        return new PagedQueryResponseImpl(limit, offset, count, total, results, meta);
    }

    /**
     * factory method for an instance of PagedQueryResponseBuilder
     * @return builder 
     */
    public static PagedQueryResponseBuilder of() {
        return new PagedQueryResponseBuilder();
    }

    /**
     * create builder for PagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PagedQueryResponseBuilder of(final PagedQueryResponse template) {
        PagedQueryResponseBuilder builder = new PagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        builder.meta = template.getMeta();
        return builder;
    }

}
