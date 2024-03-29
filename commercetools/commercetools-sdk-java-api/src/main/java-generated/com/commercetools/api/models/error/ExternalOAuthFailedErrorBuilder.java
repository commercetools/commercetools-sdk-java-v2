
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExternalOAuthFailedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExternalOAuthFailedError externalOAuthFailedError = ExternalOAuthFailedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExternalOAuthFailedErrorBuilder implements Builder<ExternalOAuthFailedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Plain text description detailing the external OAuth error. For example, <code>"External OAuth did not respond in time."</code>.</p>
     * @param message value to be set
     * @return Builder
     */

    public ExternalOAuthFailedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public ExternalOAuthFailedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public ExternalOAuthFailedErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Plain text description detailing the external OAuth error. For example, <code>"External OAuth did not respond in time."</code>.</p>
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
     * builds ExternalOAuthFailedError with checking for non-null required values
     * @return ExternalOAuthFailedError
     */
    public ExternalOAuthFailedError build() {
        Objects.requireNonNull(message, ExternalOAuthFailedError.class + ": message is missing");
        return new ExternalOAuthFailedErrorImpl(message, values);
    }

    /**
     * builds ExternalOAuthFailedError without checking for non-null required values
     * @return ExternalOAuthFailedError
     */
    public ExternalOAuthFailedError buildUnchecked() {
        return new ExternalOAuthFailedErrorImpl(message, values);
    }

    /**
     * factory method for an instance of ExternalOAuthFailedErrorBuilder
     * @return builder
     */
    public static ExternalOAuthFailedErrorBuilder of() {
        return new ExternalOAuthFailedErrorBuilder();
    }

    /**
     * create builder for ExternalOAuthFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExternalOAuthFailedErrorBuilder of(final ExternalOAuthFailedError template) {
        ExternalOAuthFailedErrorBuilder builder = new ExternalOAuthFailedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
