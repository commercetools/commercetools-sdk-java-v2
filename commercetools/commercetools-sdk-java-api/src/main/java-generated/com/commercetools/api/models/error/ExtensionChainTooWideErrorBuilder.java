
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionChainTooWideErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionChainTooWideError extensionChainTooWideError = ExtensionChainTooWideError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionChainTooWideErrorBuilder implements Builder<ExtensionChainTooWideError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"Extension chain breadth exceeds the maximum allowed breadth of 5"</code></p>
     * @param message value to be set
     * @return Builder
     */

    public ExtensionChainTooWideErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public ExtensionChainTooWideErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public ExtensionChainTooWideErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p><code>"Extension chain breadth exceeds the maximum allowed breadth of 5"</code></p>
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
     * builds ExtensionChainTooWideError with checking for non-null required values
     * @return ExtensionChainTooWideError
     */
    public ExtensionChainTooWideError build() {
        Objects.requireNonNull(message, ExtensionChainTooWideError.class + ": message is missing");
        return new ExtensionChainTooWideErrorImpl(message, values);
    }

    /**
     * builds ExtensionChainTooWideError without checking for non-null required values
     * @return ExtensionChainTooWideError
     */
    public ExtensionChainTooWideError buildUnchecked() {
        return new ExtensionChainTooWideErrorImpl(message, values);
    }

    /**
     * factory method for an instance of ExtensionChainTooWideErrorBuilder
     * @return builder
     */
    public static ExtensionChainTooWideErrorBuilder of() {
        return new ExtensionChainTooWideErrorBuilder();
    }

    /**
     * create builder for ExtensionChainTooWideError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionChainTooWideErrorBuilder of(final ExtensionChainTooWideError template) {
        ExtensionChainTooWideErrorBuilder builder = new ExtensionChainTooWideErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
