
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetBillingAddressCustomFieldActionImpl.class)
public interface OrderSetBillingAddressCustomFieldAction extends OrderUpdateAction {

    String SET_BILLING_ADDRESS_CUSTOM_FIELD = "setBillingAddressCustomField";

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

    public static OrderSetBillingAddressCustomFieldAction of() {
        return new OrderSetBillingAddressCustomFieldActionImpl();
    }

    public static OrderSetBillingAddressCustomFieldAction of(final OrderSetBillingAddressCustomFieldAction template) {
        OrderSetBillingAddressCustomFieldActionImpl instance = new OrderSetBillingAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static OrderSetBillingAddressCustomFieldActionBuilder builder() {
        return OrderSetBillingAddressCustomFieldActionBuilder.of();
    }

    public static OrderSetBillingAddressCustomFieldActionBuilder builder(
            final OrderSetBillingAddressCustomFieldAction template) {
        return OrderSetBillingAddressCustomFieldActionBuilder.of(template);
    }

    default <T> T withOrderSetBillingAddressCustomFieldAction(
            Function<OrderSetBillingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
