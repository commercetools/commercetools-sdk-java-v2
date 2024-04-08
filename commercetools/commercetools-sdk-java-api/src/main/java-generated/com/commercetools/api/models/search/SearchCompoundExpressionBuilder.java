
package com.commercetools.api.models.search;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchCompoundExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchCompoundExpression searchCompoundExpression = SearchCompoundExpression.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchCompoundExpressionBuilder implements Builder<SearchCompoundExpression> {

    /**
     * builds SearchCompoundExpression with checking for non-null required values
     * @return SearchCompoundExpression
     */
    public SearchCompoundExpression build() {
        return new SearchCompoundExpressionImpl();
    }

    /**
     * builds SearchCompoundExpression without checking for non-null required values
     * @return SearchCompoundExpression
     */
    public SearchCompoundExpression buildUnchecked() {
        return new SearchCompoundExpressionImpl();
    }

    /**
     * factory method for an instance of SearchCompoundExpressionBuilder
     * @return builder
     */
    public static SearchCompoundExpressionBuilder of() {
        return new SearchCompoundExpressionBuilder();
    }

    /**
     * create builder for SearchCompoundExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchCompoundExpressionBuilder of(final SearchCompoundExpression template) {
        SearchCompoundExpressionBuilder builder = new SearchCompoundExpressionBuilder();
        return builder;
    }

}
