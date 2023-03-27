
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidInputErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidInputError invalidInputError = InvalidInputError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InvalidInputErrorBuilder implements Builder<InvalidInputError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Description of the constraints that are not met by the request. For example, <code>"Invalid $propertyName. It may be a non-empty string up to $maxLength"</code>.</p>
     * @param message value to be set
     * @return Builder
     */

    public InvalidInputErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public InvalidInputErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public InvalidInputErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Description of the constraints that are not met by the request. For example, <code>"Invalid $propertyName. It may be a non-empty string up to $maxLength"</code>.</p>
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
     * builds InvalidInputError with checking for non-null required values
     * @return InvalidInputError
     */
    public InvalidInputError build() {
        Objects.requireNonNull(message, InvalidInputError.class + ": message is missing");
        return new InvalidInputErrorImpl(message, values);
    }

    /**
     * builds InvalidInputError without checking for non-null required values
     * @return InvalidInputError
     */
    public InvalidInputError buildUnchecked() {
        return new InvalidInputErrorImpl(message, values);
    }

    /**
     * factory method for an instance of InvalidInputErrorBuilder
     * @return builder
     */
    public static InvalidInputErrorBuilder of() {
        return new InvalidInputErrorBuilder();
    }

    /**
     * create builder for InvalidInputError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidInputErrorBuilder of(final InvalidInputError template) {
        InvalidInputErrorBuilder builder = new InvalidInputErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
