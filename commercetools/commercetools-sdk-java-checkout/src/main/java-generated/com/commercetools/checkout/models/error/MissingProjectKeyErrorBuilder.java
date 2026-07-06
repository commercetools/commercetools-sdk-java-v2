
package com.commercetools.checkout.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MissingProjectKeyErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MissingProjectKeyError missingProjectKeyError = MissingProjectKeyError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MissingProjectKeyErrorBuilder implements Builder<MissingProjectKeyError> {

    private String message;

    /**
     *  <p><code>"Missing project key in the request path."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public MissingProjectKeyErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p><code>"Missing project key in the request path."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * builds MissingProjectKeyError with checking for non-null required values
     * @return MissingProjectKeyError
     */
    public MissingProjectKeyError build() {
        Objects.requireNonNull(message, MissingProjectKeyError.class + ": message is missing");
        return new MissingProjectKeyErrorImpl(message);
    }

    /**
     * builds MissingProjectKeyError without checking for non-null required values
     * @return MissingProjectKeyError
     */
    public MissingProjectKeyError buildUnchecked() {
        return new MissingProjectKeyErrorImpl(message);
    }

    /**
     * factory method for an instance of MissingProjectKeyErrorBuilder
     * @return builder
     */
    public static MissingProjectKeyErrorBuilder of() {
        return new MissingProjectKeyErrorBuilder();
    }

    /**
     * create builder for MissingProjectKeyError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MissingProjectKeyErrorBuilder of(final MissingProjectKeyError template) {
        MissingProjectKeyErrorBuilder builder = new MissingProjectKeyErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
