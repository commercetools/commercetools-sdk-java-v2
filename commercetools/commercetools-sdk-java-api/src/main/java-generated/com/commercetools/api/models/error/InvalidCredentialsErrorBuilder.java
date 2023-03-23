
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
     * @param message
     * @return Builder
     */

    public InvalidCredentialsErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public InvalidCredentialsErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public InvalidCredentialsErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public InvalidCredentialsError build() {
        Objects.requireNonNull(message, InvalidCredentialsError.class + ": message is missing");
        return new InvalidCredentialsErrorImpl(message, values);
    }

    /**
     * builds InvalidCredentialsError without checking for non null required values
     */
    public InvalidCredentialsError buildUnchecked() {
        return new InvalidCredentialsErrorImpl(message, values);
    }

    public static InvalidCredentialsErrorBuilder of() {
        return new InvalidCredentialsErrorBuilder();
    }

    public static InvalidCredentialsErrorBuilder of(final InvalidCredentialsError template) {
        InvalidCredentialsErrorBuilder builder = new InvalidCredentialsErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
