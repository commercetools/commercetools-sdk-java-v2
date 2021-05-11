
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderUpdateItemShippingAddressActionImpl.class)
public interface StagedOrderUpdateItemShippingAddressAction extends StagedOrderUpdateAction {

    String UPDATE_ITEM_SHIPPING_ADDRESS = "updateItemShippingAddress";

    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    public void setAddress(final BaseAddress address);

    public static StagedOrderUpdateItemShippingAddressAction of() {
        return new StagedOrderUpdateItemShippingAddressActionImpl();
    }

    public static StagedOrderUpdateItemShippingAddressAction of(
            final StagedOrderUpdateItemShippingAddressAction template) {
        StagedOrderUpdateItemShippingAddressActionImpl instance = new StagedOrderUpdateItemShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static StagedOrderUpdateItemShippingAddressActionBuilder builder() {
        return StagedOrderUpdateItemShippingAddressActionBuilder.of();
    }

    public static StagedOrderUpdateItemShippingAddressActionBuilder builder(
            final StagedOrderUpdateItemShippingAddressAction template) {
        return StagedOrderUpdateItemShippingAddressActionBuilder.of(template);
    }

    default <T> T withStagedOrderUpdateItemShippingAddressAction(
            Function<StagedOrderUpdateItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
