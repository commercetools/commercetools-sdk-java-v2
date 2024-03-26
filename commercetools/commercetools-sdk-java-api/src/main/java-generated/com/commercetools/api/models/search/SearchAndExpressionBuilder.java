
package com.commercetools.api.models.search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchAndExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchAndExpression searchAndExpression = SearchAndExpression.builder()
 *             .plusAnd(andBuilder -> andBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchAndExpressionBuilder implements Builder<SearchAndExpression> {

    private java.util.List<com.commercetools.api.models.search.SearchQuery> and;

    /**
     * set values to the and
     * @param and value to be set
     * @return Builder
     */

    public SearchAndExpressionBuilder and(final com.commercetools.api.models.search.SearchQuery... and) {
        this.and = new ArrayList<>(Arrays.asList(and));
        return this;
    }

    /**
     * set value to the and
     * @param and value to be set
     * @return Builder
     */

    public SearchAndExpressionBuilder and(final java.util.List<com.commercetools.api.models.search.SearchQuery> and) {
        this.and = and;
        return this;
    }

    /**
     * add values to the and
     * @param and value to be set
     * @return Builder
     */

    public SearchAndExpressionBuilder plusAnd(final com.commercetools.api.models.search.SearchQuery... and) {
        if (this.and == null) {
            this.and = new ArrayList<>();
        }
        this.and.addAll(Arrays.asList(and));
        return this;
    }

    /**
     * add the value to the and using the builder function
     * @param builder function to build the and value
     * @return Builder
     */

    public SearchAndExpressionBuilder plusAnd(
            Function<com.commercetools.api.models.search.SearchQueryBuilder, com.commercetools.api.models.search.SearchQueryBuilder> builder) {
        if (this.and == null) {
            this.and = new ArrayList<>();
        }
        this.and.add(builder.apply(com.commercetools.api.models.search.SearchQueryBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the and using the builder function
     * @param builder function to build the and value
     * @return Builder
     */

    public SearchAndExpressionBuilder withAnd(
            Function<com.commercetools.api.models.search.SearchQueryBuilder, com.commercetools.api.models.search.SearchQueryBuilder> builder) {
        this.and = new ArrayList<>();
        this.and.add(builder.apply(com.commercetools.api.models.search.SearchQueryBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the and using the builder function
     * @param builder function to build the and value
     * @return Builder
     */

    public SearchAndExpressionBuilder addAnd(
            Function<com.commercetools.api.models.search.SearchQueryBuilder, com.commercetools.api.models.search.SearchQuery> builder) {
        return plusAnd(builder.apply(com.commercetools.api.models.search.SearchQueryBuilder.of()));
    }

    /**
     * set the value to the and using the builder function
     * @param builder function to build the and value
     * @return Builder
     */

    public SearchAndExpressionBuilder setAnd(
            Function<com.commercetools.api.models.search.SearchQueryBuilder, com.commercetools.api.models.search.SearchQuery> builder) {
        return and(builder.apply(com.commercetools.api.models.search.SearchQueryBuilder.of()));
    }

    /**
     * value of and}
     * @return and
     */

    public java.util.List<com.commercetools.api.models.search.SearchQuery> getAnd() {
        return this.and;
    }

    /**
     * builds SearchAndExpression with checking for non-null required values
     * @return SearchAndExpression
     */
    public SearchAndExpression build() {
        Objects.requireNonNull(and, SearchAndExpression.class + ": and is missing");
        return new SearchAndExpressionImpl(and);
    }

    /**
     * builds SearchAndExpression without checking for non-null required values
     * @return SearchAndExpression
     */
    public SearchAndExpression buildUnchecked() {
        return new SearchAndExpressionImpl(and);
    }

    /**
     * factory method for an instance of SearchAndExpressionBuilder
     * @return builder
     */
    public static SearchAndExpressionBuilder of() {
        return new SearchAndExpressionBuilder();
    }

    /**
     * create builder for SearchAndExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchAndExpressionBuilder of(final SearchAndExpression template) {
        SearchAndExpressionBuilder builder = new SearchAndExpressionBuilder();
        builder.and = template.getAnd();
        return builder;
    }

}
