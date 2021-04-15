package com.commercetools.api.models.order;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderAddItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderAddItemShippingAddressActionBuilder {

    
    
    private com.commercetools.api.models.common.Address address;

    
    public OrderAddItemShippingAddressActionBuilder address( final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    
    
    public com.commercetools.api.models.common.Address getAddress(){
        return this.address;
    }

    public OrderAddItemShippingAddressAction build() {
        return new OrderAddItemShippingAddressActionImpl(address);
    }

    public static OrderAddItemShippingAddressActionBuilder of() {
        return new OrderAddItemShippingAddressActionBuilder();
    }

    public static OrderAddItemShippingAddressActionBuilder of(final OrderAddItemShippingAddressAction template) {
        OrderAddItemShippingAddressActionBuilder builder = new OrderAddItemShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
