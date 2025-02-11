
package com.commercetools.importapi.models.errors;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GenericErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GenericError genericError = GenericError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GenericErrorBuilder implements Builder<GenericError> {

    private String message;

    /**
     *  <p>A plain language description of the cause of an error.</p>
     * @param message value to be set
     * @return Builder
     */

    public GenericErrorBuilder message(final String message) {
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
     * builds GenericError with checking for non-null required values
     * @return GenericError
     */
    public GenericError build() {
        Objects.requireNonNull(message, GenericError.class + ": message is missing");
        return new GenericErrorImpl(message);
    }

    /**
     * builds GenericError without checking for non-null required values
     * @return GenericError
     */
    public GenericError buildUnchecked() {
        return new GenericErrorImpl(message);
    }

    /**
     * factory method for an instance of GenericErrorBuilder
     * @return builder
     */
    public static GenericErrorBuilder of() {
        return new GenericErrorBuilder();
    }

    /**
     * create builder for GenericError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GenericErrorBuilder of(final GenericError template) {
        GenericErrorBuilder builder = new GenericErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
