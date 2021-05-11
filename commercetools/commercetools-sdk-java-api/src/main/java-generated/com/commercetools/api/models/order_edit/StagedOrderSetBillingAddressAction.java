
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetBillingAddressActionImpl.class)
public interface StagedOrderSetBillingAddressAction extends StagedOrderUpdateAction {

    String SET_BILLING_ADDRESS = "setBillingAddress";

    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    public void setAddress(final BaseAddress address);

    public static StagedOrderSetBillingAddressAction of() {
        return new StagedOrderSetBillingAddressActionImpl();
    }

    public static StagedOrderSetBillingAddressAction of(final StagedOrderSetBillingAddressAction template) {
        StagedOrderSetBillingAddressActionImpl instance = new StagedOrderSetBillingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static StagedOrderSetBillingAddressActionBuilder builder() {
        return StagedOrderSetBillingAddressActionBuilder.of();
    }

    public static StagedOrderSetBillingAddressActionBuilder builder(final StagedOrderSetBillingAddressAction template) {
        return StagedOrderSetBillingAddressActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetBillingAddressAction(Function<StagedOrderSetBillingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
