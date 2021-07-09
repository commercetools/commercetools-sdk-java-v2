
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetDeliveryAddressCustomFieldActionImpl.class)
public interface StagedOrderSetDeliveryAddressCustomFieldAction extends StagedOrderUpdateAction {

    String SET_DELIVERY_ADDRESS_CUSTOM_FIELD = "setDeliveryAddressCustomField";

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

    public static StagedOrderSetDeliveryAddressCustomFieldAction of() {
        return new StagedOrderSetDeliveryAddressCustomFieldActionImpl();
    }

    public static StagedOrderSetDeliveryAddressCustomFieldAction of(
            final StagedOrderSetDeliveryAddressCustomFieldAction template) {
        StagedOrderSetDeliveryAddressCustomFieldActionImpl instance = new StagedOrderSetDeliveryAddressCustomFieldActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static StagedOrderSetDeliveryAddressCustomFieldActionBuilder builder() {
        return StagedOrderSetDeliveryAddressCustomFieldActionBuilder.of();
    }

    public static StagedOrderSetDeliveryAddressCustomFieldActionBuilder builder(
            final StagedOrderSetDeliveryAddressCustomFieldAction template) {
        return StagedOrderSetDeliveryAddressCustomFieldActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetDeliveryAddressCustomFieldAction(
            Function<StagedOrderSetDeliveryAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
