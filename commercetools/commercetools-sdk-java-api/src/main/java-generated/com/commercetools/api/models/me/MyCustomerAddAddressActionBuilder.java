
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerAddAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerAddAddressAction myCustomerAddAddressAction = MyCustomerAddAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerAddAddressActionBuilder implements Builder<MyCustomerAddAddressAction> {

    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *  <p>Value to append to the <code>addresses</code> array.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public MyCustomerAddAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to append to the <code>addresses</code> array.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public MyCustomerAddAddressActionBuilder withAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }

    /**
     *  <p>Value to append to the <code>addresses</code> array.</p>
     * @param address value to be set
     * @return Builder
     */

    public MyCustomerAddAddressActionBuilder address(final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>Value to append to the <code>addresses</code> array.</p>
     * @return address
     */

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    /**
     * builds MyCustomerAddAddressAction with checking for non-null required values
     * @return MyCustomerAddAddressAction
     */
    public MyCustomerAddAddressAction build() {
        Objects.requireNonNull(address, MyCustomerAddAddressAction.class + ": address is missing");
        return new MyCustomerAddAddressActionImpl(address);
    }

    /**
     * builds MyCustomerAddAddressAction without checking for non-null required values
     * @return MyCustomerAddAddressAction
     */
    public MyCustomerAddAddressAction buildUnchecked() {
        return new MyCustomerAddAddressActionImpl(address);
    }

    /**
     * factory method for an instance of MyCustomerAddAddressActionBuilder
     * @return builder
     */
    public static MyCustomerAddAddressActionBuilder of() {
        return new MyCustomerAddAddressActionBuilder();
    }

    /**
     * create builder for MyCustomerAddAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerAddAddressActionBuilder of(final MyCustomerAddAddressAction template) {
        MyCustomerAddAddressActionBuilder builder = new MyCustomerAddAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
