
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
     * @param reset
     * @return Builder
     */

    public CustomerPasswordUpdatedMessagePayloadBuilder reset(final Boolean reset) {
        this.reset = reset;
        return this;
    }

    public Boolean getReset() {
        return this.reset;
    }

    public CustomerPasswordUpdatedMessagePayload build() {
        Objects.requireNonNull(reset, CustomerPasswordUpdatedMessagePayload.class + ": reset is missing");
        return new CustomerPasswordUpdatedMessagePayloadImpl(reset);
    }

    /**
     * builds CustomerPasswordUpdatedMessagePayload without checking for non null required values
     */
    public CustomerPasswordUpdatedMessagePayload buildUnchecked() {
        return new CustomerPasswordUpdatedMessagePayloadImpl(reset);
    }

    public static CustomerPasswordUpdatedMessagePayloadBuilder of() {
        return new CustomerPasswordUpdatedMessagePayloadBuilder();
    }

    public static CustomerPasswordUpdatedMessagePayloadBuilder of(
            final CustomerPasswordUpdatedMessagePayload template) {
        CustomerPasswordUpdatedMessagePayloadBuilder builder = new CustomerPasswordUpdatedMessagePayloadBuilder();
        builder.reset = template.getReset();
        return builder;
    }

}
