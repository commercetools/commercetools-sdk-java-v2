
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerDefaultShippingAddressSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerDefaultShippingAddressSetMessagePayload customerDefaultShippingAddressSetMessagePayload = CustomerDefaultShippingAddressSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerDefaultShippingAddressSetMessagePayloadBuilder
        implements Builder<CustomerDefaultShippingAddressSetMessagePayload> {

    @Nullable
    private com.commercetools.api.models.common.Address address;

    /**
     *  <p>The address that was set as the default shipping address.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public CustomerDefaultShippingAddressSetMessagePayloadBuilder address(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The address that was set as the default shipping address.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public CustomerDefaultShippingAddressSetMessagePayloadBuilder withAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>The address that was set as the default shipping address.</p>
     * @param address value to be set
     * @return Builder
     */

    public CustomerDefaultShippingAddressSetMessagePayloadBuilder address(
            @Nullable final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>The address that was set as the default shipping address.</p>
     * @return address
     */

    @Nullable
    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    /**
     * builds CustomerDefaultShippingAddressSetMessagePayload with checking for non-null required values
     * @return CustomerDefaultShippingAddressSetMessagePayload
     */
    public CustomerDefaultShippingAddressSetMessagePayload build() {
        return new CustomerDefaultShippingAddressSetMessagePayloadImpl(address);
    }

    /**
     * builds CustomerDefaultShippingAddressSetMessagePayload without checking for non-null required values
     * @return CustomerDefaultShippingAddressSetMessagePayload
     */
    public CustomerDefaultShippingAddressSetMessagePayload buildUnchecked() {
        return new CustomerDefaultShippingAddressSetMessagePayloadImpl(address);
    }

    /**
     * factory method for an instance of CustomerDefaultShippingAddressSetMessagePayloadBuilder
     * @return builder
     */
    public static CustomerDefaultShippingAddressSetMessagePayloadBuilder of() {
        return new CustomerDefaultShippingAddressSetMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerDefaultShippingAddressSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerDefaultShippingAddressSetMessagePayloadBuilder of(
            final CustomerDefaultShippingAddressSetMessagePayload template) {
        CustomerDefaultShippingAddressSetMessagePayloadBuilder builder = new CustomerDefaultShippingAddressSetMessagePayloadBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
