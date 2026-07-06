
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerBillingAddressAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerBillingAddressAddedMessagePayload customerBillingAddressAddedMessagePayload = CustomerBillingAddressAddedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerBillingAddressAddedMessagePayloadBuilder
        implements Builder<CustomerBillingAddressAddedMessagePayload> {

    private com.commercetools.api.models.common.Address address;

    /**
     *  <p>The address that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>billingAddressIds</code>.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public CustomerBillingAddressAddedMessagePayloadBuilder address(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The address that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>billingAddressIds</code>.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public CustomerBillingAddressAddedMessagePayloadBuilder withAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>The address that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>billingAddressIds</code>.</p>
     * @param address value to be set
     * @return Builder
     */

    public CustomerBillingAddressAddedMessagePayloadBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>The address that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>billingAddressIds</code>.</p>
     * @return address
     */

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    /**
     * builds CustomerBillingAddressAddedMessagePayload with checking for non-null required values
     * @return CustomerBillingAddressAddedMessagePayload
     */
    public CustomerBillingAddressAddedMessagePayload build() {
        Objects.requireNonNull(address, CustomerBillingAddressAddedMessagePayload.class + ": address is missing");
        return new CustomerBillingAddressAddedMessagePayloadImpl(address);
    }

    /**
     * builds CustomerBillingAddressAddedMessagePayload without checking for non-null required values
     * @return CustomerBillingAddressAddedMessagePayload
     */
    public CustomerBillingAddressAddedMessagePayload buildUnchecked() {
        return new CustomerBillingAddressAddedMessagePayloadImpl(address);
    }

    /**
     * factory method for an instance of CustomerBillingAddressAddedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerBillingAddressAddedMessagePayloadBuilder of() {
        return new CustomerBillingAddressAddedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerBillingAddressAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerBillingAddressAddedMessagePayloadBuilder of(
            final CustomerBillingAddressAddedMessagePayload template) {
        CustomerBillingAddressAddedMessagePayloadBuilder builder = new CustomerBillingAddressAddedMessagePayloadBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
