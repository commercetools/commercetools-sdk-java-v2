
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCustomerChangeAddressActionBuilder implements Builder<MyCustomerChangeAddressAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    private com.commercetools.api.models.common.BaseAddress address;

    public MyCustomerChangeAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    public MyCustomerChangeAddressActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    public MyCustomerChangeAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    public MyCustomerChangeAddressActionBuilder address(final com.commercetools.api.models.common.BaseAddress address) {
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

    public MyCustomerChangeAddressAction build() {
        Objects.requireNonNull(address, MyCustomerChangeAddressAction.class + ": address is missing");
        return new MyCustomerChangeAddressActionImpl(addressId, addressKey, address);
    }

    /**
     * builds MyCustomerChangeAddressAction without checking for non null required values
     */
    public MyCustomerChangeAddressAction buildUnchecked() {
        return new MyCustomerChangeAddressActionImpl(addressId, addressKey, address);
    }

    public static MyCustomerChangeAddressActionBuilder of() {
        return new MyCustomerChangeAddressActionBuilder();
    }

    public static MyCustomerChangeAddressActionBuilder of(final MyCustomerChangeAddressAction template) {
        MyCustomerChangeAddressActionBuilder builder = new MyCustomerChangeAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        builder.address = template.getAddress();
        return builder;
    }

}
