
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
     * @param message value to be set
     * @return Builder
     */

    public BadGatewayErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public BadGatewayErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
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

    /**
     * builds BadGatewayError with checking for non-null required values
     * @return BadGatewayError
     */
    public BadGatewayError build() {
        Objects.requireNonNull(message, BadGatewayError.class + ": message is missing");
        return new BadGatewayErrorImpl(message, values);
    }

    /**
     * builds BadGatewayError without checking for non-null required values
     * @return BadGatewayError
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
