
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.cart.ShippingInfo;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderShippingInfoSetMessageImpl.class)
public interface OrderShippingInfoSetMessage extends Message {

    String ORDER_SHIPPING_INFO_SET = "OrderShippingInfoSet";

    @Valid
    @JsonProperty("shippingInfo")
    public ShippingInfo getShippingInfo();

    @Valid
    @JsonProperty("oldShippingInfo")
    public ShippingInfo getOldShippingInfo();

    public void setShippingInfo(final ShippingInfo shippingInfo);

    public void setOldShippingInfo(final ShippingInfo oldShippingInfo);

    public static OrderShippingInfoSetMessage of() {
        return new OrderShippingInfoSetMessageImpl();
    }

    public static OrderShippingInfoSetMessage of(final OrderShippingInfoSetMessage template) {
        OrderShippingInfoSetMessageImpl instance = new OrderShippingInfoSetMessageImpl();
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
        instance.setShippingInfo(template.getShippingInfo());
        instance.setOldShippingInfo(template.getOldShippingInfo());
        return instance;
    }

    public static OrderShippingInfoSetMessageBuilder builder() {
        return OrderShippingInfoSetMessageBuilder.of();
    }

    public static OrderShippingInfoSetMessageBuilder builder(final OrderShippingInfoSetMessage template) {
        return OrderShippingInfoSetMessageBuilder.of(template);
    }

    default <T> T withOrderShippingInfoSetMessage(Function<OrderShippingInfoSetMessage, T> helper) {
        return helper.apply(this);
    }
}
