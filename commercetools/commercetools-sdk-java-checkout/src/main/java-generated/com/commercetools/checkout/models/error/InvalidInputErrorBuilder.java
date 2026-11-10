
package com.commercetools.checkout.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidInputErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidInputError invalidInputError = InvalidInputError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InvalidInputErrorBuilder implements Builder<InvalidInputError> {

    private String message;

    /**
     *  <p>Description of the invalid input error.</p>
     * @param message value to be set
     * @return Builder
     */

    public InvalidInputErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Description of the invalid input error.</p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * builds InvalidInputError with checking for non-null required values
     * @return InvalidInputError
     */
    public InvalidInputError build() {
        Objects.requireNonNull(message, InvalidInputError.class + ": message is missing");
        return new InvalidInputErrorImpl(message);
    }

    /**
     * builds InvalidInputError without checking for non-null required values
     * @return InvalidInputError
     */
    public InvalidInputError buildUnchecked() {
        return new InvalidInputErrorImpl(message);
    }

    /**
     * factory method for an instance of InvalidInputErrorBuilder
     * @return builder
     */
    public static InvalidInputErrorBuilder of() {
        return new InvalidInputErrorBuilder();
    }

    /**
     * create builder for InvalidInputError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidInputErrorBuilder of(final InvalidInputError template) {
        InvalidInputErrorBuilder builder = new InvalidInputErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
