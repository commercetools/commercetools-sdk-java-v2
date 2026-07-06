
package com.commercetools.checkout.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MultipleActionsNotAllowedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MultipleActionsNotAllowedError multipleActionsNotAllowedError = MultipleActionsNotAllowedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MultipleActionsNotAllowedErrorBuilder implements Builder<MultipleActionsNotAllowedError> {

    private String message;

    /**
     *  <p><code>"Actions accepts only one action at time. Array size must be 1."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public MultipleActionsNotAllowedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p><code>"Actions accepts only one action at time. Array size must be 1."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * builds MultipleActionsNotAllowedError with checking for non-null required values
     * @return MultipleActionsNotAllowedError
     */
    public MultipleActionsNotAllowedError build() {
        Objects.requireNonNull(message, MultipleActionsNotAllowedError.class + ": message is missing");
        return new MultipleActionsNotAllowedErrorImpl(message);
    }

    /**
     * builds MultipleActionsNotAllowedError without checking for non-null required values
     * @return MultipleActionsNotAllowedError
     */
    public MultipleActionsNotAllowedError buildUnchecked() {
        return new MultipleActionsNotAllowedErrorImpl(message);
    }

    /**
     * factory method for an instance of MultipleActionsNotAllowedErrorBuilder
     * @return builder
     */
    public static MultipleActionsNotAllowedErrorBuilder of() {
        return new MultipleActionsNotAllowedErrorBuilder();
    }

    /**
     * create builder for MultipleActionsNotAllowedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MultipleActionsNotAllowedErrorBuilder of(final MultipleActionsNotAllowedError template) {
        MultipleActionsNotAllowedErrorBuilder builder = new MultipleActionsNotAllowedErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
