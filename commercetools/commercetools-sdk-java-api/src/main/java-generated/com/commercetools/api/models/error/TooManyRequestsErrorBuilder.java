
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TooManyRequestsErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TooManyRequestsError tooManyRequestsError = TooManyRequestsError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TooManyRequestsErrorBuilder implements Builder<TooManyRequestsError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"Too many requests. Please try again later."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public TooManyRequestsErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public TooManyRequestsErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public TooManyRequestsErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p><code>"Too many requests. Please try again later."</code></p>
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
     * builds TooManyRequestsError with checking for non-null required values
     * @return TooManyRequestsError
     */
    public TooManyRequestsError build() {
        Objects.requireNonNull(message, TooManyRequestsError.class + ": message is missing");
        return new TooManyRequestsErrorImpl(message, values);
    }

    /**
     * builds TooManyRequestsError without checking for non-null required values
     * @return TooManyRequestsError
     */
    public TooManyRequestsError buildUnchecked() {
        return new TooManyRequestsErrorImpl(message, values);
    }

    /**
     * factory method for an instance of TooManyRequestsErrorBuilder
     * @return builder
     */
    public static TooManyRequestsErrorBuilder of() {
        return new TooManyRequestsErrorBuilder();
    }

    /**
     * create builder for TooManyRequestsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TooManyRequestsErrorBuilder of(final TooManyRequestsError template) {
        TooManyRequestsErrorBuilder builder = new TooManyRequestsErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
