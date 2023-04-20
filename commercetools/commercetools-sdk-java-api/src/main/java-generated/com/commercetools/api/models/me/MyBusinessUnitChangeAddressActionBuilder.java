
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitChangeAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitChangeAddressAction myBusinessUnitChangeAddressAction = MyBusinessUnitChangeAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitChangeAddressActionBuilder implements Builder<MyBusinessUnitChangeAddressAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *  <p>ID of the address to change. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public MyBusinessUnitChangeAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Key of the address to change. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey value to be set
     * @return Builder
     */

    public MyBusinessUnitChangeAddressActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    /**
     *  <p>New address to set.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public MyBusinessUnitChangeAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New address to set.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public MyBusinessUnitChangeAddressActionBuilder withAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }

    /**
     *  <p>New address to set.</p>
     * @param address value to be set
     * @return Builder
     */

    public MyBusinessUnitChangeAddressActionBuilder address(
            final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>ID of the address to change. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressId
     */

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    /**
     *  <p>Key of the address to change. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressKey
     */

    @Nullable
    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     *  <p>New address to set.</p>
     * @return address
     */

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    /**
     * builds MyBusinessUnitChangeAddressAction with checking for non-null required values
     * @return MyBusinessUnitChangeAddressAction
     */
    public MyBusinessUnitChangeAddressAction build() {
        Objects.requireNonNull(address, MyBusinessUnitChangeAddressAction.class + ": address is missing");
        return new MyBusinessUnitChangeAddressActionImpl(addressId, addressKey, address);
    }

    /**
     * builds MyBusinessUnitChangeAddressAction without checking for non-null required values
     * @return MyBusinessUnitChangeAddressAction
     */
    public MyBusinessUnitChangeAddressAction buildUnchecked() {
        return new MyBusinessUnitChangeAddressActionImpl(addressId, addressKey, address);
    }

    /**
     * factory method for an instance of MyBusinessUnitChangeAddressActionBuilder
     * @return builder
     */
    public static MyBusinessUnitChangeAddressActionBuilder of() {
        return new MyBusinessUnitChangeAddressActionBuilder();
    }

    /**
     * create builder for MyBusinessUnitChangeAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitChangeAddressActionBuilder of(final MyBusinessUnitChangeAddressAction template) {
        MyBusinessUnitChangeAddressActionBuilder builder = new MyBusinessUnitChangeAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        builder.address = template.getAddress();
        return builder;
    }

}
