
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchIndexingInProgressErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchIndexingInProgressError searchIndexingInProgressError = SearchIndexingInProgressError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchIndexingInProgressErrorBuilder implements Builder<SearchIndexingInProgressError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"The indexing is currently in progress. Please wait until the status is "Activated" to execute search requests."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public SearchIndexingInProgressErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public SearchIndexingInProgressErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public SearchIndexingInProgressErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p><code>"The indexing is currently in progress. Please wait until the status is "Activated" to execute search requests."</code></p>
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
     * builds SearchIndexingInProgressError with checking for non-null required values
     * @return SearchIndexingInProgressError
     */
    public SearchIndexingInProgressError build() {
        Objects.requireNonNull(message, SearchIndexingInProgressError.class + ": message is missing");
        return new SearchIndexingInProgressErrorImpl(message, values);
    }

    /**
     * builds SearchIndexingInProgressError without checking for non-null required values
     * @return SearchIndexingInProgressError
     */
    public SearchIndexingInProgressError buildUnchecked() {
        return new SearchIndexingInProgressErrorImpl(message, values);
    }

    /**
     * factory method for an instance of SearchIndexingInProgressErrorBuilder
     * @return builder
     */
    public static SearchIndexingInProgressErrorBuilder of() {
        return new SearchIndexingInProgressErrorBuilder();
    }

    /**
     * create builder for SearchIndexingInProgressError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchIndexingInProgressErrorBuilder of(final SearchIndexingInProgressError template) {
        SearchIndexingInProgressErrorBuilder builder = new SearchIndexingInProgressErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
