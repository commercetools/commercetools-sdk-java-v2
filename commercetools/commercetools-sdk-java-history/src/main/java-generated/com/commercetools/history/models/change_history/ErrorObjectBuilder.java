
package com.commercetools.history.models.change_history;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ErrorObjectBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ErrorObject errorObject = ErrorObject.builder()
 *             .code("{code}")
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ErrorObjectBuilder implements Builder<ErrorObject> {

    private String code;

    private String message;

    /**
     * set the value to the code
     * @param code value to be set
     * @return Builder
     */

    public ErrorObjectBuilder code(final String code) {
        this.code = code;
        return this;
    }

    /**
     * set the value to the message
     * @param message value to be set
     * @return Builder
     */

    public ErrorObjectBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     * value of code}
     * @return code
     */

    public String getCode() {
        return this.code;
    }

    /**
     * value of message}
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * builds ErrorObject with checking for non-null required values
     * @return ErrorObject
     */
    public ErrorObject build() {
        Objects.requireNonNull(code, ErrorObject.class + ": code is missing");
        Objects.requireNonNull(message, ErrorObject.class + ": message is missing");
        return new ErrorObjectImpl(code, message);
    }

    /**
     * builds ErrorObject without checking for non-null required values
     * @return ErrorObject
     */
    public ErrorObject buildUnchecked() {
        return new ErrorObjectImpl(code, message);
    }

    /**
     * factory method for an instance of ErrorObjectBuilder
     * @return builder
     */
    public static ErrorObjectBuilder of() {
        return new ErrorObjectBuilder();
    }

    /**
     * create builder for ErrorObject instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ErrorObjectBuilder of(final ErrorObject template) {
        ErrorObjectBuilder builder = new ErrorObjectBuilder();
        builder.code = template.getCode();
        builder.message = template.getMessage();
        return builder;
    }

}
