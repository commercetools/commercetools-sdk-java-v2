
package com.commercetools.checkout.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ConnectorFailedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ConnectorFailedError connectorFailedError = ConnectorFailedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ConnectorFailedErrorBuilder implements Builder<ConnectorFailedError> {

    private String message;

    /**
     *  <p><code>"The connector could not be reached."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public ConnectorFailedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p><code>"The connector could not be reached."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * builds ConnectorFailedError with checking for non-null required values
     * @return ConnectorFailedError
     */
    public ConnectorFailedError build() {
        Objects.requireNonNull(message, ConnectorFailedError.class + ": message is missing");
        return new ConnectorFailedErrorImpl(message);
    }

    /**
     * builds ConnectorFailedError without checking for non-null required values
     * @return ConnectorFailedError
     */
    public ConnectorFailedError buildUnchecked() {
        return new ConnectorFailedErrorImpl(message);
    }

    /**
     * factory method for an instance of ConnectorFailedErrorBuilder
     * @return builder
     */
    public static ConnectorFailedErrorBuilder of() {
        return new ConnectorFailedErrorBuilder();
    }

    /**
     * create builder for ConnectorFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ConnectorFailedErrorBuilder of(final ConnectorFailedError template) {
        ConnectorFailedErrorBuilder builder = new ConnectorFailedErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
