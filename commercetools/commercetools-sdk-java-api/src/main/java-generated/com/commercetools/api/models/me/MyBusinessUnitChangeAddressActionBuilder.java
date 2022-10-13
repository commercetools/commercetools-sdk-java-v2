
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
     */

    public MyBusinessUnitChangeAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Key of the address to change. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    public MyBusinessUnitChangeAddressActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    /**
     *  <p>New address to set.</p>
     */

    public MyBusinessUnitChangeAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New address to set.</p>
     */

    public MyBusinessUnitChangeAddressActionBuilder address(
            final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    @Nullable
    public String getAddressKey() {
        return this.addressKey;
    }

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public MyBusinessUnitChangeAddressAction build() {
        Objects.requireNonNull(address, MyBusinessUnitChangeAddressAction.class + ": address is missing");
        return new MyBusinessUnitChangeAddressActionImpl(addressId, addressKey, address);
    }

    /**
     * builds MyBusinessUnitChangeAddressAction without checking for non null required values
     */
    public MyBusinessUnitChangeAddressAction buildUnchecked() {
        return new MyBusinessUnitChangeAddressActionImpl(addressId, addressKey, address);
    }

    public static MyBusinessUnitChangeAddressActionBuilder of() {
        return new MyBusinessUnitChangeAddressActionBuilder();
    }

    public static MyBusinessUnitChangeAddressActionBuilder of(final MyBusinessUnitChangeAddressAction template) {
        MyBusinessUnitChangeAddressActionBuilder builder = new MyBusinessUnitChangeAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        builder.address = template.getAddress();
        return builder;
    }

}
