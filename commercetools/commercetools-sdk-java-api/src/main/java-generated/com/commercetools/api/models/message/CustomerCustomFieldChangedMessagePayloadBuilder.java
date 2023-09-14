
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerCustomFieldChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerCustomFieldChangedMessagePayload customerCustomFieldChangedMessagePayload = CustomerCustomFieldChangedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerCustomFieldChangedMessagePayloadBuilder
        implements Builder<CustomerCustomFieldChangedMessagePayload> {

    private String name;

    private java.lang.Object value;

    @Nullable
    private java.lang.Object previousValue;

    /**
     *  <p>Name of the Custom Field that has been changed.</p>
     * @param name value to be set
     * @return Builder
     */

    public CustomerCustomFieldChangedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>CustomFieldValue based on the FieldType after the Set CustomField update action.</p>
     * @param value value to be set
     * @return Builder
     */

    public CustomerCustomFieldChangedMessagePayloadBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action. When there has not been a Custom Field with the <code>name</code> on the Customer before, a Customer Custom Field Added Message is generated instead.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public CustomerCustomFieldChangedMessagePayloadBuilder previousValue(
            @Nullable final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Name of the Custom Field that has been changed.</p>
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
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action. When there has not been a Custom Field with the <code>name</code> on the Customer before, a Customer Custom Field Added Message is generated instead.</p>
     * @return previousValue
     */

    @Nullable
    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds CustomerCustomFieldChangedMessagePayload with checking for non-null required values
     * @return CustomerCustomFieldChangedMessagePayload
     */
    public CustomerCustomFieldChangedMessagePayload build() {
        Objects.requireNonNull(name, CustomerCustomFieldChangedMessagePayload.class + ": name is missing");
        Objects.requireNonNull(value, CustomerCustomFieldChangedMessagePayload.class + ": value is missing");
        return new CustomerCustomFieldChangedMessagePayloadImpl(name, value, previousValue);
    }

    /**
     * builds CustomerCustomFieldChangedMessagePayload without checking for non-null required values
     * @return CustomerCustomFieldChangedMessagePayload
     */
    public CustomerCustomFieldChangedMessagePayload buildUnchecked() {
        return new CustomerCustomFieldChangedMessagePayloadImpl(name, value, previousValue);
    }

    /**
     * factory method for an instance of CustomerCustomFieldChangedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerCustomFieldChangedMessagePayloadBuilder of() {
        return new CustomerCustomFieldChangedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerCustomFieldChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerCustomFieldChangedMessagePayloadBuilder of(
            final CustomerCustomFieldChangedMessagePayload template) {
        CustomerCustomFieldChangedMessagePayloadBuilder builder = new CustomerCustomFieldChangedMessagePayloadBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
