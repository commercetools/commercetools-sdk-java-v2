
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerAddressCustomFieldAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddressCustomFieldAddedMessagePayload customerAddressCustomFieldAddedMessagePayload = CustomerAddressCustomFieldAddedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerAddressCustomFieldAddedMessagePayloadBuilder
        implements Builder<CustomerAddressCustomFieldAddedMessagePayload> {

    private String name;

    private java.lang.Object value;

    @Nullable
    private String addressId;

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @param name value to be set
     * @return Builder
     */

    public CustomerAddressCustomFieldAddedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>The added CustomFieldValue based on the FieldType.</p>
     * @param value value to be set
     * @return Builder
     */

    public CustomerAddressCustomFieldAddedMessagePayloadBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p><code>id</code> of the Address to which the Custom Field was added.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public CustomerAddressCustomFieldAddedMessagePayloadBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
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
     *  <p>The added CustomFieldValue based on the FieldType.</p>
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     *  <p><code>id</code> of the Address to which the Custom Field was added.</p>
     * @return addressId
     */

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    /**
     * builds CustomerAddressCustomFieldAddedMessagePayload with checking for non-null required values
     * @return CustomerAddressCustomFieldAddedMessagePayload
     */
    public CustomerAddressCustomFieldAddedMessagePayload build() {
        Objects.requireNonNull(name, CustomerAddressCustomFieldAddedMessagePayload.class + ": name is missing");
        Objects.requireNonNull(value, CustomerAddressCustomFieldAddedMessagePayload.class + ": value is missing");
        return new CustomerAddressCustomFieldAddedMessagePayloadImpl(name, value, addressId);
    }

    /**
     * builds CustomerAddressCustomFieldAddedMessagePayload without checking for non-null required values
     * @return CustomerAddressCustomFieldAddedMessagePayload
     */
    public CustomerAddressCustomFieldAddedMessagePayload buildUnchecked() {
        return new CustomerAddressCustomFieldAddedMessagePayloadImpl(name, value, addressId);
    }

    /**
     * factory method for an instance of CustomerAddressCustomFieldAddedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerAddressCustomFieldAddedMessagePayloadBuilder of() {
        return new CustomerAddressCustomFieldAddedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerAddressCustomFieldAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddressCustomFieldAddedMessagePayloadBuilder of(
            final CustomerAddressCustomFieldAddedMessagePayload template) {
        CustomerAddressCustomFieldAddedMessagePayloadBuilder builder = new CustomerAddressCustomFieldAddedMessagePayloadBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        builder.addressId = template.getAddressId();
        return builder;
    }

}
