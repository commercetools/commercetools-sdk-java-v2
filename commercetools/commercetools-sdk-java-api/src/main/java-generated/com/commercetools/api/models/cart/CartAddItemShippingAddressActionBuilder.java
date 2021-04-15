package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.cart.CartAddItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartAddItemShippingAddressActionBuilder {

    
    
    private com.commercetools.api.models.common.Address address;

    
    public CartAddItemShippingAddressActionBuilder address( final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    
    
    public com.commercetools.api.models.common.Address getAddress(){
        return this.address;
    }

    public CartAddItemShippingAddressAction build() {
        return new CartAddItemShippingAddressActionImpl(address);
    }

    public static CartAddItemShippingAddressActionBuilder of() {
        return new CartAddItemShippingAddressActionBuilder();
    }

    public static CartAddItemShippingAddressActionBuilder of(final CartAddItemShippingAddressAction template) {
        CartAddItemShippingAddressActionBuilder builder = new CartAddItemShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
