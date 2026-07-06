
package com.commercetools.checkout.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ServiceUnavailableErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ServiceUnavailableError serviceUnavailableError = ServiceUnavailableError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ServiceUnavailableErrorBuilder implements Builder<ServiceUnavailableError> {

    private String message;

    /**
     *  <p><code>"Service is unavailable."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public ServiceUnavailableErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p><code>"Service is unavailable."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * builds ServiceUnavailableError with checking for non-null required values
     * @return ServiceUnavailableError
     */
    public ServiceUnavailableError build() {
        Objects.requireNonNull(message, ServiceUnavailableError.class + ": message is missing");
        return new ServiceUnavailableErrorImpl(message);
    }

    /**
     * builds ServiceUnavailableError without checking for non-null required values
     * @return ServiceUnavailableError
     */
    public ServiceUnavailableError buildUnchecked() {
        return new ServiceUnavailableErrorImpl(message);
    }

    /**
     * factory method for an instance of ServiceUnavailableErrorBuilder
     * @return builder
     */
    public static ServiceUnavailableErrorBuilder of() {
        return new ServiceUnavailableErrorBuilder();
    }

    /**
     * create builder for ServiceUnavailableError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ServiceUnavailableErrorBuilder of(final ServiceUnavailableError template) {
        ServiceUnavailableErrorBuilder builder = new ServiceUnavailableErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
