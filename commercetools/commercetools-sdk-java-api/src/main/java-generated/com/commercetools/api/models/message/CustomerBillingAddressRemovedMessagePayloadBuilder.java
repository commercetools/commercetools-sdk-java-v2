
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerBillingAddressRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerBillingAddressRemovedMessagePayload customerBillingAddressRemovedMessagePayload = CustomerBillingAddressRemovedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerBillingAddressRemovedMessagePayloadBuilder
        implements Builder<CustomerBillingAddressRemovedMessagePayload> {

    private com.commercetools.api.models.common.Address address;

    /**
     *  <p>The address that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>billingAddressIds</code>.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public CustomerBillingAddressRemovedMessagePayloadBuilder address(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The address that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>billingAddressIds</code>.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public CustomerBillingAddressRemovedMessagePayloadBuilder withAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>The address that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>billingAddressIds</code>.</p>
     * @param address value to be set
     * @return Builder
     */

    public CustomerBillingAddressRemovedMessagePayloadBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>The address that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>billingAddressIds</code>.</p>
     * @return address
     */

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    /**
     * builds CustomerBillingAddressRemovedMessagePayload with checking for non-null required values
     * @return CustomerBillingAddressRemovedMessagePayload
     */
    public CustomerBillingAddressRemovedMessagePayload build() {
        Objects.requireNonNull(address, CustomerBillingAddressRemovedMessagePayload.class + ": address is missing");
        return new CustomerBillingAddressRemovedMessagePayloadImpl(address);
    }

    /**
     * builds CustomerBillingAddressRemovedMessagePayload without checking for non-null required values
     * @return CustomerBillingAddressRemovedMessagePayload
     */
    public CustomerBillingAddressRemovedMessagePayload buildUnchecked() {
        return new CustomerBillingAddressRemovedMessagePayloadImpl(address);
    }

    /**
     * factory method for an instance of CustomerBillingAddressRemovedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerBillingAddressRemovedMessagePayloadBuilder of() {
        return new CustomerBillingAddressRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerBillingAddressRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerBillingAddressRemovedMessagePayloadBuilder of(
            final CustomerBillingAddressRemovedMessagePayload template) {
        CustomerBillingAddressRemovedMessagePayloadBuilder builder = new CustomerBillingAddressRemovedMessagePayloadBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
