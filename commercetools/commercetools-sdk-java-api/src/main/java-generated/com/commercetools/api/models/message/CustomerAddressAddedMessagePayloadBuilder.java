
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerAddressAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddressAddedMessagePayload customerAddressAddedMessagePayload = CustomerAddressAddedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerAddressAddedMessagePayloadBuilder implements Builder<CustomerAddressAddedMessagePayload> {

    private com.commercetools.api.models.common.Address address;

    /**
     *  <p>Address that was added during the Add Address update action.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public CustomerAddressAddedMessagePayloadBuilder address(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Address that was added during the Add Address update action.</p>
     * @param address value to be set
     * @return Builder
     */

    public CustomerAddressAddedMessagePayloadBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>Address that was added during the Add Address update action.</p>
     * @return address
     */

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    /**
     * builds CustomerAddressAddedMessagePayload with checking for non-null required values
     * @return CustomerAddressAddedMessagePayload
     */
    public CustomerAddressAddedMessagePayload build() {
        Objects.requireNonNull(address, CustomerAddressAddedMessagePayload.class + ": address is missing");
        return new CustomerAddressAddedMessagePayloadImpl(address);
    }

    /**
     * builds CustomerAddressAddedMessagePayload without checking for non-null required values
     * @return CustomerAddressAddedMessagePayload
     */
    public CustomerAddressAddedMessagePayload buildUnchecked() {
        return new CustomerAddressAddedMessagePayloadImpl(address);
    }

    /**
     * factory method for an instance of CustomerAddressAddedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerAddressAddedMessagePayloadBuilder of() {
        return new CustomerAddressAddedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerAddressAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddressAddedMessagePayloadBuilder of(final CustomerAddressAddedMessagePayload template) {
        CustomerAddressAddedMessagePayloadBuilder builder = new CustomerAddressAddedMessagePayloadBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
