
package com.commercetools.history.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TooManyRequestsErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TooManyRequestsError tooManyRequestsError = TooManyRequestsError.builder()
 *             .code("{code}")
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TooManyRequestsErrorBuilder implements Builder<TooManyRequestsError> {

    private String code;

    private String message;

    /**
     *  <p><code>"TooManyRequests"</code></p>
     * @param code value to be set
     * @return Builder
     */

    public TooManyRequestsErrorBuilder code(final String code) {
        this.code = code;
        return this;
    }

    /**
     *  <p><code>"You have made too many requests. Please try again later."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public TooManyRequestsErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p><code>"TooManyRequests"</code></p>
     * @return code
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"You have made too many requests. Please try again later."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * builds TooManyRequestsError with checking for non-null required values
     * @return TooManyRequestsError
     */
    public TooManyRequestsError build() {
        Objects.requireNonNull(code, TooManyRequestsError.class + ": code is missing");
        Objects.requireNonNull(message, TooManyRequestsError.class + ": message is missing");
        return new TooManyRequestsErrorImpl(code, message);
    }

    /**
     * builds TooManyRequestsError without checking for non-null required values
     * @return TooManyRequestsError
     */
    public TooManyRequestsError buildUnchecked() {
        return new TooManyRequestsErrorImpl(code, message);
    }

    /**
     * factory method for an instance of TooManyRequestsErrorBuilder
     * @return builder
     */
    public static TooManyRequestsErrorBuilder of() {
        return new TooManyRequestsErrorBuilder();
    }

    /**
     * create builder for TooManyRequestsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TooManyRequestsErrorBuilder of(final TooManyRequestsError template) {
        TooManyRequestsErrorBuilder builder = new TooManyRequestsErrorBuilder();
        builder.code = template.getCode();
        builder.message = template.getMessage();
        return builder;
    }

}
