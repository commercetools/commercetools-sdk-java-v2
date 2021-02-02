
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetCustomFieldActionImpl.class)
public interface OrderSetCustomFieldAction extends OrderUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

    public static OrderSetCustomFieldAction of() {
        return new OrderSetCustomFieldActionImpl();
    }

    public static OrderSetCustomFieldAction of(final OrderSetCustomFieldAction template) {
        OrderSetCustomFieldActionImpl instance = new OrderSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static OrderSetCustomFieldActionBuilder builder() {
        return OrderSetCustomFieldActionBuilder.of();
    }

    public static OrderSetCustomFieldActionBuilder builder(final OrderSetCustomFieldAction template) {
        return OrderSetCustomFieldActionBuilder.of(template);
    }

    default <T> T withOrderSetCustomFieldAction(Function<OrderSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
