
package com.commercetools.checkout.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SyntaxErrorErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SyntaxErrorError syntaxErrorError = SyntaxErrorError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SyntaxErrorErrorBuilder implements Builder<SyntaxErrorError> {

    private String message;

    /**
     *  <p><code>"Syntax error while parsing $fieldDefinition."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public SyntaxErrorErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p><code>"Syntax error while parsing $fieldDefinition."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * builds SyntaxErrorError with checking for non-null required values
     * @return SyntaxErrorError
     */
    public SyntaxErrorError build() {
        Objects.requireNonNull(message, SyntaxErrorError.class + ": message is missing");
        return new SyntaxErrorErrorImpl(message);
    }

    /**
     * builds SyntaxErrorError without checking for non-null required values
     * @return SyntaxErrorError
     */
    public SyntaxErrorError buildUnchecked() {
        return new SyntaxErrorErrorImpl(message);
    }

    /**
     * factory method for an instance of SyntaxErrorErrorBuilder
     * @return builder
     */
    public static SyntaxErrorErrorBuilder of() {
        return new SyntaxErrorErrorBuilder();
    }

    /**
     * create builder for SyntaxErrorError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SyntaxErrorErrorBuilder of(final SyntaxErrorError template) {
        SyntaxErrorErrorBuilder builder = new SyntaxErrorErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
