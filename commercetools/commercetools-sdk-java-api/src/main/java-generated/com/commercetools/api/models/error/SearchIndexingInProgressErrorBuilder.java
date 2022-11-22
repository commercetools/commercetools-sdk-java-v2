
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
     */

    public SearchIndexingInProgressErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public SearchIndexingInProgressErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public SearchIndexingInProgressErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public SearchIndexingInProgressError build() {
        Objects.requireNonNull(message, SearchIndexingInProgressError.class + ": message is missing");
        Objects.requireNonNull(values, SearchIndexingInProgressError.class + ": values are missing");
        return new SearchIndexingInProgressErrorImpl(message, values);
    }

    /**
     * builds SearchIndexingInProgressError without checking for non null required values
     */
    public SearchIndexingInProgressError buildUnchecked() {
        return new SearchIndexingInProgressErrorImpl(message, values);
    }

    public static SearchIndexingInProgressErrorBuilder of() {
        return new SearchIndexingInProgressErrorBuilder();
    }

    public static SearchIndexingInProgressErrorBuilder of(final SearchIndexingInProgressError template) {
        SearchIndexingInProgressErrorBuilder builder = new SearchIndexingInProgressErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
