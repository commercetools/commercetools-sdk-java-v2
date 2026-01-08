
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerShippingAddressRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerShippingAddressRemovedMessagePayload customerShippingAddressRemovedMessagePayload = CustomerShippingAddressRemovedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerShippingAddressRemovedMessagePayloadBuilder
        implements Builder<CustomerShippingAddressRemovedMessagePayload> {

    private com.commercetools.api.models.common.Address address;

    /**
     *  <p>The address that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>shippingAddressIds</code>.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public CustomerShippingAddressRemovedMessagePayloadBuilder address(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The address that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>shippingAddressIds</code>.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public CustomerShippingAddressRemovedMessagePayloadBuilder withAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>The address that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>shippingAddressIds</code>.</p>
     * @param address value to be set
     * @return Builder
     */

    public CustomerShippingAddressRemovedMessagePayloadBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>The address that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>shippingAddressIds</code>.</p>
     * @return address
     */

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    /**
     * builds CustomerShippingAddressRemovedMessagePayload with checking for non-null required values
     * @return CustomerShippingAddressRemovedMessagePayload
     */
    public CustomerShippingAddressRemovedMessagePayload build() {
        Objects.requireNonNull(address, CustomerShippingAddressRemovedMessagePayload.class + ": address is missing");
        return new CustomerShippingAddressRemovedMessagePayloadImpl(address);
    }

    /**
     * builds CustomerShippingAddressRemovedMessagePayload without checking for non-null required values
     * @return CustomerShippingAddressRemovedMessagePayload
     */
    public CustomerShippingAddressRemovedMessagePayload buildUnchecked() {
        return new CustomerShippingAddressRemovedMessagePayloadImpl(address);
    }

    /**
     * factory method for an instance of CustomerShippingAddressRemovedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerShippingAddressRemovedMessagePayloadBuilder of() {
        return new CustomerShippingAddressRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerShippingAddressRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerShippingAddressRemovedMessagePayloadBuilder of(
            final CustomerShippingAddressRemovedMessagePayload template) {
        CustomerShippingAddressRemovedMessagePayloadBuilder builder = new CustomerShippingAddressRemovedMessagePayloadBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
