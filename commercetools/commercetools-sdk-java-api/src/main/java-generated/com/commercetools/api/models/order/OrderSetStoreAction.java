package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.order.OrderSetStoreActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderSetStoreActionImpl.class)
public interface OrderSetStoreAction extends OrderUpdateAction {

    
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    public void setStore(final StoreResourceIdentifier store);

    public static OrderSetStoreActionImpl of(){
        return new OrderSetStoreActionImpl();
    }
    

    public static OrderSetStoreActionImpl of(final OrderSetStoreAction template) {
        OrderSetStoreActionImpl instance = new OrderSetStoreActionImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    default <T> T withOrderSetStoreAction(Function<OrderSetStoreAction, T> helper) {
        return helper.apply(this);
    }
}
