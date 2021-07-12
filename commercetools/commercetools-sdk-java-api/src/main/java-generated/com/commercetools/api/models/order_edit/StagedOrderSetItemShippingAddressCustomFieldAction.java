
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

    @NotNull
    @JsonProperty("name")
    public String getName();

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
}
