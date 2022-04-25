
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
@JsonDeserialize(as = StagedOrderSetShippingAddressCustomFieldActionImpl.class)
public interface StagedOrderSetShippingAddressCustomFieldAction extends StagedOrderUpdateAction {

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

    public static StagedOrderSetShippingAddressCustomFieldAction of() {
        return new StagedOrderSetShippingAddressCustomFieldActionImpl();
    }

    public static StagedOrderSetShippingAddressCustomFieldAction of(
            final StagedOrderSetShippingAddressCustomFieldAction template) {
        StagedOrderSetShippingAddressCustomFieldActionImpl instance = new StagedOrderSetShippingAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static StagedOrderSetShippingAddressCustomFieldActionBuilder builder() {
        return StagedOrderSetShippingAddressCustomFieldActionBuilder.of();
    }

    public static StagedOrderSetShippingAddressCustomFieldActionBuilder builder(
            final StagedOrderSetShippingAddressCustomFieldAction template) {
        return StagedOrderSetShippingAddressCustomFieldActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetShippingAddressCustomFieldAction(
            Function<StagedOrderSetShippingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetShippingAddressCustomFieldAction>";
            }
        };
    }
}
