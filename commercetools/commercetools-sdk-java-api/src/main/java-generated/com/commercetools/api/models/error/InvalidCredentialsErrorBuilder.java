
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidCredentialsErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidCredentialsError invalidCredentialsError = InvalidCredentialsError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InvalidCredentialsErrorBuilder implements Builder<InvalidCredentialsError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"Account with the given credentials not found."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public InvalidCredentialsErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public InvalidCredentialsErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public InvalidCredentialsErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p><code>"Account with the given credentials not found."</code></p>
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
     * builds InvalidCredentialsError with checking for non-null required values
     * @return InvalidCredentialsError
     */
    public InvalidCredentialsError build() {
        Objects.requireNonNull(message, InvalidCredentialsError.class + ": message is missing");
        return new InvalidCredentialsErrorImpl(message, values);
    }

    /**
     * builds InvalidCredentialsError without checking for non-null required values
     * @return InvalidCredentialsError
     */
    public InvalidCredentialsError buildUnchecked() {
        return new InvalidCredentialsErrorImpl(message, values);
    }

    /**
     * factory method for an instance of InvalidCredentialsErrorBuilder
     * @return builder
     */
    public static InvalidCredentialsErrorBuilder of() {
        return new InvalidCredentialsErrorBuilder();
    }

    /**
     * create builder for InvalidCredentialsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidCredentialsErrorBuilder of(final InvalidCredentialsError template) {
        InvalidCredentialsErrorBuilder builder = new InvalidCredentialsErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
