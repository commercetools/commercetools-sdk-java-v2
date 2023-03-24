
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidFieldErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidFieldError invalidFieldError = InvalidFieldError.builder()
 *             .message("{message}")
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InvalidFieldErrorBuilder implements Builder<InvalidFieldError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String field;

    private java.lang.Object invalidValue;

    @Nullable
    private java.util.List<java.lang.Object> allowedValues;

    /**
     *  <p><code>"The value $invalidValue is not valid for field $field."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public InvalidFieldErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public InvalidFieldErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public InvalidFieldErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Name of the field with the invalid value.</p>
     * @param field value to be set
     * @return Builder
     */

    public InvalidFieldErrorBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     *  <p>Value invalid for the field.</p>
     * @param invalidValue value to be set
     * @return Builder
     */

    public InvalidFieldErrorBuilder invalidValue(final java.lang.Object invalidValue) {
        this.invalidValue = invalidValue;
        return this;
    }

    /**
     *  <p>Fixed set of allowed values for the field, if any.</p>
     * @param allowedValues value to be set
     * @return Builder
     */

    public InvalidFieldErrorBuilder allowedValues(@Nullable final java.lang.Object... allowedValues) {
        this.allowedValues = new ArrayList<>(Arrays.asList(allowedValues));
        return this;
    }

    /**
     *  <p>Fixed set of allowed values for the field, if any.</p>
     * @param allowedValues value to be set
     * @return Builder
     */

    public InvalidFieldErrorBuilder allowedValues(@Nullable final java.util.List<java.lang.Object> allowedValues) {
        this.allowedValues = allowedValues;
        return this;
    }

    /**
     *  <p>Fixed set of allowed values for the field, if any.</p>
     * @param allowedValues value to be set
     * @return Builder
     */

    public InvalidFieldErrorBuilder plusAllowedValues(@Nullable final java.lang.Object... allowedValues) {
        if (this.allowedValues == null) {
            this.allowedValues = new ArrayList<>();
        }
        this.allowedValues.addAll(Arrays.asList(allowedValues));
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

    public java.lang.Object getInvalidValue() {
        return this.invalidValue;
    }

    @Nullable
    public java.util.List<java.lang.Object> getAllowedValues() {
        return this.allowedValues;
    }

    /**
     * builds InvalidFieldError with checking for non-null required values
     * @return InvalidFieldError
     */
    public InvalidFieldError build() {
        Objects.requireNonNull(message, InvalidFieldError.class + ": message is missing");
        Objects.requireNonNull(field, InvalidFieldError.class + ": field is missing");
        Objects.requireNonNull(invalidValue, InvalidFieldError.class + ": invalidValue is missing");
        return new InvalidFieldErrorImpl(message, values, field, invalidValue, allowedValues);
    }

    /**
     * builds InvalidFieldError without checking for non-null required values
     * @return InvalidFieldError
     */
    public InvalidFieldError buildUnchecked() {
        return new InvalidFieldErrorImpl(message, values, field, invalidValue, allowedValues);
    }

    public static InvalidFieldErrorBuilder of() {
        return new InvalidFieldErrorBuilder();
    }

    public static InvalidFieldErrorBuilder of(final InvalidFieldError template) {
        InvalidFieldErrorBuilder builder = new InvalidFieldErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.field = template.getField();
        builder.invalidValue = template.getInvalidValue();
        builder.allowedValues = template.getAllowedValues();
        return builder;
    }

}
