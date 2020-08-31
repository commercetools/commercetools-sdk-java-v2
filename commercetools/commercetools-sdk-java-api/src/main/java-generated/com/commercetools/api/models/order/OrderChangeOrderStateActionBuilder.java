package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderState;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderChangeOrderStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderChangeOrderStateActionBuilder {

    
    private com.commercetools.api.models.order.OrderState orderState;

    public OrderChangeOrderStateActionBuilder orderState( final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
        return this;
    }

    
    public com.commercetools.api.models.order.OrderState getOrderState(){
        return this.orderState;
    }

    public OrderChangeOrderStateAction build() {
        return new OrderChangeOrderStateActionImpl(orderState);
    }

    public static OrderChangeOrderStateActionBuilder of() {
        return new OrderChangeOrderStateActionBuilder();
    }

    public static OrderChangeOrderStateActionBuilder of(final OrderChangeOrderStateAction template) {
        OrderChangeOrderStateActionBuilder builder = new OrderChangeOrderStateActionBuilder();
        builder.orderState = template.getOrderState();
        return builder;
    }

}
