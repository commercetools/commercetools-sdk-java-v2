
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCustomerRemoveAddressActionBuilder {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    public MyCustomerRemoveAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    public MyCustomerRemoveAddressActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
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

    public MyCustomerRemoveAddressAction build() {
        return new MyCustomerRemoveAddressActionImpl(addressId, addressKey);
    }

    public static MyCustomerRemoveAddressActionBuilder of() {
        return new MyCustomerRemoveAddressActionBuilder();
    }

    public static MyCustomerRemoveAddressActionBuilder of(final MyCustomerRemoveAddressAction template) {
        MyCustomerRemoveAddressActionBuilder builder = new MyCustomerRemoveAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
