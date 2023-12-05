
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerCustomFieldRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerCustomFieldRemovedMessagePayload customerCustomFieldRemovedMessagePayload = CustomerCustomFieldRemovedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerCustomFieldRemovedMessagePayloadBuilder
        implements Builder<CustomerCustomFieldRemovedMessagePayload> {

    private String name;

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @param name value to be set
     * @return Builder
     */

    public CustomerCustomFieldRemovedMessagePayloadBuilder name(final String name) {
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
     * builds CustomerCustomFieldRemovedMessagePayload with checking for non-null required values
     * @return CustomerCustomFieldRemovedMessagePayload
     */
    public CustomerCustomFieldRemovedMessagePayload build() {
        Objects.requireNonNull(name, CustomerCustomFieldRemovedMessagePayload.class + ": name is missing");
        return new CustomerCustomFieldRemovedMessagePayloadImpl(name);
    }

    /**
     * builds CustomerCustomFieldRemovedMessagePayload without checking for non-null required values
     * @return CustomerCustomFieldRemovedMessagePayload
     */
    public CustomerCustomFieldRemovedMessagePayload buildUnchecked() {
        return new CustomerCustomFieldRemovedMessagePayloadImpl(name);
    }

    /**
     * factory method for an instance of CustomerCustomFieldRemovedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerCustomFieldRemovedMessagePayloadBuilder of() {
        return new CustomerCustomFieldRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerCustomFieldRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerCustomFieldRemovedMessagePayloadBuilder of(
            final CustomerCustomFieldRemovedMessagePayload template) {
        CustomerCustomFieldRemovedMessagePayloadBuilder builder = new CustomerCustomFieldRemovedMessagePayloadBuilder();
        builder.name = template.getName();
        return builder;
    }

}
