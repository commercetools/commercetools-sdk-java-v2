
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderEditSetShippingAddressCustomFieldActionImpl.class)
public interface OrderEditSetShippingAddressCustomFieldAction extends OrderEditUpdateAction {

    String SET_SHIPPING_ADDRESS_CUSTOM_FIELD = "setShippingAddressCustomField";

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

    public static OrderEditSetShippingAddressCustomFieldAction of() {
        return new OrderEditSetShippingAddressCustomFieldActionImpl();
    }

    public static OrderEditSetShippingAddressCustomFieldAction of(
            final OrderEditSetShippingAddressCustomFieldAction template) {
        OrderEditSetShippingAddressCustomFieldActionImpl instance = new OrderEditSetShippingAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static OrderEditSetShippingAddressCustomFieldActionBuilder builder() {
        return OrderEditSetShippingAddressCustomFieldActionBuilder.of();
    }

    public static OrderEditSetShippingAddressCustomFieldActionBuilder builder(
            final OrderEditSetShippingAddressCustomFieldAction template) {
        return OrderEditSetShippingAddressCustomFieldActionBuilder.of(template);
    }

    default <T> T withOrderEditSetShippingAddressCustomFieldAction(
            Function<OrderEditSetShippingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
