
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderFailureErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderFailureError recurringOrderFailureError = RecurringOrderFailureError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderFailureErrorBuilder implements Builder<RecurringOrderFailureError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private java.lang.Object details;

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public RecurringOrderFailureErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public RecurringOrderFailureErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public RecurringOrderFailureErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Details about the error's cause and the entities involved.</p>
     * @param details value to be set
     * @return Builder
     */

    public RecurringOrderFailureErrorBuilder details(final java.lang.Object details) {
        this.details = details;
        return this;
    }

    /**
     *  <p>Plain text description of the error.</p>
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
     *  <p>Details about the error's cause and the entities involved.</p>
     * @return details
     */

    public java.lang.Object getDetails() {
        return this.details;
    }

    /**
     * builds RecurringOrderFailureError with checking for non-null required values
     * @return RecurringOrderFailureError
     */
    public RecurringOrderFailureError build() {
        Objects.requireNonNull(message, RecurringOrderFailureError.class + ": message is missing");
        Objects.requireNonNull(details, RecurringOrderFailureError.class + ": details is missing");
        return new RecurringOrderFailureErrorImpl(message, values, details);
    }

    /**
     * builds RecurringOrderFailureError without checking for non-null required values
     * @return RecurringOrderFailureError
     */
    public RecurringOrderFailureError buildUnchecked() {
        return new RecurringOrderFailureErrorImpl(message, values, details);
    }

    /**
     * factory method for an instance of RecurringOrderFailureErrorBuilder
     * @return builder
     */
    public static RecurringOrderFailureErrorBuilder of() {
        return new RecurringOrderFailureErrorBuilder();
    }

    /**
     * create builder for RecurringOrderFailureError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderFailureErrorBuilder of(final RecurringOrderFailureError template) {
        RecurringOrderFailureErrorBuilder builder = new RecurringOrderFailureErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.details = template.getDetails();
        return builder;
    }

}
