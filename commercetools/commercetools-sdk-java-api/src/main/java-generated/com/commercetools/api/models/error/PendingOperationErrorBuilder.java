
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PendingOperationErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PendingOperationError pendingOperationError = PendingOperationError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PendingOperationErrorBuilder implements Builder<PendingOperationError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Plain text description of the error.</p>
     */

    public PendingOperationErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public PendingOperationErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public PendingOperationErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public PendingOperationError build() {
        Objects.requireNonNull(message, PendingOperationError.class + ": message is missing");
        Objects.requireNonNull(values, PendingOperationError.class + ": values are missing");
        return new PendingOperationErrorImpl(message, values);
    }

    /**
     * builds PendingOperationError without checking for non null required values
     */
    public PendingOperationError buildUnchecked() {
        return new PendingOperationErrorImpl(message, values);
    }

    public static PendingOperationErrorBuilder of() {
        return new PendingOperationErrorBuilder();
    }

    public static PendingOperationErrorBuilder of(final PendingOperationError template) {
        PendingOperationErrorBuilder builder = new PendingOperationErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
