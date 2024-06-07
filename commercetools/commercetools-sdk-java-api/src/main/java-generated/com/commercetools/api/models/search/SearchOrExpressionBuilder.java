
package com.commercetools.api.models.search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchOrExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchOrExpression searchOrExpression = SearchOrExpression.builder()
 *             .plusOr(orBuilder -> orBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchOrExpressionBuilder implements Builder<SearchOrExpression> {

    private java.util.List<com.commercetools.api.models.search.SearchQuery> or;

    /**
     * set values to the or
     * @param or value to be set
     * @return Builder
     */

    public SearchOrExpressionBuilder or(final com.commercetools.api.models.search.SearchQuery... or) {
        this.or = new ArrayList<>(Arrays.asList(or));
        return this;
    }

    /**
     * set value to the or
     * @param or value to be set
     * @return Builder
     */

    public SearchOrExpressionBuilder or(final java.util.List<com.commercetools.api.models.search.SearchQuery> or) {
        this.or = or;
        return this;
    }

    /**
     * add values to the or
     * @param or value to be set
     * @return Builder
     */

    public SearchOrExpressionBuilder plusOr(final com.commercetools.api.models.search.SearchQuery... or) {
        if (this.or == null) {
            this.or = new ArrayList<>();
        }
        this.or.addAll(Arrays.asList(or));
        return this;
    }

    /**
     * add the value to the or using the builder function
     * @param builder function to build the or value
     * @return Builder
     */

    public SearchOrExpressionBuilder plusOr(
            Function<com.commercetools.api.models.search.SearchQueryBuilder, com.commercetools.api.models.search.SearchQueryBuilder> builder) {
        if (this.or == null) {
            this.or = new ArrayList<>();
        }
        this.or.add(builder.apply(com.commercetools.api.models.search.SearchQueryBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the or using the builder function
     * @param builder function to build the or value
     * @return Builder
     */

    public SearchOrExpressionBuilder withOr(
            Function<com.commercetools.api.models.search.SearchQueryBuilder, com.commercetools.api.models.search.SearchQueryBuilder> builder) {
        this.or = new ArrayList<>();
        this.or.add(builder.apply(com.commercetools.api.models.search.SearchQueryBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the or using the builder function
     * @param builder function to build the or value
     * @return Builder
     */

    public SearchOrExpressionBuilder addOr(
            Function<com.commercetools.api.models.search.SearchQueryBuilder, com.commercetools.api.models.search.SearchQuery> builder) {
        return plusOr(builder.apply(com.commercetools.api.models.search.SearchQueryBuilder.of()));
    }

    /**
     * set the value to the or using the builder function
     * @param builder function to build the or value
     * @return Builder
     */

    public SearchOrExpressionBuilder setOr(
            Function<com.commercetools.api.models.search.SearchQueryBuilder, com.commercetools.api.models.search.SearchQuery> builder) {
        return or(builder.apply(com.commercetools.api.models.search.SearchQueryBuilder.of()));
    }

    /**
     * value of or}
     * @return or
     */

    public java.util.List<com.commercetools.api.models.search.SearchQuery> getOr() {
        return this.or;
    }

    /**
     * builds SearchOrExpression with checking for non-null required values
     * @return SearchOrExpression
     */
    public SearchOrExpression build() {
        Objects.requireNonNull(or, SearchOrExpression.class + ": or is missing");
        return new SearchOrExpressionImpl(or);
    }

    /**
     * builds SearchOrExpression without checking for non-null required values
     * @return SearchOrExpression
     */
    public SearchOrExpression buildUnchecked() {
        return new SearchOrExpressionImpl(or);
    }

    /**
     * factory method for an instance of SearchOrExpressionBuilder
     * @return builder
     */
    public static SearchOrExpressionBuilder of() {
        return new SearchOrExpressionBuilder();
    }

    /**
     * create builder for SearchOrExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchOrExpressionBuilder of(final SearchOrExpression template) {
        SearchOrExpressionBuilder builder = new SearchOrExpressionBuilder();
        builder.or = template.getOr();
        return builder;
    }

}
