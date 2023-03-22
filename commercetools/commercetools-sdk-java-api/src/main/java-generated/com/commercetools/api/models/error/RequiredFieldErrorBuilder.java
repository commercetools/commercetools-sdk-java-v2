
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RequiredFieldErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RequiredFieldError requiredFieldError = RequiredFieldError.builder()
 *             .message("{message}")
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RequiredFieldErrorBuilder implements Builder<RequiredFieldError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String field;

    /**
     *  <p><code>"A value is required for field $field."</code></p>
     * @param message
     * @return Builder
     */

    public RequiredFieldErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public RequiredFieldErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public RequiredFieldErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Name of the field missing the value.</p>
     * @param field
     * @return Builder
     */

    public RequiredFieldErrorBuilder field(final String field) {
        this.field = field;
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

    public RequiredFieldError build() {
        Objects.requireNonNull(message, RequiredFieldError.class + ": message is missing");
        Objects.requireNonNull(field, RequiredFieldError.class + ": field is missing");
        return new RequiredFieldErrorImpl(message, values, field);
    }

    /**
     * builds RequiredFieldError without checking for non null required values
     */
    public RequiredFieldError buildUnchecked() {
        return new RequiredFieldErrorImpl(message, values, field);
    }

    public static RequiredFieldErrorBuilder of() {
        return new RequiredFieldErrorBuilder();
    }

    public static RequiredFieldErrorBuilder of(final RequiredFieldError template) {
        RequiredFieldErrorBuilder builder = new RequiredFieldErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.field = template.getField();
        return builder;
    }

}
