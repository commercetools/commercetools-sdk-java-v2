
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetDeliveryCustomFieldActionImpl.class)
public interface OrderSetDeliveryCustomFieldAction extends OrderUpdateAction {

    String SET_DELIVERY_CUSTOM_FIELD = "setDeliveryCustomField";

    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setDeliveryId(final String deliveryId);

    public void setName(final String name);

    public void setValue(final Object value);

    public static OrderSetDeliveryCustomFieldAction of() {
        return new OrderSetDeliveryCustomFieldActionImpl();
    }

    public static OrderSetDeliveryCustomFieldAction of(final OrderSetDeliveryCustomFieldAction template) {
        OrderSetDeliveryCustomFieldActionImpl instance = new OrderSetDeliveryCustomFieldActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static OrderSetDeliveryCustomFieldActionBuilder builder() {
        return OrderSetDeliveryCustomFieldActionBuilder.of();
    }

    public static OrderSetDeliveryCustomFieldActionBuilder builder(final OrderSetDeliveryCustomFieldAction template) {
        return OrderSetDeliveryCustomFieldActionBuilder.of(template);
    }

    default <T> T withOrderSetDeliveryCustomFieldAction(Function<OrderSetDeliveryCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
