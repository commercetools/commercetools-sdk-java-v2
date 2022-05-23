
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidJsonInputErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidJsonInputError invalidJsonInputError = InvalidJsonInputError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InvalidJsonInputErrorBuilder implements Builder<InvalidJsonInputError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     <>
     */

    public InvalidJsonInputErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     <>
     */

    public InvalidJsonInputErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     <>
     */

    public InvalidJsonInputErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public InvalidJsonInputError build() {
        Objects.requireNonNull(message, InvalidJsonInputError.class + ": message is missing");
        Objects.requireNonNull(values, InvalidJsonInputError.class + ": values are missing");
        return new InvalidJsonInputErrorImpl(message, values);
    }

    /**
     * builds InvalidJsonInputError without checking for non null required values
     */
    public InvalidJsonInputError buildUnchecked() {
        return new InvalidJsonInputErrorImpl(message, values);
    }

    public static InvalidJsonInputErrorBuilder of() {
        return new InvalidJsonInputErrorBuilder();
    }

    public static InvalidJsonInputErrorBuilder of(final InvalidJsonInputError template) {
        InvalidJsonInputErrorBuilder builder = new InvalidJsonInputErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
