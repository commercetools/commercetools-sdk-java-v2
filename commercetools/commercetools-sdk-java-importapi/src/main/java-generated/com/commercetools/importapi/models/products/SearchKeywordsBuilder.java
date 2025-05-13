
package com.commercetools.importapi.models.products;

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
 *             .plus/^[a-zA-Z]{2,3}(?:-[a-zA-Z]{4})?(?:-(?:[a-zA-Z]{2}|\d{3}))?$/(/^[a-zA-Z]{2,3}(?:-[a-zA-Z]{4})?(?:-(?:[a-zA-Z]{2}|\d{3}))?$/Builder -> /^[a-zA-Z]{2,3}(?:-[a-zA-Z]{4})?(?:-(?:[a-zA-Z]{2}|\d{3}))?$/Builder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchKeywordsBuilder implements Builder<SearchKeywords> {

    private Map<String, java.util.List<com.commercetools.importapi.models.products.SearchKeyword>> values = new HashMap<>();

    /**
     * assign pattern properties to the builder
     * @param values properties to be set
     * @return Builder
     */

    public SearchKeywordsBuilder values(
            final Map<String, java.util.List<com.commercetools.importapi.models.products.SearchKeyword>> values) {
        this.values = values;
        return this;
    }

    /**
     * assign a pattern property to the builder
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public SearchKeywordsBuilder addValue(final String key,
            final java.util.List<com.commercetools.importapi.models.products.SearchKeyword> value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     * values of pattern properties
     * @return pattern properties
     */

    public Map<String, java.util.List<com.commercetools.importapi.models.products.SearchKeyword>> getValues() {
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

    /**
     * factory method for an instance of SearchKeywordsBuilder
     * @return builder
     */
    public static SearchKeywordsBuilder of() {
        return new SearchKeywordsBuilder();
    }

    /**
     * create builder for SearchKeywords instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchKeywordsBuilder of(final SearchKeywords template) {
        SearchKeywordsBuilder builder = new SearchKeywordsBuilder();
        builder.values = template.values();
        return builder;
    }

}
