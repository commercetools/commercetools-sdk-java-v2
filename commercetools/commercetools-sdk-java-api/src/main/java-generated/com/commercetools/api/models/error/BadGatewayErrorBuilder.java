
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BadGatewayErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BadGatewayError badGatewayError = BadGatewayError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BadGatewayErrorBuilder implements Builder<BadGatewayError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Plain text description of the error.</p>
     */

    public BadGatewayErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public BadGatewayErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public BadGatewayErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public BadGatewayError build() {
        Objects.requireNonNull(message, BadGatewayError.class + ": message is missing");
        Objects.requireNonNull(values, BadGatewayError.class + ": values are missing");
        return new BadGatewayErrorImpl(message, values);
    }

    /**
     * builds BadGatewayError without checking for non null required values
     */
    public BadGatewayError buildUnchecked() {
        return new BadGatewayErrorImpl(message, values);
    }

    public static BadGatewayErrorBuilder of() {
        return new BadGatewayErrorBuilder();
    }

    public static BadGatewayErrorBuilder of(final BadGatewayError template) {
        BadGatewayErrorBuilder builder = new BadGatewayErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
