
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

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetDeliveryAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetDeliveryAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetDeliveryAddressCustomFieldAction>";
            }
        };
    }
}
