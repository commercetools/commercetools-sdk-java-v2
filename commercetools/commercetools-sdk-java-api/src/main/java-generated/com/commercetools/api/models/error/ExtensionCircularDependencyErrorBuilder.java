
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionCircularDependencyErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionCircularDependencyError extensionCircularDependencyError = ExtensionCircularDependencyError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionCircularDependencyErrorBuilder implements Builder<ExtensionCircularDependencyError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"Circular dependency detected: [3fa85f64-5717-4562-b3fc-2c963f66afa6, 5e0e1e0b-1f4b-4b8b-9c1a-2d3f4a5b6c7d, 3fa85f64-5717-4562-b3fc-2c963f66afa6]"</code></p>
     * @param message value to be set
     * @return Builder
     */

    public ExtensionCircularDependencyErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public ExtensionCircularDependencyErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public ExtensionCircularDependencyErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p><code>"Circular dependency detected: [3fa85f64-5717-4562-b3fc-2c963f66afa6, 5e0e1e0b-1f4b-4b8b-9c1a-2d3f4a5b6c7d, 3fa85f64-5717-4562-b3fc-2c963f66afa6]"</code></p>
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
     * builds ExtensionCircularDependencyError with checking for non-null required values
     * @return ExtensionCircularDependencyError
     */
    public ExtensionCircularDependencyError build() {
        Objects.requireNonNull(message, ExtensionCircularDependencyError.class + ": message is missing");
        return new ExtensionCircularDependencyErrorImpl(message, values);
    }

    /**
     * builds ExtensionCircularDependencyError without checking for non-null required values
     * @return ExtensionCircularDependencyError
     */
    public ExtensionCircularDependencyError buildUnchecked() {
        return new ExtensionCircularDependencyErrorImpl(message, values);
    }

    /**
     * factory method for an instance of ExtensionCircularDependencyErrorBuilder
     * @return builder
     */
    public static ExtensionCircularDependencyErrorBuilder of() {
        return new ExtensionCircularDependencyErrorBuilder();
    }

    /**
     * create builder for ExtensionCircularDependencyError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionCircularDependencyErrorBuilder of(final ExtensionCircularDependencyError template) {
        ExtensionCircularDependencyErrorBuilder builder = new ExtensionCircularDependencyErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
