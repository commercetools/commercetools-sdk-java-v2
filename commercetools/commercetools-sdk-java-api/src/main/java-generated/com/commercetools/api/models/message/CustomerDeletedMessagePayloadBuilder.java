package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.CustomerDeletedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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

    /**
     * factory method for an instance of CustomerDeletedMessagePayloadBuilder
     * @return builder 
     */
    public static CustomerDeletedMessagePayloadBuilder of() {
        return new CustomerDeletedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerDeletedMessagePayloadBuilder of(final CustomerDeletedMessagePayload template) {
        CustomerDeletedMessagePayloadBuilder builder = new CustomerDeletedMessagePayloadBuilder();
        return builder;
    }

}
