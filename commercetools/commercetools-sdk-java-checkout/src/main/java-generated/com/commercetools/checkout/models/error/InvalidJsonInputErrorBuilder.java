
package com.commercetools.checkout.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidJsonInputErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidJsonInputError invalidJsonInputError = InvalidJsonInputError.builder()
 *             .message("{message}")
 *             .detailedErrorMessage("{detailedErrorMessage}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InvalidJsonInputErrorBuilder implements Builder<InvalidJsonInputError> {

    private String message;

    private String detailedErrorMessage;

    /**
     *  <p><code>"Request body does not contain valid JSON."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public InvalidJsonInputErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Further explanation about why the JSON is invalid.</p>
     * @param detailedErrorMessage value to be set
     * @return Builder
     */

    public InvalidJsonInputErrorBuilder detailedErrorMessage(final String detailedErrorMessage) {
        this.detailedErrorMessage = detailedErrorMessage;
        return this;
    }

    /**
     *  <p><code>"Request body does not contain valid JSON."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Further explanation about why the JSON is invalid.</p>
     * @return detailedErrorMessage
     */

    public String getDetailedErrorMessage() {
        return this.detailedErrorMessage;
    }

    /**
     * builds InvalidJsonInputError with checking for non-null required values
     * @return InvalidJsonInputError
     */
    public InvalidJsonInputError build() {
        Objects.requireNonNull(message, InvalidJsonInputError.class + ": message is missing");
        Objects.requireNonNull(detailedErrorMessage, InvalidJsonInputError.class + ": detailedErrorMessage is missing");
        return new InvalidJsonInputErrorImpl(message, detailedErrorMessage);
    }

    /**
     * builds InvalidJsonInputError without checking for non-null required values
     * @return InvalidJsonInputError
     */
    public InvalidJsonInputError buildUnchecked() {
        return new InvalidJsonInputErrorImpl(message, detailedErrorMessage);
    }

    /**
     * factory method for an instance of InvalidJsonInputErrorBuilder
     * @return builder
     */
    public static InvalidJsonInputErrorBuilder of() {
        return new InvalidJsonInputErrorBuilder();
    }

    /**
     * create builder for InvalidJsonInputError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidJsonInputErrorBuilder of(final InvalidJsonInputError template) {
        InvalidJsonInputErrorBuilder builder = new InvalidJsonInputErrorBuilder();
        builder.message = template.getMessage();
        builder.detailedErrorMessage = template.getDetailedErrorMessage();
        return builder;
    }

}
