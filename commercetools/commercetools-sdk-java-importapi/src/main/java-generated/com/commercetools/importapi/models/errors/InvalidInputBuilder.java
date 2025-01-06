
package com.commercetools.importapi.models.errors;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidInputBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidInput invalidInput = InvalidInput.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InvalidInputBuilder implements Builder<InvalidInput> {

    private String message;

    /**
     *  <p>A plain language description of the cause of an error.</p>
     * @param message value to be set
     * @return Builder
     */

    public InvalidInputBuilder message(final String message) {
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
     * builds InvalidInput with checking for non-null required values
     * @return InvalidInput
     */
    public InvalidInput build() {
        Objects.requireNonNull(message, InvalidInput.class + ": message is missing");
        return new InvalidInputImpl(message);
    }

    /**
     * builds InvalidInput without checking for non-null required values
     * @return InvalidInput
     */
    public InvalidInput buildUnchecked() {
        return new InvalidInputImpl(message);
    }

    /**
     * factory method for an instance of InvalidInputBuilder
     * @return builder
     */
    public static InvalidInputBuilder of() {
        return new InvalidInputBuilder();
    }

    /**
     * create builder for InvalidInput instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidInputBuilder of(final InvalidInput template) {
        InvalidInputBuilder builder = new InvalidInputBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
