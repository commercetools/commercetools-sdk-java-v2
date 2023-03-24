
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerDeletedMessagePayload customerDeletedMessagePayload = CustomerDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerDeletedMessagePayloadBuilder implements Builder<CustomerDeletedMessagePayload> {

    /**
     * builds CustomerDeletedMessagePayload with checking for non-null required values
     * @return CustomerDeletedMessagePayload
     */
    public CustomerDeletedMessagePayload build() {
        return new CustomerDeletedMessagePayloadImpl();
    }

    /**
     * builds CustomerDeletedMessagePayload without checking for non-null required values
     * @return CustomerDeletedMessagePayload
     */
    public CustomerDeletedMessagePayload buildUnchecked() {
        return new CustomerDeletedMessagePayloadImpl();
    }

    public static CustomerDeletedMessagePayloadBuilder of() {
        return new CustomerDeletedMessagePayloadBuilder();
    }

    public static CustomerDeletedMessagePayloadBuilder of(final CustomerDeletedMessagePayload template) {
        CustomerDeletedMessagePayloadBuilder builder = new CustomerDeletedMessagePayloadBuilder();
        return builder;
    }

}
