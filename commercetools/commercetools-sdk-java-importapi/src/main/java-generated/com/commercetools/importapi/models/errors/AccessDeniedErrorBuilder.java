
package com.commercetools.importapi.models.errors;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AccessDeniedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AccessDeniedError accessDeniedError = AccessDeniedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AccessDeniedErrorBuilder implements Builder<AccessDeniedError> {

    private String message;

    /**
     * set the value to the message
     * @param message value to be set
     * @return Builder
     */

    public AccessDeniedErrorBuilder message(final String message) {
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
     * builds AccessDeniedError with checking for non-null required values
     * @return AccessDeniedError
     */
    public AccessDeniedError build() {
        Objects.requireNonNull(message, AccessDeniedError.class + ": message is missing");
        return new AccessDeniedErrorImpl(message);
    }

    /**
     * builds AccessDeniedError without checking for non-null required values
     * @return AccessDeniedError
     */
    public AccessDeniedError buildUnchecked() {
        return new AccessDeniedErrorImpl(message);
    }

    /**
     * factory method for an instance of AccessDeniedErrorBuilder
     * @return builder
     */
    public static AccessDeniedErrorBuilder of() {
        return new AccessDeniedErrorBuilder();
    }

    /**
     * create builder for AccessDeniedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AccessDeniedErrorBuilder of(final AccessDeniedError template) {
        AccessDeniedErrorBuilder builder = new AccessDeniedErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
