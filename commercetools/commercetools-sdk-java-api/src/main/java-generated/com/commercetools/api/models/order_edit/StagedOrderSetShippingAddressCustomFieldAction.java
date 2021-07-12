
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

    @NotNull
    @JsonProperty("name")
    public String getName();

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
}
