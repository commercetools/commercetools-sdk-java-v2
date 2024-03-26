
package com.commercetools.api.models.search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchFilterExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchFilterExpression searchFilterExpression = SearchFilterExpression.builder()
 *             .plusFilter(filterBuilder -> filterBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchFilterExpressionBuilder implements Builder<SearchFilterExpression> {

    private java.util.List<com.commercetools.api.models.search.SearchQueryExpression> filter;

    /**
     * set values to the filter
     * @param filter value to be set
     * @return Builder
     */

    public SearchFilterExpressionBuilder filter(
            final com.commercetools.api.models.search.SearchQueryExpression... filter) {
        this.filter = new ArrayList<>(Arrays.asList(filter));
        return this;
    }

    /**
     * set value to the filter
     * @param filter value to be set
     * @return Builder
     */

    public SearchFilterExpressionBuilder filter(
            final java.util.List<com.commercetools.api.models.search.SearchQueryExpression> filter) {
        this.filter = filter;
        return this;
    }

    /**
     * add values to the filter
     * @param filter value to be set
     * @return Builder
     */

    public SearchFilterExpressionBuilder plusFilter(
            final com.commercetools.api.models.search.SearchQueryExpression... filter) {
        if (this.filter == null) {
            this.filter = new ArrayList<>();
        }
        this.filter.addAll(Arrays.asList(filter));
        return this;
    }

    /**
     * add the value to the filter using the builder function
     * @param builder function to build the filter value
     * @return Builder
     */

    public SearchFilterExpressionBuilder plusFilter(
            Function<com.commercetools.api.models.search.SearchQueryExpressionBuilder, com.commercetools.api.models.search.SearchQueryExpressionBuilder> builder) {
        if (this.filter == null) {
            this.filter = new ArrayList<>();
        }
        this.filter.add(builder.apply(com.commercetools.api.models.search.SearchQueryExpressionBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the filter using the builder function
     * @param builder function to build the filter value
     * @return Builder
     */

    public SearchFilterExpressionBuilder withFilter(
            Function<com.commercetools.api.models.search.SearchQueryExpressionBuilder, com.commercetools.api.models.search.SearchQueryExpressionBuilder> builder) {
        this.filter = new ArrayList<>();
        this.filter.add(builder.apply(com.commercetools.api.models.search.SearchQueryExpressionBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the filter using the builder function
     * @param builder function to build the filter value
     * @return Builder
     */

    public SearchFilterExpressionBuilder addFilter(
            Function<com.commercetools.api.models.search.SearchQueryExpressionBuilder, com.commercetools.api.models.search.SearchQueryExpression> builder) {
        return plusFilter(builder.apply(com.commercetools.api.models.search.SearchQueryExpressionBuilder.of()));
    }

    /**
     * set the value to the filter using the builder function
     * @param builder function to build the filter value
     * @return Builder
     */

    public SearchFilterExpressionBuilder setFilter(
            Function<com.commercetools.api.models.search.SearchQueryExpressionBuilder, com.commercetools.api.models.search.SearchQueryExpression> builder) {
        return filter(builder.apply(com.commercetools.api.models.search.SearchQueryExpressionBuilder.of()));
    }

    /**
     * value of filter}
     * @return filter
     */

    public java.util.List<com.commercetools.api.models.search.SearchQueryExpression> getFilter() {
        return this.filter;
    }

    /**
     * builds SearchFilterExpression with checking for non-null required values
     * @return SearchFilterExpression
     */
    public SearchFilterExpression build() {
        Objects.requireNonNull(filter, SearchFilterExpression.class + ": filter is missing");
        return new SearchFilterExpressionImpl(filter);
    }

    /**
     * builds SearchFilterExpression without checking for non-null required values
     * @return SearchFilterExpression
     */
    public SearchFilterExpression buildUnchecked() {
        return new SearchFilterExpressionImpl(filter);
    }

    /**
     * factory method for an instance of SearchFilterExpressionBuilder
     * @return builder
     */
    public static SearchFilterExpressionBuilder of() {
        return new SearchFilterExpressionBuilder();
    }

    /**
     * create builder for SearchFilterExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchFilterExpressionBuilder of(final SearchFilterExpression template) {
        SearchFilterExpressionBuilder builder = new SearchFilterExpressionBuilder();
        builder.filter = template.getFilter();
        return builder;
    }

}
