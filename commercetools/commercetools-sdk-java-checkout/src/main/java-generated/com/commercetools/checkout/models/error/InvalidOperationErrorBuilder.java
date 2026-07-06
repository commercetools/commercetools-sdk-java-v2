
package com.commercetools.checkout.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidOperationErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidOperationError invalidOperationError = InvalidOperationError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InvalidOperationErrorBuilder implements Builder<InvalidOperationError> {

    private String message;

    /**
     *  <p>Description of the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public InvalidOperationErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Description of the error.</p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * builds InvalidOperationError with checking for non-null required values
     * @return InvalidOperationError
     */
    public InvalidOperationError build() {
        Objects.requireNonNull(message, InvalidOperationError.class + ": message is missing");
        return new InvalidOperationErrorImpl(message);
    }

    /**
     * builds InvalidOperationError without checking for non-null required values
     * @return InvalidOperationError
     */
    public InvalidOperationError buildUnchecked() {
        return new InvalidOperationErrorImpl(message);
    }

    /**
     * factory method for an instance of InvalidOperationErrorBuilder
     * @return builder
     */
    public static InvalidOperationErrorBuilder of() {
        return new InvalidOperationErrorBuilder();
    }

    /**
     * create builder for InvalidOperationError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidOperationErrorBuilder of(final InvalidOperationError template) {
        InvalidOperationErrorBuilder builder = new InvalidOperationErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
