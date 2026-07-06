
package com.commercetools.checkout.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GeneralErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GeneralError generalError = GeneralError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GeneralErrorBuilder implements Builder<GeneralError> {

    private String message;

    /**
     *  <p>Description about any known details of the problem, for example, <code>"Write operations are temporarily unavailable"</code>.</p>
     * @param message value to be set
     * @return Builder
     */

    public GeneralErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Description about any known details of the problem, for example, <code>"Write operations are temporarily unavailable"</code>.</p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * builds GeneralError with checking for non-null required values
     * @return GeneralError
     */
    public GeneralError build() {
        Objects.requireNonNull(message, GeneralError.class + ": message is missing");
        return new GeneralErrorImpl(message);
    }

    /**
     * builds GeneralError without checking for non-null required values
     * @return GeneralError
     */
    public GeneralError buildUnchecked() {
        return new GeneralErrorImpl(message);
    }

    /**
     * factory method for an instance of GeneralErrorBuilder
     * @return builder
     */
    public static GeneralErrorBuilder of() {
        return new GeneralErrorBuilder();
    }

    /**
     * create builder for GeneralError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GeneralErrorBuilder of(final GeneralError template) {
        GeneralErrorBuilder builder = new GeneralErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
