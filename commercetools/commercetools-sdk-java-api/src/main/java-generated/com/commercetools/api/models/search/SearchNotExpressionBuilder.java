
package com.commercetools.api.models.search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchNotExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchNotExpression searchNotExpression = SearchNotExpression.builder()
 *             .plusNot(notBuilder -> notBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchNotExpressionBuilder implements Builder<SearchNotExpression> {

    private java.util.List<com.commercetools.api.models.search.SearchQuery> not;

    /**
     * set values to the not
     * @param not value to be set
     * @return Builder
     */

    public SearchNotExpressionBuilder not(final com.commercetools.api.models.search.SearchQuery... not) {
        this.not = new ArrayList<>(Arrays.asList(not));
        return this;
    }

    /**
     * set value to the not
     * @param not value to be set
     * @return Builder
     */

    public SearchNotExpressionBuilder not(final java.util.List<com.commercetools.api.models.search.SearchQuery> not) {
        this.not = not;
        return this;
    }

    /**
     * add values to the not
     * @param not value to be set
     * @return Builder
     */

    public SearchNotExpressionBuilder plusNot(final com.commercetools.api.models.search.SearchQuery... not) {
        if (this.not == null) {
            this.not = new ArrayList<>();
        }
        this.not.addAll(Arrays.asList(not));
        return this;
    }

    /**
     * add the value to the not using the builder function
     * @param builder function to build the not value
     * @return Builder
     */

    public SearchNotExpressionBuilder plusNot(
            Function<com.commercetools.api.models.search.SearchQueryBuilder, com.commercetools.api.models.search.SearchQueryBuilder> builder) {
        if (this.not == null) {
            this.not = new ArrayList<>();
        }
        this.not.add(builder.apply(com.commercetools.api.models.search.SearchQueryBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the not using the builder function
     * @param builder function to build the not value
     * @return Builder
     */

    public SearchNotExpressionBuilder withNot(
            Function<com.commercetools.api.models.search.SearchQueryBuilder, com.commercetools.api.models.search.SearchQueryBuilder> builder) {
        this.not = new ArrayList<>();
        this.not.add(builder.apply(com.commercetools.api.models.search.SearchQueryBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the not using the builder function
     * @param builder function to build the not value
     * @return Builder
     */

    public SearchNotExpressionBuilder addNot(
            Function<com.commercetools.api.models.search.SearchQueryBuilder, com.commercetools.api.models.search.SearchQuery> builder) {
        return plusNot(builder.apply(com.commercetools.api.models.search.SearchQueryBuilder.of()));
    }

    /**
     * set the value to the not using the builder function
     * @param builder function to build the not value
     * @return Builder
     */

    public SearchNotExpressionBuilder setNot(
            Function<com.commercetools.api.models.search.SearchQueryBuilder, com.commercetools.api.models.search.SearchQuery> builder) {
        return not(builder.apply(com.commercetools.api.models.search.SearchQueryBuilder.of()));
    }

    /**
     * value of not}
     * @return not
     */

    public java.util.List<com.commercetools.api.models.search.SearchQuery> getNot() {
        return this.not;
    }

    /**
     * builds SearchNotExpression with checking for non-null required values
     * @return SearchNotExpression
     */
    public SearchNotExpression build() {
        Objects.requireNonNull(not, SearchNotExpression.class + ": not is missing");
        return new SearchNotExpressionImpl(not);
    }

    /**
     * builds SearchNotExpression without checking for non-null required values
     * @return SearchNotExpression
     */
    public SearchNotExpression buildUnchecked() {
        return new SearchNotExpressionImpl(not);
    }

    /**
     * factory method for an instance of SearchNotExpressionBuilder
     * @return builder
     */
    public static SearchNotExpressionBuilder of() {
        return new SearchNotExpressionBuilder();
    }

    /**
     * create builder for SearchNotExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchNotExpressionBuilder of(final SearchNotExpression template) {
        SearchNotExpressionBuilder builder = new SearchNotExpressionBuilder();
        builder.not = template.getNot();
        return builder;
    }

}
