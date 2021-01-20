
package com.commercetools.api.models.message;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ShippingInfo;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.OrderShippingInfoSetMessagePayloadImpl;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderShippingInfoSetMessagePayloadImpl.class)
public interface OrderShippingInfoSetMessagePayload extends MessagePayload {

    @Valid
    @JsonProperty("shippingInfo")
    public ShippingInfo getShippingInfo();

    @Valid
    @JsonProperty("oldShippingInfo")
    public ShippingInfo getOldShippingInfo();

    public void setShippingInfo(final ShippingInfo shippingInfo);

    public void setOldShippingInfo(final ShippingInfo oldShippingInfo);

    public static OrderShippingInfoSetMessagePayload of() {
        return new OrderShippingInfoSetMessagePayloadImpl();
    }

    public static OrderShippingInfoSetMessagePayload of(final OrderShippingInfoSetMessagePayload template) {
        OrderShippingInfoSetMessagePayloadImpl instance = new OrderShippingInfoSetMessagePayloadImpl();
        instance.setShippingInfo(template.getShippingInfo());
        instance.setOldShippingInfo(template.getOldShippingInfo());
        return instance;
    }

    public static OrderShippingInfoSetMessagePayloadBuilder builder() {
        return OrderShippingInfoSetMessagePayloadBuilder.of();
    }

    public static OrderShippingInfoSetMessagePayloadBuilder builder(final OrderShippingInfoSetMessagePayload template) {
        return OrderShippingInfoSetMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderShippingInfoSetMessagePayload(Function<OrderShippingInfoSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
