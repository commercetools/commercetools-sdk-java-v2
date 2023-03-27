
package com.commercetools.importapi.models.errors;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RequiredFieldErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RequiredFieldError requiredFieldError = RequiredFieldError.builder()
 *             .message("{message}")
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RequiredFieldErrorBuilder implements Builder<RequiredFieldError> {

    private String message;

    private String field;

    /**
     * set the value to the message
     * @param message value to be set
     * @return Builder
     */

    public RequiredFieldErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>The name of the field.</p>
     * @param field value to be set
     * @return Builder
     */

    public RequiredFieldErrorBuilder field(final String field) {
        this.field = field;
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
     *  <p>The name of the field.</p>
     * @return field
     */

    public String getField() {
        return this.field;
    }

    /**
     * builds RequiredFieldError with checking for non-null required values
     * @return RequiredFieldError
     */
    public RequiredFieldError build() {
        Objects.requireNonNull(message, RequiredFieldError.class + ": message is missing");
        Objects.requireNonNull(field, RequiredFieldError.class + ": field is missing");
        return new RequiredFieldErrorImpl(message, field);
    }

    /**
     * builds RequiredFieldError without checking for non-null required values
     * @return RequiredFieldError
     */
    public RequiredFieldError buildUnchecked() {
        return new RequiredFieldErrorImpl(message, field);
    }

    /**
     * factory method for an instance of RequiredFieldErrorBuilder
     * @return builder
     */
    public static RequiredFieldErrorBuilder of() {
        return new RequiredFieldErrorBuilder();
    }

    /**
     * create builder for RequiredFieldError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RequiredFieldErrorBuilder of(final RequiredFieldError template) {
        RequiredFieldErrorBuilder builder = new RequiredFieldErrorBuilder();
        builder.message = template.getMessage();
        builder.field = template.getField();
        return builder;
    }

}
