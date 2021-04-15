
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetItemShippingAddressCustomFieldActionImpl.class)
public interface OrderSetItemShippingAddressCustomFieldAction extends OrderUpdateAction {

    String SET_ITEM_SHIPPING_ADDRESS_CUSTOM_FIELD = "setItemShippingAddressCustomField";

    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setAddressKey(final String addressKey);

    public void setName(final String name);

    public void setValue(final Object value);

    public static OrderSetItemShippingAddressCustomFieldAction of() {
        return new OrderSetItemShippingAddressCustomFieldActionImpl();
    }

    public static OrderSetItemShippingAddressCustomFieldAction of(
            final OrderSetItemShippingAddressCustomFieldAction template) {
        OrderSetItemShippingAddressCustomFieldActionImpl instance = new OrderSetItemShippingAddressCustomFieldActionImpl();
        instance.setAddressKey(template.getAddressKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static OrderSetItemShippingAddressCustomFieldActionBuilder builder() {
        return OrderSetItemShippingAddressCustomFieldActionBuilder.of();
    }

    public static OrderSetItemShippingAddressCustomFieldActionBuilder builder(
            final OrderSetItemShippingAddressCustomFieldAction template) {
        return OrderSetItemShippingAddressCustomFieldActionBuilder.of(template);
    }

    default <T> T withOrderSetItemShippingAddressCustomFieldAction(
            Function<OrderSetItemShippingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
