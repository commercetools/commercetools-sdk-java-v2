
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerChangeAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerChangeAddressAction customerChangeAddressAction = CustomerChangeAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerChangeAddressActionBuilder implements Builder<CustomerChangeAddressAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *  <p><code>id</code> of the Address to change.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public CustomerChangeAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p><code>key</code> of the Address to change.</p>
     * @param addressKey value to be set
     * @return Builder
     */

    public CustomerChangeAddressActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public CustomerChangeAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param address value to be set
     * @return Builder
     */

    public CustomerChangeAddressActionBuilder address(final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    /**
     *  <p><code>id</code> of the Address to change.</p>
     * @return addressId
     */

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    /**
     *  <p><code>key</code> of the Address to change.</p>
     * @return addressKey
     */

    @Nullable
    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     *  <p>Value to set.</p>
     * @return address
     */

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    /**
     * builds CustomerChangeAddressAction with checking for non-null required values
     * @return CustomerChangeAddressAction
     */
    public CustomerChangeAddressAction build() {
        Objects.requireNonNull(address, CustomerChangeAddressAction.class + ": address is missing");
        return new CustomerChangeAddressActionImpl(addressId, addressKey, address);
    }

    /**
     * builds CustomerChangeAddressAction without checking for non-null required values
     * @return CustomerChangeAddressAction
     */
    public CustomerChangeAddressAction buildUnchecked() {
        return new CustomerChangeAddressActionImpl(addressId, addressKey, address);
    }

    /**
     * factory method for an instance of CustomerChangeAddressActionBuilder
     * @return builder
     */
    public static CustomerChangeAddressActionBuilder of() {
        return new CustomerChangeAddressActionBuilder();
    }

    /**
     * create builder for CustomerChangeAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerChangeAddressActionBuilder of(final CustomerChangeAddressAction template) {
        CustomerChangeAddressActionBuilder builder = new CustomerChangeAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        builder.address = template.getAddress();
        return builder;
    }

}
