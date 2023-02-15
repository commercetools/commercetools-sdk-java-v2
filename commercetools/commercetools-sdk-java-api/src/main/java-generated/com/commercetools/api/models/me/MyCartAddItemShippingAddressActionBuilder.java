
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartAddItemShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartAddItemShippingAddressAction myCartAddItemShippingAddressAction = MyCartAddItemShippingAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartAddItemShippingAddressActionBuilder implements Builder<MyCartAddItemShippingAddressAction> {

    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     */

    public MyCartAddItemShippingAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     */

    public MyCartAddItemShippingAddressActionBuilder address(
            final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public MyCartAddItemShippingAddressAction build() {
        Objects.requireNonNull(address, MyCartAddItemShippingAddressAction.class + ": address is missing");
        return new MyCartAddItemShippingAddressActionImpl(address);
    }

    /**
     * builds MyCartAddItemShippingAddressAction without checking for non null required values
     */
    public MyCartAddItemShippingAddressAction buildUnchecked() {
        return new MyCartAddItemShippingAddressActionImpl(address);
    }

    public static MyCartAddItemShippingAddressActionBuilder of() {
        return new MyCartAddItemShippingAddressActionBuilder();
    }

    public static MyCartAddItemShippingAddressActionBuilder of(final MyCartAddItemShippingAddressAction template) {
        MyCartAddItemShippingAddressActionBuilder builder = new MyCartAddItemShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
