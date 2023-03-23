
package com.commercetools.importapi.models.errors;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidScopeErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidScopeError invalidScopeError = InvalidScopeError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InvalidScopeErrorBuilder implements Builder<InvalidScopeError> {

    private String message;

    /**
     *
     * @param message
     * @return Builder
     */

    public InvalidScopeErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public InvalidScopeError build() {
        Objects.requireNonNull(message, InvalidScopeError.class + ": message is missing");
        return new InvalidScopeErrorImpl(message);
    }

    /**
     * builds InvalidScopeError without checking for non null required values
     */
    public InvalidScopeError buildUnchecked() {
        return new InvalidScopeErrorImpl(message);
    }

    public static InvalidScopeErrorBuilder of() {
        return new InvalidScopeErrorBuilder();
    }

    public static InvalidScopeErrorBuilder of(final InvalidScopeError template) {
        InvalidScopeErrorBuilder builder = new InvalidScopeErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
