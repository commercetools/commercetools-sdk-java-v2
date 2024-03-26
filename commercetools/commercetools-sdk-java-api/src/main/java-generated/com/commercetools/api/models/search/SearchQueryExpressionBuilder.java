
package com.commercetools.api.models.search;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchQueryExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchQueryExpression searchQueryExpression = SearchQueryExpression.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchQueryExpressionBuilder implements Builder<SearchQueryExpression> {

    /**
     * builds SearchQueryExpression with checking for non-null required values
     * @return SearchQueryExpression
     */
    public SearchQueryExpression build() {
        return new SearchQueryExpressionImpl();
    }

    /**
     * builds SearchQueryExpression without checking for non-null required values
     * @return SearchQueryExpression
     */
    public SearchQueryExpression buildUnchecked() {
        return new SearchQueryExpressionImpl();
    }

    /**
     * factory method for an instance of SearchQueryExpressionBuilder
     * @return builder
     */
    public static SearchQueryExpressionBuilder of() {
        return new SearchQueryExpressionBuilder();
    }

    /**
     * create builder for SearchQueryExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchQueryExpressionBuilder of(final SearchQueryExpression template) {
        SearchQueryExpressionBuilder builder = new SearchQueryExpressionBuilder();
        return builder;
    }

}
