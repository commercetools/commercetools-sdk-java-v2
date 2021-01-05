package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderSetOrderNumberActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderSetOrderNumberActionImpl.class)
public interface OrderSetOrderNumberAction extends OrderUpdateAction {

    
    
    @JsonProperty("orderNumber")
    public String getOrderNumber();

    public void setOrderNumber(final String orderNumber);

    public static OrderSetOrderNumberAction of(){
        return new OrderSetOrderNumberActionImpl();
    }
    

    public static OrderSetOrderNumberAction of(final OrderSetOrderNumberAction template) {
        OrderSetOrderNumberActionImpl instance = new OrderSetOrderNumberActionImpl();
        instance.setOrderNumber(template.getOrderNumber());
        return instance;
    }

    public static OrderSetOrderNumberActionBuilder builder(){
        return OrderSetOrderNumberActionBuilder.of();
    }
    
    public static OrderSetOrderNumberActionBuilder builder(final OrderSetOrderNumberAction template){
        return OrderSetOrderNumberActionBuilder.of(template);
    }
    

    default <T> T withOrderSetOrderNumberAction(Function<OrderSetOrderNumberAction, T> helper) {
        return helper.apply(this);
    }
}
