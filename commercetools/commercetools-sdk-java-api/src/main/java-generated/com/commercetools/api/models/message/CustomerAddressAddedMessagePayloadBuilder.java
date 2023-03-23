
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
     * @return Builder
     */

    public CustomerAddressAddedMessagePayloadBuilder address(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Address that was added during the Add Address update action.</p>
     * @param address
     * @return Builder
     */

    public CustomerAddressAddedMessagePayloadBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public CustomerAddressAddedMessagePayload build() {
        Objects.requireNonNull(address, CustomerAddressAddedMessagePayload.class + ": address is missing");
        return new CustomerAddressAddedMessagePayloadImpl(address);
    }

    /**
     * builds CustomerAddressAddedMessagePayload without checking for non null required values
     */
    public CustomerAddressAddedMessagePayload buildUnchecked() {
        return new CustomerAddressAddedMessagePayloadImpl(address);
    }

    public static CustomerAddressAddedMessagePayloadBuilder of() {
        return new CustomerAddressAddedMessagePayloadBuilder();
    }

    public static CustomerAddressAddedMessagePayloadBuilder of(final CustomerAddressAddedMessagePayload template) {
        CustomerAddressAddedMessagePayloadBuilder builder = new CustomerAddressAddedMessagePayloadBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
