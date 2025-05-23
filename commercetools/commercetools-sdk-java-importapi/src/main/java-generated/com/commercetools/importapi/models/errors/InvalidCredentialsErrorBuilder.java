
package com.commercetools.importapi.models.errors;

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

    /**
     *  <p>A plain language description of the cause of an error.</p>
     * @param message value to be set
     * @return Builder
     */

    public InvalidCredentialsErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>A plain language description of the cause of an error.</p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * builds InvalidCredentialsError with checking for non-null required values
     * @return InvalidCredentialsError
     */
    public InvalidCredentialsError build() {
        Objects.requireNonNull(message, InvalidCredentialsError.class + ": message is missing");
        return new InvalidCredentialsErrorImpl(message);
    }

    /**
     * builds InvalidCredentialsError without checking for non-null required values
     * @return InvalidCredentialsError
     */
    public InvalidCredentialsError buildUnchecked() {
        return new InvalidCredentialsErrorImpl(message);
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
        return builder;
    }

}
