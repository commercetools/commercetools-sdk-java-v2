
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitAddAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitAddAddressAction myBusinessUnitAddAddressAction = MyBusinessUnitAddAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitAddAddressActionBuilder implements Builder<MyBusinessUnitAddAddressAction> {

    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *  <p>The address to add to <code>addresses</code>.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public MyBusinessUnitAddAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The address to add to <code>addresses</code>.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public MyBusinessUnitAddAddressActionBuilder withAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }

    /**
     *  <p>The address to add to <code>addresses</code>.</p>
     * @param address value to be set
     * @return Builder
     */

    public MyBusinessUnitAddAddressActionBuilder address(
            final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>The address to add to <code>addresses</code>.</p>
     * @return address
     */

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    /**
     * builds MyBusinessUnitAddAddressAction with checking for non-null required values
     * @return MyBusinessUnitAddAddressAction
     */
    public MyBusinessUnitAddAddressAction build() {
        Objects.requireNonNull(address, MyBusinessUnitAddAddressAction.class + ": address is missing");
        return new MyBusinessUnitAddAddressActionImpl(address);
    }

    /**
     * builds MyBusinessUnitAddAddressAction without checking for non-null required values
     * @return MyBusinessUnitAddAddressAction
     */
    public MyBusinessUnitAddAddressAction buildUnchecked() {
        return new MyBusinessUnitAddAddressActionImpl(address);
    }

    /**
     * factory method for an instance of MyBusinessUnitAddAddressActionBuilder
     * @return builder
     */
    public static MyBusinessUnitAddAddressActionBuilder of() {
        return new MyBusinessUnitAddAddressActionBuilder();
    }

    /**
     * create builder for MyBusinessUnitAddAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitAddAddressActionBuilder of(final MyBusinessUnitAddAddressAction template) {
        MyBusinessUnitAddAddressActionBuilder builder = new MyBusinessUnitAddAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
