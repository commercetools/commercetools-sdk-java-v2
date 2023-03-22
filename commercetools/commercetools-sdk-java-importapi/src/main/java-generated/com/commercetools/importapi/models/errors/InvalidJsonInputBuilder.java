
package com.commercetools.importapi.models.errors;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidJsonInputBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidJsonInput invalidJsonInput = InvalidJsonInput.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InvalidJsonInputBuilder implements Builder<InvalidJsonInput> {

    private String message;

    /**
     *
     * @param message
     * @return Builder
     */

    public InvalidJsonInputBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public InvalidJsonInput build() {
        Objects.requireNonNull(message, InvalidJsonInput.class + ": message is missing");
        return new InvalidJsonInputImpl(message);
    }

    /**
     * builds InvalidJsonInput without checking for non null required values
     */
    public InvalidJsonInput buildUnchecked() {
        return new InvalidJsonInputImpl(message);
    }

    public static InvalidJsonInputBuilder of() {
        return new InvalidJsonInputBuilder();
    }

    public static InvalidJsonInputBuilder of(final InvalidJsonInput template) {
        InvalidJsonInputBuilder builder = new InvalidJsonInputBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
