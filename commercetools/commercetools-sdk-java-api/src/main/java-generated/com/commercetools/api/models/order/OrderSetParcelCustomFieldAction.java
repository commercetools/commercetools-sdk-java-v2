
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetParcelCustomFieldActionImpl.class)
public interface OrderSetParcelCustomFieldAction extends OrderUpdateAction {

    String SET_PARCEL_CUSTOM_FIELD = "setParcelCustomField";

    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setParcelId(final String parcelId);

    public void setName(final String name);

    public void setValue(final Object value);

    public static OrderSetParcelCustomFieldAction of() {
        return new OrderSetParcelCustomFieldActionImpl();
    }

    public static OrderSetParcelCustomFieldAction of(final OrderSetParcelCustomFieldAction template) {
        OrderSetParcelCustomFieldActionImpl instance = new OrderSetParcelCustomFieldActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static OrderSetParcelCustomFieldActionBuilder builder() {
        return OrderSetParcelCustomFieldActionBuilder.of();
    }

    public static OrderSetParcelCustomFieldActionBuilder builder(final OrderSetParcelCustomFieldAction template) {
        return OrderSetParcelCustomFieldActionBuilder.of(template);
    }

    default <T> T withOrderSetParcelCustomFieldAction(Function<OrderSetParcelCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
