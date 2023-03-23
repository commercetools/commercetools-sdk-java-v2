
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
     * @param message
     * @return Builder
     */

    public ExternalOAuthFailedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public ExternalOAuthFailedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public ExternalOAuthFailedErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public ExternalOAuthFailedError build() {
        Objects.requireNonNull(message, ExternalOAuthFailedError.class + ": message is missing");
        return new ExternalOAuthFailedErrorImpl(message, values);
    }

    /**
     * builds ExternalOAuthFailedError without checking for non null required values
     */
    public ExternalOAuthFailedError buildUnchecked() {
        return new ExternalOAuthFailedErrorImpl(message, values);
    }

    public static ExternalOAuthFailedErrorBuilder of() {
        return new ExternalOAuthFailedErrorBuilder();
    }

    public static ExternalOAuthFailedErrorBuilder of(final ExternalOAuthFailedError template) {
        ExternalOAuthFailedErrorBuilder builder = new ExternalOAuthFailedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
