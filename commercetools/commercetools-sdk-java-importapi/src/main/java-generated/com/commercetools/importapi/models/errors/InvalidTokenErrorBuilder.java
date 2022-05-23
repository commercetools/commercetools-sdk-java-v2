
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
     <>
     */

    public InvalidTokenErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public InvalidTokenError build() {
        Objects.requireNonNull(message, InvalidTokenError.class + ": message is missing");
        return new InvalidTokenErrorImpl(message);
    }

    /**
     * builds InvalidTokenError without checking for non null required values
     */
    public InvalidTokenError buildUnchecked() {
        return new InvalidTokenErrorImpl(message);
    }

    public static InvalidTokenErrorBuilder of() {
        return new InvalidTokenErrorBuilder();
    }

    public static InvalidTokenErrorBuilder of(final InvalidTokenError template) {
        InvalidTokenErrorBuilder builder = new InvalidTokenErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
