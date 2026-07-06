
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CircularDependencyErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CircularDependencyError circularDependencyError = CircularDependencyError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CircularDependencyErrorBuilder implements Builder<CircularDependencyError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"Circular dependency detected: [ext-1, ext-2, ext-1]"</code></p>
     * @param message value to be set
     * @return Builder
     */

    public CircularDependencyErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public CircularDependencyErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public CircularDependencyErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p><code>"Circular dependency detected: [ext-1, ext-2, ext-1]"</code></p>
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
     * builds CircularDependencyError with checking for non-null required values
     * @return CircularDependencyError
     */
    public CircularDependencyError build() {
        Objects.requireNonNull(message, CircularDependencyError.class + ": message is missing");
        return new CircularDependencyErrorImpl(message, values);
    }

    /**
     * builds CircularDependencyError without checking for non-null required values
     * @return CircularDependencyError
     */
    public CircularDependencyError buildUnchecked() {
        return new CircularDependencyErrorImpl(message, values);
    }

    /**
     * factory method for an instance of CircularDependencyErrorBuilder
     * @return builder
     */
    public static CircularDependencyErrorBuilder of() {
        return new CircularDependencyErrorBuilder();
    }

    /**
     * create builder for CircularDependencyError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CircularDependencyErrorBuilder of(final CircularDependencyError template) {
        CircularDependencyErrorBuilder builder = new CircularDependencyErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
