
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchKeywordsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchKeywords searchKeywords = SearchKeywords.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchKeywordsBuilder implements Builder<SearchKeywords> {

    public SearchKeywords build() {
        return new SearchKeywordsImpl();
    }

    /**
     * builds SearchKeywords without checking for non null required values
     */
    public SearchKeywords buildUnchecked() {
        return new SearchKeywordsImpl();
    }

    public static SearchKeywordsBuilder of() {
        return new SearchKeywordsBuilder();
    }

    public static SearchKeywordsBuilder of(final SearchKeywords template) {
        SearchKeywordsBuilder builder = new SearchKeywordsBuilder();
        return builder;
    }

}
