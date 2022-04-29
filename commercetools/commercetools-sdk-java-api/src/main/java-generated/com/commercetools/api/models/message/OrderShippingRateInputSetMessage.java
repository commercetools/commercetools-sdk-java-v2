
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
@JsonDeserialize(as = OrderShippingRateInputSetMessageImpl.class)
public interface OrderShippingRateInputSetMessage extends OrderMessage {

    String ORDER_SHIPPING_RATE_INPUT_SET = "OrderShippingRateInputSet";

    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInput getShippingRateInput();

    @Valid
    @JsonProperty("oldShippingRateInput")
    public ShippingRateInput getOldShippingRateInput();

    public void setShippingRateInput(final ShippingRateInput shippingRateInput);

    public void setOldShippingRateInput(final ShippingRateInput oldShippingRateInput);

    public static OrderShippingRateInputSetMessage of() {
        return new OrderShippingRateInputSetMessageImpl();
    }

    public static OrderShippingRateInputSetMessage of(final OrderShippingRateInputSetMessage template) {
        OrderShippingRateInputSetMessageImpl instance = new OrderShippingRateInputSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setShippingRateInput(template.getShippingRateInput());
        instance.setOldShippingRateInput(template.getOldShippingRateInput());
        return instance;
    }

    public static OrderShippingRateInputSetMessageBuilder builder() {
        return OrderShippingRateInputSetMessageBuilder.of();
    }

    public static OrderShippingRateInputSetMessageBuilder builder(final OrderShippingRateInputSetMessage template) {
        return OrderShippingRateInputSetMessageBuilder.of(template);
    }

    default <T> T withOrderShippingRateInputSetMessage(Function<OrderShippingRateInputSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderShippingRateInputSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderShippingRateInputSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderShippingRateInputSetMessage>";
            }
        };
    }
}
