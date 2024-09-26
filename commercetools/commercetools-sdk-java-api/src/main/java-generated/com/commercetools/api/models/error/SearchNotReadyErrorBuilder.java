
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchNotReadyErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchNotReadyError searchNotReadyError = SearchNotReadyError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchNotReadyErrorBuilder implements Builder<SearchNotReadyError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>$Search is not ready. Check the indexing-status endpoint and that the feature has been activated in the project settings.</code></p>
     * @param message value to be set
     * @return Builder
     */

    public SearchNotReadyErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public SearchNotReadyErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public SearchNotReadyErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p><code>$Search is not ready. Check the indexing-status endpoint and that the feature has been activated in the project settings.</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    /**
     * builds SearchNotReadyError with checking for non-null required values
     * @return SearchNotReadyError
     */
    public SearchNotReadyError build() {
        Objects.requireNonNull(message, SearchNotReadyError.class + ": message is missing");
        return new SearchNotReadyErrorImpl(message, values);
    }

    /**
     * builds SearchNotReadyError without checking for non-null required values
     * @return SearchNotReadyError
     */
    public SearchNotReadyError buildUnchecked() {
        return new SearchNotReadyErrorImpl(message, values);
    }

    /**
     * factory method for an instance of SearchNotReadyErrorBuilder
     * @return builder
     */
    public static SearchNotReadyErrorBuilder of() {
        return new SearchNotReadyErrorBuilder();
    }

    /**
     * create builder for SearchNotReadyError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchNotReadyErrorBuilder of(final SearchNotReadyError template) {
        SearchNotReadyErrorBuilder builder = new SearchNotReadyErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
