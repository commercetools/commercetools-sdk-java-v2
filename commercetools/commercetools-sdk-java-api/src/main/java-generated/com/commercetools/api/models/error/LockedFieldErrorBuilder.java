
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LockedFieldErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LockedFieldError lockedFieldError = LockedFieldError.builder()
 *             .message("{message}")
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LockedFieldErrorBuilder implements Builder<LockedFieldError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String field;

    /**
     *  <p><code>"'$field' is locked by another request. Please try again later."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public LockedFieldErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public LockedFieldErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public LockedFieldErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Field that is currently locked.</p>
     * @param field value to be set
     * @return Builder
     */

    public LockedFieldErrorBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     *  <p><code>"'$field' is locked by another request. Please try again later."</code></p>
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
     *  <p>Field that is currently locked.</p>
     * @return field
     */

    public String getField() {
        return this.field;
    }

    /**
     * builds LockedFieldError with checking for non-null required values
     * @return LockedFieldError
     */
    public LockedFieldError build() {
        Objects.requireNonNull(message, LockedFieldError.class + ": message is missing");
        Objects.requireNonNull(field, LockedFieldError.class + ": field is missing");
        return new LockedFieldErrorImpl(message, values, field);
    }

    /**
     * builds LockedFieldError without checking for non-null required values
     * @return LockedFieldError
     */
    public LockedFieldError buildUnchecked() {
        return new LockedFieldErrorImpl(message, values, field);
    }

    /**
     * factory method for an instance of LockedFieldErrorBuilder
     * @return builder
     */
    public static LockedFieldErrorBuilder of() {
        return new LockedFieldErrorBuilder();
    }

    /**
     * create builder for LockedFieldError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LockedFieldErrorBuilder of(final LockedFieldError template) {
        LockedFieldErrorBuilder builder = new LockedFieldErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.field = template.getField();
        return builder;
    }

}
