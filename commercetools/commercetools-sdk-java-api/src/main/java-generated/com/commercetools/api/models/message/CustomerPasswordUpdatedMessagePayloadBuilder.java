
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CustomerPasswordUpdatedMessagePayload customerPasswordUpdatedMessagePayload = CustomerPasswordUpdatedMessagePayload.builder()
           .reset(true)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerPasswordUpdatedMessagePayloadBuilder implements Builder<CustomerPasswordUpdatedMessagePayload> {

    private Boolean reset;

    /**
     *  <p>true, if password has been updated during Customer's Password Reset workflow.</p>
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
