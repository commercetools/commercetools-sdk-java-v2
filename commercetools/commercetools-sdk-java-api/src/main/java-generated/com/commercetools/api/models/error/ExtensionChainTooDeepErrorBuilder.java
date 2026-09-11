
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionChainTooDeepErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionChainTooDeepError extensionChainTooDeepError = ExtensionChainTooDeepError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionChainTooDeepErrorBuilder implements Builder<ExtensionChainTooDeepError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"The dependency chain depth 4 exceeds the maximum allowed depth of 3"</code></p>
     * @param message value to be set
     * @return Builder
     */

    public ExtensionChainTooDeepErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public ExtensionChainTooDeepErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public ExtensionChainTooDeepErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p><code>"The dependency chain depth 4 exceeds the maximum allowed depth of 3"</code></p>
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
     * builds ExtensionChainTooDeepError with checking for non-null required values
     * @return ExtensionChainTooDeepError
     */
    public ExtensionChainTooDeepError build() {
        Objects.requireNonNull(message, ExtensionChainTooDeepError.class + ": message is missing");
        return new ExtensionChainTooDeepErrorImpl(message, values);
    }

    /**
     * builds ExtensionChainTooDeepError without checking for non-null required values
     * @return ExtensionChainTooDeepError
     */
    public ExtensionChainTooDeepError buildUnchecked() {
        return new ExtensionChainTooDeepErrorImpl(message, values);
    }

    /**
     * factory method for an instance of ExtensionChainTooDeepErrorBuilder
     * @return builder
     */
    public static ExtensionChainTooDeepErrorBuilder of() {
        return new ExtensionChainTooDeepErrorBuilder();
    }

    /**
     * create builder for ExtensionChainTooDeepError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionChainTooDeepErrorBuilder of(final ExtensionChainTooDeepError template) {
        ExtensionChainTooDeepErrorBuilder builder = new ExtensionChainTooDeepErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
