
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerEmailVerifiedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerEmailVerifiedMessagePayload customerEmailVerifiedMessagePayload = CustomerEmailVerifiedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerEmailVerifiedMessagePayloadBuilder implements Builder<CustomerEmailVerifiedMessagePayload> {

    /**
     * builds CustomerEmailVerifiedMessagePayload with checking for non-null required values
     * @return CustomerEmailVerifiedMessagePayload
     */
    public CustomerEmailVerifiedMessagePayload build() {
        return new CustomerEmailVerifiedMessagePayloadImpl();
    }

    /**
     * builds CustomerEmailVerifiedMessagePayload without checking for non-null required values
     * @return CustomerEmailVerifiedMessagePayload
     */
    public CustomerEmailVerifiedMessagePayload buildUnchecked() {
        return new CustomerEmailVerifiedMessagePayloadImpl();
    }

    /**
     * factory method for an instance of CustomerEmailVerifiedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerEmailVerifiedMessagePayloadBuilder of() {
        return new CustomerEmailVerifiedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerEmailVerifiedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerEmailVerifiedMessagePayloadBuilder of(final CustomerEmailVerifiedMessagePayload template) {
        CustomerEmailVerifiedMessagePayloadBuilder builder = new CustomerEmailVerifiedMessagePayloadBuilder();
        return builder;
    }

}
