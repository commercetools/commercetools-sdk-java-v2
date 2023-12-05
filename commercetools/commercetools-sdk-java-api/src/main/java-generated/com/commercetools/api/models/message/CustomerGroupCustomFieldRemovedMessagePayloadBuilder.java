
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupCustomFieldRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupCustomFieldRemovedMessagePayload customerGroupCustomFieldRemovedMessagePayload = CustomerGroupCustomFieldRemovedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupCustomFieldRemovedMessagePayloadBuilder
        implements Builder<CustomerGroupCustomFieldRemovedMessagePayload> {

    private String name;

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @param name value to be set
     * @return Builder
     */

    public CustomerGroupCustomFieldRemovedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * builds CustomerGroupCustomFieldRemovedMessagePayload with checking for non-null required values
     * @return CustomerGroupCustomFieldRemovedMessagePayload
     */
    public CustomerGroupCustomFieldRemovedMessagePayload build() {
        Objects.requireNonNull(name, CustomerGroupCustomFieldRemovedMessagePayload.class + ": name is missing");
        return new CustomerGroupCustomFieldRemovedMessagePayloadImpl(name);
    }

    /**
     * builds CustomerGroupCustomFieldRemovedMessagePayload without checking for non-null required values
     * @return CustomerGroupCustomFieldRemovedMessagePayload
     */
    public CustomerGroupCustomFieldRemovedMessagePayload buildUnchecked() {
        return new CustomerGroupCustomFieldRemovedMessagePayloadImpl(name);
    }

    /**
     * factory method for an instance of CustomerGroupCustomFieldRemovedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerGroupCustomFieldRemovedMessagePayloadBuilder of() {
        return new CustomerGroupCustomFieldRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerGroupCustomFieldRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupCustomFieldRemovedMessagePayloadBuilder of(
            final CustomerGroupCustomFieldRemovedMessagePayload template) {
        CustomerGroupCustomFieldRemovedMessagePayloadBuilder builder = new CustomerGroupCustomFieldRemovedMessagePayloadBuilder();
        builder.name = template.getName();
        return builder;
    }

}
