
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetShippingAddressCustomFieldActionImpl.class)
public interface OrderSetShippingAddressCustomFieldAction extends OrderUpdateAction {

    String SET_SHIPPING_ADDRESS_CUSTOM_FIELD = "setShippingAddressCustomField";

    /**
    *  <p>Name of the <a href="/../api/projects/custom-fields">Custom Field</a>.</p>
    */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
    *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists.
    *  Trying to remove a field that does not exist will fail with an <a href="/../api/errors#general-400-invalid-operation">InvalidOperation</a> error.
    *  If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
    */

    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

    public static OrderSetShippingAddressCustomFieldAction of() {
        return new OrderSetShippingAddressCustomFieldActionImpl();
    }

    public static OrderSetShippingAddressCustomFieldAction of(final OrderSetShippingAddressCustomFieldAction template) {
        OrderSetShippingAddressCustomFieldActionImpl instance = new OrderSetShippingAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static OrderSetShippingAddressCustomFieldActionBuilder builder() {
        return OrderSetShippingAddressCustomFieldActionBuilder.of();
    }

    public static OrderSetShippingAddressCustomFieldActionBuilder builder(
            final OrderSetShippingAddressCustomFieldAction template) {
        return OrderSetShippingAddressCustomFieldActionBuilder.of(template);
    }

    default <T> T withOrderSetShippingAddressCustomFieldAction(
            Function<OrderSetShippingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetShippingAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetShippingAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetShippingAddressCustomFieldAction>";
            }
        };
    }
}
