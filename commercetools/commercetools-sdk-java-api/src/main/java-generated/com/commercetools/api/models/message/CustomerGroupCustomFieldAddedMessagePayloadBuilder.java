
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupCustomFieldAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupCustomFieldAddedMessagePayload customerGroupCustomFieldAddedMessagePayload = CustomerGroupCustomFieldAddedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupCustomFieldAddedMessagePayloadBuilder
        implements Builder<CustomerGroupCustomFieldAddedMessagePayload> {

    private String name;

    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @param name value to be set
     * @return Builder
     */

    public CustomerGroupCustomFieldAddedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>The added <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a>.</p>
     * @param value value to be set
     * @return Builder
     */

    public CustomerGroupCustomFieldAddedMessagePayloadBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>The added <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a>.</p>
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds CustomerGroupCustomFieldAddedMessagePayload with checking for non-null required values
     * @return CustomerGroupCustomFieldAddedMessagePayload
     */
    public CustomerGroupCustomFieldAddedMessagePayload build() {
        Objects.requireNonNull(name, CustomerGroupCustomFieldAddedMessagePayload.class + ": name is missing");
        Objects.requireNonNull(value, CustomerGroupCustomFieldAddedMessagePayload.class + ": value is missing");
        return new CustomerGroupCustomFieldAddedMessagePayloadImpl(name, value);
    }

    /**
     * builds CustomerGroupCustomFieldAddedMessagePayload without checking for non-null required values
     * @return CustomerGroupCustomFieldAddedMessagePayload
     */
    public CustomerGroupCustomFieldAddedMessagePayload buildUnchecked() {
        return new CustomerGroupCustomFieldAddedMessagePayloadImpl(name, value);
    }

    /**
     * factory method for an instance of CustomerGroupCustomFieldAddedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerGroupCustomFieldAddedMessagePayloadBuilder of() {
        return new CustomerGroupCustomFieldAddedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerGroupCustomFieldAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupCustomFieldAddedMessagePayloadBuilder of(
            final CustomerGroupCustomFieldAddedMessagePayload template) {
        CustomerGroupCustomFieldAddedMessagePayloadBuilder builder = new CustomerGroupCustomFieldAddedMessagePayloadBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
