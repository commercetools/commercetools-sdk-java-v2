
package com.commercetools.api.models.search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchExistsExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchExistsExpression searchExistsExpression = SearchExistsExpression.builder()
 *             .exists(existsBuilder -> existsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchExistsExpressionBuilder implements Builder<SearchExistsExpression> {

    private com.commercetools.api.models.search.SearchExistsValue exists;

    /**
     * set the value to the exists using the builder function
     * @param builder function to build the exists value
     * @return Builder
     */

    public SearchExistsExpressionBuilder exists(
            Function<com.commercetools.api.models.search.SearchExistsValueBuilder, com.commercetools.api.models.search.SearchExistsValueBuilder> builder) {
        this.exists = builder.apply(com.commercetools.api.models.search.SearchExistsValueBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the exists using the builder function
     * @param builder function to build the exists value
     * @return Builder
     */

    public SearchExistsExpressionBuilder withExists(
            Function<com.commercetools.api.models.search.SearchExistsValueBuilder, com.commercetools.api.models.search.SearchExistsValue> builder) {
        this.exists = builder.apply(com.commercetools.api.models.search.SearchExistsValueBuilder.of());
        return this;
    }

    /**
     * set the value to the exists
     * @param exists value to be set
     * @return Builder
     */

    public SearchExistsExpressionBuilder exists(final com.commercetools.api.models.search.SearchExistsValue exists) {
        this.exists = exists;
        return this;
    }

    /**
     * value of exists}
     * @return exists
     */

    public com.commercetools.api.models.search.SearchExistsValue getExists() {
        return this.exists;
    }

    /**
     * builds SearchExistsExpression with checking for non-null required values
     * @return SearchExistsExpression
     */
    public SearchExistsExpression build() {
        Objects.requireNonNull(exists, SearchExistsExpression.class + ": exists is missing");
        return new SearchExistsExpressionImpl(exists);
    }

    /**
     * builds SearchExistsExpression without checking for non-null required values
     * @return SearchExistsExpression
     */
    public SearchExistsExpression buildUnchecked() {
        return new SearchExistsExpressionImpl(exists);
    }

    /**
     * factory method for an instance of SearchExistsExpressionBuilder
     * @return builder
     */
    public static SearchExistsExpressionBuilder of() {
        return new SearchExistsExpressionBuilder();
    }

    /**
     * create builder for SearchExistsExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchExistsExpressionBuilder of(final SearchExistsExpression template) {
        SearchExistsExpressionBuilder builder = new SearchExistsExpressionBuilder();
        builder.exists = template.getExists();
        return builder;
    }

}
