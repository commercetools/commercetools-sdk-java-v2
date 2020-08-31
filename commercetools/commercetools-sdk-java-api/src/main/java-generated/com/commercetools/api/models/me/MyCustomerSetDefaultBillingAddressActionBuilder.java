package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerSetDefaultBillingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCustomerSetDefaultBillingAddressActionBuilder {

    @Nullable
    private String addressId;

    public MyCustomerSetDefaultBillingAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    @Nullable
    public String getAddressId(){
        return this.addressId;
    }

    public MyCustomerSetDefaultBillingAddressAction build() {
        return new MyCustomerSetDefaultBillingAddressActionImpl(addressId);
    }

    public static MyCustomerSetDefaultBillingAddressActionBuilder of() {
        return new MyCustomerSetDefaultBillingAddressActionBuilder();
    }

    public static MyCustomerSetDefaultBillingAddressActionBuilder of(final MyCustomerSetDefaultBillingAddressAction template) {
        MyCustomerSetDefaultBillingAddressActionBuilder builder = new MyCustomerSetDefaultBillingAddressActionBuilder();
        builder.addressId = template.getAddressId();
        return builder;
    }

}
