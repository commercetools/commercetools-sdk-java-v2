
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerAddressChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddressChangedMessagePayload customerAddressChangedMessagePayload = CustomerAddressChangedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerAddressChangedMessagePayloadBuilder implements Builder<CustomerAddressChangedMessagePayload> {

    private com.commercetools.api.models.common.Address address;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> that was set during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerChangeAddressAction" rel="nofollow">Change Address</a> update action.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public CustomerAddressChangedMessagePayloadBuilder address(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> that was set during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerChangeAddressAction" rel="nofollow">Change Address</a> update action.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public CustomerAddressChangedMessagePayloadBuilder withAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> that was set during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerChangeAddressAction" rel="nofollow">Change Address</a> update action.</p>
     * @param address value to be set
     * @return Builder
     */

    public CustomerAddressChangedMessagePayloadBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> that was set during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerChangeAddressAction" rel="nofollow">Change Address</a> update action.</p>
     * @return address
     */

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    /**
     * builds CustomerAddressChangedMessagePayload with checking for non-null required values
     * @return CustomerAddressChangedMessagePayload
     */
    public CustomerAddressChangedMessagePayload build() {
        Objects.requireNonNull(address, CustomerAddressChangedMessagePayload.class + ": address is missing");
        return new CustomerAddressChangedMessagePayloadImpl(address);
    }

    /**
     * builds CustomerAddressChangedMessagePayload without checking for non-null required values
     * @return CustomerAddressChangedMessagePayload
     */
    public CustomerAddressChangedMessagePayload buildUnchecked() {
        return new CustomerAddressChangedMessagePayloadImpl(address);
    }

    /**
     * factory method for an instance of CustomerAddressChangedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerAddressChangedMessagePayloadBuilder of() {
        return new CustomerAddressChangedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerAddressChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddressChangedMessagePayloadBuilder of(final CustomerAddressChangedMessagePayload template) {
        CustomerAddressChangedMessagePayloadBuilder builder = new CustomerAddressChangedMessagePayloadBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
