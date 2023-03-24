
package com.commercetools.importapi.models.errors;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InsufficientScopeErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InsufficientScopeError insufficientScopeError = InsufficientScopeError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InsufficientScopeErrorBuilder implements Builder<InsufficientScopeError> {

    private String message;

    /**
     *
     * @param message value to be set
     * @return Builder
     */

    public InsufficientScopeErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    /**
     * builds InsufficientScopeError with checking for non-null required values
     * @return InsufficientScopeError
     */
    public InsufficientScopeError build() {
        Objects.requireNonNull(message, InsufficientScopeError.class + ": message is missing");
        return new InsufficientScopeErrorImpl(message);
    }

    /**
     * builds InsufficientScopeError without checking for non-null required values
     * @return InsufficientScopeError
     */
    public InsufficientScopeError buildUnchecked() {
        return new InsufficientScopeErrorImpl(message);
    }

    public static InsufficientScopeErrorBuilder of() {
        return new InsufficientScopeErrorBuilder();
    }

    public static InsufficientScopeErrorBuilder of(final InsufficientScopeError template) {
        InsufficientScopeErrorBuilder builder = new InsufficientScopeErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
