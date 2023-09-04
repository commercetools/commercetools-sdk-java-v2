
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerCustomFieldAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerCustomFieldAddedMessagePayload customerCustomFieldAddedMessagePayload = CustomerCustomFieldAddedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerCustomFieldAddedMessagePayloadBuilder implements Builder<CustomerCustomFieldAddedMessagePayload> {

    private String name;

    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field that has been added.</p>
     * @param name value to be set
     * @return Builder
     */

    public CustomerCustomFieldAddedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>The added CustomFieldValue based on the FieldType.</p>
     * @param value value to be set
     * @return Builder
     */

    public CustomerCustomFieldAddedMessagePayloadBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Name of the Custom Field that has been added.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>The added CustomFieldValue based on the FieldType.</p>
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds CustomerCustomFieldAddedMessagePayload with checking for non-null required values
     * @return CustomerCustomFieldAddedMessagePayload
     */
    public CustomerCustomFieldAddedMessagePayload build() {
        Objects.requireNonNull(name, CustomerCustomFieldAddedMessagePayload.class + ": name is missing");
        Objects.requireNonNull(value, CustomerCustomFieldAddedMessagePayload.class + ": value is missing");
        return new CustomerCustomFieldAddedMessagePayloadImpl(name, value);
    }

    /**
     * builds CustomerCustomFieldAddedMessagePayload without checking for non-null required values
     * @return CustomerCustomFieldAddedMessagePayload
     */
    public CustomerCustomFieldAddedMessagePayload buildUnchecked() {
        return new CustomerCustomFieldAddedMessagePayloadImpl(name, value);
    }

    /**
     * factory method for an instance of CustomerCustomFieldAddedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerCustomFieldAddedMessagePayloadBuilder of() {
        return new CustomerCustomFieldAddedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerCustomFieldAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerCustomFieldAddedMessagePayloadBuilder of(
            final CustomerCustomFieldAddedMessagePayload template) {
        CustomerCustomFieldAddedMessagePayloadBuilder builder = new CustomerCustomFieldAddedMessagePayloadBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
