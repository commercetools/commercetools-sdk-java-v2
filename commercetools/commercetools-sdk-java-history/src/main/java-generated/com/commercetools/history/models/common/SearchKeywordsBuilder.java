
package com.commercetools.history.models.common;

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
 *             .plus/^[a-z]{2}(-[A-Z]{2})?$/(/^[a-z]{2}(-[A-Z]{2})?$/Builder -> /^[a-z]{2}(-[A-Z]{2})?$/Builder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchKeywordsBuilder implements Builder<SearchKeywords> {

    private Map<String, java.util.List<com.commercetools.history.models.common.SearchKeyword>> values = new HashMap<>();

    /**
     *
     * @param values properties to be set
     * @return Builder
     */

    public SearchKeywordsBuilder values(
            final Map<String, java.util.List<com.commercetools.history.models.common.SearchKeyword>> values) {
        this.values = values;
        return this;
    }

    /**
     *
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public SearchKeywordsBuilder addValue(final String key,
            final java.util.List<com.commercetools.history.models.common.SearchKeyword> value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public Map<String, java.util.List<com.commercetools.history.models.common.SearchKeyword>> getValues() {
        return this.values;
    }

    /**
     * builds SearchKeywords with checking for non-null required values
     * @return SearchKeywords
     */
    public SearchKeywords build() {
        return new SearchKeywordsImpl(values);
    }

    /**
     * builds SearchKeywords without checking for non-null required values
     * @return SearchKeywords
     */
    public SearchKeywords buildUnchecked() {
        return new SearchKeywordsImpl(values);
    }

    public static SearchKeywordsBuilder of() {
        return new SearchKeywordsBuilder();
    }

    public static SearchKeywordsBuilder of(final SearchKeywords template) {
        SearchKeywordsBuilder builder = new SearchKeywordsBuilder();
        builder.values = template.values();
        return builder;
    }

}
