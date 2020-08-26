package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartRemoveItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartRemoveItemShippingAddressActionBuilder {

    
    private String addressKey;

    public CartRemoveItemShippingAddressActionBuilder addressKey( final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    
    public String getAddressKey(){
        return this.addressKey;
    }

    public CartRemoveItemShippingAddressAction build() {
        return new CartRemoveItemShippingAddressActionImpl(addressKey);
    }

    public static CartRemoveItemShippingAddressActionBuilder of() {
        return new CartRemoveItemShippingAddressActionBuilder();
    }

    public static CartRemoveItemShippingAddressActionBuilder of(final CartRemoveItemShippingAddressAction template) {
        CartRemoveItemShippingAddressActionBuilder builder = new CartRemoveItemShippingAddressActionBuilder();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
