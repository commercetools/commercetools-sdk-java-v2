
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidOperationErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidOperationError invalidOperationError = InvalidOperationError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InvalidOperationErrorBuilder implements Builder<InvalidOperationError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Plain text description of the error.</p>
     */

    public InvalidOperationErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public InvalidOperationErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public InvalidOperationErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public InvalidOperationError build() {
        Objects.requireNonNull(message, InvalidOperationError.class + ": message is missing");
        Objects.requireNonNull(values, InvalidOperationError.class + ": values are missing");
        return new InvalidOperationErrorImpl(message, values);
    }

    /**
     * builds InvalidOperationError without checking for non null required values
     */
    public InvalidOperationError buildUnchecked() {
        return new InvalidOperationErrorImpl(message, values);
    }

    public static InvalidOperationErrorBuilder of() {
        return new InvalidOperationErrorBuilder();
    }

    public static InvalidOperationErrorBuilder of(final InvalidOperationError template) {
        InvalidOperationErrorBuilder builder = new InvalidOperationErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
