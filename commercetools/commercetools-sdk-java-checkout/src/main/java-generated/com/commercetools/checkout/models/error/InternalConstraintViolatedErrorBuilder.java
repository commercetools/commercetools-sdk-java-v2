
package com.commercetools.checkout.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InternalConstraintViolatedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InternalConstraintViolatedError internalConstraintViolatedError = InternalConstraintViolatedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InternalConstraintViolatedErrorBuilder implements Builder<InternalConstraintViolatedError> {

    private String message;

    /**
     *  <p>Description of the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public InternalConstraintViolatedErrorBuilder message(final String message) {
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
     * builds InternalConstraintViolatedError with checking for non-null required values
     * @return InternalConstraintViolatedError
     */
    public InternalConstraintViolatedError build() {
        Objects.requireNonNull(message, InternalConstraintViolatedError.class + ": message is missing");
        return new InternalConstraintViolatedErrorImpl(message);
    }

    /**
     * builds InternalConstraintViolatedError without checking for non-null required values
     * @return InternalConstraintViolatedError
     */
    public InternalConstraintViolatedError buildUnchecked() {
        return new InternalConstraintViolatedErrorImpl(message);
    }

    /**
     * factory method for an instance of InternalConstraintViolatedErrorBuilder
     * @return builder
     */
    public static InternalConstraintViolatedErrorBuilder of() {
        return new InternalConstraintViolatedErrorBuilder();
    }

    /**
     * create builder for InternalConstraintViolatedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InternalConstraintViolatedErrorBuilder of(final InternalConstraintViolatedError template) {
        InternalConstraintViolatedErrorBuilder builder = new InternalConstraintViolatedErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
