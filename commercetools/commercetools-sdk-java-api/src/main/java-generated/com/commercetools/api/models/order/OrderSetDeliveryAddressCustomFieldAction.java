
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetDeliveryAddressCustomFieldActionImpl.class)
public interface OrderSetDeliveryAddressCustomFieldAction extends OrderUpdateAction {

    String SET_DELIVERY_ADDRESS_CUSTOM_FIELD = "setDeliveryAddressCustomField";

    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setDeliveryId(final String deliveryId);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static OrderSetDeliveryAddressCustomFieldAction of() {
        return new OrderSetDeliveryAddressCustomFieldActionImpl();
    }

    public static OrderSetDeliveryAddressCustomFieldAction of(final OrderSetDeliveryAddressCustomFieldAction template) {
        OrderSetDeliveryAddressCustomFieldActionImpl instance = new OrderSetDeliveryAddressCustomFieldActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static OrderSetDeliveryAddressCustomFieldActionBuilder builder() {
        return OrderSetDeliveryAddressCustomFieldActionBuilder.of();
    }

    public static OrderSetDeliveryAddressCustomFieldActionBuilder builder(
            final OrderSetDeliveryAddressCustomFieldAction template) {
        return OrderSetDeliveryAddressCustomFieldActionBuilder.of(template);
    }

    default <T> T withOrderSetDeliveryAddressCustomFieldAction(
            Function<OrderSetDeliveryAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
