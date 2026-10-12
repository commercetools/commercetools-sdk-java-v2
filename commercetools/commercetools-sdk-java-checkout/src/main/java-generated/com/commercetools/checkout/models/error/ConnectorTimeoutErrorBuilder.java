
package com.commercetools.checkout.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ConnectorTimeoutErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ConnectorTimeoutError connectorTimeoutError = ConnectorTimeoutError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ConnectorTimeoutErrorBuilder implements Builder<ConnectorTimeoutError> {

    private String message;

    /**
     *  <p><code>"The connector did not respond within the configured timeout."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public ConnectorTimeoutErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p><code>"The connector did not respond within the configured timeout."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * builds ConnectorTimeoutError with checking for non-null required values
     * @return ConnectorTimeoutError
     */
    public ConnectorTimeoutError build() {
        Objects.requireNonNull(message, ConnectorTimeoutError.class + ": message is missing");
        return new ConnectorTimeoutErrorImpl(message);
    }

    /**
     * builds ConnectorTimeoutError without checking for non-null required values
     * @return ConnectorTimeoutError
     */
    public ConnectorTimeoutError buildUnchecked() {
        return new ConnectorTimeoutErrorImpl(message);
    }

    /**
     * factory method for an instance of ConnectorTimeoutErrorBuilder
     * @return builder
     */
    public static ConnectorTimeoutErrorBuilder of() {
        return new ConnectorTimeoutErrorBuilder();
    }

    /**
     * create builder for ConnectorTimeoutError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ConnectorTimeoutErrorBuilder of(final ConnectorTimeoutError template) {
        ConnectorTimeoutErrorBuilder builder = new ConnectorTimeoutErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
