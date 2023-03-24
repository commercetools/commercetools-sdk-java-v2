
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchDeactivatedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchDeactivatedError searchDeactivatedError = SearchDeactivatedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchDeactivatedErrorBuilder implements Builder<SearchDeactivatedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"The endpoint is deactivated for this project. Please enable it via the Project endpoint, via the Merchant Center in the Project settings, or reach out to Support to enable it."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public SearchDeactivatedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public SearchDeactivatedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public SearchDeactivatedErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds SearchDeactivatedError with checking for non-null required values
     * @return SearchDeactivatedError
     */
    public SearchDeactivatedError build() {
        Objects.requireNonNull(message, SearchDeactivatedError.class + ": message is missing");
        return new SearchDeactivatedErrorImpl(message, values);
    }

    /**
     * builds SearchDeactivatedError without checking for non-null required values
     * @return SearchDeactivatedError
     */
    public SearchDeactivatedError buildUnchecked() {
        return new SearchDeactivatedErrorImpl(message, values);
    }

    public static SearchDeactivatedErrorBuilder of() {
        return new SearchDeactivatedErrorBuilder();
    }

    public static SearchDeactivatedErrorBuilder of(final SearchDeactivatedError template) {
        SearchDeactivatedErrorBuilder builder = new SearchDeactivatedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
