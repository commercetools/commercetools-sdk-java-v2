
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
@JsonDeserialize(as = StagedOrderSetItemShippingAddressCustomFieldActionImpl.class)
public interface StagedOrderSetItemShippingAddressCustomFieldAction extends StagedOrderUpdateAction {

    String SET_ITEM_SHIPPING_ADDRESS_CUSTOM_FIELD = "setItemShippingAddressCustomField";

    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

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

    public void setAddressKey(final String addressKey);

    public void setName(final String name);

    public void setValue(final Object value);

    public static StagedOrderSetItemShippingAddressCustomFieldAction of() {
        return new StagedOrderSetItemShippingAddressCustomFieldActionImpl();
    }

    public static StagedOrderSetItemShippingAddressCustomFieldAction of(
            final StagedOrderSetItemShippingAddressCustomFieldAction template) {
        StagedOrderSetItemShippingAddressCustomFieldActionImpl instance = new StagedOrderSetItemShippingAddressCustomFieldActionImpl();
        instance.setAddressKey(template.getAddressKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static StagedOrderSetItemShippingAddressCustomFieldActionBuilder builder() {
        return StagedOrderSetItemShippingAddressCustomFieldActionBuilder.of();
    }

    public static StagedOrderSetItemShippingAddressCustomFieldActionBuilder builder(
            final StagedOrderSetItemShippingAddressCustomFieldAction template) {
        return StagedOrderSetItemShippingAddressCustomFieldActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetItemShippingAddressCustomFieldAction(
            Function<StagedOrderSetItemShippingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetItemShippingAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetItemShippingAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetItemShippingAddressCustomFieldAction>";
            }
        };
    }
}
