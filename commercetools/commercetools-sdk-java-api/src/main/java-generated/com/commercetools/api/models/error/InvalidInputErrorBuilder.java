
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
     */

    public InvalidInputErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public InvalidInputErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public InvalidInputErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public InvalidInputError build() {
        Objects.requireNonNull(message, InvalidInputError.class + ": message is missing");
        Objects.requireNonNull(values, InvalidInputError.class + ": values are missing");
        return new InvalidInputErrorImpl(message, values);
    }

    /**
     * builds InvalidInputError without checking for non null required values
     */
    public InvalidInputError buildUnchecked() {
        return new InvalidInputErrorImpl(message, values);
    }

    public static InvalidInputErrorBuilder of() {
        return new InvalidInputErrorBuilder();
    }

    public static InvalidInputErrorBuilder of(final InvalidInputError template) {
        InvalidInputErrorBuilder builder = new InvalidInputErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
