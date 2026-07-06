
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
 *             .plus/^[a-z]{2}(-[A-Z]{2})?$/(/^[a-z]{2}(-[A-Z]{2})?$/Builder -> /^[a-z]{2}(-[A-Z]{2})?$/Builder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchKeywordsBuilder implements Builder<SearchKeywords> {

    private Map<String, java.util.List<com.commercetools.api.models.product.SearchKeyword>> values = new HashMap<>();

    /**
     *  <p>Key-value pair where the keys are of type <a href="https://docs.commercetools.com/apis/ctp:api:type:Locale" rel="nofollow">Locale</a> and the values are an array of <a href="https://docs.commercetools.com/apis/ctp:api:type:SearchKeyword" rel="nofollow">SearchKeyword</a>.</p>
     * @param values properties to be set
     * @return Builder
     */

    public SearchKeywordsBuilder values(
            final Map<String, java.util.List<com.commercetools.api.models.product.SearchKeyword>> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Key-value pair where the keys are of type <a href="https://docs.commercetools.com/apis/ctp:api:type:Locale" rel="nofollow">Locale</a> and the values are an array of <a href="https://docs.commercetools.com/apis/ctp:api:type:SearchKeyword" rel="nofollow">SearchKeyword</a>.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public SearchKeywordsBuilder addValue(final String key,
            final java.util.List<com.commercetools.api.models.product.SearchKeyword> value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Key-value pair where the keys are of type <a href="https://docs.commercetools.com/apis/ctp:api:type:Locale" rel="nofollow">Locale</a> and the values are an array of <a href="https://docs.commercetools.com/apis/ctp:api:type:SearchKeyword" rel="nofollow">SearchKeyword</a>.</p>
     * @return pattern properties
     */

    public Map<String, java.util.List<com.commercetools.api.models.product.SearchKeyword>> getValues() {
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
