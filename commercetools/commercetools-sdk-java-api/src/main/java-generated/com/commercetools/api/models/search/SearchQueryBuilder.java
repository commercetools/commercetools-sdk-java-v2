
package com.commercetools.api.models.search;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchQueryBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchQuery searchQuery = SearchQuery.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchQueryBuilder implements Builder<SearchQuery> {

    /**
     * builds SearchQuery with checking for non-null required values
     * @return SearchQuery
     */
    public SearchQuery build() {
        return new SearchQueryImpl();
    }

    /**
     * builds SearchQuery without checking for non-null required values
     * @return SearchQuery
     */
    public SearchQuery buildUnchecked() {
        return new SearchQueryImpl();
    }

    /**
     * factory method for an instance of SearchQueryBuilder
     * @return builder
     */
    public static SearchQueryBuilder of() {
        return new SearchQueryBuilder();
    }

    /**
     * create builder for SearchQuery instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchQueryBuilder of(final SearchQuery template) {
        SearchQueryBuilder builder = new SearchQueryBuilder();
        return builder;
    }

}
