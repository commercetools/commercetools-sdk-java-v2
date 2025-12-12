
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerShippingAddressAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerShippingAddressAddedMessagePayload customerShippingAddressAddedMessagePayload = CustomerShippingAddressAddedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerShippingAddressAddedMessagePayloadBuilder
        implements Builder<CustomerShippingAddressAddedMessagePayload> {

    private com.commercetools.api.models.common.Address address;

    /**
     *  <p>The address that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>shippingAddressIds</code>.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public CustomerShippingAddressAddedMessagePayloadBuilder address(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The address that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>shippingAddressIds</code>.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public CustomerShippingAddressAddedMessagePayloadBuilder withAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>The address that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>shippingAddressIds</code>.</p>
     * @param address value to be set
     * @return Builder
     */

    public CustomerShippingAddressAddedMessagePayloadBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>The address that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>shippingAddressIds</code>.</p>
     * @return address
     */

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    /**
     * builds CustomerShippingAddressAddedMessagePayload with checking for non-null required values
     * @return CustomerShippingAddressAddedMessagePayload
     */
    public CustomerShippingAddressAddedMessagePayload build() {
        Objects.requireNonNull(address, CustomerShippingAddressAddedMessagePayload.class + ": address is missing");
        return new CustomerShippingAddressAddedMessagePayloadImpl(address);
    }

    /**
     * builds CustomerShippingAddressAddedMessagePayload without checking for non-null required values
     * @return CustomerShippingAddressAddedMessagePayload
     */
    public CustomerShippingAddressAddedMessagePayload buildUnchecked() {
        return new CustomerShippingAddressAddedMessagePayloadImpl(address);
    }

    /**
     * factory method for an instance of CustomerShippingAddressAddedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerShippingAddressAddedMessagePayloadBuilder of() {
        return new CustomerShippingAddressAddedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerShippingAddressAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerShippingAddressAddedMessagePayloadBuilder of(
            final CustomerShippingAddressAddedMessagePayload template) {
        CustomerShippingAddressAddedMessagePayloadBuilder builder = new CustomerShippingAddressAddedMessagePayloadBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
