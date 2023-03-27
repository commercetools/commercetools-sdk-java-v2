
package com.commercetools.importapi.models.errors;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidTokenErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidTokenError invalidTokenError = InvalidTokenError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InvalidTokenErrorBuilder implements Builder<InvalidTokenError> {

    private String message;

    /**
     * set the value to the message
     * @param message value to be set
     * @return Builder
     */

    public InvalidTokenErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     * value of message}
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * builds InvalidTokenError with checking for non-null required values
     * @return InvalidTokenError
     */
    public InvalidTokenError build() {
        Objects.requireNonNull(message, InvalidTokenError.class + ": message is missing");
        return new InvalidTokenErrorImpl(message);
    }

    /**
     * builds InvalidTokenError without checking for non-null required values
     * @return InvalidTokenError
     */
    public InvalidTokenError buildUnchecked() {
        return new InvalidTokenErrorImpl(message);
    }

    /**
     * factory method for an instance of InvalidTokenErrorBuilder
     * @return builder
     */
    public static InvalidTokenErrorBuilder of() {
        return new InvalidTokenErrorBuilder();
    }

    /**
     * create builder for InvalidTokenError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidTokenErrorBuilder of(final InvalidTokenError template) {
        InvalidTokenErrorBuilder builder = new InvalidTokenErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
