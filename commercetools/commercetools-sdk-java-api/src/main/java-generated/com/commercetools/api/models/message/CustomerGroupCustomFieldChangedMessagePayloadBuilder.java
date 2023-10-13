
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupCustomFieldChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupCustomFieldChangedMessagePayload customerGroupCustomFieldChangedMessagePayload = CustomerGroupCustomFieldChangedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupCustomFieldChangedMessagePayloadBuilder
        implements Builder<CustomerGroupCustomFieldChangedMessagePayload> {

    private String name;

    private java.lang.Object value;

    @Nullable
    private java.lang.Object oldValue;

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @param name value to be set
     * @return Builder
     */

    public CustomerGroupCustomFieldChangedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>CustomFieldValue based on the FieldType after the Set CustomField update action.</p>
     * @param value value to be set
     * @return Builder
     */

    public CustomerGroupCustomFieldChangedMessagePayloadBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action.</p>
     * @param oldValue value to be set
     * @return Builder
     */

    public CustomerGroupCustomFieldChangedMessagePayloadBuilder oldValue(@Nullable final java.lang.Object oldValue) {
        this.oldValue = oldValue;
        return this;
    }

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>CustomFieldValue based on the FieldType after the Set CustomField update action.</p>
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action.</p>
     * @return oldValue
     */

    @Nullable
    public java.lang.Object getOldValue() {
        return this.oldValue;
    }

    /**
     * builds CustomerGroupCustomFieldChangedMessagePayload with checking for non-null required values
     * @return CustomerGroupCustomFieldChangedMessagePayload
     */
    public CustomerGroupCustomFieldChangedMessagePayload build() {
        Objects.requireNonNull(name, CustomerGroupCustomFieldChangedMessagePayload.class + ": name is missing");
        Objects.requireNonNull(value, CustomerGroupCustomFieldChangedMessagePayload.class + ": value is missing");
        return new CustomerGroupCustomFieldChangedMessagePayloadImpl(name, value, oldValue);
    }

    /**
     * builds CustomerGroupCustomFieldChangedMessagePayload without checking for non-null required values
     * @return CustomerGroupCustomFieldChangedMessagePayload
     */
    public CustomerGroupCustomFieldChangedMessagePayload buildUnchecked() {
        return new CustomerGroupCustomFieldChangedMessagePayloadImpl(name, value, oldValue);
    }

    /**
     * factory method for an instance of CustomerGroupCustomFieldChangedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerGroupCustomFieldChangedMessagePayloadBuilder of() {
        return new CustomerGroupCustomFieldChangedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerGroupCustomFieldChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupCustomFieldChangedMessagePayloadBuilder of(
            final CustomerGroupCustomFieldChangedMessagePayload template) {
        CustomerGroupCustomFieldChangedMessagePayloadBuilder builder = new CustomerGroupCustomFieldChangedMessagePayloadBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        builder.oldValue = template.getOldValue();
        return builder;
    }

}
