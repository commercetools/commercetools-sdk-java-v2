
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
@JsonDeserialize(as = StagedOrderRemoveItemShippingAddressActionImpl.class)
public interface StagedOrderRemoveItemShippingAddressAction extends StagedOrderUpdateAction {

    String REMOVE_ITEM_SHIPPING_ADDRESS = "removeItemShippingAddress";

    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressKey(final String addressKey);

    public static StagedOrderRemoveItemShippingAddressAction of() {
        return new StagedOrderRemoveItemShippingAddressActionImpl();
    }

    public static StagedOrderRemoveItemShippingAddressAction of(
            final StagedOrderRemoveItemShippingAddressAction template) {
        StagedOrderRemoveItemShippingAddressActionImpl instance = new StagedOrderRemoveItemShippingAddressActionImpl();
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static StagedOrderRemoveItemShippingAddressActionBuilder builder() {
        return StagedOrderRemoveItemShippingAddressActionBuilder.of();
    }

    public static StagedOrderRemoveItemShippingAddressActionBuilder builder(
            final StagedOrderRemoveItemShippingAddressAction template) {
        return StagedOrderRemoveItemShippingAddressActionBuilder.of(template);
    }

    default <T> T withStagedOrderRemoveItemShippingAddressAction(
            Function<StagedOrderRemoveItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemoveItemShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemoveItemShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderRemoveItemShippingAddressAction>";
            }
        };
    }
}
