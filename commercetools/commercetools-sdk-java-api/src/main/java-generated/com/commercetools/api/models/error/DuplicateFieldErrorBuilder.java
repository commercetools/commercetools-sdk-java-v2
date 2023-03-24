
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DuplicateFieldErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DuplicateFieldError duplicateFieldError = DuplicateFieldError.builder()
 *             .message("{message}")
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DuplicateFieldErrorBuilder implements Builder<DuplicateFieldError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String field;

    private java.lang.Object duplicateValue;

    /**
     *  <p><code>"A duplicate value $duplicateValue exists for field $field."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public DuplicateFieldErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public DuplicateFieldErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public DuplicateFieldErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Name of the conflicting field.</p>
     * @param field value to be set
     * @return Builder
     */

    public DuplicateFieldErrorBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     *  <p>Conflicting duplicate value.</p>
     * @param duplicateValue value to be set
     * @return Builder
     */

    public DuplicateFieldErrorBuilder duplicateValue(final java.lang.Object duplicateValue) {
        this.duplicateValue = duplicateValue;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public String getField() {
        return this.field;
    }

    public java.lang.Object getDuplicateValue() {
        return this.duplicateValue;
    }

    /**
     * builds DuplicateFieldError with checking for non-null required values
     * @return DuplicateFieldError
     */
    public DuplicateFieldError build() {
        Objects.requireNonNull(message, DuplicateFieldError.class + ": message is missing");
        Objects.requireNonNull(field, DuplicateFieldError.class + ": field is missing");
        Objects.requireNonNull(duplicateValue, DuplicateFieldError.class + ": duplicateValue is missing");
        return new DuplicateFieldErrorImpl(message, values, field, duplicateValue);
    }

    /**
     * builds DuplicateFieldError without checking for non-null required values
     * @return DuplicateFieldError
     */
    public DuplicateFieldError buildUnchecked() {
        return new DuplicateFieldErrorImpl(message, values, field, duplicateValue);
    }

    public static DuplicateFieldErrorBuilder of() {
        return new DuplicateFieldErrorBuilder();
    }

    public static DuplicateFieldErrorBuilder of(final DuplicateFieldError template) {
        DuplicateFieldErrorBuilder builder = new DuplicateFieldErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.field = template.getField();
        builder.duplicateValue = template.getDuplicateValue();
        return builder;
    }

}
