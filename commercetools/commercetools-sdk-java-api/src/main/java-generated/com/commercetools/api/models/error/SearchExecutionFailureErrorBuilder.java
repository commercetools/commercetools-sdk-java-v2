
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchExecutionFailureErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchExecutionFailureError searchExecutionFailureError = SearchExecutionFailureError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchExecutionFailureErrorBuilder implements Builder<SearchExecutionFailureError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"Something went wrong during the search query execution. In most case this happens due to usage of non-existing fields and custom product attributes. Please verify all filters and facets in your search query and make sure that all paths are correct."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public SearchExecutionFailureErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public SearchExecutionFailureErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public SearchExecutionFailureErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    /**
     * builds SearchExecutionFailureError with checking for non-null required values
     * @return SearchExecutionFailureError
     */
    public SearchExecutionFailureError build() {
        Objects.requireNonNull(message, SearchExecutionFailureError.class + ": message is missing");
        return new SearchExecutionFailureErrorImpl(message, values);
    }

    /**
     * builds SearchExecutionFailureError without checking for non-null required values
     * @return SearchExecutionFailureError
     */
    public SearchExecutionFailureError buildUnchecked() {
        return new SearchExecutionFailureErrorImpl(message, values);
    }

    public static SearchExecutionFailureErrorBuilder of() {
        return new SearchExecutionFailureErrorBuilder();
    }

    public static SearchExecutionFailureErrorBuilder of(final SearchExecutionFailureError template) {
        SearchExecutionFailureErrorBuilder builder = new SearchExecutionFailureErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
