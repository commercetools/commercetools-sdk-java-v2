
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerAddressCustomFieldRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddressCustomFieldRemovedMessagePayload customerAddressCustomFieldRemovedMessagePayload = CustomerAddressCustomFieldRemovedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerAddressCustomFieldRemovedMessagePayloadBuilder
        implements Builder<CustomerAddressCustomFieldRemovedMessagePayload> {

    private String name;

    @Nullable
    private String addressId;

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @param name value to be set
     * @return Builder
     */

    public CustomerAddressCustomFieldRemovedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p><code>id</code> of the Address from which the Custom Field was removed.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public CustomerAddressCustomFieldRemovedMessagePayloadBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
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
     *  <p><code>id</code> of the Address from which the Custom Field was removed.</p>
     * @return addressId
     */

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    /**
     * builds CustomerAddressCustomFieldRemovedMessagePayload with checking for non-null required values
     * @return CustomerAddressCustomFieldRemovedMessagePayload
     */
    public CustomerAddressCustomFieldRemovedMessagePayload build() {
        Objects.requireNonNull(name, CustomerAddressCustomFieldRemovedMessagePayload.class + ": name is missing");
        return new CustomerAddressCustomFieldRemovedMessagePayloadImpl(name, addressId);
    }

    /**
     * builds CustomerAddressCustomFieldRemovedMessagePayload without checking for non-null required values
     * @return CustomerAddressCustomFieldRemovedMessagePayload
     */
    public CustomerAddressCustomFieldRemovedMessagePayload buildUnchecked() {
        return new CustomerAddressCustomFieldRemovedMessagePayloadImpl(name, addressId);
    }

    /**
     * factory method for an instance of CustomerAddressCustomFieldRemovedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerAddressCustomFieldRemovedMessagePayloadBuilder of() {
        return new CustomerAddressCustomFieldRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerAddressCustomFieldRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddressCustomFieldRemovedMessagePayloadBuilder of(
            final CustomerAddressCustomFieldRemovedMessagePayload template) {
        CustomerAddressCustomFieldRemovedMessagePayloadBuilder builder = new CustomerAddressCustomFieldRemovedMessagePayloadBuilder();
        builder.name = template.getName();
        builder.addressId = template.getAddressId();
        return builder;
    }

}
