
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.cart.ShippingRateInput;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderShippingRateInputSetMessagePayloadImpl.class)
public interface OrderShippingRateInputSetMessagePayload extends MessagePayload {

    String ORDER_SHIPPING_RATE_INPUT_SET = "OrderShippingRateInputSet";

    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInput getShippingRateInput();

    @Valid
    @JsonProperty("oldShippingRateInput")
    public ShippingRateInput getOldShippingRateInput();

    public void setShippingRateInput(final ShippingRateInput shippingRateInput);

    public void setOldShippingRateInput(final ShippingRateInput oldShippingRateInput);

    public static OrderShippingRateInputSetMessagePayload of() {
        return new OrderShippingRateInputSetMessagePayloadImpl();
    }

    public static OrderShippingRateInputSetMessagePayload of(final OrderShippingRateInputSetMessagePayload template) {
        OrderShippingRateInputSetMessagePayloadImpl instance = new OrderShippingRateInputSetMessagePayloadImpl();
        instance.setShippingRateInput(template.getShippingRateInput());
        instance.setOldShippingRateInput(template.getOldShippingRateInput());
        return instance;
    }

    public static OrderShippingRateInputSetMessagePayloadBuilder builder() {
        return OrderShippingRateInputSetMessagePayloadBuilder.of();
    }

    public static OrderShippingRateInputSetMessagePayloadBuilder builder(
            final OrderShippingRateInputSetMessagePayload template) {
        return OrderShippingRateInputSetMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderShippingRateInputSetMessagePayload(
            Function<OrderShippingRateInputSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
