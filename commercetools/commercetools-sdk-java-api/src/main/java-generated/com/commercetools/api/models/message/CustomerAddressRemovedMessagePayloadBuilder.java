
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerAddressRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddressRemovedMessagePayload customerAddressRemovedMessagePayload = CustomerAddressRemovedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerAddressRemovedMessagePayloadBuilder implements Builder<CustomerAddressRemovedMessagePayload> {

    private com.commercetools.api.models.common.Address address;

    /**
     *  <p>Address that was removed during the Remove Address update action.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public CustomerAddressRemovedMessagePayloadBuilder address(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Address that was removed during the Remove Address update action.</p>
     * @param address value to be set
     * @return Builder
     */

    public CustomerAddressRemovedMessagePayloadBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>Address that was removed during the Remove Address update action.</p>
     * @return address
     */

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    /**
     * builds CustomerAddressRemovedMessagePayload with checking for non-null required values
     * @return CustomerAddressRemovedMessagePayload
     */
    public CustomerAddressRemovedMessagePayload build() {
        Objects.requireNonNull(address, CustomerAddressRemovedMessagePayload.class + ": address is missing");
        return new CustomerAddressRemovedMessagePayloadImpl(address);
    }

    /**
     * builds CustomerAddressRemovedMessagePayload without checking for non-null required values
     * @return CustomerAddressRemovedMessagePayload
     */
    public CustomerAddressRemovedMessagePayload buildUnchecked() {
        return new CustomerAddressRemovedMessagePayloadImpl(address);
    }

    /**
     * factory method for an instance of CustomerAddressRemovedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerAddressRemovedMessagePayloadBuilder of() {
        return new CustomerAddressRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerAddressRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddressRemovedMessagePayloadBuilder of(final CustomerAddressRemovedMessagePayload template) {
        CustomerAddressRemovedMessagePayloadBuilder builder = new CustomerAddressRemovedMessagePayloadBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
