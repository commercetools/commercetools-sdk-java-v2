
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartSetBillingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetBillingAddressAction myCartSetBillingAddressAction = MyCartSetBillingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartSetBillingAddressActionBuilder implements Builder<MyCartSetBillingAddressAction> {

    @Nullable
    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public MyCartSetBillingAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public MyCartSetBillingAddressActionBuilder withAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param address value to be set
     * @return Builder
     */

    public MyCartSetBillingAddressActionBuilder address(
            @Nullable final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return address
     */

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    /**
     * builds MyCartSetBillingAddressAction with checking for non-null required values
     * @return MyCartSetBillingAddressAction
     */
    public MyCartSetBillingAddressAction build() {
        return new MyCartSetBillingAddressActionImpl(address);
    }

    /**
     * builds MyCartSetBillingAddressAction without checking for non-null required values
     * @return MyCartSetBillingAddressAction
     */
    public MyCartSetBillingAddressAction buildUnchecked() {
        return new MyCartSetBillingAddressActionImpl(address);
    }

    /**
     * factory method for an instance of MyCartSetBillingAddressActionBuilder
     * @return builder
     */
    public static MyCartSetBillingAddressActionBuilder of() {
        return new MyCartSetBillingAddressActionBuilder();
    }

    /**
     * create builder for MyCartSetBillingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartSetBillingAddressActionBuilder of(final MyCartSetBillingAddressAction template) {
        MyCartSetBillingAddressActionBuilder builder = new MyCartSetBillingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
