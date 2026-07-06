
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerChangeAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerChangeAddressAction myCustomerChangeAddressAction = MyCustomerChangeAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerChangeAddressActionBuilder implements Builder<MyCustomerChangeAddressAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to change.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public MyCustomerChangeAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to change.</p>
     * @param addressKey value to be set
     * @return Builder
     */

    public MyCustomerChangeAddressActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public MyCustomerChangeAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public MyCustomerChangeAddressActionBuilder withAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param address value to be set
     * @return Builder
     */

    public MyCustomerChangeAddressActionBuilder address(final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to change.</p>
     * @return addressId
     */

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to change.</p>
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
     * builds MyCustomerChangeAddressAction with checking for non-null required values
     * @return MyCustomerChangeAddressAction
     */
    public MyCustomerChangeAddressAction build() {
        Objects.requireNonNull(address, MyCustomerChangeAddressAction.class + ": address is missing");
        return new MyCustomerChangeAddressActionImpl(addressId, addressKey, address);
    }

    /**
     * builds MyCustomerChangeAddressAction without checking for non-null required values
     * @return MyCustomerChangeAddressAction
     */
    public MyCustomerChangeAddressAction buildUnchecked() {
        return new MyCustomerChangeAddressActionImpl(addressId, addressKey, address);
    }

    /**
     * factory method for an instance of MyCustomerChangeAddressActionBuilder
     * @return builder
     */
    public static MyCustomerChangeAddressActionBuilder of() {
        return new MyCustomerChangeAddressActionBuilder();
    }

    /**
     * create builder for MyCustomerChangeAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerChangeAddressActionBuilder of(final MyCustomerChangeAddressAction template) {
        MyCustomerChangeAddressActionBuilder builder = new MyCustomerChangeAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        builder.address = template.getAddress();
        return builder;
    }

}
