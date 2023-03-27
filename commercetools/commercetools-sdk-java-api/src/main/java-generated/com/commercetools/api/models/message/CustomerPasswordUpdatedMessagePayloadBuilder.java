
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerPasswordUpdatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerPasswordUpdatedMessagePayload customerPasswordUpdatedMessagePayload = CustomerPasswordUpdatedMessagePayload.builder()
 *             .reset(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerPasswordUpdatedMessagePayloadBuilder implements Builder<CustomerPasswordUpdatedMessagePayload> {

    private Boolean reset;

    /**
     *  <p>Whether the Customer's password was updated during the Reset password or Change password flow.</p>
     * @param reset value to be set
     * @return Builder
     */

    public CustomerPasswordUpdatedMessagePayloadBuilder reset(final Boolean reset) {
        this.reset = reset;
        return this;
    }

    /**
     *  <p>Whether the Customer's password was updated during the Reset password or Change password flow.</p>
     * @return reset
     */

    public Boolean getReset() {
        return this.reset;
    }

    /**
     * builds CustomerPasswordUpdatedMessagePayload with checking for non-null required values
     * @return CustomerPasswordUpdatedMessagePayload
     */
    public CustomerPasswordUpdatedMessagePayload build() {
        Objects.requireNonNull(reset, CustomerPasswordUpdatedMessagePayload.class + ": reset is missing");
        return new CustomerPasswordUpdatedMessagePayloadImpl(reset);
    }

    /**
     * builds CustomerPasswordUpdatedMessagePayload without checking for non-null required values
     * @return CustomerPasswordUpdatedMessagePayload
     */
    public CustomerPasswordUpdatedMessagePayload buildUnchecked() {
        return new CustomerPasswordUpdatedMessagePayloadImpl(reset);
    }

    /**
     * factory method for an instance of CustomerPasswordUpdatedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerPasswordUpdatedMessagePayloadBuilder of() {
        return new CustomerPasswordUpdatedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerPasswordUpdatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerPasswordUpdatedMessagePayloadBuilder of(
            final CustomerPasswordUpdatedMessagePayload template) {
        CustomerPasswordUpdatedMessagePayloadBuilder builder = new CustomerPasswordUpdatedMessagePayloadBuilder();
        builder.reset = template.getReset();
        return builder;
    }

}
