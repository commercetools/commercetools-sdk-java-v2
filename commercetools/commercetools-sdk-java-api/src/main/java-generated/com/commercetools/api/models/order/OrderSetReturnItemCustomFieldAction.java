
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetReturnItemCustomFieldActionImpl.class)
public interface OrderSetReturnItemCustomFieldAction extends OrderUpdateAction {

    String SET_RETURN_ITEM_CUSTOM_FIELD = "setReturnItemCustomField";

    @NotNull
    @JsonProperty("returnItemId")
    public String getReturnItemId();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setReturnItemId(final String returnItemId);

    public void setName(final String name);

    public void setValue(final Object value);

    public static OrderSetReturnItemCustomFieldAction of() {
        return new OrderSetReturnItemCustomFieldActionImpl();
    }

    public static OrderSetReturnItemCustomFieldAction of(final OrderSetReturnItemCustomFieldAction template) {
        OrderSetReturnItemCustomFieldActionImpl instance = new OrderSetReturnItemCustomFieldActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static OrderSetReturnItemCustomFieldActionBuilder builder() {
        return OrderSetReturnItemCustomFieldActionBuilder.of();
    }

    public static OrderSetReturnItemCustomFieldActionBuilder builder(
            final OrderSetReturnItemCustomFieldAction template) {
        return OrderSetReturnItemCustomFieldActionBuilder.of(template);
    }

    default <T> T withOrderSetReturnItemCustomFieldAction(Function<OrderSetReturnItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
